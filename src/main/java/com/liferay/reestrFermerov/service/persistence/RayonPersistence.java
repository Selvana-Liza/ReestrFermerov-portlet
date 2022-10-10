package com.liferay.reestrFermerov.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.liferay.reestrFermerov.model.Rayon;

/**
 * The persistence interface for the rayon service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liza
 * @see RayonPersistenceImpl
 * @see RayonUtil
 * @generated
 */
public interface RayonPersistence extends BasePersistence<Rayon> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RayonUtil} to access the rayon persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the rayons where rayonId = &#63;.
    *
    * @param rayonId the rayon ID
    * @return the matching rayons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> findByrayonId(
        long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the rayons where rayonId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param rayonId the rayon ID
    * @param start the lower bound of the range of rayons
    * @param end the upper bound of the range of rayons (not inclusive)
    * @return the range of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> findByrayonId(
        long rayonId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the rayons where rayonId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param rayonId the rayon ID
    * @param start the lower bound of the range of rayons
    * @param end the upper bound of the range of rayons (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> findByrayonId(
        long rayonId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first rayon in the ordered set where rayonId = &#63;.
    *
    * @param rayonId the rayon ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon
    * @throws com.liferay.reestrFermerov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Rayon findByrayonId_First(
        long rayonId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchRayonException;

    /**
    * Returns the first rayon in the ordered set where rayonId = &#63;.
    *
    * @param rayonId the rayon ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Rayon fetchByrayonId_First(
        long rayonId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last rayon in the ordered set where rayonId = &#63;.
    *
    * @param rayonId the rayon ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon
    * @throws com.liferay.reestrFermerov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Rayon findByrayonId_Last(
        long rayonId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchRayonException;

    /**
    * Returns the last rayon in the ordered set where rayonId = &#63;.
    *
    * @param rayonId the rayon ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Rayon fetchByrayonId_Last(
        long rayonId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the rayons where rayonId = &#63; from the database.
    *
    * @param rayonId the rayon ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByrayonId(long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rayons where rayonId = &#63;.
    *
    * @param rayonId the rayon ID
    * @return the number of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public int countByrayonId(long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the rayons where name = &#63;.
    *
    * @param name the name
    * @return the matching rayons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> findByName(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the rayons where name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param name the name
    * @param start the lower bound of the range of rayons
    * @param end the upper bound of the range of rayons (not inclusive)
    * @return the range of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> findByName(
        java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the rayons where name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param name the name
    * @param start the lower bound of the range of rayons
    * @param end the upper bound of the range of rayons (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> findByName(
        java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first rayon in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon
    * @throws com.liferay.reestrFermerov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Rayon findByName_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchRayonException;

    /**
    * Returns the first rayon in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Rayon fetchByName_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last rayon in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon
    * @throws com.liferay.reestrFermerov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Rayon findByName_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchRayonException;

    /**
    * Returns the last rayon in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Rayon fetchByName_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rayons before and after the current rayon in the ordered set where name = &#63;.
    *
    * @param rayonId the primary key of the current rayon
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next rayon
    * @throws com.liferay.reestrFermerov.NoSuchRayonException if a rayon with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Rayon[] findByName_PrevAndNext(
        long rayonId, java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchRayonException;

    /**
    * Removes all the rayons where name = &#63; from the database.
    *
    * @param name the name
    * @throws SystemException if a system exception occurred
    */
    public void removeByName(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rayons where name = &#63;.
    *
    * @param name the name
    * @return the number of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public int countByName(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the rayons where archive = &#63;.
    *
    * @param archive the archive
    * @return the matching rayons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> findByArchive(
        boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the rayons where archive = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archive the archive
    * @param start the lower bound of the range of rayons
    * @param end the upper bound of the range of rayons (not inclusive)
    * @return the range of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> findByArchive(
        boolean archive, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the rayons where archive = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archive the archive
    * @param start the lower bound of the range of rayons
    * @param end the upper bound of the range of rayons (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> findByArchive(
        boolean archive, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first rayon in the ordered set where archive = &#63;.
    *
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon
    * @throws com.liferay.reestrFermerov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Rayon findByArchive_First(
        boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchRayonException;

    /**
    * Returns the first rayon in the ordered set where archive = &#63;.
    *
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Rayon fetchByArchive_First(
        boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last rayon in the ordered set where archive = &#63;.
    *
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon
    * @throws com.liferay.reestrFermerov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Rayon findByArchive_Last(
        boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchRayonException;

    /**
    * Returns the last rayon in the ordered set where archive = &#63;.
    *
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Rayon fetchByArchive_Last(
        boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rayons before and after the current rayon in the ordered set where archive = &#63;.
    *
    * @param rayonId the primary key of the current rayon
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next rayon
    * @throws com.liferay.reestrFermerov.NoSuchRayonException if a rayon with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Rayon[] findByArchive_PrevAndNext(
        long rayonId, boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchRayonException;

    /**
    * Removes all the rayons where archive = &#63; from the database.
    *
    * @param archive the archive
    * @throws SystemException if a system exception occurred
    */
    public void removeByArchive(boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rayons where archive = &#63;.
    *
    * @param archive the archive
    * @return the number of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public int countByArchive(boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the rayon in the entity cache if it is enabled.
    *
    * @param rayon the rayon
    */
    public void cacheResult(com.liferay.reestrFermerov.model.Rayon rayon);

    /**
    * Caches the rayons in the entity cache if it is enabled.
    *
    * @param rayons the rayons
    */
    public void cacheResult(
        java.util.List<com.liferay.reestrFermerov.model.Rayon> rayons);

    /**
    * Creates a new rayon with the primary key. Does not add the rayon to the database.
    *
    * @param rayonId the primary key for the new rayon
    * @return the new rayon
    */
    public com.liferay.reestrFermerov.model.Rayon create(long rayonId);

    /**
    * Removes the rayon with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param rayonId the primary key of the rayon
    * @return the rayon that was removed
    * @throws com.liferay.reestrFermerov.NoSuchRayonException if a rayon with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Rayon remove(long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchRayonException;

    public com.liferay.reestrFermerov.model.Rayon updateImpl(
        com.liferay.reestrFermerov.model.Rayon rayon)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rayon with the primary key or throws a {@link com.liferay.reestrFermerov.NoSuchRayonException} if it could not be found.
    *
    * @param rayonId the primary key of the rayon
    * @return the rayon
    * @throws com.liferay.reestrFermerov.NoSuchRayonException if a rayon with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Rayon findByPrimaryKey(long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchRayonException;

    /**
    * Returns the rayon with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param rayonId the primary key of the rayon
    * @return the rayon, or <code>null</code> if a rayon with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Rayon fetchByPrimaryKey(
        long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the rayons.
    *
    * @return the rayons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the rayons.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of rayons
    * @param end the upper bound of the range of rayons (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of rayons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the rayons from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rayons.
    *
    * @return the number of rayons
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the fermers associated with the rayon.
    *
    * @param pk the primary key of the rayon
    * @return the fermers associated with the rayon
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> getFermers(
        long pk) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the fermers associated with the rayon.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the rayon
    * @param start the lower bound of the range of rayons
    * @param end the upper bound of the range of rayons (not inclusive)
    * @return the range of fermers associated with the rayon
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> getFermers(
        long pk, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the fermers associated with the rayon.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the rayon
    * @param start the lower bound of the range of rayons
    * @param end the upper bound of the range of rayons (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of fermers associated with the rayon
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> getFermers(
        long pk, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of fermers associated with the rayon.
    *
    * @param pk the primary key of the rayon
    * @return the number of fermers associated with the rayon
    * @throws SystemException if a system exception occurred
    */
    public int getFermersSize(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns <code>true</code> if the fermer is associated with the rayon.
    *
    * @param pk the primary key of the rayon
    * @param fermerPK the primary key of the fermer
    * @return <code>true</code> if the fermer is associated with the rayon; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public boolean containsFermer(long pk, long fermerPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns <code>true</code> if the rayon has any fermers associated with it.
    *
    * @param pk the primary key of the rayon to check for associations with fermers
    * @return <code>true</code> if the rayon has any fermers associated with it; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public boolean containsFermers(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the rayon and the fermer. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the rayon
    * @param fermerPK the primary key of the fermer
    * @throws SystemException if a system exception occurred
    */
    public void addFermer(long pk, long fermerPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the rayon and the fermer. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the rayon
    * @param fermer the fermer
    * @throws SystemException if a system exception occurred
    */
    public void addFermer(long pk,
        com.liferay.reestrFermerov.model.Fermer fermer)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the rayon and the fermers. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the rayon
    * @param fermerPKs the primary keys of the fermers
    * @throws SystemException if a system exception occurred
    */
    public void addFermers(long pk, long[] fermerPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the rayon and the fermers. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the rayon
    * @param fermers the fermers
    * @throws SystemException if a system exception occurred
    */
    public void addFermers(long pk,
        java.util.List<com.liferay.reestrFermerov.model.Fermer> fermers)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Clears all associations between the rayon and its fermers. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the rayon to clear the associated fermers from
    * @throws SystemException if a system exception occurred
    */
    public void clearFermers(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the rayon and the fermer. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the rayon
    * @param fermerPK the primary key of the fermer
    * @throws SystemException if a system exception occurred
    */
    public void removeFermer(long pk, long fermerPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the rayon and the fermer. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the rayon
    * @param fermer the fermer
    * @throws SystemException if a system exception occurred
    */
    public void removeFermer(long pk,
        com.liferay.reestrFermerov.model.Fermer fermer)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the rayon and the fermers. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the rayon
    * @param fermerPKs the primary keys of the fermers
    * @throws SystemException if a system exception occurred
    */
    public void removeFermers(long pk, long[] fermerPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the rayon and the fermers. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the rayon
    * @param fermers the fermers
    * @throws SystemException if a system exception occurred
    */
    public void removeFermers(long pk,
        java.util.List<com.liferay.reestrFermerov.model.Fermer> fermers)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Sets the fermers associated with the rayon, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the rayon
    * @param fermerPKs the primary keys of the fermers to be associated with the rayon
    * @throws SystemException if a system exception occurred
    */
    public void setFermers(long pk, long[] fermerPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Sets the fermers associated with the rayon, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the rayon
    * @param fermers the fermers to be associated with the rayon
    * @throws SystemException if a system exception occurred
    */
    public void setFermers(long pk,
        java.util.List<com.liferay.reestrFermerov.model.Fermer> fermers)
        throws com.liferay.portal.kernel.exception.SystemException;
}
