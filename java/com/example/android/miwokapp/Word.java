package com.example.android.miwokapp;

/**
 * Created by Yasser on 26/02/2017.
 */

public class Word {


    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId =  NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId ;


    public Word(String DefaultTranslation , String miwokTranslation ,int imageResourceId, int audioResourceId){
         mDefaultTranslation = DefaultTranslation ;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId = imageResourceId ;
        mAudioResourceId = audioResourceId;

    }
    public Word(String DefaultTranslation , String miwokTranslation , int audioResourceId){
        mDefaultTranslation = DefaultTranslation ;
        mMiwokTranslation = miwokTranslation;

        mAudioResourceId = audioResourceId;
    }


    public String getDefaultTranslation(){

        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){

        return mMiwokTranslation ;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED ;

    }

    public int getmAudioResourceId(){
        return mAudioResourceId;
    }


}
