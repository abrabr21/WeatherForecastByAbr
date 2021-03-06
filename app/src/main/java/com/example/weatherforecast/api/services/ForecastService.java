package com.example.weatherforecast.api.services;

import com.example.weatherforecast.api.entity.Forecast;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface ForecastService {

    @GET("forecast.json")
    Observable<Forecast> getForWeek(
            @Query("key") String key,
            @Query("q") String city,
            @Query("days") String days
    );
}
