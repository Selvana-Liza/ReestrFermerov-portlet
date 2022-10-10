package com.liferay.reestrFermerov.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.reestrFermerov.model.Fermer;
import com.liferay.reestrFermerov.service.FermerLocalServiceUtil;

/**
 * @author liza
 * @generated
 */
public abstract class FermerActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public FermerActionableDynamicQuery() throws SystemException {
        setBaseLocalService(FermerLocalServiceUtil.getService());
        setClass(Fermer.class);

        setClassLoader(com.liferay.reestrFermerov.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("fermerId");
    }
}
