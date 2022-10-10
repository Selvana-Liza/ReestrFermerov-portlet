package com.liferay.reestrFermerov.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.reestrFermerov.model.Fermer;

import java.util.List;

/**
 * The persistence utility for the fermer service. This utility wraps {@link FermerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liza
 * @see FermerPersistence
 * @see FermerPersistenceImpl
 * @generated
 */
public class FermerUtil {
    private static FermerPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Fermer fermer) {
        getPersistence().clearCache(fermer);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Fermer> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Fermer> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Fermer> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Fermer update(Fermer fermer) throws SystemException {
        return getPersistence().update(fermer);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Fermer update(Fermer fermer, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(fermer, serviceContext);
    }

    /**
    * Returns all the fermers where fermerId = &#63;.
    *
    * @param fermerId the fermer ID
    * @return the matching fermers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findByfermerId(
        long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByfermerId(fermerId);
    }

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
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findByfermerId(
        long fermerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByfermerId(fermerId, start, end);
    }

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
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findByfermerId(
        long fermerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByfermerId(fermerId, start, end, orderByComparator);
    }

    /**
    * Returns the first fermer in the ordered set where fermerId = &#63;.
    *
    * @param fermerId the fermer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer findByfermerId_First(
        long fermerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException {
        return getPersistence().findByfermerId_First(fermerId, orderByComparator);
    }

    /**
    * Returns the first fermer in the ordered set where fermerId = &#63;.
    *
    * @param fermerId the fermer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer fetchByfermerId_First(
        long fermerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByfermerId_First(fermerId, orderByComparator);
    }

    /**
    * Returns the last fermer in the ordered set where fermerId = &#63;.
    *
    * @param fermerId the fermer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer findByfermerId_Last(
        long fermerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException {
        return getPersistence().findByfermerId_Last(fermerId, orderByComparator);
    }

    /**
    * Returns the last fermer in the ordered set where fermerId = &#63;.
    *
    * @param fermerId the fermer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer fetchByfermerId_Last(
        long fermerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByfermerId_Last(fermerId, orderByComparator);
    }

    /**
    * Removes all the fermers where fermerId = &#63; from the database.
    *
    * @param fermerId the fermer ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByfermerId(long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByfermerId(fermerId);
    }

    /**
    * Returns the number of fermers where fermerId = &#63;.
    *
    * @param fermerId the fermer ID
    * @return the number of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public static int countByfermerId(long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByfermerId(fermerId);
    }

    /**
    * Returns all the fermers where name = &#63;.
    *
    * @param name the name
    * @return the matching fermers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findByName(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName(name);
    }

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
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findByName(
        java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName(name, start, end);
    }

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
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findByName(
        java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName(name, start, end, orderByComparator);
    }

    /**
    * Returns the first fermer in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer findByName_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException {
        return getPersistence().findByName_First(name, orderByComparator);
    }

    /**
    * Returns the first fermer in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer fetchByName_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByName_First(name, orderByComparator);
    }

    /**
    * Returns the last fermer in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer findByName_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException {
        return getPersistence().findByName_Last(name, orderByComparator);
    }

    /**
    * Returns the last fermer in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer fetchByName_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByName_Last(name, orderByComparator);
    }

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
    public static com.liferay.reestrFermerov.model.Fermer[] findByName_PrevAndNext(
        long fermerId, java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException {
        return getPersistence()
                   .findByName_PrevAndNext(fermerId, name, orderByComparator);
    }

    /**
    * Removes all the fermers where name = &#63; from the database.
    *
    * @param name the name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByName(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByName(name);
    }

    /**
    * Returns the number of fermers where name = &#63;.
    *
    * @param name the name
    * @return the number of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public static int countByName(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByName(name);
    }

    /**
    * Returns all the fermers where inn = &#63;.
    *
    * @param inn the inn
    * @return the matching fermers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findByInn(
        java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInn(inn);
    }

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
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findByInn(
        java.lang.String inn, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInn(inn, start, end);
    }

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
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findByInn(
        java.lang.String inn, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInn(inn, start, end, orderByComparator);
    }

    /**
    * Returns the first fermer in the ordered set where inn = &#63;.
    *
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer findByInn_First(
        java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException {
        return getPersistence().findByInn_First(inn, orderByComparator);
    }

    /**
    * Returns the first fermer in the ordered set where inn = &#63;.
    *
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer fetchByInn_First(
        java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByInn_First(inn, orderByComparator);
    }

    /**
    * Returns the last fermer in the ordered set where inn = &#63;.
    *
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer findByInn_Last(
        java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException {
        return getPersistence().findByInn_Last(inn, orderByComparator);
    }

    /**
    * Returns the last fermer in the ordered set where inn = &#63;.
    *
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer fetchByInn_Last(
        java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByInn_Last(inn, orderByComparator);
    }

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
    public static com.liferay.reestrFermerov.model.Fermer[] findByInn_PrevAndNext(
        long fermerId, java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException {
        return getPersistence()
                   .findByInn_PrevAndNext(fermerId, inn, orderByComparator);
    }

    /**
    * Removes all the fermers where inn = &#63; from the database.
    *
    * @param inn the inn
    * @throws SystemException if a system exception occurred
    */
    public static void removeByInn(java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByInn(inn);
    }

    /**
    * Returns the number of fermers where inn = &#63;.
    *
    * @param inn the inn
    * @return the number of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public static int countByInn(java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByInn(inn);
    }

    /**
    * Returns all the fermers where rayonRegistration = &#63;.
    *
    * @param rayonRegistration the rayon registration
    * @return the matching fermers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findByRayonRegistration(
        java.lang.String rayonRegistration)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByRayonRegistration(rayonRegistration);
    }

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
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findByRayonRegistration(
        java.lang.String rayonRegistration, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRayonRegistration(rayonRegistration, start, end);
    }

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
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findByRayonRegistration(
        java.lang.String rayonRegistration, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRayonRegistration(rayonRegistration, start, end,
            orderByComparator);
    }

    /**
    * Returns the first fermer in the ordered set where rayonRegistration = &#63;.
    *
    * @param rayonRegistration the rayon registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer findByRayonRegistration_First(
        java.lang.String rayonRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException {
        return getPersistence()
                   .findByRayonRegistration_First(rayonRegistration,
            orderByComparator);
    }

    /**
    * Returns the first fermer in the ordered set where rayonRegistration = &#63;.
    *
    * @param rayonRegistration the rayon registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer fetchByRayonRegistration_First(
        java.lang.String rayonRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByRayonRegistration_First(rayonRegistration,
            orderByComparator);
    }

    /**
    * Returns the last fermer in the ordered set where rayonRegistration = &#63;.
    *
    * @param rayonRegistration the rayon registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer findByRayonRegistration_Last(
        java.lang.String rayonRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException {
        return getPersistence()
                   .findByRayonRegistration_Last(rayonRegistration,
            orderByComparator);
    }

    /**
    * Returns the last fermer in the ordered set where rayonRegistration = &#63;.
    *
    * @param rayonRegistration the rayon registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer fetchByRayonRegistration_Last(
        java.lang.String rayonRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByRayonRegistration_Last(rayonRegistration,
            orderByComparator);
    }

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
    public static com.liferay.reestrFermerov.model.Fermer[] findByRayonRegistration_PrevAndNext(
        long fermerId, java.lang.String rayonRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException {
        return getPersistence()
                   .findByRayonRegistration_PrevAndNext(fermerId,
            rayonRegistration, orderByComparator);
    }

    /**
    * Removes all the fermers where rayonRegistration = &#63; from the database.
    *
    * @param rayonRegistration the rayon registration
    * @throws SystemException if a system exception occurred
    */
    public static void removeByRayonRegistration(
        java.lang.String rayonRegistration)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByRayonRegistration(rayonRegistration);
    }

    /**
    * Returns the number of fermers where rayonRegistration = &#63;.
    *
    * @param rayonRegistration the rayon registration
    * @return the number of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public static int countByRayonRegistration(
        java.lang.String rayonRegistration)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByRayonRegistration(rayonRegistration);
    }

    /**
    * Returns all the fermers where dateRegistration = &#63;.
    *
    * @param dateRegistration the date registration
    * @return the matching fermers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findByDateRegistration(
        java.util.Date dateRegistration)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDateRegistration(dateRegistration);
    }

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
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findByDateRegistration(
        java.util.Date dateRegistration, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByDateRegistration(dateRegistration, start, end);
    }

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
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findByDateRegistration(
        java.util.Date dateRegistration, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByDateRegistration(dateRegistration, start, end,
            orderByComparator);
    }

    /**
    * Returns the first fermer in the ordered set where dateRegistration = &#63;.
    *
    * @param dateRegistration the date registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer findByDateRegistration_First(
        java.util.Date dateRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException {
        return getPersistence()
                   .findByDateRegistration_First(dateRegistration,
            orderByComparator);
    }

    /**
    * Returns the first fermer in the ordered set where dateRegistration = &#63;.
    *
    * @param dateRegistration the date registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer fetchByDateRegistration_First(
        java.util.Date dateRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByDateRegistration_First(dateRegistration,
            orderByComparator);
    }

    /**
    * Returns the last fermer in the ordered set where dateRegistration = &#63;.
    *
    * @param dateRegistration the date registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer findByDateRegistration_Last(
        java.util.Date dateRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException {
        return getPersistence()
                   .findByDateRegistration_Last(dateRegistration,
            orderByComparator);
    }

    /**
    * Returns the last fermer in the ordered set where dateRegistration = &#63;.
    *
    * @param dateRegistration the date registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer fetchByDateRegistration_Last(
        java.util.Date dateRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByDateRegistration_Last(dateRegistration,
            orderByComparator);
    }

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
    public static com.liferay.reestrFermerov.model.Fermer[] findByDateRegistration_PrevAndNext(
        long fermerId, java.util.Date dateRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException {
        return getPersistence()
                   .findByDateRegistration_PrevAndNext(fermerId,
            dateRegistration, orderByComparator);
    }

    /**
    * Removes all the fermers where dateRegistration = &#63; from the database.
    *
    * @param dateRegistration the date registration
    * @throws SystemException if a system exception occurred
    */
    public static void removeByDateRegistration(java.util.Date dateRegistration)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByDateRegistration(dateRegistration);
    }

    /**
    * Returns the number of fermers where dateRegistration = &#63;.
    *
    * @param dateRegistration the date registration
    * @return the number of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public static int countByDateRegistration(java.util.Date dateRegistration)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByDateRegistration(dateRegistration);
    }

    /**
    * Returns all the fermers where archiveStatus = &#63;.
    *
    * @param archiveStatus the archive status
    * @return the matching fermers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findByArchiveStatus(
        boolean archiveStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByArchiveStatus(archiveStatus);
    }

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
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findByArchiveStatus(
        boolean archiveStatus, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByArchiveStatus(archiveStatus, start, end);
    }

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
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findByArchiveStatus(
        boolean archiveStatus, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByArchiveStatus(archiveStatus, start, end,
            orderByComparator);
    }

    /**
    * Returns the first fermer in the ordered set where archiveStatus = &#63;.
    *
    * @param archiveStatus the archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer findByArchiveStatus_First(
        boolean archiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException {
        return getPersistence()
                   .findByArchiveStatus_First(archiveStatus, orderByComparator);
    }

    /**
    * Returns the first fermer in the ordered set where archiveStatus = &#63;.
    *
    * @param archiveStatus the archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer fetchByArchiveStatus_First(
        boolean archiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByArchiveStatus_First(archiveStatus, orderByComparator);
    }

    /**
    * Returns the last fermer in the ordered set where archiveStatus = &#63;.
    *
    * @param archiveStatus the archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer findByArchiveStatus_Last(
        boolean archiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException {
        return getPersistence()
                   .findByArchiveStatus_Last(archiveStatus, orderByComparator);
    }

    /**
    * Returns the last fermer in the ordered set where archiveStatus = &#63;.
    *
    * @param archiveStatus the archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching fermer, or <code>null</code> if a matching fermer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer fetchByArchiveStatus_Last(
        boolean archiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByArchiveStatus_Last(archiveStatus, orderByComparator);
    }

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
    public static com.liferay.reestrFermerov.model.Fermer[] findByArchiveStatus_PrevAndNext(
        long fermerId, boolean archiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException {
        return getPersistence()
                   .findByArchiveStatus_PrevAndNext(fermerId, archiveStatus,
            orderByComparator);
    }

    /**
    * Removes all the fermers where archiveStatus = &#63; from the database.
    *
    * @param archiveStatus the archive status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByArchiveStatus(boolean archiveStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByArchiveStatus(archiveStatus);
    }

    /**
    * Returns the number of fermers where archiveStatus = &#63;.
    *
    * @param archiveStatus the archive status
    * @return the number of matching fermers
    * @throws SystemException if a system exception occurred
    */
    public static int countByArchiveStatus(boolean archiveStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByArchiveStatus(archiveStatus);
    }

    /**
    * Caches the fermer in the entity cache if it is enabled.
    *
    * @param fermer the fermer
    */
    public static void cacheResult(
        com.liferay.reestrFermerov.model.Fermer fermer) {
        getPersistence().cacheResult(fermer);
    }

    /**
    * Caches the fermers in the entity cache if it is enabled.
    *
    * @param fermers the fermers
    */
    public static void cacheResult(
        java.util.List<com.liferay.reestrFermerov.model.Fermer> fermers) {
        getPersistence().cacheResult(fermers);
    }

    /**
    * Creates a new fermer with the primary key. Does not add the fermer to the database.
    *
    * @param fermerId the primary key for the new fermer
    * @return the new fermer
    */
    public static com.liferay.reestrFermerov.model.Fermer create(long fermerId) {
        return getPersistence().create(fermerId);
    }

    /**
    * Removes the fermer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param fermerId the primary key of the fermer
    * @return the fermer that was removed
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a fermer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer remove(long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException {
        return getPersistence().remove(fermerId);
    }

    public static com.liferay.reestrFermerov.model.Fermer updateImpl(
        com.liferay.reestrFermerov.model.Fermer fermer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(fermer);
    }

    /**
    * Returns the fermer with the primary key or throws a {@link com.liferay.reestrFermerov.NoSuchFermerException} if it could not be found.
    *
    * @param fermerId the primary key of the fermer
    * @return the fermer
    * @throws com.liferay.reestrFermerov.NoSuchFermerException if a fermer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer findByPrimaryKey(
        long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrFermerov.NoSuchFermerException {
        return getPersistence().findByPrimaryKey(fermerId);
    }

    /**
    * Returns the fermer with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param fermerId the primary key of the fermer
    * @return the fermer, or <code>null</code> if a fermer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrFermerov.model.Fermer fetchByPrimaryKey(
        long fermerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(fermerId);
    }

    /**
    * Returns all the fermers.
    *
    * @return the fermers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.liferay.reestrFermerov.model.Fermer> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the fermers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of fermers.
    *
    * @return the number of fermers
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    /**
    * Returns all the rayons associated with the fermer.
    *
    * @param pk the primary key of the fermer
    * @return the rayons associated with the fermer
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrFermerov.model.Rayon> getRayons(
        long pk) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getRayons(pk);
    }

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
    public static java.util.List<com.liferay.reestrFermerov.model.Rayon> getRayons(
        long pk, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getRayons(pk, start, end);
    }

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
    public static java.util.List<com.liferay.reestrFermerov.model.Rayon> getRayons(
        long pk, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getRayons(pk, start, end, orderByComparator);
    }

    /**
    * Returns the number of rayons associated with the fermer.
    *
    * @param pk the primary key of the fermer
    * @return the number of rayons associated with the fermer
    * @throws SystemException if a system exception occurred
    */
    public static int getRayonsSize(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getRayonsSize(pk);
    }

    /**
    * Returns <code>true</code> if the rayon is associated with the fermer.
    *
    * @param pk the primary key of the fermer
    * @param rayonPK the primary key of the rayon
    * @return <code>true</code> if the rayon is associated with the fermer; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsRayon(long pk, long rayonPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsRayon(pk, rayonPK);
    }

    /**
    * Returns <code>true</code> if the fermer has any rayons associated with it.
    *
    * @param pk the primary key of the fermer to check for associations with rayons
    * @return <code>true</code> if the fermer has any rayons associated with it; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsRayons(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsRayons(pk);
    }

    /**
    * Adds an association between the fermer and the rayon. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer
    * @param rayonPK the primary key of the rayon
    * @throws SystemException if a system exception occurred
    */
    public static void addRayon(long pk, long rayonPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addRayon(pk, rayonPK);
    }

    /**
    * Adds an association between the fermer and the rayon. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer
    * @param rayon the rayon
    * @throws SystemException if a system exception occurred
    */
    public static void addRayon(long pk,
        com.liferay.reestrFermerov.model.Rayon rayon)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addRayon(pk, rayon);
    }

    /**
    * Adds an association between the fermer and the rayons. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer
    * @param rayonPKs the primary keys of the rayons
    * @throws SystemException if a system exception occurred
    */
    public static void addRayons(long pk, long[] rayonPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addRayons(pk, rayonPKs);
    }

    /**
    * Adds an association between the fermer and the rayons. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer
    * @param rayons the rayons
    * @throws SystemException if a system exception occurred
    */
    public static void addRayons(long pk,
        java.util.List<com.liferay.reestrFermerov.model.Rayon> rayons)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addRayons(pk, rayons);
    }

    /**
    * Clears all associations between the fermer and its rayons. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer to clear the associated rayons from
    * @throws SystemException if a system exception occurred
    */
    public static void clearRayons(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().clearRayons(pk);
    }

    /**
    * Removes the association between the fermer and the rayon. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer
    * @param rayonPK the primary key of the rayon
    * @throws SystemException if a system exception occurred
    */
    public static void removeRayon(long pk, long rayonPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeRayon(pk, rayonPK);
    }

    /**
    * Removes the association between the fermer and the rayon. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer
    * @param rayon the rayon
    * @throws SystemException if a system exception occurred
    */
    public static void removeRayon(long pk,
        com.liferay.reestrFermerov.model.Rayon rayon)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeRayon(pk, rayon);
    }

    /**
    * Removes the association between the fermer and the rayons. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer
    * @param rayonPKs the primary keys of the rayons
    * @throws SystemException if a system exception occurred
    */
    public static void removeRayons(long pk, long[] rayonPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeRayons(pk, rayonPKs);
    }

    /**
    * Removes the association between the fermer and the rayons. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer
    * @param rayons the rayons
    * @throws SystemException if a system exception occurred
    */
    public static void removeRayons(long pk,
        java.util.List<com.liferay.reestrFermerov.model.Rayon> rayons)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeRayons(pk, rayons);
    }

    /**
    * Sets the rayons associated with the fermer, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer
    * @param rayonPKs the primary keys of the rayons to be associated with the fermer
    * @throws SystemException if a system exception occurred
    */
    public static void setRayons(long pk, long[] rayonPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().setRayons(pk, rayonPKs);
    }

    /**
    * Sets the rayons associated with the fermer, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the fermer
    * @param rayons the rayons to be associated with the fermer
    * @throws SystemException if a system exception occurred
    */
    public static void setRayons(long pk,
        java.util.List<com.liferay.reestrFermerov.model.Rayon> rayons)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().setRayons(pk, rayons);
    }

    public static FermerPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (FermerPersistence) PortletBeanLocatorUtil.locate(com.liferay.reestrFermerov.service.ClpSerializer.getServletContextName(),
                    FermerPersistence.class.getName());

            ReferenceRegistry.registerReference(FermerUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(FermerPersistence persistence) {
    }
}
