package com.example.fuckingpj.api.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Hour implements Serializable {
    @SerializedName("time_epoch")
    Number timeEpoch;

    @SerializedName("time")
    String time;

    @SerializedName("temp_c")
    Double tempC;

    @SerializedName("temp_f")
    Double tempF;

    @SerializedName("is_day")
    Number isDay;

    @SerializedName("condition")
    Condition condition;

    @SerializedName("wind_mph")
    Double windMph;

    @SerializedName("wind_kph")
    Double windKph;

    @SerializedName("wind_degree")
    Double windDegree;

    @SerializedName("wind_dir")
    String windDir;

    @SerializedName("pressure_mb")
    Double pressureMb;

    @SerializedName("pressure_in")
    Double pressureIn;

    @SerializedName("precip_mm")
    Double precipMM;

    @SerializedName("precip_in")
    Double precipIn;

    @SerializedName("humidity")
    Number humidity;

    @SerializedName("cloud")
    Number cloud;

    @SerializedName("feelslike_c")
    Double feelslike_c;

    @SerializedName("feelslike_f")
    Double feelslike_f;

    @SerializedName("windchill_c")
    Double windchill_c;

    @SerializedName("windchill_f")
    Double windchill_f;

    @SerializedName("heatindex_c")
    Double heatindex_c;

    @SerializedName("heatindex_f")
    Double heatindex_f;

    @SerializedName("dewpoint_c")
    Double dewpoint_c;

    @SerializedName("dewpoint_f")
    Double dewpoint_f;

    @SerializedName("will_it_rain")
    Number will_it_rain;

    @SerializedName("chance_of_rain")
    Number chance_of_rain;

    @SerializedName("will_it_snow")
    Number will_it_snow;

    @SerializedName("chance_of_snow")
    Number chance_of_snow;

    @SerializedName("vis_km")
    Double vis_km;

    @SerializedName("vis_miles")
    Double vis_miles;

    @SerializedName("gust_mph")
    Double gust_mph;

    @SerializedName("gust_kph")
    Double gust_kph;

    @SerializedName("uv")
    Double uv;
}
