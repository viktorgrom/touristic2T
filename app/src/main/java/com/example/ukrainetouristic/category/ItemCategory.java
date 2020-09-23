package com.example.ukrainetouristic.category;

import android.os.Parcel;
import android.os.Parcelable;

public class ItemCategory implements Parcelable {

    int id;
    int background;
    int profileName;
    int profileDescribe;
    int profileLongDescribe;

    public ItemCategory(){

    }

    public ItemCategory(int id, int background, int profileName, int profileDescribe, int profileLongDescribe) {
        this.id=id;
        this.background = background;
        this.profileName = profileName;
        this.profileDescribe = profileDescribe;
        this.profileLongDescribe = profileLongDescribe;
    }

    protected ItemCategory(Parcel in) {
        id = in.readInt();
        background = in.readInt();
        profileName = in.readInt();
        profileDescribe = in.readInt();
        profileLongDescribe = in.readInt();
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
    public int getProfileName() {
        return profileName;
    }
    public int getProfileDescribe() { return profileDescribe;
    }
    public int getProfileLongDescribe() { return profileLongDescribe; }

    public void setId (int id) {
        this.id = id;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public void setProfileName(int profileName) { this.profileName = profileName; }

    public void setProfileDescribe(int profileDescribe) { this.profileDescribe = profileDescribe; }
    public void setProfileLongDescribe(int profileLongDescribe) { this.profileLongDescribe = profileLongDescribe; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeInt(background);
        dest.writeInt(profileName);
        dest.writeInt(profileDescribe);
        dest.writeInt(profileLongDescribe);
    }


}
