package com.example.fuckingpj.api.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Forecast implements Serializable {
    @SerializedName("location")
    public Location location;

    @SerializedName("current")
    public CurrentDay currentDay;

    @SerializedName("forecast")
    public ForecastDays forecasts;
}
