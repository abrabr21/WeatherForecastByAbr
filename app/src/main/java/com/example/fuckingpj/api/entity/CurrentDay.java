package com.example.fuckingpj.api.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CurrentDay implements Serializable {
    @SerializedName("last_updated_epoch")
    public Number lastUpdatedEpoch;

    @SerializedName("last_updated")
    public String lastUpdated;

    @SerializedName("temp_c")
    public Double tempCelsius;

    @SerializedName("temp_f")
    public Double temFarengate;

    @SerializedName("is_day")
    public Number isDay;

    @SerializedName("condition")
    public Condition condition;

    @SerializedName("wind_mph")
    public Double windMph;

    @SerializedName("wind_kph")
    public String windKph;

    @SerializedName("wind_degree")
    public Double windDegree;

    @SerializedName("wind_dir")
    public String windDir;

    @SerializedName("pressure_mb")
    public String pressureMb;

    @SerializedName("pressure_in")
    public String pressureIn;

    @SerializedName("precip_mm")
    public Double precipMm;

    @SerializedName("precip_in")
    public Double precipIm;

    @SerializedName("humidity")
    public String humidity;

    @SerializedName("feelslike_c")
    public Double feelslikeC;

    @SerializedName("feelslike_f")
    public Double feelslikeF;

    @SerializedName("vis_km")
    public Double visKm;

    @SerializedName("vis_miles")
    public Double visMiles;

    @SerializedName("uv")
    public Double uv;

    @SerializedName("gust_mph")
    public Double gustMph;

    @SerializedName("gust_kph")
    public Double gustKph;
}
