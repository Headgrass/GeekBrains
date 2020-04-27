package ru.GeekBrains.weather;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Constants {
    private static final int Request_Code_Settings = 42;
    private static final String WEATHER = "WEATHER";

    private Weather weather;

    private TextView currCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        Parcel parcel = (Parcel) getIntent().getSerializableExtra(TEXT);
        if (parcel == null){
        TextView currCity = findViewById(R.id.city);
        currCity.setText(parcel.city);
        }*/

        weather = new Weather();

        currCity = findViewById(R.id.city);
        currCity.setText(weather.getCityName());


        Button settings = findViewById(R.id.btnset);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activitytwo.class);
                startActivity(intent);
                startActivityForResult(intent, Request_Code_Settings);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == Request_Code_Settings) {
            if (resultCode == RESULT_OK) {
                Parcel parcel = getParcelFromIntent(data);
                weather = new Weather();
                weather.setCityName(parcel.city);
                currCity.setText(weather.getCityName());
                return;
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private Parcel getParcelFromIntent(@Nullable Intent data) {
        Parcel parcel = null;
        if (data != null) {
            parcel = (Parcel) data.getSerializableExtra(TEXT);
        }
        if (parcel == null) {
            parcel = new Parcel();
        }
        return parcel;
    }
}


