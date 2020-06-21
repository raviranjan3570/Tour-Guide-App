package com.android.tourguide;

class Location {

    private int mTitle;
    private int mDetail;
    private int mAddress;
    private int mTime;
    private int mImageId;

    Location(int mTitle, int mDetail, int mAddress, int mTime, int mImageId) {
        this.mTitle = mTitle;
        this.mDetail = mDetail;
        this.mAddress = mAddress;
        this.mTime = mTime;
        this.mImageId = mImageId;
    }

    int getmTitle() {
        return mTitle;
    }

    int getmDetail() {
        return mDetail;
    }

    int getmAddress() {
        return mAddress;
    }

    int getmTime() {
        return mTime;
    }

    int getmImageId() {
        return mImageId;
    }
}