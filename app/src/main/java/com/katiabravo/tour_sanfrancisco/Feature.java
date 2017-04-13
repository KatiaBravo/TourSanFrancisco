package com.katiabravo.tour_sanfrancisco;

/**
 * Created by wendy on 12/26/2016.
 */

public class Feature {

    private String mName;
    private int mImageResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mDescription;

    public Feature(String name, int imageResourceId, int description){
        mName = name;
        mImageResourceId = imageResourceId;
        mDescription = description;
    }

    public Feature(String name, int description){
        mName = name;
        mDescription = description;
    }

    public String getmName(){ return mName;}
    public int getmImageResourceId(){ return mImageResourceId;}
    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED;}
    public int getmDescription(){ return mDescription;}

}
