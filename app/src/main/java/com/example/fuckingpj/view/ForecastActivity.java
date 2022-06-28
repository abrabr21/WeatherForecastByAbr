package com.example.fuckingpj.view;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import com.example.fuckingpj.R;
import com.example.fuckingpj.api.entity.Astro;
import com.example.fuckingpj.api.entity.Forecast;
import com.example.fuckingpj.api.entity.Location;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class ForecastActivity extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        Forecast forecast = (Forecast) getIntent().getSerializableExtra("FORECAST");

        // Current place
        TextView address = findViewById(R.id.address);
        TextView lastUpdate = findViewById(R.id.updated_at);

        address.setText(formatLocation(forecast.location));
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        lastUpdate.setText(timeStamp);

        // Current temperature
        TextView tmp = findViewById(R.id.temp);
        TextView minTemp = findViewById(R.id.temp_min);
        TextView maxTemp = findViewById(R.id.temp_max);

        tmp.setText(temperature(forecast.currentDay.tempCelsius.toString()));
        minTemp.setText(temperature("min temp: "+forecast.forecasts.days.get(0).day.minTemperatureCelsius));
        maxTemp.setText(temperature("max temp: "+forecast.forecasts.days.get(0).day.maxTemperatureCelsius));

        // Condition oof the weather
        TextView weather = findViewById(R.id.status);


        weather.setText(forecast.currentDay.condition.text);

        TextView sunRise = findViewById(R.id.sunrise);
        TextView sunSet = findViewById(R.id.sunset);

        sunRise.setText(forecast.forecasts.days.get(0).astro.sunrise);
        sunSet.setText(forecast.forecasts.days.get(0).astro.sunset);

        TextView monTemp = findViewById(R.id.mnTemp);
        monTemp.setText(temperature(forecast.currentDay.tempCelsius.toString()));

        TextView tue = findViewById(R.id.SecondDay);
        tue.setText(forecast.forecasts.days.get(1).date.toString());
        TextView tueTemp = findViewById(R.id.tueTemp);
        tueTemp.setText(temperature(forecast.forecasts.days.get(1).day.avgTemperatureCelsius.toString()));

        TextView wen = findViewById(R.id.ThirdDay);
        wen.setText(forecast.forecasts.days.get(2).date.toString());
        TextView wenTemp = findViewById(R.id.wenTemp);
        wenTemp.setText(temperature(forecast.forecasts.days.get(2).day.avgTemperatureCelsius.toString()));





//        sunRise.setText(forecast.forecasts.days.);


        TextView pressure = findViewById(R.id.pressure);
        pressure.setText(forecast.currentDay.pressureMb + " Mb");

        TextView wind = findViewById(R.id.wind);
        wind.setText(forecast.currentDay.windDir+" "+forecast.currentDay.windKph+"km/h");

        TextView humidity = findViewById(R.id.humidity);
        humidity.setText(forecast.currentDay.humidity +" %");
    }

    private String formatLocation(Location location) {
        return location.country + ", " + location.name;
    }

    private String temperature(String temperature) {
        return temperature + "°C";
    }
}