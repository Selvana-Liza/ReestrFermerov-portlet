package com.liferay.reestrFermerov.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Fermer}.
 * </p>
 *
 * @author liza
 * @see Fermer
 * @generated
 */
public class FermerWrapper implements Fermer, ModelWrapper<Fermer> {
    private Fermer _fermer;

    public FermerWrapper(Fermer fermer) {
        _fermer = fermer;
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

    /**
    * Returns the primary key of this fermer.
    *
    * @return the primary key of this fermer
    */
    @Override
    public long getPrimaryKey() {
        return _fermer.getPrimaryKey();
    }

    /**
    * Sets the primary key of this fermer.
    *
    * @param primaryKey the primary key of this fermer
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _fermer.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the fermer ID of this fermer.
    *
    * @return the fermer ID of this fermer
    */
    @Override
    public long getFermerId() {
        return _fermer.getFermerId();
    }

    /**
    * Sets the fermer ID of this fermer.
    *
    * @param fermerId the fermer ID of this fermer
    */
    @Override
    public void setFermerId(long fermerId) {
        _fermer.setFermerId(fermerId);
    }

    /**
    * Returns the name of this fermer.
    *
    * @return the name of this fermer
    */
    @Override
    public java.lang.String getName() {
        return _fermer.getName();
    }

    /**
    * Sets the name of this fermer.
    *
    * @param name the name of this fermer
    */
    @Override
    public void setName(java.lang.String name) {
        _fermer.setName(name);
    }

    /**
    * Returns the pravo forma of this fermer.
    *
    * @return the pravo forma of this fermer
    */
    @Override
    public java.lang.String getPravoForma() {
        return _fermer.getPravoForma();
    }

    /**
    * Sets the pravo forma of this fermer.
    *
    * @param pravoForma the pravo forma of this fermer
    */
    @Override
    public void setPravoForma(java.lang.String pravoForma) {
        _fermer.setPravoForma(pravoForma);
    }

    /**
    * Returns the inn of this fermer.
    *
    * @return the inn of this fermer
    */
    @Override
    public java.lang.String getInn() {
        return _fermer.getInn();
    }

    /**
    * Sets the inn of this fermer.
    *
    * @param inn the inn of this fermer
    */
    @Override
    public void setInn(java.lang.String inn) {
        _fermer.setInn(inn);
    }

    /**
    * Returns the kpp of this fermer.
    *
    * @return the kpp of this fermer
    */
    @Override
    public java.lang.String getKpp() {
        return _fermer.getKpp();
    }

    /**
    * Sets the kpp of this fermer.
    *
    * @param kpp the kpp of this fermer
    */
    @Override
    public void setKpp(java.lang.String kpp) {
        _fermer.setKpp(kpp);
    }

    /**
    * Returns the ogrn of this fermer.
    *
    * @return the ogrn of this fermer
    */
    @Override
    public java.lang.String getOgrn() {
        return _fermer.getOgrn();
    }

    /**
    * Sets the ogrn of this fermer.
    *
    * @param ogrn the ogrn of this fermer
    */
    @Override
    public void setOgrn(java.lang.String ogrn) {
        _fermer.setOgrn(ogrn);
    }

    /**
    * Returns the rayon registration of this fermer.
    *
    * @return the rayon registration of this fermer
    */
    @Override
    public java.lang.String getRayonRegistration() {
        return _fermer.getRayonRegistration();
    }

    /**
    * Sets the rayon registration of this fermer.
    *
    * @param rayonRegistration the rayon registration of this fermer
    */
    @Override
    public void setRayonRegistration(java.lang.String rayonRegistration) {
        _fermer.setRayonRegistration(rayonRegistration);
    }

    /**
    * Returns the rayon posev pole of this fermer.
    *
    * @return the rayon posev pole of this fermer
    */
    @Override
    public java.lang.String getRayonPosevPole() {
        return _fermer.getRayonPosevPole();
    }

    /**
    * Sets the rayon posev pole of this fermer.
    *
    * @param rayonPosevPole the rayon posev pole of this fermer
    */
    @Override
    public void setRayonPosevPole(java.lang.String rayonPosevPole) {
        _fermer.setRayonPosevPole(rayonPosevPole);
    }

    /**
    * Returns the date registration of this fermer.
    *
    * @return the date registration of this fermer
    */
    @Override
    public java.util.Date getDateRegistration() {
        return _fermer.getDateRegistration();
    }

    /**
    * Sets the date registration of this fermer.
    *
    * @param dateRegistration the date registration of this fermer
    */
    @Override
    public void setDateRegistration(java.util.Date dateRegistration) {
        _fermer.setDateRegistration(dateRegistration);
    }

    /**
    * Returns the archive status of this fermer.
    *
    * @return the archive status of this fermer
    */
    @Override
    public boolean getArchiveStatus() {
        return _fermer.getArchiveStatus();
    }

    /**
    * Returns <code>true</code> if this fermer is archive status.
    *
    * @return <code>true</code> if this fermer is archive status; <code>false</code> otherwise
    */
    @Override
    public boolean isArchiveStatus() {
        return _fermer.isArchiveStatus();
    }

    /**
    * Sets whether this fermer is archive status.
    *
    * @param archiveStatus the archive status of this fermer
    */
    @Override
    public void setArchiveStatus(boolean archiveStatus) {
        _fermer.setArchiveStatus(archiveStatus);
    }

    @Override
    public boolean isNew() {
        return _fermer.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _fermer.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _fermer.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _fermer.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _fermer.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _fermer.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _fermer.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _fermer.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _fermer.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _fermer.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _fermer.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new FermerWrapper((Fermer) _fermer.clone());
    }

    @Override
    public int compareTo(com.liferay.reestrFermerov.model.Fermer fermer) {
        return _fermer.compareTo(fermer);
    }

    @Override
    public int hashCode() {
        return _fermer.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.liferay.reestrFermerov.model.Fermer> toCacheModel() {
        return _fermer.toCacheModel();
    }

    @Override
    public com.liferay.reestrFermerov.model.Fermer toEscapedModel() {
        return new FermerWrapper(_fermer.toEscapedModel());
    }

    @Override
    public com.liferay.reestrFermerov.model.Fermer toUnescapedModel() {
        return new FermerWrapper(_fermer.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _fermer.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _fermer.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _fermer.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FermerWrapper)) {
            return false;
        }

        FermerWrapper fermerWrapper = (FermerWrapper) obj;

        if (Validator.equals(_fermer, fermerWrapper._fermer)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Fermer getWrappedFermer() {
        return _fermer;
    }

    @Override
    public Fermer getWrappedModel() {
        return _fermer;
    }

    @Override
    public void resetOriginalValues() {
        _fermer.resetOriginalValues();
    }
}
