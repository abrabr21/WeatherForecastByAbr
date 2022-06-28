package com.example.fuckingpj.api.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ForecastDays implements Serializable {
    @SerializedName("forecastday")
    public List<ForecastDay> days;
}
