package com.liferay.reestrFermerov.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RayonLocalService}.
 *
 * @author liza
 * @see RayonLocalService
 * @generated
 */
public class RayonLocalServiceWrapper implements RayonLocalService,
    ServiceWrapper<RayonLocalService> {
    private RayonLocalService _rayonLocalService;

    public RayonLocalServiceWrapper(RayonLocalService rayonLocalService) {
        _rayonLocalService = rayonLocalService;
    }

    /**
    * Adds the rayon to the database. Also notifies the appropriate model listeners.
    *
    * @param rayon the rayon
    * @return the rayon that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.reestrFermerov.model.Rayon addRayon(
        com.liferay.reestrFermerov.model.Rayon rayon)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.addRayon(rayon);
    }

    /**
    * Creates a new rayon with the primary key. Does not add the rayon to the database.
    *
    * @param rayonId the primary key for the new rayon
    * @return the new rayon
    */
    @Override
    public com.liferay.reestrFermerov.model.Rayon createRayon(long rayonId) {
        return _rayonLocalService.createRayon(rayonId);
    }

    /**
    * Deletes the rayon with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param rayonId the primary key of the rayon
    * @return the rayon that was removed
    * @throws PortalException if a rayon with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.reestrFermerov.model.Rayon deleteRayon(long rayonId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.deleteRayon(rayonId);
    }

    /**
    * Deletes the rayon from the database. Also notifies the appropriate model listeners.
    *
    * @param rayon the rayon
    * @return the rayon that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.reestrFermerov.model.Rayon deleteRayon(
        com.liferay.reestrFermerov.model.Rayon rayon)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.deleteRayon(rayon);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _rayonLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.liferay.reestrFermerov.model.Rayon fetchRayon(long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.fetchRayon(rayonId);
    }

    /**
    * Returns the rayon with the primary key.
    *
    * @param rayonId the primary key of the rayon
    * @return the rayon
    * @throws PortalException if a rayon with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.reestrFermerov.model.Rayon getRayon(long rayonId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.getRayon(rayonId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the rayons.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of rayons
    * @param end the upper bound of the range of rayons (not inclusive)
    * @return the range of rayons
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> getRayons(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.getRayons(start, end);
    }

    /**
    * Returns the number of rayons.
    *
    * @return the number of rayons
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getRayonsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.getRayonsCount();
    }

    /**
    * Updates the rayon in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param rayon the rayon
    * @return the rayon that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.reestrFermerov.model.Rayon updateRayon(
        com.liferay.reestrFermerov.model.Rayon rayon)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.updateRayon(rayon);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void addFermerRayon(long fermerId, long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException {
        _rayonLocalService.addFermerRayon(fermerId, rayonId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void addFermerRayon(long fermerId,
        com.liferay.reestrFermerov.model.Rayon rayon)
        throws com.liferay.portal.kernel.exception.SystemException {
        _rayonLocalService.addFermerRayon(fermerId, rayon);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void addFermerRayons(long fermerId, long[] rayonIds)
        throws com.liferay.portal.kernel.exception.SystemException {
        _rayonLocalService.addFermerRayons(fermerId, rayonIds);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void addFermerRayons(long fermerId,
        java.util.List<com.liferay.reestrFermerov.model.Rayon> Rayons)
        throws com.liferay.portal.kernel.exception.SystemException {
        _rayonLocalService.addFermerRayons(fermerId, Rayons);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void clearFermerRayons(long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        _rayonLocalService.clearFermerRayons(fermerId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void deleteFermerRayon(long fermerId, long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException {
        _rayonLocalService.deleteFermerRayon(fermerId, rayonId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void deleteFermerRayon(long fermerId,
        com.liferay.reestrFermerov.model.Rayon rayon)
        throws com.liferay.portal.kernel.exception.SystemException {
        _rayonLocalService.deleteFermerRayon(fermerId, rayon);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void deleteFermerRayons(long fermerId, long[] rayonIds)
        throws com.liferay.portal.kernel.exception.SystemException {
        _rayonLocalService.deleteFermerRayons(fermerId, rayonIds);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void deleteFermerRayons(long fermerId,
        java.util.List<com.liferay.reestrFermerov.model.Rayon> Rayons)
        throws com.liferay.portal.kernel.exception.SystemException {
        _rayonLocalService.deleteFermerRayons(fermerId, Rayons);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> getFermerRayons(
        long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.getFermerRayons(fermerId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> getFermerRayons(
        long fermerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.getFermerRayons(fermerId, start, end);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> getFermerRayons(
        long fermerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.getFermerRayons(fermerId, start, end,
            orderByComparator);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getFermerRayonsCount(long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.getFermerRayonsCount(fermerId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public boolean hasFermerRayon(long fermerId, long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.hasFermerRayon(fermerId, rayonId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public boolean hasFermerRayons(long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.hasFermerRayons(fermerId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void setFermerRayons(long fermerId, long[] rayonIds)
        throws com.liferay.portal.kernel.exception.SystemException {
        _rayonLocalService.setFermerRayons(fermerId, rayonIds);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _rayonLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _rayonLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _rayonLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> getRayons(
        long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.getRayons(rayonId);
    }

    @Override
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> getRayons(
        boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.getRayons(archive);
    }

    @Override
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> getRayons(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rayonLocalService.getRayons(name);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RayonLocalService getWrappedRayonLocalService() {
        return _rayonLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRayonLocalService(RayonLocalService rayonLocalService) {
        _rayonLocalService = rayonLocalService;
    }

    @Override
    public RayonLocalService getWrappedService() {
        return _rayonLocalService;
    }

    @Override
    public void setWrappedService(RayonLocalService rayonLocalService) {
        _rayonLocalService = rayonLocalService;
    }
}
