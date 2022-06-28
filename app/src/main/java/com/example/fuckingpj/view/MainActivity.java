package com.example.fuckingpj.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.fuckingpj.R;
import com.example.fuckingpj.api.entity.Forecast;
import com.example.fuckingpj.api.services.ForecastService;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    public static String requestUrl = "https://api.weatherapi.com/v1/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gBtn = findViewById(R.id.gBtn);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(requestUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        ForecastService service = retrofit.create(ForecastService.class);

        ProgressBar loading = findViewById(R.id.progressBar);
        loading.setVisibility(ProgressBar.INVISIBLE);

        gBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input = findViewById(R.id.editTextCity);

                service.getForWeek("df715ab35e3248bd8a4180739222106", input.getText().toString(), "6")
                        .subscribeOn(Schedulers.io())
                        .subscribe(new Subscriber<Forecast>() {
                            @Override
                            public void onCompleted() {
                                Log.d("TAG", "[onCompleted] ");
                            }

                            @Override
                            public void onError(Throwable t) {
                                Log.e("ForecastLoading", t.getMessage());
                                t.printStackTrace();
                            }

                            @Override
                            public void onNext(Forecast m) {
                                Intent intent = new Intent(MainActivity.this, ForecastActivity.class);
                                intent.putExtra("FORECAST", m);

                                startActivity(intent);
                            }
                        });
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }
}

