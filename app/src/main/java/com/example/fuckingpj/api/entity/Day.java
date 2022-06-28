package com.example.fuckingpj.api.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Day implements Serializable {
    @SerializedName("maxtemp_c")
    public String maxTemperatureCelsius;

    @SerializedName("maxtemp_f")
    public Double maxTemperatureFahrenheit;

    @SerializedName("mintemp_c")
    public String minTemperatureCelsius;

    @SerializedName("mintemp_f")
    public Double minTemperatureFahrenheit;

    @SerializedName("avgtemp_c")
    public Double avgTemperatureCelsius;

    @SerializedName("avgtemp_f")
    public Double avgTemperatureFahrenheit;

    // Maximum wind speed in miles per hour
    @SerializedName("maxwind_mph")
    public Double maxWindSpeedMile;

    // Maximum wind speed in kilometer per hour
    @SerializedName("maxwind_kph")
    public Double maxWindSpeedKilometer;

    @SerializedName("totalprecip_mm")
    public Double totalPrecipitationMilimeter;

    @SerializedName("totalprecip_in")
    public Double totalPrecipitationInches;

    @SerializedName("avgvis_km")
    public Double avgvisKm;

    @SerializedName("avgvis_miles")
    public Double avgvisMiles;

    @SerializedName("avghumidity")
    public Double avghumidity;

    @SerializedName("daily_will_it_rain")
    public Double dailyWillItRain;

    @SerializedName("daily_chance_of_rain")
    public Double dailyChanceOfRain;

    @SerializedName("daily_chance_of_snow")
    public Double dailyChanceOfSnow;

    @SerializedName("uv")
    public Double uv;

    @SerializedName("condition")
    public Condition condition;
}
