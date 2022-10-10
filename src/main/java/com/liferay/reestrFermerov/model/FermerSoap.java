package com.liferay.reestrFermerov.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.reestrFermerov.service.http.FermerServiceSoap}.
 *
 * @author liza
 * @see com.liferay.reestrFermerov.service.http.FermerServiceSoap
 * @generated
 */
public class FermerSoap implements Serializable {
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

    public FermerSoap() {
    }

    public static FermerSoap toSoapModel(Fermer model) {
        FermerSoap soapModel = new FermerSoap();

        soapModel.setFermerId(model.getFermerId());
        soapModel.setName(model.getName());
        soapModel.setPravoForma(model.getPravoForma());
        soapModel.setInn(model.getInn());
        soapModel.setKpp(model.getKpp());
        soapModel.setOgrn(model.getOgrn());
        soapModel.setRayonRegistration(model.getRayonRegistration());
        soapModel.setRayonPosevPole(model.getRayonPosevPole());
        soapModel.setDateRegistration(model.getDateRegistration());
        soapModel.setArchiveStatus(model.getArchiveStatus());

        return soapModel;
    }

    public static FermerSoap[] toSoapModels(Fermer[] models) {
        FermerSoap[] soapModels = new FermerSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static FermerSoap[][] toSoapModels(Fermer[][] models) {
        FermerSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new FermerSoap[models.length][models[0].length];
        } else {
            soapModels = new FermerSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static FermerSoap[] toSoapModels(List<Fermer> models) {
        List<FermerSoap> soapModels = new ArrayList<FermerSoap>(models.size());

        for (Fermer model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new FermerSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _fermerId;
    }

    public void setPrimaryKey(long pk) {
        setFermerId(pk);
    }

    public long getFermerId() {
        return _fermerId;
    }

    public void setFermerId(long fermerId) {
        _fermerId = fermerId;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getPravoForma() {
        return _pravoForma;
    }

    public void setPravoForma(String pravoForma) {
        _pravoForma = pravoForma;
    }

    public String getInn() {
        return _inn;
    }

    public void setInn(String inn) {
        _inn = inn;
    }

    public String getKpp() {
        return _kpp;
    }

    public void setKpp(String kpp) {
        _kpp = kpp;
    }

    public String getOgrn() {
        return _ogrn;
    }

    public void setOgrn(String ogrn) {
        _ogrn = ogrn;
    }

    public String getRayonRegistration() {
        return _rayonRegistration;
    }

    public void setRayonRegistration(String rayonRegistration) {
        _rayonRegistration = rayonRegistration;
    }

    public String getRayonPosevPole() {
        return _rayonPosevPole;
    }

    public void setRayonPosevPole(String rayonPosevPole) {
        _rayonPosevPole = rayonPosevPole;
    }

    public Date getDateRegistration() {
        return _dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        _dateRegistration = dateRegistration;
    }

    public boolean getArchiveStatus() {
        return _archiveStatus;
    }

    public boolean isArchiveStatus() {
        return _archiveStatus;
    }

    public void setArchiveStatus(boolean archiveStatus) {
        _archiveStatus = archiveStatus;
    }
}
