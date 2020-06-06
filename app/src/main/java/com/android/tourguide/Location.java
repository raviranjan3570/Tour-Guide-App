package com.android.tourguide;

public class Location {

    private String mName;
    private String mDetail;

    public Location(String mName, String mDetail) {
        this.mName = mName;
        this.mDetail = mDetail;
    }

    public String getmName() {
        return mName;
    }

    public String getmDetail() {
        return mDetail;
    }
}
