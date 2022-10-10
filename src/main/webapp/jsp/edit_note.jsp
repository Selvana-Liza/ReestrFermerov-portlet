<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"  %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="javax.portlet.*" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.servlet.SessionErrors" %>
<%@ page import="com.liferay.portal.kernel.servlet.SessionMessages" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="com.liferay.portal.kernel.exception.PortalException" %>
<%@ page import="com.liferay.portal.kernel.exception.SystemException" %>
<%@ page import="com.liferay.portal.kernel.util.ListUtil" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchEntry" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@ page import="com.liferay.portal.kernel.dao.search.RowChecker" %>

<%@ page import="com.liferay.reestrFermerov.model.Fermer" %>
<%@ page import="com.liferay.reestrFermerov.service.FermerLocalServiceUtil" %>
<%@ page import="com.liferay.reestrFermerov.model.Rayon" %>
<%@ page import="com.liferay.reestrFermerov.service.RayonLocalServiceUtil" %>

<portlet:defineObjects />
<theme:defineObjects />
<liferay-theme:defineObjects />

<liferay-ui:error key="error.add" message="error-added" />
<liferay-ui:error key="error.update" message="error-update" />

<%
long fermerId = ParamUtil.getLong(renderRequest, "fermerId");
Fermer fermer = null;
String rayonReg = "";
String prForma = "";
String dateReg = "";
List<Rayon> fermerRayons = null;
if (fermerId > 0) {
  fermer = FermerLocalServiceUtil.getFermer(fermerId);
  rayonReg = fermer.getRayonRegistration();
  prForma = fermer.getPravoForma();
  dateReg = String.valueOf(fermer.getDateRegistration());
  fermerRayons = RayonLocalServiceUtil.getFermerRayons(fermerId);
  if(fermerRayons.size()==0) fermerRayons = null;
}

List<Rayon> rayonList=RayonLocalServiceUtil.getRayons(0,RayonLocalServiceUtil.getRayonsCount());
Rayon selectRayonObject=(Rayon)renderRequest.getAttribute("rayonObject");

int countNote = RayonLocalServiceUtil.getRayonsCount();
List res = RayonLocalServiceUtil.getRayons(0,countNote);
%>

<h2>EDIT FERMER</h2>

    <portlet:renderURL var="viewURL">
        <portlet:param name="mvcPath" value="/jsp/view.jsp"></portlet:param>
    </portlet:renderURL>

    <portlet:renderURL var="multySelectRayonURL">
        <portlet:param name="mvcPath" value="/jsp/multy_select_rayon.jsp"></portlet:param>
    </portlet:renderURL>

    <portlet:actionURL name="addNote" var="addNoteURL" />

    <aui:form action="<%= addNoteURL %>" name="<portlet:namespace />fm">
    <aui:model-context bean="<%= fermer %>" model="<%= Fermer.class %>" />
    	<aui:fieldset>
    		<aui:input name="name" id="name" label="Name" >
    		    <aui:validator name="required" errorMessage="name-missing"/>
    		</aui:input>

    		<aui:select name="pravoForma" id="pravoForma" label="Organizacionno-pravovaya forma"
    		onchange="submitform(this.value);">
                <option value="<%= prForma %>" ><%= prForma %></option>
                <option value="UR">UR</option>
                <option value="IP">IP</option>
                <option value="FL">FL</option>
            </aui:select>
    		<aui:input name="inn" id="inn" label="INN" >
                <aui:validator name="required" errorMessage="inn-missing"/>
                <aui:validator name="number" errorMessage="error-enter-number"/>
                <aui:validator name="maxLength" errorMessage="error-size-inn">12</aui:validator>
                <aui:validator name="minLength" errorMessage="error-size-inn">12</aui:validator>
            </aui:input>
            <aui:input name="kpp" id="kpp" label="KPP" >
                <aui:validator name="number" errorMessage="error-enter-number"/>
                <aui:validator name="maxLength" errorMessage="error-size-kpp">9</aui:validator>
                <aui:validator name="minLength" errorMessage="error-size-kpp">9</aui:validator>
            </aui:input>
            <aui:input name="ogrn" id="ogrn" label="OGRN" >
                <aui:validator name="number" errorMessage="error-enter-number"/>
                <aui:validator name="maxLength" errorMessage="error-size-ogrn">13</aui:validator>
                <aui:validator name="minLength" errorMessage="error-size-ogrn">13</aui:validator>
            </aui:input>

            <aui:select name="rayonRegistration" id="rayonRegistration"
                        label="Rayon Registration" onchange="submitform(this.value);" >
                <option value="<%= rayonReg %>" ><%= rayonReg %></option>
                <% for(Rayon rayon : rayonList){ %>
                <option value="<%=rayon.getName()%>"
                    <%= selectRayonObject != null && selectRayonObject.getRayonId() == rayon.getRayonId() ? "selected" : "" %>>
                    <%= rayon.getName() %> </option>
                <% } %>
            </aui:select>

            Rayons Posevnih Poley</br></br>
            <%  int flag =0;
            for(Rayon rayon : rayonList) {
                flag = 0;
                if(fermerRayons!=null) {
                    for(Rayon fermerRayon : fermerRayons){
                        if(fermerRayon.getRayonId() == rayon.getRayonId()) {%>
                            <aui:input type="checkbox" name="rayonsPosevPoley" id="rayonsPosevPoley"
                                                label="<%=rayon.getName()%>" value="true"/>
                            <% flag = 1;
                        }
                    }
                    if (flag == 0) {%>
                        <aui:input type="checkbox" name="rayonsPosevPoley" id="rayonsPosevPoley"
                                    label="<%=rayon.getName()%>" value="false"/>
                    <%}
                } else {%>
                    <aui:input type="checkbox" name="rayonsPosevPoley" id="rayonsPosevPoley"
                                    label="<%=rayon.getName()%>" value="false"/>
                <% }
            }%></br>

            <aui:input type="text" name="dateRegistration" id="dateRegistration" label="Date Registration"/>
                <aui:script>
                    AUI().use('aui-datepicker', function(A) {
                                var datepicker = new A.DatePicker({
                                        trigger : '#<portlet:namespace/>dateRegistration',
                                        mask: '%d/%m/%y',
                                        popover : {
                                        zIndex : 1}
                                });
                    });
                </aui:script>


            <% if(fermerId>0 && fermer.getArchiveStatus()) {%>
    		<aui:input type="checkbox" name="archive" id="archive" label="Status archive"
    		 value="true" />
    		 <% } else {%>
            <aui:input type="checkbox" name="archive" id="archive" label="Status archive"
             value="false" />
             <% } %>

    		<aui:input name="fermerId" id="fermerId"  type="hidden" />
    	</aui:fieldset>

    	<aui:button-row>
    		<aui:button type="submit"></aui:button>
    		<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
    	</aui:button-row>
    </aui:form>