<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="javax.portlet.*" %>
<%@ page import="java.io.IOException" %>
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

<%@ page import="com.liferay.reestrFermerov.model.Fermer" %>
<%@ page import="com.liferay.reestrFermerov.service.FermerLocalServiceUtil" %>

<portlet:defineObjects />
<theme:defineObjects />
<liferay-theme:defineObjects />

<liferay-ui:success key="fermer.add.success" message="fermer-added" />
<liferay-ui:success key="fermer.update.success" message="fermer-updated" />
<liferay-ui:success key="fermer.delete.success" message="fermer-deleted" />
<liferay-ui:success key="fermer.archive.success" message="fermer-put-archive" />
<liferay-ui:success key="fermer.getarchive.success" message="fermer-get-archive" />
<liferay-ui:error key="error.add" message="error-added" />
<liferay-ui:error key="error.update" message="error-update" />
<liferay-ui:error key="error.delete" message="error-delete" />
<liferay-ui:error key="error.archive" message="error-archive" />
<liferay-ui:success key="fermer.filter" message="fermer-filter" />

<%
int countNote = FermerLocalServiceUtil.getFermersCount();
List res = FermerLocalServiceUtil.getFermers(0,countNote);
String fil =(String) renderRequest.getAttribute( "filterStatus" );
if(fil!=null && !fil.equals("null")){
    res=(List)renderRequest.getAttribute( "result" );
    countNote=(Integer)renderRequest.getAttribute( "total" );
}
%>


<h2>REESTR FERMEROV</h2>

    <portlet:renderURL var="editNoteURL">
        <portlet:param name="mvcPath" value="/jsp/edit_note.jsp"></portlet:param>
    </portlet:renderURL>

    <aui:button-row>
        <aui:button onClick="<%= editNoteURL.toString() %>" value="Add Fermer"></aui:button>
    </aui:button-row>

    <portlet:actionURL name="filter" var="filterURL" />
    <aui:form action="<%= filterURL %>" name="<portlet:namespace />fm">
        <aui:select label="Filter by archive" id="archiveFilter" name="archiveFilter">
          <option value="<%= fil %>" ><%= fil %></option>
          <option value="all">all</option>
          <option value="true">true</option>
          <option value="false">false</option>
        </aui:select>

        <aui:button-row>
            <aui:button type="submit" onClick="<%= filterURL.toString() %>" value="Filter"></aui:button>
        </aui:button-row>
    </aui:form>

    <liferay-ui:search-container
               total="<%= countNote %>"
               emptyResultsMessage="No fermers">
        <liferay-ui:search-container-results results="<%= res %>" />
            <liferay-ui:search-container-row
                className="com.liferay.reestrFermerov.model.Fermer" modelVar="fermer">

                <liferay-ui:search-container-column-text property="name" name="Fermer name" />
                <liferay-ui:search-container-column-text property="pravoForma" name="Organizacionno-pravovaya forma" />
                <liferay-ui:search-container-column-text property="inn" name="INN" />
                <liferay-ui:search-container-column-text property="kpp" name="KPP" />
                <liferay-ui:search-container-column-text property="ogrn" name="OGRN" />
                <liferay-ui:search-container-column-text property="rayonRegistration" name="Rayon Registration"/>
                <liferay-ui:search-container-column-text property="rayonPosevPole" name="Rayon Posevnih Poley"/>
                <liferay-ui:search-container-column-text property="dateRegistration" name="Date Registration" />
                <liferay-ui:search-container-column-text property="archiveStatus" name="Status archive"/>

                <liferay-ui:search-container-column-jsp
                    align="right"
                    path="/jsp/note_actions.jsp" />

        </liferay-ui:search-container-row>
        <liferay-ui:search-iterator />
    </liferay-ui:search-container>

