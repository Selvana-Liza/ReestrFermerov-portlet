package com.liferay.reestrFermerov.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for Fermer. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author liza
 * @see FermerLocalServiceUtil
 * @see com.liferay.reestrFermerov.service.base.FermerLocalServiceBaseImpl
 * @see com.liferay.reestrFermerov.service.impl.FermerLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface FermerLocalService extends BaseLocalService,
    InvokableLocalService, PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link FermerLocalServiceUtil} to access the fermer local service. Add custom service methods to {@link com.liferay.reestrFermerov.service.impl.FermerLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the fermer to the database. Also notifies the appropriate model listeners.
    *
    * @param fermer the fermer
    * @return the fermer that was added
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
    public com.liferay.reestrFermerov.model.Fermer addFermer(
        com.liferay.reestrFermerov.model.Fermer fermer)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new fermer with the primary key. Does not add the fermer to the database.
    *
    * @param fermerId the primary key for the new fermer
    * @return the new fermer
    */
    public com.liferay.reestrFermerov.model.Fermer createFermer(long fermerId);

    /**
    * Deletes the fermer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param fermerId the primary key of the fermer
    * @return the fermer that was removed
    * @throws PortalException if a fermer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
    public com.liferay.reestrFermerov.model.Fermer deleteFermer(long fermerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the fermer from the database. Also notifies the appropriate model listeners.
    *
    * @param fermer the fermer
    * @return the fermer that was removed
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
    public com.liferay.reestrFermerov.model.Fermer deleteFermer(
        com.liferay.reestrFermerov.model.Fermer fermer)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.FermerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.FermerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.reestrFermerov.model.Fermer fetchFermer(long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the fermer with the primary key.
    *
    * @param fermerId the primary key of the fermer
    * @return the fermer
    * @throws PortalException if a fermer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.reestrFermerov.model.Fermer getFermer(long fermerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the fermers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.FermerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of fermers
    * @param end the upper bound of the range of fermers (not inclusive)
    * @return the range of fermers
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> getFermers(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of fermers.
    *
    * @return the number of fermers
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getFermersCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the fermer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param fermer the fermer
    * @return the fermer that was updated
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
    public com.liferay.reestrFermerov.model.Fermer updateFermer(
        com.liferay.reestrFermerov.model.Fermer fermer)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * @throws SystemException if a system exception occurred
    */
    public void addRayonFermer(long rayonId, long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * @throws SystemException if a system exception occurred
    */
    public void addRayonFermer(long rayonId,
        com.liferay.reestrFermerov.model.Fermer fermer)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * @throws SystemException if a system exception occurred
    */
    public void addRayonFermers(long rayonId, long[] fermerIds)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * @throws SystemException if a system exception occurred
    */
    public void addRayonFermers(long rayonId,
        java.util.List<com.liferay.reestrFermerov.model.Fermer> Fermers)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * @throws SystemException if a system exception occurred
    */
    public void clearRayonFermers(long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * @throws SystemException if a system exception occurred
    */
    public void deleteRayonFermer(long rayonId, long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * @throws SystemException if a system exception occurred
    */
    public void deleteRayonFermer(long rayonId,
        com.liferay.reestrFermerov.model.Fermer fermer)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * @throws SystemException if a system exception occurred
    */
    public void deleteRayonFermers(long rayonId, long[] fermerIds)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * @throws SystemException if a system exception occurred
    */
    public void deleteRayonFermers(long rayonId,
        java.util.List<com.liferay.reestrFermerov.model.Fermer> Fermers)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> getRayonFermers(
        long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> getRayonFermers(
        long rayonId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> getRayonFermers(
        long rayonId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getRayonFermersCount(long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public boolean hasRayonFermer(long rayonId, long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public boolean hasRayonFermers(long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * @throws SystemException if a system exception occurred
    */
    public void setRayonFermers(long rayonId, long[] fermerIds)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    public com.liferay.reestrFermerov.model.Fermer addFermer(
        java.lang.String name, java.lang.String pravoForma,
        java.lang.String inn, java.lang.String kpp, java.lang.String ogrn,
        com.liferay.reestrFermerov.model.Rayon rayonRegistration,
        java.util.List<com.liferay.reestrFermerov.model.Rayon> rayonsPosevPoley,
        java.util.Date dateRegistration, boolean archiveStatus)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.reestrFermerov.model.Fermer updateFermer(long fermerId,
        java.lang.String name, java.lang.String pravoForma,
        java.lang.String inn, java.lang.String kpp, java.lang.String ogrn,
        com.liferay.reestrFermerov.model.Rayon rayonRegistration,
        java.util.List<com.liferay.reestrFermerov.model.Rayon> rayonsPosevPoley,
        java.util.Date dateRegistration, boolean archiveStatus)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> getFermers(
        long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> getFermers(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> getFermersByInn(
        java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> getFermersByRayonRegistration(
        java.lang.String rayonRegistration)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> getFermers(
        boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException;
}
