package com.liferay.reestrFermerov.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.reestrFermerov.model.Fermer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Fermer in entity cache.
 *
 * @author liza
 * @see Fermer
 * @generated
 */
public class FermerCacheModel implements CacheModel<Fermer>, Externalizable {
    public long fermerId;
    public String name;
    public String pravoForma;
    public String inn;
    public String kpp;
    public String ogrn;
    public String rayonRegistration;
    public String rayonPosevPole;
    public long dateRegistration;
    public boolean archiveStatus;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{fermerId=");
        sb.append(fermerId);
        sb.append(", name=");
        sb.append(name);
        sb.append(", pravoForma=");
        sb.append(pravoForma);
        sb.append(", inn=");
        sb.append(inn);
        sb.append(", kpp=");
        sb.append(kpp);
        sb.append(", ogrn=");
        sb.append(ogrn);
        sb.append(", rayonRegistration=");
        sb.append(rayonRegistration);
        sb.append(", rayonPosevPole=");
        sb.append(rayonPosevPole);
        sb.append(", dateRegistration=");
        sb.append(dateRegistration);
        sb.append(", archiveStatus=");
        sb.append(archiveStatus);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Fermer toEntityModel() {
        FermerImpl fermerImpl = new FermerImpl();

        fermerImpl.setFermerId(fermerId);

        if (name == null) {
            fermerImpl.setName(StringPool.BLANK);
        } else {
            fermerImpl.setName(name);
        }

        if (pravoForma == null) {
            fermerImpl.setPravoForma(StringPool.BLANK);
        } else {
            fermerImpl.setPravoForma(pravoForma);
        }

        if (inn == null) {
            fermerImpl.setInn(StringPool.BLANK);
        } else {
            fermerImpl.setInn(inn);
        }

        if (kpp == null) {
            fermerImpl.setKpp(StringPool.BLANK);
        } else {
            fermerImpl.setKpp(kpp);
        }

        if (ogrn == null) {
            fermerImpl.setOgrn(StringPool.BLANK);
        } else {
            fermerImpl.setOgrn(ogrn);
        }

        if (rayonRegistration == null) {
            fermerImpl.setRayonRegistration(StringPool.BLANK);
        } else {
            fermerImpl.setRayonRegistration(rayonRegistration);
        }

        if (rayonPosevPole == null) {
            fermerImpl.setRayonPosevPole(StringPool.BLANK);
        } else {
            fermerImpl.setRayonPosevPole(rayonPosevPole);
        }

        if (dateRegistration == Long.MIN_VALUE) {
            fermerImpl.setDateRegistration(null);
        } else {
            fermerImpl.setDateRegistration(new Date(dateRegistration));
        }

        fermerImpl.setArchiveStatus(archiveStatus);

        fermerImpl.resetOriginalValues();

        return fermerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        fermerId = objectInput.readLong();
        name = objectInput.readUTF();
        pravoForma = objectInput.readUTF();
        inn = objectInput.readUTF();
        kpp = objectInput.readUTF();
        ogrn = objectInput.readUTF();
        rayonRegistration = objectInput.readUTF();
        rayonPosevPole = objectInput.readUTF();
        dateRegistration = objectInput.readLong();
        archiveStatus = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(fermerId);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (pravoForma == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(pravoForma);
        }

        if (inn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(inn);
        }

        if (kpp == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(kpp);
        }

        if (ogrn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(ogrn);
        }

        if (rayonRegistration == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(rayonRegistration);
        }

        if (rayonPosevPole == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(rayonPosevPole);
        }

        objectOutput.writeLong(dateRegistration);
        objectOutput.writeBoolean(archiveStatus);
    }
}
