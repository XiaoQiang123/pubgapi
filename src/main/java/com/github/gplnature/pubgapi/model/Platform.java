package com.github.gplnature.pubgapi.model;

import com.google.gson.annotations.SerializedName;

public enum Platform {
    @SerializedName("steam") STEAM("steam"),
    @SerializedName("kakao") KAKAO("kakao"),
    @SerializedName("console") CONSOLE("console");

    private final String text;

    Platform(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}

