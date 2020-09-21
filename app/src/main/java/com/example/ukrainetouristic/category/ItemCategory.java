package com.example.ukrainetouristic.category;

import android.os.Parcel;
import android.os.Parcelable;

public class ItemCategory implements Parcelable {

    int id;
    int background;
    String profileName;
    String profileDescribe;
    String profileLongDescribe;

    public ItemCategory(){

    }

    public ItemCategory(int id, int background, String profileName, String profileDescribe, String profileLongDescribe) {
        this.id=id;
        this.background = background;
        this.profileName = profileName;
        this.profileDescribe = profileDescribe;
        this.profileLongDescribe = profileLongDescribe;
    }

    protected ItemCategory(Parcel in) {
        id = in.readInt();
        background = in.readInt();
        profileName = in.readString();
        profileDescribe = in.readString();
        profileLongDescribe = in.readString();
    }

    public static final Creator<ItemCategory> CREATOR = new Creator<ItemCategory>() {
        @Override
        public ItemCategory createFromParcel(Parcel in) {
            return new ItemCategory(in);
        }

        @Override
        public ItemCategory[] newArray(int size) {
            return new ItemCategory[size];
        }
    };

    public int getBackground() {
        return background;
    }
    public int getId() {return id;}
    public String getProfileName() {
        return profileName;
    }
    public String getProfileDescribe() { return profileDescribe;
    }
    public String getProfileLongDescribe() { return profileLongDescribe; }

    public void setId (int id) {
        this.id = id;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public void setProfileName(String profileName) { this.profileName = profileName; }

    public void setProfileDescribe(String profileDescribe) { this.profileDescribe = profileDescribe; }
    public void setProfileLongDescribe(String profileLongDescribe) { this.profileLongDescribe = profileLongDescribe; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeInt(background);
        dest.writeString(profileName);
        dest.writeString(profileDescribe);
        dest.writeString(profileLongDescribe);
    }


}
