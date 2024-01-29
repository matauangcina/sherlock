package com.test.test.database;

import java.util.Date;
import java.util.UUID;
/* loaded from: classes3.dex */
public class Crime {
    private Date mDate;
    private final UUID mId;
    private String mPhoneNum;
    private boolean mSolved;
    private String mSuspect;
    private String mSuspectId;
    private String mTitle;

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        this.mId = id;
        this.mDate = new Date();
    }

    public UUID getId() {
        return this.mId;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public Date getDate() {
        return this.mDate;
    }

    public void setDate(Date date) {
        this.mDate = date;
    }

    public boolean isSolved() {
        return this.mSolved;
    }

    public void setSolved(boolean solved) {
        this.mSolved = solved;
    }

    public String getSuspect() {
        return this.mSuspect;
    }

    public void setSuspect(String suspect) {
        this.mSuspect = suspect;
    }

    public String getPhoneNum() {
        return this.mPhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.mPhoneNum = phoneNum;
    }

    public String getSuspectId() {
        return this.mSuspectId;
    }

    public void setSuspectId(String suspectId) {
        this.mSuspectId = suspectId;
    }

    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }
}
