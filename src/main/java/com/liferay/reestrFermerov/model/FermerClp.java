package com.liferay.reestrFermerov.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.liferay.reestrFermerov.service.ClpSerializer;
import com.liferay.reestrFermerov.service.FermerLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class FermerClp extends BaseModelImpl<Fermer> implements Fermer {
    private long _fermerId;
    private String _name;
    private String _pravoForma;
    private String _inn;
    private String _kpp;
    private String _ogrn;
    private String _rayonRegistration;
    private String _rayonPosevPole;
    private Date _dateRegistration;
    private boolean _archiveStatus;
    private BaseModel<?> _fermerRemoteModel;
    private Class<?> _clpSerializerClass = com.liferay.reestrFermerov.service.ClpSerializer.class;

    public FermerClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Fermer.class;
    }

    @Override
    public String getModelClassName() {
        return Fermer.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _fermerId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setFermerId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _fermerId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("fermerId", getFermerId());
        attributes.put("name", getName());
        attributes.put("pravoForma", getPravoForma());
        attributes.put("inn", getInn());
        attributes.put("kpp", getKpp());
        attributes.put("ogrn", getOgrn());
        attributes.put("rayonRegistration", getRayonRegistration());
        attributes.put("rayonPosevPole", getRayonPosevPole());
        attributes.put("dateRegistration", getDateRegistration());
        attributes.put("archiveStatus", getArchiveStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long fermerId = (Long) attributes.get("fermerId");

        if (fermerId != null) {
            setFermerId(fermerId);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String pravoForma = (String) attributes.get("pravoForma");

        if (pravoForma != null) {
            setPravoForma(pravoForma);
        }

        String inn = (String) attributes.get("inn");

        if (inn != null) {
            setInn(inn);
        }

        String kpp = (String) attributes.get("kpp");

        if (kpp != null) {
            setKpp(kpp);
        }

        String ogrn = (String) attributes.get("ogrn");

        if (ogrn != null) {
            setOgrn(ogrn);
        }

        String rayonRegistration = (String) attributes.get("rayonRegistration");

        if (rayonRegistration != null) {
            setRayonRegistration(rayonRegistration);
        }

        String rayonPosevPole = (String) attributes.get("rayonPosevPole");

        if (rayonPosevPole != null) {
            setRayonPosevPole(rayonPosevPole);
        }

        Date dateRegistration = (Date) attributes.get("dateRegistration");

        if (dateRegistration != null) {
            setDateRegistration(dateRegistration);
        }

        Boolean archiveStatus = (Boolean) attributes.get("archiveStatus");

        if (archiveStatus != null) {
            setArchiveStatus(archiveStatus);
        }
    }

    @Override
    public long getFermerId() {
        return _fermerId;
    }

    @Override
    public void setFermerId(long fermerId) {
        _fermerId = fermerId;

        if (_fermerRemoteModel != null) {
            try {
                Class<?> clazz = _fermerRemoteModel.getClass();

                Method method = clazz.getMethod("setFermerId", long.class);

                method.invoke(_fermerRemoteModel, fermerId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_fermerRemoteModel != null) {
            try {
                Class<?> clazz = _fermerRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_fermerRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPravoForma() {
        return _pravoForma;
    }

    @Override
    public void setPravoForma(String pravoForma) {
        _pravoForma = pravoForma;

        if (_fermerRemoteModel != null) {
            try {
                Class<?> clazz = _fermerRemoteModel.getClass();

                Method method = clazz.getMethod("setPravoForma", String.class);

                method.invoke(_fermerRemoteModel, pravoForma);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getInn() {
        return _inn;
    }

    @Override
    public void setInn(String inn) {
        _inn = inn;

        if (_fermerRemoteModel != null) {
            try {
                Class<?> clazz = _fermerRemoteModel.getClass();

                Method method = clazz.getMethod("setInn", String.class);

                method.invoke(_fermerRemoteModel, inn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getKpp() {
        return _kpp;
    }

    @Override
    public void setKpp(String kpp) {
        _kpp = kpp;

        if (_fermerRemoteModel != null) {
            try {
                Class<?> clazz = _fermerRemoteModel.getClass();

                Method method = clazz.getMethod("setKpp", String.class);

                method.invoke(_fermerRemoteModel, kpp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getOgrn() {
        return _ogrn;
    }

    @Override
    public void setOgrn(String ogrn) {
        _ogrn = ogrn;

        if (_fermerRemoteModel != null) {
            try {
                Class<?> clazz = _fermerRemoteModel.getClass();

                Method method = clazz.getMethod("setOgrn", String.class);

                method.invoke(_fermerRemoteModel, ogrn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRayonRegistration() {
        return _rayonRegistration;
    }

    @Override
    public void setRayonRegistration(String rayonRegistration) {
        _rayonRegistration = rayonRegistration;

        if (_fermerRemoteModel != null) {
            try {
                Class<?> clazz = _fermerRemoteModel.getClass();

                Method method = clazz.getMethod("setRayonRegistration",
                        String.class);

                method.invoke(_fermerRemoteModel, rayonRegistration);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRayonPosevPole() {
        return _rayonPosevPole;
    }

    @Override
    public void setRayonPosevPole(String rayonPosevPole) {
        _rayonPosevPole = rayonPosevPole;

        if (_fermerRemoteModel != null) {
            try {
                Class<?> clazz = _fermerRemoteModel.getClass();

                Method method = clazz.getMethod("setRayonPosevPole",
                        String.class);

                method.invoke(_fermerRemoteModel, rayonPosevPole);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getDateRegistration() {
        return _dateRegistration;
    }

    @Override
    public void setDateRegistration(Date dateRegistration) {
        _dateRegistration = dateRegistration;

        if (_fermerRemoteModel != null) {
            try {
                Class<?> clazz = _fermerRemoteModel.getClass();

                Method method = clazz.getMethod("setDateRegistration",
                        Date.class);

                method.invoke(_fermerRemoteModel, dateRegistration);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getArchiveStatus() {
        return _archiveStatus;
    }

    @Override
    public boolean isArchiveStatus() {
        return _archiveStatus;
    }

    @Override
    public void setArchiveStatus(boolean archiveStatus) {
        _archiveStatus = archiveStatus;

        if (_fermerRemoteModel != null) {
            try {
                Class<?> clazz = _fermerRemoteModel.getClass();

                Method method = clazz.getMethod("setArchiveStatus",
                        boolean.class);

                method.invoke(_fermerRemoteModel, archiveStatus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getFermerRemoteModel() {
        return _fermerRemoteModel;
    }

    public void setFermerRemoteModel(BaseModel<?> fermerRemoteModel) {
        _fermerRemoteModel = fermerRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _fermerRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_fermerRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            FermerLocalServiceUtil.addFermer(this);
        } else {
            FermerLocalServiceUtil.updateFermer(this);
        }
    }

    @Override
    public Fermer toEscapedModel() {
        return (Fermer) ProxyUtil.newProxyInstance(Fermer.class.getClassLoader(),
            new Class[] { Fermer.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        FermerClp clone = new FermerClp();

        clone.setFermerId(getFermerId());
        clone.setName(getName());
        clone.setPravoForma(getPravoForma());
        clone.setInn(getInn());
        clone.setKpp(getKpp());
        clone.setOgrn(getOgrn());
        clone.setRayonRegistration(getRayonRegistration());
        clone.setRayonPosevPole(getRayonPosevPole());
        clone.setDateRegistration(getDateRegistration());
        clone.setArchiveStatus(getArchiveStatus());

        return clone;
    }

    @Override
    public int compareTo(Fermer fermer) {
        int value = 0;

        value = getName().compareTo(fermer.getName());

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

        if (!(obj instanceof FermerClp)) {
            return false;
        }

        FermerClp fermer = (FermerClp) obj;

        long primaryKey = fermer.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{fermerId=");
        sb.append(getFermerId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", pravoForma=");
        sb.append(getPravoForma());
        sb.append(", inn=");
        sb.append(getInn());
        sb.append(", kpp=");
        sb.append(getKpp());
        sb.append(", ogrn=");
        sb.append(getOgrn());
        sb.append(", rayonRegistration=");
        sb.append(getRayonRegistration());
        sb.append(", rayonPosevPole=");
        sb.append(getRayonPosevPole());
        sb.append(", dateRegistration=");
        sb.append(getDateRegistration());
        sb.append(", archiveStatus=");
        sb.append(getArchiveStatus());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("com.liferay.reestrFermerov.model.Fermer");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>fermerId</column-name><column-value><![CDATA[");
        sb.append(getFermerId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pravoForma</column-name><column-value><![CDATA[");
        sb.append(getPravoForma());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>inn</column-name><column-value><![CDATA[");
        sb.append(getInn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kpp</column-name><column-value><![CDATA[");
        sb.append(getKpp());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ogrn</column-name><column-value><![CDATA[");
        sb.append(getOgrn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rayonRegistration</column-name><column-value><![CDATA[");
        sb.append(getRayonRegistration());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rayonPosevPole</column-name><column-value><![CDATA[");
        sb.append(getRayonPosevPole());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dateRegistration</column-name><column-value><![CDATA[");
        sb.append(getDateRegistration());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>archiveStatus</column-name><column-value><![CDATA[");
        sb.append(getArchiveStatus());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
