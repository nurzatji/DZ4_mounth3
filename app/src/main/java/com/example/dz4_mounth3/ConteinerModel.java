package com.example.dz4_mounth3;

import java.io.Serializable;

public class ConteinerModel implements Serializable {
    private int AvatarImageCountry;
    private String name;

    public int getAvatarImageCountry() {
        return AvatarImageCountry;
    }

    public ConteinerModel(int avatarImageCountry, String name) {
        AvatarImageCountry = avatarImageCountry;
        this.name = name;
    }

    public void setAvatarImageCountry(int avatarImageCountry) {
        AvatarImageCountry = avatarImageCountry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
