package com.liferay.reestrFermerov.service.persistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.service.persistence.impl.TableMapper;
import com.liferay.portal.service.persistence.impl.TableMapperFactory;

import com.liferay.reestrFermerov.NoSuchFermerException;
import com.liferay.reestrFermerov.model.Fermer;
import com.liferay.reestrFermerov.model.impl.FermerImpl;
import com.liferay.reestrFermerov.model.impl.FermerModelImpl;
import com.liferay.reestrFermerov.service.persistence.FermerPersistence;
import com.liferay.reestrFermerov.service.persistence.RayonPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the fermer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liza
 * @see FermerPersistence
 * @see FermerUtil
 * @generated
 */
public class FermerPersistenceImpl extends BasePersistenceImpl<Fermer>
    implements FermerPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link FermerUtil} to access the fermer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = FermerImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, FermerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, FermerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FERMERID = new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, FermerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByfermerId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FERMERID =
        new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, FermerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByfermerId",
            new String[] { Long.class.getName() },
            FermerModelImpl.FERMERID_COLUMN_BITMASK |
            FermerModelImpl.NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_FERMERID = new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfermerId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_FERMERID_FERMERID_2 = "fermer.fermerId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME = new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, FermerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByName",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME = new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, FermerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByName",
            new String[] { String.class.getName() },
            FermerModelImpl.NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_NAME = new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByName",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_NAME_NAME_1 = "fermer.name IS NULL";
    private static final String _FINDER_COLUMN_NAME_NAME_2 = "fermer.name = ?";
    private static final String _FINDER_COLUMN_NAME_NAME_3 = "(fermer.name IS NULL OR fermer.name = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INN = new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, FermerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInn",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INN = new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, FermerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInn",
            new String[] { String.class.getName() },
            FermerModelImpl.INN_COLUMN_BITMASK |
            FermerModelImpl.NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_INN = new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInn",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_INN_INN_1 = "fermer.inn IS NULL";
    private static final String _FINDER_COLUMN_INN_INN_2 = "fermer.inn = ?";
    private static final String _FINDER_COLUMN_INN_INN_3 = "(fermer.inn IS NULL OR fermer.inn = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_RAYONREGISTRATION =
        new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, FermerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRayonRegistration",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RAYONREGISTRATION =
        new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, FermerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByRayonRegistration", new String[] { String.class.getName() },
            FermerModelImpl.RAYONREGISTRATION_COLUMN_BITMASK |
            FermerModelImpl.NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_RAYONREGISTRATION = new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByRayonRegistration", new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_RAYONREGISTRATION_RAYONREGISTRATION_1 =
        "fermer.rayonRegistration IS NULL";
    private static final String _FINDER_COLUMN_RAYONREGISTRATION_RAYONREGISTRATION_2 =
        "fermer.rayonRegistration = ?";
    private static final String _FINDER_COLUMN_RAYONREGISTRATION_RAYONREGISTRATION_3 =
        "(fermer.rayonRegistration IS NULL OR fermer.rayonRegistration = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DATEREGISTRATION =
        new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, FermerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDateRegistration",
            new String[] {
                Date.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATEREGISTRATION =
        new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, FermerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByDateRegistration", new String[] { Date.class.getName() },
            FermerModelImpl.DATEREGISTRATION_COLUMN_BITMASK |
            FermerModelImpl.NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_DATEREGISTRATION = new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByDateRegistration", new String[] { Date.class.getName() });
    private static final String _FINDER_COLUMN_DATEREGISTRATION_DATEREGISTRATION_1 =
        "fermer.dateRegistration IS NULL";
    private static final String _FINDER_COLUMN_DATEREGISTRATION_DATEREGISTRATION_2 =
        "fermer.dateRegistration = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ARCHIVESTATUS =
        new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, FermerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByArchiveStatus",
            new String[] {
                Boolean.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVESTATUS =
        new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, FermerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByArchiveStatus",
            new String[] { Boolean.class.getName() },
            FermerModelImpl.ARCHIVESTATUS_COLUMN_BITMASK |
            FermerModelImpl.NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ARCHIVESTATUS = new FinderPath(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByArchiveStatus",
            new String[] { Boolean.class.getName() });
    private static final String _FINDER_COLUMN_ARCHIVESTATUS_ARCHIVESTATUS_2 = "fermer.archiveStatus = ?";
    private static final String _SQL_SELECT_FERMER = "SELECT fermer FROM Fermer fermer";
    private static final String _SQL_SELECT_FERMER_WHERE = "SELECT fermer FROM Fermer fermer WHERE ";
    private static final String _SQL_COUNT_FERMER = "SELECT COUNT(fermer) FROM Fermer fermer";
    private static final String _SQL_COUNT_FERMER_WHERE = "SELECT COUNT(fermer) FROM Fermer fermer WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "fermer.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Fermer exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Fermer exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(FermerPersistenceImpl.class);
    private static Fermer _nullFermer = new FermerImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Fermer> toCacheModel() {
                return _nullFermerCacheModel;
            }
        };

    private static CacheModel<Fermer> _nullFermerCacheModel = new CacheModel<Fermer>() {
            @Override
            public Fermer toEntityModel() {
                return _nullFermer;
            }
        };

    @BeanReference(type = RayonPersistence.class)
    protected RayonPersistence rayonPersistence;
    protected TableMapper<Fermer, com.liferay.reestrFermerov.model.Rayon> fermerToRayonTableMapper;

    public FermerPersistenceImpl() {
        setModelClass(Fermer.class);
    }

    /**
     * Returns all the fermers where fermerId = &#63;.
     *
     * @param fermerId the fermer ID
     * @return the matching fermers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Fermer> findByfermerId(long fermerId) throws SystemException {
        return findByfermerId(fermerId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
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
    @Override
    public List<Fermer> findByfermerId(long fermerId, int start, int end)
        throws SystemException {
        return findByfermerId(fermerId, start, end, null);
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
    @Override
    public List<Fermer> findByfermerId(long fermerId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FERMERID;
            finderArgs = new Object[] { fermerId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FERMERID;
            finderArgs = new Object[] { fermerId, start, end, orderByComparator };
        }

        List<Fermer> list = (List<Fermer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Fermer fermer : list) {
                if ((fermerId != fermer.getFermerId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_FERMER_WHERE);

            query.append(_FINDER_COLUMN_FERMERID_FERMERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FermerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(fermerId);

                if (!pagination) {
                    list = (List<Fermer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Fermer>(list);
                } else {
                    list = (List<Fermer>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Fermer findByfermerId_First(long fermerId,
        OrderByComparator orderByComparator)
        throws NoSuchFermerException, SystemException {
        Fermer fermer = fetchByfermerId_First(fermerId, orderByComparator);

        if (fermer != null) {
            return fermer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("fermerId=");
        msg.append(fermerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFermerException(msg.toString());
    }

    /**
     * Returns the first fermer in the ordered set where fermerId = &#63;.
     *
     * @param fermerId the fermer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching fermer, or <code>null</code> if a matching fermer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Fermer fetchByfermerId_First(long fermerId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Fermer> list = findByfermerId(fermerId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Fermer findByfermerId_Last(long fermerId,
        OrderByComparator orderByComparator)
        throws NoSuchFermerException, SystemException {
        Fermer fermer = fetchByfermerId_Last(fermerId, orderByComparator);

        if (fermer != null) {
            return fermer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("fermerId=");
        msg.append(fermerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFermerException(msg.toString());
    }

    /**
     * Returns the last fermer in the ordered set where fermerId = &#63;.
     *
     * @param fermerId the fermer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching fermer, or <code>null</code> if a matching fermer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Fermer fetchByfermerId_Last(long fermerId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByfermerId(fermerId);

        if (count == 0) {
            return null;
        }

        List<Fermer> list = findByfermerId(fermerId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Removes all the fermers where fermerId = &#63; from the database.
     *
     * @param fermerId the fermer ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByfermerId(long fermerId) throws SystemException {
        for (Fermer fermer : findByfermerId(fermerId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(fermer);
        }
    }

    /**
     * Returns the number of fermers where fermerId = &#63;.
     *
     * @param fermerId the fermer ID
     * @return the number of matching fermers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByfermerId(long fermerId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_FERMERID;

        Object[] finderArgs = new Object[] { fermerId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_FERMER_WHERE);

            query.append(_FINDER_COLUMN_FERMERID_FERMERID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(fermerId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the fermers where name = &#63;.
     *
     * @param name the name
     * @return the matching fermers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Fermer> findByName(String name) throws SystemException {
        return findByName(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Fermer> findByName(String name, int start, int end)
        throws SystemException {
        return findByName(name, start, end, null);
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
    @Override
    public List<Fermer> findByName(String name, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME;
            finderArgs = new Object[] { name };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME;
            finderArgs = new Object[] { name, start, end, orderByComparator };
        }

        List<Fermer> list = (List<Fermer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Fermer fermer : list) {
                if (!Validator.equals(name, fermer.getName())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_FERMER_WHERE);

            boolean bindName = false;

            if (name == null) {
                query.append(_FINDER_COLUMN_NAME_NAME_1);
            } else if (name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_NAME_3);
            } else {
                bindName = true;

                query.append(_FINDER_COLUMN_NAME_NAME_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FermerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindName) {
                    qPos.add(name);
                }

                if (!pagination) {
                    list = (List<Fermer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Fermer>(list);
                } else {
                    list = (List<Fermer>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Fermer findByName_First(String name,
        OrderByComparator orderByComparator)
        throws NoSuchFermerException, SystemException {
        Fermer fermer = fetchByName_First(name, orderByComparator);

        if (fermer != null) {
            return fermer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("name=");
        msg.append(name);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFermerException(msg.toString());
    }

    /**
     * Returns the first fermer in the ordered set where name = &#63;.
     *
     * @param name the name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching fermer, or <code>null</code> if a matching fermer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Fermer fetchByName_First(String name,
        OrderByComparator orderByComparator) throws SystemException {
        List<Fermer> list = findByName(name, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Fermer findByName_Last(String name,
        OrderByComparator orderByComparator)
        throws NoSuchFermerException, SystemException {
        Fermer fermer = fetchByName_Last(name, orderByComparator);

        if (fermer != null) {
            return fermer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("name=");
        msg.append(name);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFermerException(msg.toString());
    }

    /**
     * Returns the last fermer in the ordered set where name = &#63;.
     *
     * @param name the name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching fermer, or <code>null</code> if a matching fermer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Fermer fetchByName_Last(String name,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByName(name);

        if (count == 0) {
            return null;
        }

        List<Fermer> list = findByName(name, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Fermer[] findByName_PrevAndNext(long fermerId, String name,
        OrderByComparator orderByComparator)
        throws NoSuchFermerException, SystemException {
        Fermer fermer = findByPrimaryKey(fermerId);

        Session session = null;

        try {
            session = openSession();

            Fermer[] array = new FermerImpl[3];

            array[0] = getByName_PrevAndNext(session, fermer, name,
                    orderByComparator, true);

            array[1] = fermer;

            array[2] = getByName_PrevAndNext(session, fermer, name,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Fermer getByName_PrevAndNext(Session session, Fermer fermer,
        String name, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_FERMER_WHERE);

        boolean bindName = false;

        if (name == null) {
            query.append(_FINDER_COLUMN_NAME_NAME_1);
        } else if (name.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_NAME_NAME_3);
        } else {
            bindName = true;

            query.append(_FINDER_COLUMN_NAME_NAME_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(FermerModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindName) {
            qPos.add(name);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(fermer);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Fermer> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the fermers where name = &#63; from the database.
     *
     * @param name the name
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByName(String name) throws SystemException {
        for (Fermer fermer : findByName(name, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(fermer);
        }
    }

    /**
     * Returns the number of fermers where name = &#63;.
     *
     * @param name the name
     * @return the number of matching fermers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByName(String name) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_NAME;

        Object[] finderArgs = new Object[] { name };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_FERMER_WHERE);

            boolean bindName = false;

            if (name == null) {
                query.append(_FINDER_COLUMN_NAME_NAME_1);
            } else if (name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_NAME_3);
            } else {
                bindName = true;

                query.append(_FINDER_COLUMN_NAME_NAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindName) {
                    qPos.add(name);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the fermers where inn = &#63;.
     *
     * @param inn the inn
     * @return the matching fermers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Fermer> findByInn(String inn) throws SystemException {
        return findByInn(inn, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Fermer> findByInn(String inn, int start, int end)
        throws SystemException {
        return findByInn(inn, start, end, null);
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
    @Override
    public List<Fermer> findByInn(String inn, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INN;
            finderArgs = new Object[] { inn };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INN;
            finderArgs = new Object[] { inn, start, end, orderByComparator };
        }

        List<Fermer> list = (List<Fermer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Fermer fermer : list) {
                if (!Validator.equals(inn, fermer.getInn())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_FERMER_WHERE);

            boolean bindInn = false;

            if (inn == null) {
                query.append(_FINDER_COLUMN_INN_INN_1);
            } else if (inn.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_INN_INN_3);
            } else {
                bindInn = true;

                query.append(_FINDER_COLUMN_INN_INN_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FermerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindInn) {
                    qPos.add(inn);
                }

                if (!pagination) {
                    list = (List<Fermer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Fermer>(list);
                } else {
                    list = (List<Fermer>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Fermer findByInn_First(String inn,
        OrderByComparator orderByComparator)
        throws NoSuchFermerException, SystemException {
        Fermer fermer = fetchByInn_First(inn, orderByComparator);

        if (fermer != null) {
            return fermer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("inn=");
        msg.append(inn);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFermerException(msg.toString());
    }

    /**
     * Returns the first fermer in the ordered set where inn = &#63;.
     *
     * @param inn the inn
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching fermer, or <code>null</code> if a matching fermer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Fermer fetchByInn_First(String inn,
        OrderByComparator orderByComparator) throws SystemException {
        List<Fermer> list = findByInn(inn, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Fermer findByInn_Last(String inn, OrderByComparator orderByComparator)
        throws NoSuchFermerException, SystemException {
        Fermer fermer = fetchByInn_Last(inn, orderByComparator);

        if (fermer != null) {
            return fermer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("inn=");
        msg.append(inn);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFermerException(msg.toString());
    }

    /**
     * Returns the last fermer in the ordered set where inn = &#63;.
     *
     * @param inn the inn
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching fermer, or <code>null</code> if a matching fermer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Fermer fetchByInn_Last(String inn,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByInn(inn);

        if (count == 0) {
            return null;
        }

        List<Fermer> list = findByInn(inn, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Fermer[] findByInn_PrevAndNext(long fermerId, String inn,
        OrderByComparator orderByComparator)
        throws NoSuchFermerException, SystemException {
        Fermer fermer = findByPrimaryKey(fermerId);

        Session session = null;

        try {
            session = openSession();

            Fermer[] array = new FermerImpl[3];

            array[0] = getByInn_PrevAndNext(session, fermer, inn,
                    orderByComparator, true);

            array[1] = fermer;

            array[2] = getByInn_PrevAndNext(session, fermer, inn,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Fermer getByInn_PrevAndNext(Session session, Fermer fermer,
        String inn, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_FERMER_WHERE);

        boolean bindInn = false;

        if (inn == null) {
            query.append(_FINDER_COLUMN_INN_INN_1);
        } else if (inn.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_INN_INN_3);
        } else {
            bindInn = true;

            query.append(_FINDER_COLUMN_INN_INN_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(FermerModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindInn) {
            qPos.add(inn);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(fermer);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Fermer> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the fermers where inn = &#63; from the database.
     *
     * @param inn the inn
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByInn(String inn) throws SystemException {
        for (Fermer fermer : findByInn(inn, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(fermer);
        }
    }

    /**
     * Returns the number of fermers where inn = &#63;.
     *
     * @param inn the inn
     * @return the number of matching fermers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByInn(String inn) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_INN;

        Object[] finderArgs = new Object[] { inn };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_FERMER_WHERE);

            boolean bindInn = false;

            if (inn == null) {
                query.append(_FINDER_COLUMN_INN_INN_1);
            } else if (inn.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_INN_INN_3);
            } else {
                bindInn = true;

                query.append(_FINDER_COLUMN_INN_INN_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindInn) {
                    qPos.add(inn);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the fermers where rayonRegistration = &#63;.
     *
     * @param rayonRegistration the rayon registration
     * @return the matching fermers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Fermer> findByRayonRegistration(String rayonRegistration)
        throws SystemException {
        return findByRayonRegistration(rayonRegistration, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Fermer> findByRayonRegistration(String rayonRegistration,
        int start, int end) throws SystemException {
        return findByRayonRegistration(rayonRegistration, start, end, null);
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
    @Override
    public List<Fermer> findByRayonRegistration(String rayonRegistration,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RAYONREGISTRATION;
            finderArgs = new Object[] { rayonRegistration };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_RAYONREGISTRATION;
            finderArgs = new Object[] {
                    rayonRegistration,
                    
                    start, end, orderByComparator
                };
        }

        List<Fermer> list = (List<Fermer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Fermer fermer : list) {
                if (!Validator.equals(rayonRegistration,
                            fermer.getRayonRegistration())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_FERMER_WHERE);

            boolean bindRayonRegistration = false;

            if (rayonRegistration == null) {
                query.append(_FINDER_COLUMN_RAYONREGISTRATION_RAYONREGISTRATION_1);
            } else if (rayonRegistration.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_RAYONREGISTRATION_RAYONREGISTRATION_3);
            } else {
                bindRayonRegistration = true;

                query.append(_FINDER_COLUMN_RAYONREGISTRATION_RAYONREGISTRATION_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FermerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindRayonRegistration) {
                    qPos.add(rayonRegistration);
                }

                if (!pagination) {
                    list = (List<Fermer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Fermer>(list);
                } else {
                    list = (List<Fermer>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Fermer findByRayonRegistration_First(String rayonRegistration,
        OrderByComparator orderByComparator)
        throws NoSuchFermerException, SystemException {
        Fermer fermer = fetchByRayonRegistration_First(rayonRegistration,
                orderByComparator);

        if (fermer != null) {
            return fermer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("rayonRegistration=");
        msg.append(rayonRegistration);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFermerException(msg.toString());
    }

    /**
     * Returns the first fermer in the ordered set where rayonRegistration = &#63;.
     *
     * @param rayonRegistration the rayon registration
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching fermer, or <code>null</code> if a matching fermer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Fermer fetchByRayonRegistration_First(String rayonRegistration,
        OrderByComparator orderByComparator) throws SystemException {
        List<Fermer> list = findByRayonRegistration(rayonRegistration, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Fermer findByRayonRegistration_Last(String rayonRegistration,
        OrderByComparator orderByComparator)
        throws NoSuchFermerException, SystemException {
        Fermer fermer = fetchByRayonRegistration_Last(rayonRegistration,
                orderByComparator);

        if (fermer != null) {
            return fermer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("rayonRegistration=");
        msg.append(rayonRegistration);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFermerException(msg.toString());
    }

    /**
     * Returns the last fermer in the ordered set where rayonRegistration = &#63;.
     *
     * @param rayonRegistration the rayon registration
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching fermer, or <code>null</code> if a matching fermer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Fermer fetchByRayonRegistration_Last(String rayonRegistration,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByRayonRegistration(rayonRegistration);

        if (count == 0) {
            return null;
        }

        List<Fermer> list = findByRayonRegistration(rayonRegistration,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Fermer[] findByRayonRegistration_PrevAndNext(long fermerId,
        String rayonRegistration, OrderByComparator orderByComparator)
        throws NoSuchFermerException, SystemException {
        Fermer fermer = findByPrimaryKey(fermerId);

        Session session = null;

        try {
            session = openSession();

            Fermer[] array = new FermerImpl[3];

            array[0] = getByRayonRegistration_PrevAndNext(session, fermer,
                    rayonRegistration, orderByComparator, true);

            array[1] = fermer;

            array[2] = getByRayonRegistration_PrevAndNext(session, fermer,
                    rayonRegistration, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Fermer getByRayonRegistration_PrevAndNext(Session session,
        Fermer fermer, String rayonRegistration,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_FERMER_WHERE);

        boolean bindRayonRegistration = false;

        if (rayonRegistration == null) {
            query.append(_FINDER_COLUMN_RAYONREGISTRATION_RAYONREGISTRATION_1);
        } else if (rayonRegistration.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_RAYONREGISTRATION_RAYONREGISTRATION_3);
        } else {
            bindRayonRegistration = true;

            query.append(_FINDER_COLUMN_RAYONREGISTRATION_RAYONREGISTRATION_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(FermerModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindRayonRegistration) {
            qPos.add(rayonRegistration);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(fermer);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Fermer> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the fermers where rayonRegistration = &#63; from the database.
     *
     * @param rayonRegistration the rayon registration
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByRayonRegistration(String rayonRegistration)
        throws SystemException {
        for (Fermer fermer : findByRayonRegistration(rayonRegistration,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(fermer);
        }
    }

    /**
     * Returns the number of fermers where rayonRegistration = &#63;.
     *
     * @param rayonRegistration the rayon registration
     * @return the number of matching fermers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByRayonRegistration(String rayonRegistration)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_RAYONREGISTRATION;

        Object[] finderArgs = new Object[] { rayonRegistration };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_FERMER_WHERE);

            boolean bindRayonRegistration = false;

            if (rayonRegistration == null) {
                query.append(_FINDER_COLUMN_RAYONREGISTRATION_RAYONREGISTRATION_1);
            } else if (rayonRegistration.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_RAYONREGISTRATION_RAYONREGISTRATION_3);
            } else {
                bindRayonRegistration = true;

                query.append(_FINDER_COLUMN_RAYONREGISTRATION_RAYONREGISTRATION_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindRayonRegistration) {
                    qPos.add(rayonRegistration);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the fermers where dateRegistration = &#63;.
     *
     * @param dateRegistration the date registration
     * @return the matching fermers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Fermer> findByDateRegistration(Date dateRegistration)
        throws SystemException {
        return findByDateRegistration(dateRegistration, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Fermer> findByDateRegistration(Date dateRegistration,
        int start, int end) throws SystemException {
        return findByDateRegistration(dateRegistration, start, end, null);
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
    @Override
    public List<Fermer> findByDateRegistration(Date dateRegistration,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATEREGISTRATION;
            finderArgs = new Object[] { dateRegistration };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DATEREGISTRATION;
            finderArgs = new Object[] {
                    dateRegistration,
                    
                    start, end, orderByComparator
                };
        }

        List<Fermer> list = (List<Fermer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Fermer fermer : list) {
                if (!Validator.equals(dateRegistration,
                            fermer.getDateRegistration())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_FERMER_WHERE);

            boolean bindDateRegistration = false;

            if (dateRegistration == null) {
                query.append(_FINDER_COLUMN_DATEREGISTRATION_DATEREGISTRATION_1);
            } else {
                bindDateRegistration = true;

                query.append(_FINDER_COLUMN_DATEREGISTRATION_DATEREGISTRATION_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FermerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindDateRegistration) {
                    qPos.add(CalendarUtil.getTimestamp(dateRegistration));
                }

                if (!pagination) {
                    list = (List<Fermer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Fermer>(list);
                } else {
                    list = (List<Fermer>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Fermer findByDateRegistration_First(Date dateRegistration,
        OrderByComparator orderByComparator)
        throws NoSuchFermerException, SystemException {
        Fermer fermer = fetchByDateRegistration_First(dateRegistration,
                orderByComparator);

        if (fermer != null) {
            return fermer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("dateRegistration=");
        msg.append(dateRegistration);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFermerException(msg.toString());
    }

    /**
     * Returns the first fermer in the ordered set where dateRegistration = &#63;.
     *
     * @param dateRegistration the date registration
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching fermer, or <code>null</code> if a matching fermer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Fermer fetchByDateRegistration_First(Date dateRegistration,
        OrderByComparator orderByComparator) throws SystemException {
        List<Fermer> list = findByDateRegistration(dateRegistration, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Fermer findByDateRegistration_Last(Date dateRegistration,
        OrderByComparator orderByComparator)
        throws NoSuchFermerException, SystemException {
        Fermer fermer = fetchByDateRegistration_Last(dateRegistration,
                orderByComparator);

        if (fermer != null) {
            return fermer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("dateRegistration=");
        msg.append(dateRegistration);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFermerException(msg.toString());
    }

    /**
     * Returns the last fermer in the ordered set where dateRegistration = &#63;.
     *
     * @param dateRegistration the date registration
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching fermer, or <code>null</code> if a matching fermer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Fermer fetchByDateRegistration_Last(Date dateRegistration,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByDateRegistration(dateRegistration);

        if (count == 0) {
            return null;
        }

        List<Fermer> list = findByDateRegistration(dateRegistration, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Fermer[] findByDateRegistration_PrevAndNext(long fermerId,
        Date dateRegistration, OrderByComparator orderByComparator)
        throws NoSuchFermerException, SystemException {
        Fermer fermer = findByPrimaryKey(fermerId);

        Session session = null;

        try {
            session = openSession();

            Fermer[] array = new FermerImpl[3];

            array[0] = getByDateRegistration_PrevAndNext(session, fermer,
                    dateRegistration, orderByComparator, true);

            array[1] = fermer;

            array[2] = getByDateRegistration_PrevAndNext(session, fermer,
                    dateRegistration, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Fermer getByDateRegistration_PrevAndNext(Session session,
        Fermer fermer, Date dateRegistration,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_FERMER_WHERE);

        boolean bindDateRegistration = false;

        if (dateRegistration == null) {
            query.append(_FINDER_COLUMN_DATEREGISTRATION_DATEREGISTRATION_1);
        } else {
            bindDateRegistration = true;

            query.append(_FINDER_COLUMN_DATEREGISTRATION_DATEREGISTRATION_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(FermerModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindDateRegistration) {
            qPos.add(CalendarUtil.getTimestamp(dateRegistration));
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(fermer);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Fermer> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the fermers where dateRegistration = &#63; from the database.
     *
     * @param dateRegistration the date registration
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByDateRegistration(Date dateRegistration)
        throws SystemException {
        for (Fermer fermer : findByDateRegistration(dateRegistration,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(fermer);
        }
    }

    /**
     * Returns the number of fermers where dateRegistration = &#63;.
     *
     * @param dateRegistration the date registration
     * @return the number of matching fermers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByDateRegistration(Date dateRegistration)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_DATEREGISTRATION;

        Object[] finderArgs = new Object[] { dateRegistration };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_FERMER_WHERE);

            boolean bindDateRegistration = false;

            if (dateRegistration == null) {
                query.append(_FINDER_COLUMN_DATEREGISTRATION_DATEREGISTRATION_1);
            } else {
                bindDateRegistration = true;

                query.append(_FINDER_COLUMN_DATEREGISTRATION_DATEREGISTRATION_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindDateRegistration) {
                    qPos.add(CalendarUtil.getTimestamp(dateRegistration));
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the fermers where archiveStatus = &#63;.
     *
     * @param archiveStatus the archive status
     * @return the matching fermers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Fermer> findByArchiveStatus(boolean archiveStatus)
        throws SystemException {
        return findByArchiveStatus(archiveStatus, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Fermer> findByArchiveStatus(boolean archiveStatus, int start,
        int end) throws SystemException {
        return findByArchiveStatus(archiveStatus, start, end, null);
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
    @Override
    public List<Fermer> findByArchiveStatus(boolean archiveStatus, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVESTATUS;
            finderArgs = new Object[] { archiveStatus };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ARCHIVESTATUS;
            finderArgs = new Object[] {
                    archiveStatus,
                    
                    start, end, orderByComparator
                };
        }

        List<Fermer> list = (List<Fermer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Fermer fermer : list) {
                if ((archiveStatus != fermer.getArchiveStatus())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_FERMER_WHERE);

            query.append(_FINDER_COLUMN_ARCHIVESTATUS_ARCHIVESTATUS_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FermerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(archiveStatus);

                if (!pagination) {
                    list = (List<Fermer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Fermer>(list);
                } else {
                    list = (List<Fermer>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Fermer findByArchiveStatus_First(boolean archiveStatus,
        OrderByComparator orderByComparator)
        throws NoSuchFermerException, SystemException {
        Fermer fermer = fetchByArchiveStatus_First(archiveStatus,
                orderByComparator);

        if (fermer != null) {
            return fermer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("archiveStatus=");
        msg.append(archiveStatus);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFermerException(msg.toString());
    }

    /**
     * Returns the first fermer in the ordered set where archiveStatus = &#63;.
     *
     * @param archiveStatus the archive status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching fermer, or <code>null</code> if a matching fermer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Fermer fetchByArchiveStatus_First(boolean archiveStatus,
        OrderByComparator orderByComparator) throws SystemException {
        List<Fermer> list = findByArchiveStatus(archiveStatus, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Fermer findByArchiveStatus_Last(boolean archiveStatus,
        OrderByComparator orderByComparator)
        throws NoSuchFermerException, SystemException {
        Fermer fermer = fetchByArchiveStatus_Last(archiveStatus,
                orderByComparator);

        if (fermer != null) {
            return fermer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("archiveStatus=");
        msg.append(archiveStatus);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFermerException(msg.toString());
    }

    /**
     * Returns the last fermer in the ordered set where archiveStatus = &#63;.
     *
     * @param archiveStatus the archive status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching fermer, or <code>null</code> if a matching fermer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Fermer fetchByArchiveStatus_Last(boolean archiveStatus,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByArchiveStatus(archiveStatus);

        if (count == 0) {
            return null;
        }

        List<Fermer> list = findByArchiveStatus(archiveStatus, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Fermer[] findByArchiveStatus_PrevAndNext(long fermerId,
        boolean archiveStatus, OrderByComparator orderByComparator)
        throws NoSuchFermerException, SystemException {
        Fermer fermer = findByPrimaryKey(fermerId);

        Session session = null;

        try {
            session = openSession();

            Fermer[] array = new FermerImpl[3];

            array[0] = getByArchiveStatus_PrevAndNext(session, fermer,
                    archiveStatus, orderByComparator, true);

            array[1] = fermer;

            array[2] = getByArchiveStatus_PrevAndNext(session, fermer,
                    archiveStatus, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Fermer getByArchiveStatus_PrevAndNext(Session session,
        Fermer fermer, boolean archiveStatus,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_FERMER_WHERE);

        query.append(_FINDER_COLUMN_ARCHIVESTATUS_ARCHIVESTATUS_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(FermerModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(archiveStatus);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(fermer);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Fermer> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the fermers where archiveStatus = &#63; from the database.
     *
     * @param archiveStatus the archive status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByArchiveStatus(boolean archiveStatus)
        throws SystemException {
        for (Fermer fermer : findByArchiveStatus(archiveStatus,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(fermer);
        }
    }

    /**
     * Returns the number of fermers where archiveStatus = &#63;.
     *
     * @param archiveStatus the archive status
     * @return the number of matching fermers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByArchiveStatus(boolean archiveStatus)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ARCHIVESTATUS;

        Object[] finderArgs = new Object[] { archiveStatus };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_FERMER_WHERE);

            query.append(_FINDER_COLUMN_ARCHIVESTATUS_ARCHIVESTATUS_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(archiveStatus);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the fermer in the entity cache if it is enabled.
     *
     * @param fermer the fermer
     */
    @Override
    public void cacheResult(Fermer fermer) {
        EntityCacheUtil.putResult(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerImpl.class, fermer.getPrimaryKey(), fermer);

        fermer.resetOriginalValues();
    }

    /**
     * Caches the fermers in the entity cache if it is enabled.
     *
     * @param fermers the fermers
     */
    @Override
    public void cacheResult(List<Fermer> fermers) {
        for (Fermer fermer : fermers) {
            if (EntityCacheUtil.getResult(
                        FermerModelImpl.ENTITY_CACHE_ENABLED, FermerImpl.class,
                        fermer.getPrimaryKey()) == null) {
                cacheResult(fermer);
            } else {
                fermer.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all fermers.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(FermerImpl.class.getName());
        }

        EntityCacheUtil.clearCache(FermerImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the fermer.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Fermer fermer) {
        EntityCacheUtil.removeResult(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerImpl.class, fermer.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Fermer> fermers) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Fermer fermer : fermers) {
            EntityCacheUtil.removeResult(FermerModelImpl.ENTITY_CACHE_ENABLED,
                FermerImpl.class, fermer.getPrimaryKey());
        }
    }

    /**
     * Creates a new fermer with the primary key. Does not add the fermer to the database.
     *
     * @param fermerId the primary key for the new fermer
     * @return the new fermer
     */
    @Override
    public Fermer create(long fermerId) {
        Fermer fermer = new FermerImpl();

        fermer.setNew(true);
        fermer.setPrimaryKey(fermerId);

        return fermer;
    }

    /**
     * Removes the fermer with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param fermerId the primary key of the fermer
     * @return the fermer that was removed
     * @throws com.liferay.reestrFermerov.NoSuchFermerException if a fermer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Fermer remove(long fermerId)
        throws NoSuchFermerException, SystemException {
        return remove((Serializable) fermerId);
    }

    /**
     * Removes the fermer with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the fermer
     * @return the fermer that was removed
     * @throws com.liferay.reestrFermerov.NoSuchFermerException if a fermer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Fermer remove(Serializable primaryKey)
        throws NoSuchFermerException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Fermer fermer = (Fermer) session.get(FermerImpl.class, primaryKey);

            if (fermer == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchFermerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(fermer);
        } catch (NoSuchFermerException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Fermer removeImpl(Fermer fermer) throws SystemException {
        fermer = toUnwrappedModel(fermer);

        fermerToRayonTableMapper.deleteLeftPrimaryKeyTableMappings(fermer.getPrimaryKey());

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(fermer)) {
                fermer = (Fermer) session.get(FermerImpl.class,
                        fermer.getPrimaryKeyObj());
            }

            if (fermer != null) {
                session.delete(fermer);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (fermer != null) {
            clearCache(fermer);
        }

        return fermer;
    }

    @Override
    public Fermer updateImpl(com.liferay.reestrFermerov.model.Fermer fermer)
        throws SystemException {
        fermer = toUnwrappedModel(fermer);

        boolean isNew = fermer.isNew();

        FermerModelImpl fermerModelImpl = (FermerModelImpl) fermer;

        Session session = null;

        try {
            session = openSession();

            if (fermer.isNew()) {
                session.save(fermer);

                fermer.setNew(false);
            } else {
                session.merge(fermer);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !FermerModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((fermerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FERMERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        fermerModelImpl.getOriginalFermerId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FERMERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FERMERID,
                    args);

                args = new Object[] { fermerModelImpl.getFermerId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FERMERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FERMERID,
                    args);
            }

            if ((fermerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { fermerModelImpl.getOriginalName() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
                    args);

                args = new Object[] { fermerModelImpl.getName() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
                    args);
            }

            if ((fermerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INN.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { fermerModelImpl.getOriginalInn() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INN,
                    args);

                args = new Object[] { fermerModelImpl.getInn() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INN,
                    args);
            }

            if ((fermerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RAYONREGISTRATION.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        fermerModelImpl.getOriginalRayonRegistration()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RAYONREGISTRATION,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RAYONREGISTRATION,
                    args);

                args = new Object[] { fermerModelImpl.getRayonRegistration() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RAYONREGISTRATION,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RAYONREGISTRATION,
                    args);
            }

            if ((fermerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATEREGISTRATION.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        fermerModelImpl.getOriginalDateRegistration()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATEREGISTRATION,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATEREGISTRATION,
                    args);

                args = new Object[] { fermerModelImpl.getDateRegistration() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATEREGISTRATION,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATEREGISTRATION,
                    args);
            }

            if ((fermerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVESTATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        fermerModelImpl.getOriginalArchiveStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ARCHIVESTATUS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVESTATUS,
                    args);

                args = new Object[] { fermerModelImpl.getArchiveStatus() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ARCHIVESTATUS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVESTATUS,
                    args);
            }
        }

        EntityCacheUtil.putResult(FermerModelImpl.ENTITY_CACHE_ENABLED,
            FermerImpl.class, fermer.getPrimaryKey(), fermer);

        return fermer;
    }

    protected Fermer toUnwrappedModel(Fermer fermer) {
        if (fermer instanceof FermerImpl) {
            return fermer;
        }

        FermerImpl fermerImpl = new FermerImpl();

        fermerImpl.setNew(fermer.isNew());
        fermerImpl.setPrimaryKey(fermer.getPrimaryKey());

        fermerImpl.setFermerId(fermer.getFermerId());
        fermerImpl.setName(fermer.getName());
        fermerImpl.setPravoForma(fermer.getPravoForma());
        fermerImpl.setInn(fermer.getInn());
        fermerImpl.setKpp(fermer.getKpp());
        fermerImpl.setOgrn(fermer.getOgrn());
        fermerImpl.setRayonRegistration(fermer.getRayonRegistration());
        fermerImpl.setRayonPosevPole(fermer.getRayonPosevPole());
        fermerImpl.setDateRegistration(fermer.getDateRegistration());
        fermerImpl.setArchiveStatus(fermer.isArchiveStatus());

        return fermerImpl;
    }

    /**
     * Returns the fermer with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the fermer
     * @return the fermer
     * @throws com.liferay.reestrFermerov.NoSuchFermerException if a fermer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Fermer findByPrimaryKey(Serializable primaryKey)
        throws NoSuchFermerException, SystemException {
        Fermer fermer = fetchByPrimaryKey(primaryKey);

        if (fermer == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchFermerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return fermer;
    }

    /**
     * Returns the fermer with the primary key or throws a {@link com.liferay.reestrFermerov.NoSuchFermerException} if it could not be found.
     *
     * @param fermerId the primary key of the fermer
     * @return the fermer
     * @throws com.liferay.reestrFermerov.NoSuchFermerException if a fermer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Fermer findByPrimaryKey(long fermerId)
        throws NoSuchFermerException, SystemException {
        return findByPrimaryKey((Serializable) fermerId);
    }

    /**
     * Returns the fermer with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the fermer
     * @return the fermer, or <code>null</code> if a fermer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Fermer fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Fermer fermer = (Fermer) EntityCacheUtil.getResult(FermerModelImpl.ENTITY_CACHE_ENABLED,
                FermerImpl.class, primaryKey);

        if (fermer == _nullFermer) {
            return null;
        }

        if (fermer == null) {
            Session session = null;

            try {
                session = openSession();

                fermer = (Fermer) session.get(FermerImpl.class, primaryKey);

                if (fermer != null) {
                    cacheResult(fermer);
                } else {
                    EntityCacheUtil.putResult(FermerModelImpl.ENTITY_CACHE_ENABLED,
                        FermerImpl.class, primaryKey, _nullFermer);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(FermerModelImpl.ENTITY_CACHE_ENABLED,
                    FermerImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return fermer;
    }

    /**
     * Returns the fermer with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param fermerId the primary key of the fermer
     * @return the fermer, or <code>null</code> if a fermer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Fermer fetchByPrimaryKey(long fermerId) throws SystemException {
        return fetchByPrimaryKey((Serializable) fermerId);
    }

    /**
     * Returns all the fermers.
     *
     * @return the fermers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Fermer> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Fermer> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Fermer> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Fermer> list = (List<Fermer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_FERMER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_FERMER;

                if (pagination) {
                    sql = sql.concat(FermerModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Fermer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Fermer>(list);
                } else {
                    list = (List<Fermer>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the fermers from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Fermer fermer : findAll()) {
            remove(fermer);
        }
    }

    /**
     * Returns the number of fermers.
     *
     * @return the number of fermers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_FERMER);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the rayons associated with the fermer.
     *
     * @param pk the primary key of the fermer
     * @return the rayons associated with the fermer
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<com.liferay.reestrFermerov.model.Rayon> getRayons(long pk)
        throws SystemException {
        return getRayons(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
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
    @Override
    public List<com.liferay.reestrFermerov.model.Rayon> getRayons(long pk,
        int start, int end) throws SystemException {
        return getRayons(pk, start, end, null);
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
    @Override
    public List<com.liferay.reestrFermerov.model.Rayon> getRayons(long pk,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return fermerToRayonTableMapper.getRightBaseModels(pk, start, end,
            orderByComparator);
    }

    /**
     * Returns the number of rayons associated with the fermer.
     *
     * @param pk the primary key of the fermer
     * @return the number of rayons associated with the fermer
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getRayonsSize(long pk) throws SystemException {
        long[] pks = fermerToRayonTableMapper.getRightPrimaryKeys(pk);

        return pks.length;
    }

    /**
     * Returns <code>true</code> if the rayon is associated with the fermer.
     *
     * @param pk the primary key of the fermer
     * @param rayonPK the primary key of the rayon
     * @return <code>true</code> if the rayon is associated with the fermer; <code>false</code> otherwise
     * @throws SystemException if a system exception occurred
     */
    @Override
    public boolean containsRayon(long pk, long rayonPK)
        throws SystemException {
        return fermerToRayonTableMapper.containsTableMapping(pk, rayonPK);
    }

    /**
     * Returns <code>true</code> if the fermer has any rayons associated with it.
     *
     * @param pk the primary key of the fermer to check for associations with rayons
     * @return <code>true</code> if the fermer has any rayons associated with it; <code>false</code> otherwise
     * @throws SystemException if a system exception occurred
     */
    @Override
    public boolean containsRayons(long pk) throws SystemException {
        if (getRayonsSize(pk) > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Adds an association between the fermer and the rayon. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the fermer
     * @param rayonPK the primary key of the rayon
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addRayon(long pk, long rayonPK) throws SystemException {
        fermerToRayonTableMapper.addTableMapping(pk, rayonPK);
    }

    /**
     * Adds an association between the fermer and the rayon. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the fermer
     * @param rayon the rayon
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addRayon(long pk, com.liferay.reestrFermerov.model.Rayon rayon)
        throws SystemException {
        fermerToRayonTableMapper.addTableMapping(pk, rayon.getPrimaryKey());
    }

    /**
     * Adds an association between the fermer and the rayons. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the fermer
     * @param rayonPKs the primary keys of the rayons
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addRayons(long pk, long[] rayonPKs) throws SystemException {
        for (long rayonPK : rayonPKs) {
            fermerToRayonTableMapper.addTableMapping(pk, rayonPK);
        }
    }

    /**
     * Adds an association between the fermer and the rayons. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the fermer
     * @param rayons the rayons
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addRayons(long pk,
        List<com.liferay.reestrFermerov.model.Rayon> rayons)
        throws SystemException {
        for (com.liferay.reestrFermerov.model.Rayon rayon : rayons) {
            fermerToRayonTableMapper.addTableMapping(pk, rayon.getPrimaryKey());
        }
    }

    /**
     * Clears all associations between the fermer and its rayons. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the fermer to clear the associated rayons from
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void clearRayons(long pk) throws SystemException {
        fermerToRayonTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
    }

    /**
     * Removes the association between the fermer and the rayon. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the fermer
     * @param rayonPK the primary key of the rayon
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeRayon(long pk, long rayonPK) throws SystemException {
        fermerToRayonTableMapper.deleteTableMapping(pk, rayonPK);
    }

    /**
     * Removes the association between the fermer and the rayon. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the fermer
     * @param rayon the rayon
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeRayon(long pk,
        com.liferay.reestrFermerov.model.Rayon rayon) throws SystemException {
        fermerToRayonTableMapper.deleteTableMapping(pk, rayon.getPrimaryKey());
    }

    /**
     * Removes the association between the fermer and the rayons. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the fermer
     * @param rayonPKs the primary keys of the rayons
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeRayons(long pk, long[] rayonPKs)
        throws SystemException {
        for (long rayonPK : rayonPKs) {
            fermerToRayonTableMapper.deleteTableMapping(pk, rayonPK);
        }
    }

    /**
     * Removes the association between the fermer and the rayons. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the fermer
     * @param rayons the rayons
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeRayons(long pk,
        List<com.liferay.reestrFermerov.model.Rayon> rayons)
        throws SystemException {
        for (com.liferay.reestrFermerov.model.Rayon rayon : rayons) {
            fermerToRayonTableMapper.deleteTableMapping(pk,
                rayon.getPrimaryKey());
        }
    }

    /**
     * Sets the rayons associated with the fermer, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the fermer
     * @param rayonPKs the primary keys of the rayons to be associated with the fermer
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void setRayons(long pk, long[] rayonPKs) throws SystemException {
        Set<Long> newRayonPKsSet = SetUtil.fromArray(rayonPKs);
        Set<Long> oldRayonPKsSet = SetUtil.fromArray(fermerToRayonTableMapper.getRightPrimaryKeys(
                    pk));

        Set<Long> removeRayonPKsSet = new HashSet<Long>(oldRayonPKsSet);

        removeRayonPKsSet.removeAll(newRayonPKsSet);

        for (long removeRayonPK : removeRayonPKsSet) {
            fermerToRayonTableMapper.deleteTableMapping(pk, removeRayonPK);
        }

        newRayonPKsSet.removeAll(oldRayonPKsSet);

        for (long newRayonPK : newRayonPKsSet) {
            fermerToRayonTableMapper.addTableMapping(pk, newRayonPK);
        }
    }

    /**
     * Sets the rayons associated with the fermer, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the fermer
     * @param rayons the rayons to be associated with the fermer
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void setRayons(long pk,
        List<com.liferay.reestrFermerov.model.Rayon> rayons)
        throws SystemException {
        try {
            long[] rayonPKs = new long[rayons.size()];

            for (int i = 0; i < rayons.size(); i++) {
                com.liferay.reestrFermerov.model.Rayon rayon = rayons.get(i);

                rayonPKs[i] = rayon.getPrimaryKey();
            }

            setRayons(pk, rayonPKs);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            FinderCacheUtil.clearCache(FermerModelImpl.MAPPING_TABLE_RR_RAYONSPP_FERMERS_NAME);
        }
    }

    /**
     * Initializes the fermer persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.liferay.reestrFermerov.model.Fermer")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Fermer>> listenersList = new ArrayList<ModelListener<Fermer>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Fermer>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }

        fermerToRayonTableMapper = TableMapperFactory.getTableMapper("RR_RayonsPP_Fermers",
                "fermerId", "rayonId", this, rayonPersistence);
    }

    public void destroy() {
        EntityCacheUtil.removeCache(FermerImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        TableMapperFactory.removeTableMapper("RR_RayonsPP_Fermers");
    }
}
