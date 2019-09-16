package com.example.myplaces;

public class place {
    private String mArabName;
    private String mEngName;
    private int mImageResourceId;
    private String mInfo;

    public place(String defArab,String defEng,int imageId,String info){
        mArabName=defArab;
        mEngName=defEng;
        mImageResourceId=imageId;
        mInfo=info;
    }
    public String getArabName(){
        return mArabName;
    }
    public String getEngName(){
        return mEngName;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
    public  String getInfo(){
        return mInfo;
    }
}
