package com.liferay.reestrFermerov.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.liferay.reestrFermerov.model.Fermer;

/**
 * The persistence interface for the fermer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liza
 * @see FermerPersistenceImpl
 * @see FermerUtil
 * @generated
 */
public interface FermerPersistence extends BasePersistence<Fermer> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link FermerUtil} to access the fermer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the fermers where fermerId = &#63;.
    *
    * @param fermerId the fermer ID
    * @return the matching fermers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findByfermerId(
        long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the fermers where fermerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.FermerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param fermerId the fermer ID
    * @param start the lower bound of the range of fermers
    * @param end the upper bound of the range of fermers (not inclusive)
    * @return the range of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findByfermerId(
        long fermerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the fermers where fermerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.FermerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param fermerId the fermer ID
    * @param start the lower bound of the range of fermers
    * @param end the upper bound of the range of fermers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findByfermerId(
        long fermerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first fermer in the ordered set where fermerId = &#63;.
    *
    * @param fermerId the fermer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer findByfermerId_First(
        long fermerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException;

    /**
    * Returns the first fermer in the ordered set where fermerId = &#63;.
    *
    * @param fermerId the fermer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer fetchByfermerId_First(
        long fermerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last fermer in the ordered set where fermerId = &#63;.
    *
    * @param fermerId the fermer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer findByfermerId_Last(
        long fermerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException;

    /**
    * Returns the last fermer in the ordered set where fermerId = &#63;.
    *
    * @param fermerId the fermer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer fetchByfermerId_Last(
        long fermerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the fermers where fermerId = &#63; from the database.
    *
    * @param fermerId the fermer ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByfermerId(long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of fermers where fermerId = &#63;.
    *
    * @param fermerId the fermer ID
    * @return the number of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public int countByfermerId(long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the fermers where name = &#63;.
    *
    * @param name the name
    * @return the matching fermers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findByName(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the fermers where name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.FermerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param name the name
    * @param start the lower bound of the range of fermers
    * @param end the upper bound of the range of fermers (not inclusive)
    * @return the range of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findByName(
        java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the fermers where name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.FermerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param name the name
    * @param start the lower bound of the range of fermers
    * @param end the upper bound of the range of fermers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findByName(
        java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first fermer in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer findByName_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException;

    /**
    * Returns the first fermer in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer fetchByName_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last fermer in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer findByName_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException;

    /**
    * Returns the last fermer in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer fetchByName_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the fermers before and after the current fermer in the ordered set where name = &#63;.
    *
    * @param fermerId the primary key of the current fermer
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a fermer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer[] findByName_PrevAndNext(
        long fermerId, java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException;

    /**
    * Removes all the fermers where name = &#63; from the database.
    *
    * @param name the name
    * @throws SystemException if a system exception occurred
    */
    public void removeByName(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of fermers where name = &#63;.
    *
    * @param name the name
    * @return the number of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public int countByName(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the fermers where inn = &#63;.
    *
    * @param inn the inn
    * @return the matching fermers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findByInn(
        java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the fermers where inn = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.FermerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param inn the inn
    * @param start the lower bound of the range of fermers
    * @param end the upper bound of the range of fermers (not inclusive)
    * @return the range of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findByInn(
        java.lang.String inn, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the fermers where inn = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.FermerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param inn the inn
    * @param start the lower bound of the range of fermers
    * @param end the upper bound of the range of fermers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findByInn(
        java.lang.String inn, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first fermer in the ordered set where inn = &#63;.
    *
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer findByInn_First(
        java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException;

    /**
    * Returns the first fermer in the ordered set where inn = &#63;.
    *
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer fetchByInn_First(
        java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last fermer in the ordered set where inn = &#63;.
    *
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer findByInn_Last(
        java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException;

    /**
    * Returns the last fermer in the ordered set where inn = &#63;.
    *
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer fetchByInn_Last(
        java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the fermers before and after the current fermer in the ordered set where inn = &#63;.
    *
    * @param fermerId the primary key of the current fermer
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a fermer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer[] findByInn_PrevAndNext(
        long fermerId, java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException;

    /**
    * Removes all the fermers where inn = &#63; from the database.
    *
    * @param inn the inn
    * @throws SystemException if a system exception occurred
    */
    public void removeByInn(java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of fermers where inn = &#63;.
    *
    * @param inn the inn
    * @return the number of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public int countByInn(java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the fermers where rayonRegistration = &#63;.
    *
    * @param rayonRegistration the rayon registration
    * @return the matching fermers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findByRayonRegistration(
        java.lang.String rayonRegistration)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the fermers where rayonRegistration = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.FermerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param rayonRegistration the rayon registration
    * @param start the lower bound of the range of fermers
    * @param end the upper bound of the range of fermers (not inclusive)
    * @return the range of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findByRayonRegistration(
        java.lang.String rayonRegistration, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the fermers where rayonRegistration = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.FermerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param rayonRegistration the rayon registration
    * @param start the lower bound of the range of fermers
    * @param end the upper bound of the range of fermers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findByRayonRegistration(
        java.lang.String rayonRegistration, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first fermer in the ordered set where rayonRegistration = &#63;.
    *
    * @param rayonRegistration the rayon registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer findByRayonRegistration_First(
        java.lang.String rayonRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException;

    /**
    * Returns the first fermer in the ordered set where rayonRegistration = &#63;.
    *
    * @param rayonRegistration the rayon registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer fetchByRayonRegistration_First(
        java.lang.String rayonRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last fermer in the ordered set where rayonRegistration = &#63;.
    *
    * @param rayonRegistration the rayon registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer findByRayonRegistration_Last(
        java.lang.String rayonRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException;

    /**
    * Returns the last fermer in the ordered set where rayonRegistration = &#63;.
    *
    * @param rayonRegistration the rayon registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer fetchByRayonRegistration_Last(
        java.lang.String rayonRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the fermers before and after the current fermer in the ordered set where rayonRegistration = &#63;.
    *
    * @param fermerId the primary key of the current fermer
    * @param rayonRegistration the rayon registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a fermer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer[] findByRayonRegistration_PrevAndNext(
        long fermerId, java.lang.String rayonRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException;

    /**
    * Removes all the fermers where rayonRegistration = &#63; from the database.
    *
    * @param rayonRegistration the rayon registration
    * @throws SystemException if a system exception occurred
    */
    public void removeByRayonRegistration(java.lang.String rayonRegistration)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of fermers where rayonRegistration = &#63;.
    *
    * @param rayonRegistration the rayon registration
    * @return the number of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public int countByRayonRegistration(java.lang.String rayonRegistration)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the fermers where dateRegistration = &#63;.
    *
    * @param dateRegistration the date registration
    * @return the matching fermers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findByDateRegistration(
        java.util.Date dateRegistration)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the fermers where dateRegistration = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.FermerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dateRegistration the date registration
    * @param start the lower bound of the range of fermers
    * @param end the upper bound of the range of fermers (not inclusive)
    * @return the range of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findByDateRegistration(
        java.util.Date dateRegistration, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the fermers where dateRegistration = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.FermerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dateRegistration the date registration
    * @param start the lower bound of the range of fermers
    * @param end the upper bound of the range of fermers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findByDateRegistration(
        java.util.Date dateRegistration, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first fermer in the ordered set where dateRegistration = &#63;.
    *
    * @param dateRegistration the date registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer findByDateRegistration_First(
        java.util.Date dateRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException;

    /**
    * Returns the first fermer in the ordered set where dateRegistration = &#63;.
    *
    * @param dateRegistration the date registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer fetchByDateRegistration_First(
        java.util.Date dateRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last fermer in the ordered set where dateRegistration = &#63;.
    *
    * @param dateRegistration the date registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer findByDateRegistration_Last(
        java.util.Date dateRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException;

    /**
    * Returns the last fermer in the ordered set where dateRegistration = &#63;.
    *
    * @param dateRegistration the date registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer fetchByDateRegistration_Last(
        java.util.Date dateRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the fermers before and after the current fermer in the ordered set where dateRegistration = &#63;.
    *
    * @param fermerId the primary key of the current fermer
    * @param dateRegistration the date registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a fermer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer[] findByDateRegistration_PrevAndNext(
        long fermerId, java.util.Date dateRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException;

    /**
    * Removes all the fermers where dateRegistration = &#63; from the database.
    *
    * @param dateRegistration the date registration
    * @throws SystemException if a system exception occurred
    */
    public void removeByDateRegistration(java.util.Date dateRegistration)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of fermers where dateRegistration = &#63;.
    *
    * @param dateRegistration the date registration
    * @return the number of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public int countByDateRegistration(java.util.Date dateRegistration)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the fermers where archiveStatus = &#63;.
    *
    * @param archiveStatus the archive status
    * @return the matching fermers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findByArchiveStatus(
        boolean archiveStatus)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the fermers where archiveStatus = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.FermerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archiveStatus the archive status
    * @param start the lower bound of the range of fermers
    * @param end the upper bound of the range of fermers (not inclusive)
    * @return the range of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findByArchiveStatus(
        boolean archiveStatus, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the fermers where archiveStatus = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.FermerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archiveStatus the archive status
    * @param start the lower bound of the range of fermers
    * @param end the upper bound of the range of fermers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findByArchiveStatus(
        boolean archiveStatus, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first fermer in the ordered set where archiveStatus = &#63;.
    *
    * @param archiveStatus the archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer findByArchiveStatus_First(
        boolean archiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException;

    /**
    * Returns the first fermer in the ordered set where archiveStatus = &#63;.
    *
    * @param archiveStatus the archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer fetchByArchiveStatus_First(
        boolean archiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last fermer in the ordered set where archiveStatus = &#63;.
    *
    * @param archiveStatus the archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer findByArchiveStatus_Last(
        boolean archiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException;

    /**
    * Returns the last fermer in the ordered set where archiveStatus = &#63;.
    *
    * @param archiveStatus the archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer fetchByArchiveStatus_Last(
        boolean archiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the fermers before and after the current fermer in the ordered set where archiveStatus = &#63;.
    *
    * @param fermerId the primary key of the current fermer
    * @param archiveStatus the archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a fermer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer[] findByArchiveStatus_PrevAndNext(
        long fermerId, boolean archiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException;

    /**
    * Removes all the fermers where archiveStatus = &#63; from the database.
    *
    * @param archiveStatus the archive status
    * @throws SystemException if a system exception occurred
    */
    public void removeByArchiveStatus(boolean archiveStatus)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of fermers where archiveStatus = &#63;.
    *
    * @param archiveStatus the archive status
    * @return the number of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public int countByArchiveStatus(boolean archiveStatus)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the fermer in the entity cache if it is enabled.
    *
    * @param fermer the fermer
    */
    public void cacheResult(com.liferay.reestrFermerov.model.Fermer fermer);

    /**
    * Caches the fermers in the entity cache if it is enabled.
    *
    * @param fermers the fermers
    */
    public void cacheResult(
        java.util.List<com.liferay.reestrFermerov.model.Fermer> fermers);

    /**
    * Creates a new fermer with the primary key. Does not add the fermer to the database.
    *
    * @param fermerId the primary key for the new fermer
    * @return the new fermer
    */
    public com.liferay.reestrFermerov.model.Fermer create(long fermerId);

    /**
    * Removes the fermer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param fermerId the primary key of the fermer
    * @return the fermer that was removed
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a fermer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer remove(long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException;

    public com.liferay.reestrFermerov.model.Fermer updateImpl(
        com.liferay.reestrFermerov.model.Fermer fermer)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the fermer with the primary key or throws a {@link com.liferay.reestrFermerov.NoSuchFermerException} if it could not be found.
    *
    * @param fermerId the primary key of the fermer
    * @return the fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a fermer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer findByPrimaryKey(
        long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException;

    /**
    * Returns the fermer with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param fermerId the primary key of the fermer
    * @return the fermer, or <code>null</code> if a fermer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrFermerov.model.Fermer fetchByPrimaryKey(
        long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the fermers.
    *
    * @return the fermers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the fermers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.FermerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of fermers
    * @param end the upper bound of the range of fermers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of fermers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Fermer> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the fermers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of fermers.
    *
    * @return the number of fermers
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the rayons associated with the fermer.
    *
    * @param pk the primary key of the fermer
    * @return the rayons associated with the fermer
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> getRayons(
        long pk) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the rayons associated with the fermer.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.FermerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the fermer
    * @param start the lower bound of the range of fermers
    * @param end the upper bound of the range of fermers (not inclusive)
    * @return the range of rayons associated with the fermer
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> getRayons(
        long pk, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the rayons associated with the fermer.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrFermerov.model.impl.FermerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the fermer
    * @param start the lower bound of the range of fermers
    * @param end the upper bound of the range of fermers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of rayons associated with the fermer
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrFermerov.model.Rayon> getRayons(
        long pk, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rayons associated with the fermer.
    *
    * @param pk the primary key of the fermer
    * @return the number of rayons associated with the fermer
    * @throws SystemException if a system exception occurred
    */
    public int getRayonsSize(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns <code>true</code> if the rayon is associated with the fermer.
    *
    * @param pk the primary key of the fermer
    * @param rayonPK the primary key of the rayon
    * @return <code>true</code> if the rayon is associated with the fermer; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public boolean containsRayon(long pk, long rayonPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns <code>true</code> if the fermer has any rayons associated with it.
    *
    * @param pk the primary key of the fermer to check for associations with rayons
    * @return <code>true</code> if the fermer has any rayons associated with it; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public boolean containsRayons(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the fermer and the rayon. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer
    * @param rayonPK the primary key of the rayon
    * @throws SystemException if a system exception occurred
    */
    public void addRayon(long pk, long rayonPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the fermer and the rayon. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer
    * @param rayon the rayon
    * @throws SystemException if a system exception occurred
    */
    public void addRayon(long pk, com.liferay.reestrFermerov.model.Rayon rayon)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the fermer and the rayons. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer
    * @param rayonPKs the primary keys of the rayons
    * @throws SystemException if a system exception occurred
    */
    public void addRayons(long pk, long[] rayonPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the fermer and the rayons. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer
    * @param rayons the rayons
    * @throws SystemException if a system exception occurred
    */
    public void addRayons(long pk,
        java.util.List<com.liferay.reestrFermerov.model.Rayon> rayons)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Clears all associations between the fermer and its rayons. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer to clear the associated rayons from
    * @throws SystemException if a system exception occurred
    */
    public void clearRayons(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the fermer and the rayon. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer
    * @param rayonPK the primary key of the rayon
    * @throws SystemException if a system exception occurred
    */
    public void removeRayon(long pk, long rayonPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the fermer and the rayon. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer
    * @param rayon the rayon
    * @throws SystemException if a system exception occurred
    */
    public void removeRayon(long pk,
        com.liferay.reestrFermerov.model.Rayon rayon)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the fermer and the rayons. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer
    * @param rayonPKs the primary keys of the rayons
    * @throws SystemException if a system exception occurred
    */
    public void removeRayons(long pk, long[] rayonPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the fermer and the rayons. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer
    * @param rayons the rayons
    * @throws SystemException if a system exception occurred
    */
    public void removeRayons(long pk,
        java.util.List<com.liferay.reestrFermerov.model.Rayon> rayons)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Sets the rayons associated with the fermer, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer
    * @param rayonPKs the primary keys of the rayons to be associated with the fermer
    * @throws SystemException if a system exception occurred
    */
    public void setRayons(long pk, long[] rayonPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Sets the rayons associated with the fermer, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer
    * @param rayons the rayons to be associated with the fermer
    * @throws SystemException if a system exception occurred
    */
    public void setRayons(long pk,
        java.util.List<com.liferay.reestrFermerov.model.Rayon> rayons)
        throws com.liferay.portal.kernel.exception.SystemException;
}
