import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.reestrFermerov.model.Fermer;
import com.liferay.reestrFermerov.model.Rayon;
import com.liferay.reestrFermerov.service.FermerLocalServiceUtil;
import com.liferay.reestrFermerov.service.RayonLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReestrFermerovPortlet extends MVCPortlet {
    public void addNote(ActionRequest request, ActionResponse response) throws SystemException {
        long fermerId = ParamUtil.getLong(request, "fermerId");
        String name = ParamUtil.getString(request, "name");
        String pravoForma = ParamUtil.getString(request, "pravoForma");
        String inn = ParamUtil.getString(request, "inn");
        String kpp = ParamUtil.getString(request, "kpp");
        String ogrn = ParamUtil.getString(request, "ogrn");
        String rayonRegistration = ParamUtil.getString(request, "rayonRegistration");
        boolean archive = ParamUtil.getBoolean(request, "archive");
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dateRegistration = ParamUtil.getDate(request, "dateRegistration", df);

        Rayon rayonRegistr;
        if (rayonRegistration.equals("")) rayonRegistr = null;
        else rayonRegistr = RayonLocalServiceUtil.getRayons(rayonRegistration).get(0);

        String[] subjects = ParamUtil.getParameterValues(request, "rayonsPosevPoley");
        List<Rayon> rayons = RayonLocalServiceUtil.getRayons(0, RayonLocalServiceUtil.getRayonsCount());
        List<Rayon> rayonsPP = new ArrayList<Rayon>();

        if (fermerId > 0) {
            try {
                RayonLocalServiceUtil.deleteFermerRayons(fermerId, RayonLocalServiceUtil.getFermerRayons(fermerId));
                for (int i = 0; i < subjects.length; i++) {
                    if (subjects[i].equals("true")) {
                        RayonLocalServiceUtil.addFermerRayon(fermerId, rayons.get(i).getRayonId());
                        rayonsPP.add(rayons.get(i));
                    }
                }
                if(rayonsPP.size()==0) rayonsPP=null;
                FermerLocalServiceUtil.updateFermer(fermerId, name, pravoForma, inn, kpp, ogrn, rayonRegistr,
                        rayonsPP, dateRegistration, archive);

                SessionMessages.add(request, "fermer.update.success");
                response.setRenderParameter("fermerId", Long.toString(fermerId));
            } catch (Exception e) {
                SessionErrors.add(request, "error.update");
                PortalUtil.copyRequestParameters(request, response);
                response.setRenderParameter("mvcPath", "/jsp/edit_note.jsp");
            }
        } else {
            try {
                for (int i = 0; i < subjects.length; i++) {
                    if (subjects[i].equals("true")) {
                        rayonsPP.add(rayons.get(i));
                    }
                }
                if(rayonsPP.size()==0) rayonsPP=null;
                Fermer fermer = FermerLocalServiceUtil.addFermer(name, pravoForma, inn, kpp, ogrn, rayonRegistr,
                        rayonsPP, dateRegistration, archive);
                if (rayonsPP != null)
                    RayonLocalServiceUtil.addFermerRayons(fermer.getFermerId(), rayonsPP);

                SessionMessages.add(request, "fermer.add.success");
                response.setRenderParameter("fermerId", Long.toString(fermerId));
            } catch (Exception e) {
                SessionErrors.add(request, "error.add");
                PortalUtil.copyRequestParameters(request, response);
                response.setRenderParameter("mvcPath", "/jsp/edit_note.jsp");
            }
        }
    }

    public void filter(ActionRequest request, ActionResponse response) throws SystemException {
        int countNote = 0;
        List res = null;
        String filterByarchive = ParamUtil.getString(request, "archiveFilter");
        if(filterByarchive.equals("true")){
            res = FermerLocalServiceUtil.getFermers(true);
            countNote = res.size();
        } else if(filterByarchive.equals("false")){
            res = FermerLocalServiceUtil.getFermers(false);
            countNote = res.size();
        } else if(filterByarchive.equals("all")){
            countNote = FermerLocalServiceUtil.getFermersCount();
            res = FermerLocalServiceUtil.getFermers(0,countNote);;
        }
        request.setAttribute("filterStatus", filterByarchive);
        request.setAttribute("result", res);
        request.setAttribute("total", countNote);
        SessionMessages.add(request, "fermer.filter");
    }

    public void deleteNote(ActionRequest request, ActionResponse response) {
        long fermerId = ParamUtil.getLong(request, "fermerId");

        try {
            response.setRenderParameter("fermerId", Long.toString(fermerId));
            RayonLocalServiceUtil.deleteFermerRayons(fermerId, RayonLocalServiceUtil.getFermerRayons(fermerId));
            FermerLocalServiceUtil.deleteFermer(fermerId);
            SessionMessages.add(request, "fermer.delete.success");
        } catch (Exception e) {
            SessionErrors.add(request, "error.delete");
        }
    }

    public void archiveNote(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        long fermerId = ParamUtil.getLong(request, "fermerId");
        Fermer fermer = FermerLocalServiceUtil.getFermer(fermerId);
        String message;
        if(fermer.getArchiveStatus()){
            fermer.setArchiveStatus(false);
            message = "fermer.getarchive.success";
        } else{
            fermer.setArchiveStatus(true);
            message = "fermer.archive.success";
        }

        try {
            response.setRenderParameter("fermerId", Long.toString(fermerId));
            FermerLocalServiceUtil.updateFermer(fermer);
            SessionMessages.add(request, message);
        } catch (Exception e) {
            SessionErrors.add(request, "error.archive");
        }
    }

    @Override
    public void render(RenderRequest request, RenderResponse response) throws PortletException, IOException {
        try {
            long fermerId = ParamUtil.getLong(request, "fermerId");
            int countNote = FermerLocalServiceUtil.getFermersCount();
            List<Fermer> fermers = FermerLocalServiceUtil.getFermers(0, countNote);

            if (fermers.size() == 0) {
                Fermer fermer = FermerLocalServiceUtil.addFermer("Main", null,
                        "111111111111", null, null,
                        null, null,null, false);
                fermerId = fermer.getFermerId();
            }
            request.setAttribute("fermerId", fermerId);

        } catch (Exception e) {
            throw new PortletException(e);
        }

        super.render(request, response);
    }
}
