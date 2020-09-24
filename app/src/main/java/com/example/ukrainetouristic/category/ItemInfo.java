package com.example.ukrainetouristic.category;

import android.widget.ImageView;

public class ItemInfo {


    private String profileName;
    private String proShortDescribe;
    private String proLongDescribe;

    public ItemInfo(String profileName, String proShortDescribe, String proLongDescribe) {


        this.profileName = profileName;
        this.proShortDescribe = proShortDescribe;
        this.proLongDescribe = proLongDescribe;
    }


    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getProShortDescribe() {
        return proShortDescribe;
    }

    public void setProShortDescribe(String proShortDescribe) {
        this.proShortDescribe = proShortDescribe;
    }

    public String getProLongDescribe() {
        return proLongDescribe;
    }

    public void setProLongDescribe(String proLongDescribe) {
        this.proLongDescribe = proLongDescribe;
    }
}
