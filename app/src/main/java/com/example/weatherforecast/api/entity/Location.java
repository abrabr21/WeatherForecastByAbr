package com.example.weatherforecast.api.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Location implements Serializable {
    @SerializedName("name")
    public String name;

    @SerializedName("region")
    public String region;

    @SerializedName("country")
    public String country;

    @SerializedName("lat")
    public Double lat;

    @SerializedName("lon")
    public Double lon;

    @SerializedName("localtime_epoch")
    public Number localTimeEpoch;

    @SerializedName("localtime")
    public String localtime;
}
