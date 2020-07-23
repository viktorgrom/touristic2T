package com.example.ukrainetouristic.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Hat implements Parcelable {
    private String title;
    private int image;
    private String describe;


    public Hat(String title, int image, String describe) {
        this.title = title;
        this.image = image;
        this.describe = describe;

    }

    public Hat() {
    }

    protected Hat(Parcel in) {
        title = in.readString();
        image = in.readInt();
        describe = in.readString();
    }

    public static final Creator<Hat> CREATOR = new Creator<Hat>() {
        @Override
        public Hat createFromParcel(Parcel in) {
            return new Hat(in);
        }

        @Override
        public Hat[] newArray(int size) {
            return new Hat[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescribe() {
        return describe;
    }

    public void setPrice(String price) {
        this.describe = describe;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeInt(image);
        dest.writeString(describe);
    }
}
