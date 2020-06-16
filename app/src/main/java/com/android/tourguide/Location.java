package com.android.tourguide;

public class Location {

    private String mTitle;
    private String mDetail;
    private String mAddress;
    private String mTime;
    private int mImageId;

    public Location(String mTitle, String mDetail, String mAddress, String mTime, int mImageId) {
        this.mTitle = mTitle;
        this.mDetail = mDetail;
        this.mAddress = mAddress;
        this.mTime = mTime;
        this.mImageId = mImageId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDetail() {
        return mDetail;
    }

    public String getmAddress() {
        return mAddress;
    }

    public String getmTime() {
        return mTime;
    }

    public int getmImageId() {
        return mImageId;
    }
}