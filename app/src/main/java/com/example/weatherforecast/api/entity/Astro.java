package com.example.weatherforecast.api.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Astro implements Serializable {
    @SerializedName("sunrise")
    public String sunrise;

    @SerializedName("sunset")
    public String sunset;

    @SerializedName("moonrise")
    public String moonrise;

    @SerializedName("moonset")
    public String moonset;

    @SerializedName("moon_phase")
    public String moonPhase;

    @SerializedName("moon_illumination")
    public String moonIllumination;
}
