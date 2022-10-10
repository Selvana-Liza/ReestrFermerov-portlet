package com.liferay.reestrFermerov.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.reestrFermerov.model.Rayon;
import com.liferay.reestrFermerov.service.RayonLocalServiceUtil;

/**
 * @author liza
 * @generated
 */
public abstract class RayonActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RayonActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RayonLocalServiceUtil.getService());
        setClass(Rayon.class);

        setClassLoader(com.liferay.reestrFermerov.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("rayonId");
    }
}
