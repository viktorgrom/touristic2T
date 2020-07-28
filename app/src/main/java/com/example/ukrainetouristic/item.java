package com.example.ukrainetouristic;

public class item {

    int background;
    String profileName;
    String profileDescribe;

    public item(){

    }

    public item(int background, String profileName, String profileDescribe) {
        this.background = background;
        this.profileName = profileName;
        this.profileDescribe = profileDescribe;
    }

    public int getBackground() {
        return background;
    }

    public String getProfileName() {
        return profileName;
    }

    public String getProfileDescribe() {
        return profileDescribe;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public void setProfileDescribe(String profileDescribe) {
        this.profileDescribe = profileDescribe;
    }
}
