package com.liferay.reestrFermerov.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.liferay.reestrFermerov.model.Rayon;
import com.liferay.reestrFermerov.model.RayonModel;
import com.liferay.reestrFermerov.model.RayonSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Rayon service. Represents a row in the &quot;RR_Rayon&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.reestrFermerov.model.RayonModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RayonImpl}.
 * </p>
 *
 * @author liza
 * @see RayonImpl
 * @see com.liferay.reestrFermerov.model.Rayon
 * @see com.liferay.reestrFermerov.model.RayonModel
 * @generated
 */
@JSON(strict = true)
public class RayonModelImpl extends BaseModelImpl<Rayon> implements RayonModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a rayon model instance should use the {@link com.liferay.reestrFermerov.model.Rayon} interface instead.
     */
    public static final String TABLE_NAME = "RR_Rayon";
    public static final Object[][] TABLE_COLUMNS = {
            { "rayonId", Types.BIGINT },
            { "name", Types.VARCHAR },
            { "kod", Types.INTEGER },
            { "archive", Types.BOOLEAN }
        };
    public static final String TABLE_SQL_CREATE = "create table RR_Rayon (rayonId LONG not null primary key,name VARCHAR(75) null,kod INTEGER,archive BOOLEAN)";
    public static final String TABLE_SQL_DROP = "drop table RR_Rayon";
    public static final String ORDER_BY_JPQL = " ORDER BY rayon.name ASC";
    public static final String ORDER_BY_SQL = " ORDER BY RR_Rayon.name ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.liferay.reestrFermerov.model.Rayon"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.liferay.reestrFermerov.model.Rayon"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.liferay.reestrFermerov.model.Rayon"),
            true);
    public static long ARCHIVE_COLUMN_BITMASK = 1L;
    public static long NAME_COLUMN_BITMASK = 2L;
    public static long RAYONID_COLUMN_BITMASK = 4L;
    public static final String MAPPING_TABLE_RR_FERMERS_RAYONS_NAME = "RR_Fermers_Rayons";
    public static final Object[][] MAPPING_TABLE_RR_FERMERS_RAYONS_COLUMNS = {
            { "rayonId", Types.BIGINT },
            { "fermerId", Types.BIGINT }
        };
    public static final String MAPPING_TABLE_RR_FERMERS_RAYONS_SQL_CREATE = "create table RR_Fermers_Rayons (fermerId LONG not null,rayonId LONG not null,primary key (fermerId, rayonId))";
    public static final boolean FINDER_CACHE_ENABLED_RR_FERMERS_RAYONS = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.RR_Fermers_Rayons"), true);
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.liferay.reestrFermerov.model.Rayon"));
    private static ClassLoader _classLoader = Rayon.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { Rayon.class };
    private long _rayonId;
    private long _originalRayonId;
    private boolean _setOriginalRayonId;
    private String _name;
    private String _originalName;
    private int _kod;
    private boolean _archive;
    private boolean _originalArchive;
    private boolean _setOriginalArchive;
    private long _columnBitmask;
    private Rayon _escapedModel;

    public RayonModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Rayon toModel(RayonSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Rayon model = new RayonImpl();

        model.setRayonId(soapModel.getRayonId());
        model.setName(soapModel.getName());
        model.setKod(soapModel.getKod());
        model.setArchive(soapModel.getArchive());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Rayon> toModels(RayonSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Rayon> models = new ArrayList<Rayon>(soapModels.length);

        for (RayonSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _rayonId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setRayonId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _rayonId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Rayon.class;
    }

    @Override
    public String getModelClassName() {
        return Rayon.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("rayonId", getRayonId());
        attributes.put("name", getName());
        attributes.put("kod", getKod());
        attributes.put("archive", getArchive());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long rayonId = (Long) attributes.get("rayonId");

        if (rayonId != null) {
            setRayonId(rayonId);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Integer kod = (Integer) attributes.get("kod");

        if (kod != null) {
            setKod(kod);
        }

        Boolean archive = (Boolean) attributes.get("archive");

        if (archive != null) {
            setArchive(archive);
        }
    }

    @JSON
    @Override
    public long getRayonId() {
        return _rayonId;
    }

    @Override
    public void setRayonId(long rayonId) {
        _columnBitmask |= RAYONID_COLUMN_BITMASK;

        if (!_setOriginalRayonId) {
            _setOriginalRayonId = true;

            _originalRayonId = _rayonId;
        }

        _rayonId = rayonId;
    }

    public long getOriginalRayonId() {
        return _originalRayonId;
    }

    @JSON
    @Override
    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    @Override
    public void setName(String name) {
        _columnBitmask = -1L;

        if (_originalName == null) {
            _originalName = _name;
        }

        _name = name;
    }

    public String getOriginalName() {
        return GetterUtil.getString(_originalName);
    }

    @JSON
    @Override
    public int getKod() {
        return _kod;
    }

    @Override
    public void setKod(int kod) {
        _kod = kod;
    }

    @JSON
    @Override
    public boolean getArchive() {
        return _archive;
    }

    @Override
    public boolean isArchive() {
        return _archive;
    }

    @Override
    public void setArchive(boolean archive) {
        _columnBitmask |= ARCHIVE_COLUMN_BITMASK;

        if (!_setOriginalArchive) {
            _setOriginalArchive = true;

            _originalArchive = _archive;
        }

        _archive = archive;
    }

    public boolean getOriginalArchive() {
        return _originalArchive;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Rayon.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Rayon toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Rayon) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        RayonImpl rayonImpl = new RayonImpl();

        rayonImpl.setRayonId(getRayonId());
        rayonImpl.setName(getName());
        rayonImpl.setKod(getKod());
        rayonImpl.setArchive(getArchive());

        rayonImpl.resetOriginalValues();

        return rayonImpl;
    }

    @Override
    public int compareTo(Rayon rayon) {
        int value = 0;

        value = getName().compareTo(rayon.getName());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Rayon)) {
            return false;
        }

        Rayon rayon = (Rayon) obj;

        long primaryKey = rayon.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        RayonModelImpl rayonModelImpl = this;

        rayonModelImpl._originalRayonId = rayonModelImpl._rayonId;

        rayonModelImpl._setOriginalRayonId = false;

        rayonModelImpl._originalName = rayonModelImpl._name;

        rayonModelImpl._originalArchive = rayonModelImpl._archive;

        rayonModelImpl._setOriginalArchive = false;

        rayonModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Rayon> toCacheModel() {
        RayonCacheModel rayonCacheModel = new RayonCacheModel();

        rayonCacheModel.rayonId = getRayonId();

        rayonCacheModel.name = getName();

        String name = rayonCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            rayonCacheModel.name = null;
        }

        rayonCacheModel.kod = getKod();

        rayonCacheModel.archive = getArchive();

        return rayonCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{rayonId=");
        sb.append(getRayonId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", kod=");
        sb.append(getKod());
        sb.append(", archive=");
        sb.append(getArchive());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.liferay.reestrFermerov.model.Rayon");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>rayonId</column-name><column-value><![CDATA[");
        sb.append(getRayonId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kod</column-name><column-value><![CDATA[");
        sb.append(getKod());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>archive</column-name><column-value><![CDATA[");
        sb.append(getArchive());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
