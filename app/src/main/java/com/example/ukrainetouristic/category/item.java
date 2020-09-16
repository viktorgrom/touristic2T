package com.example.ukrainetouristic.category;

public class item {

    int id;
    int background;
    String profileName;
    String profileDescribe;

    public item(){

    }

    public item(int id, int background, String profileName, String profileDescribe) {
        this.id=id;
        this.background = background;
        this.profileName = profileName;
        this.profileDescribe = profileDescribe;
    }

    public int getBackground() {
        return background;
    }
    public int getId() {return id;}

    public String getProfileName() {
        return profileName;
    }

    public String getProfileDescribe() {
        return profileDescribe;
    }

    public void setId (int id) {
        this.id = id;
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
