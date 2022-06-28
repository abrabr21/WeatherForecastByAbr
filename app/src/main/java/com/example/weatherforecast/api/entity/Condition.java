package com.example.weatherforecast.api.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Condition implements Serializable {
    @SerializedName("text")
    public String text;

    @SerializedName("icon")
    public String icon;

    @SerializedName("code")
    public Number code;
}
