package com.example.fuckingpj.api.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ForecastDay implements Serializable {
    @SerializedName("date")
    public String date;

    @SerializedName("date_epoch")
    public Number dateEpoch;

    @SerializedName("day")
    public Day day;

    @SerializedName("astro")
    public Astro astro;

    @SerializedName("hour")
    public List<Hour> hours;
}
