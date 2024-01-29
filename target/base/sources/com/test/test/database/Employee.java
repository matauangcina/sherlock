package com.test.test.database;

import java.util.UUID;
/* loaded from: classes3.dex */
public class Employee {
    private String mDomicile;
    private String mEmail;
    private String mId;
    private String mNIK;
    private String mName;
    private String mPhoneNum;
    private String mPosition;

    public Employee() {
    }

    public Employee(String nik, String name, String email, String phoneNum, String domicile, String position) {
        this.mId = UUID.randomUUID().toString();
        this.mNIK = nik;
        this.mName = name;
        this.mEmail = email;
        this.mPhoneNum = phoneNum;
        this.mDomicile = domicile;
        this.mPosition = position;
    }

    public String getId() {
        return this.mId;
    }

    public void setId(String id) {
        this.mId = id;
    }

    public String getNIK() {
        return this.mNIK;
    }

    public void setNIK(String NIK) {
        this.mNIK = NIK;
    }

    public String getName() {
        return this.mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getEmail() {
        return this.mEmail;
    }

    public void setEmail(String email) {
        this.mEmail = email;
    }

    public String getPhoneNum() {
        return this.mPhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.mPhoneNum = phoneNum;
    }

    public String getDomicile() {
        return this.mDomicile;
    }

    public void setDomicile(String domicile) {
        this.mDomicile = domicile;
    }

    public String getPosition() {
        return this.mPosition;
    }

    public void setPosition(String position) {
        this.mPosition = position;
    }
}
