package com.liferay.reestrFermerov.service.impl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.reestrFermerov.FermerInnException;
import com.liferay.reestrFermerov.FermerNameException;
import com.liferay.reestrFermerov.model.Fermer;
import com.liferay.reestrFermerov.model.Rayon;
import com.liferay.reestrFermerov.service.base.FermerLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the fermer local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.reestrFermerov.service.FermerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author liza
 * @see com.liferay.reestrFermerov.service.base.FermerLocalServiceBaseImpl
 * @see com.liferay.reestrFermerov.service.FermerLocalServiceUtil
 */
public class FermerLocalServiceImpl extends FermerLocalServiceBaseImpl {
    public Fermer addFermer(String name, String pravoForma, String inn, String kpp, String ogrn,
                            Rayon rayonRegistration, List<Rayon> rayonsPosevPoley,
                            Date dateRegistration, boolean archiveStatus) throws PortalException, SystemException {

        long fermerId = CounterLocalServiceUtil.increment(Fermer.class.getName());

        validate(name, inn);

        Fermer fermer = fermerPersistence.create(fermerId);

        fermer.setName(name);
        fermer.setPravoForma(pravoForma);
        fermer.setInn(inn);
        fermer.setKpp(kpp);
        fermer.setOgrn(ogrn);
        if (rayonRegistration != null)
            fermer.setRayonRegistration(rayonRegistration.getName());
        else fermer.setRayonRegistration("");
        if (rayonsPosevPoley != null) {
            StringBuilder s = new StringBuilder();
            for (Rayon rayon : rayonsPosevPoley)
                s.append(",").append(rayon.getName());
            fermer.setRayonPosevPole(s.substring(1));
        } else fermer.setRayonPosevPole("");
        fermer.setDateRegistration(dateRegistration);
        fermer.setArchiveStatus(archiveStatus);

        fermerPersistence.update(fermer);
        return fermer;
    }

    protected void validate(String name,String inn) throws PortalException {
        if (Validator.isNull(name)) {
            throw new FermerNameException();
        }
        if (Validator.isNull(inn)) {
            throw new FermerInnException();
        }
    }

    public Fermer updateFermer(long fermerId, String name, String pravoForma,
                               String inn, String kpp, String ogrn,
                               Rayon rayonRegistration, List<Rayon> rayonsPosevPoley,
                               Date dateRegistration, boolean archiveStatus) throws PortalException, SystemException {
        validate(name, inn);

        Fermer fermer = fermerPersistence.findByPrimaryKey(fermerId);

        fermer.setName(name);
        fermer.setPravoForma(pravoForma);
        fermer.setInn(inn);
        fermer.setKpp(kpp);
        fermer.setOgrn(ogrn);
        if (rayonRegistration != null)
            fermer.setRayonRegistration(rayonRegistration.getName());
        else fermer.setRayonRegistration("");
        if (rayonsPosevPoley != null) {
            StringBuilder s = new StringBuilder();
            for (Rayon rayon : rayonsPosevPoley)
                s.append(",").append(rayon.getName());
            fermer.setRayonPosevPole(s.substring(1));
        } else fermer.setRayonPosevPole("");
        fermer.setDateRegistration(dateRegistration);
        fermer.setArchiveStatus(archiveStatus);

        fermerPersistence.update(fermer);
        return fermer;
    }

    public Fermer deleteFermer(Fermer fermer) throws SystemException {
        fermerPersistence.remove(fermer);
        return fermer;
    }

    public Fermer deleteFermer(long fermerId) throws PortalException, SystemException {
        Fermer fermer = fermerPersistence.findByPrimaryKey(fermerId);
        return deleteFermer(fermer);
    }
    public int getFermersCount() throws SystemException {
        return fermerPersistence.countAll();
    }

    public List<Fermer> getFermers(long fermerId) throws SystemException {
        return fermerPersistence.findByfermerId(fermerId);
    }

    public List<Fermer> getFermers(String name) throws SystemException {
        return fermerPersistence.findByName(name);
    }

    public List<Fermer> getFermersByInn(String inn) throws SystemException {
        return fermerPersistence.findByInn(inn);
    }

    public List<Fermer> getFermersByRayonRegistration(String rayonRegistration) throws SystemException {
        return fermerPersistence.findByRayonRegistration(rayonRegistration);
    }

    public List<Fermer> getFermers(boolean archive) throws SystemException {
        return fermerPersistence.findByArchiveStatus(archive);
    }
}
