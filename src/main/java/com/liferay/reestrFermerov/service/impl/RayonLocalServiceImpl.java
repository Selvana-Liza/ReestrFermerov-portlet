package com.liferay.reestrFermerov.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.reestrFermerov.model.Rayon;
import com.liferay.reestrFermerov.service.base.RayonLocalServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the rayon local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.reestrFermerov.service.RayonLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author liza
 * @see com.liferay.reestrFermerov.service.base.RayonLocalServiceBaseImpl
 * @see com.liferay.reestrFermerov.service.RayonLocalServiceUtil
 */
public class RayonLocalServiceImpl extends RayonLocalServiceBaseImpl {
    public List<Rayon> getRayons(long rayonId) throws SystemException {
        return rayonPersistence.findByrayonId(rayonId);
    }

    public List<Rayon> getRayons(boolean archive) throws SystemException {
        return rayonPersistence.findByArchive(archive);
    }

    public List<Rayon> getRayons(String name) throws SystemException {
        return rayonPersistence.findByName(name);
    }
}
