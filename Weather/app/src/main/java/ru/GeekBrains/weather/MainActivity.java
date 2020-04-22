package ru.GeekBrains.weather;
//Продолжаю работать
import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements Constants{
    private static final String LIFECYCLE = "LIFE_CYCLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Parcel parcel = (Parcel) getIntent().getSerializableExtra(TEXT);
        TextView currCity = findViewById(R.id.city);
        currCity.setText(parcel.city);


        Button settings = findViewById(R.id.btnset);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activitytwo.class);
                startActivity(intent);
            }
        });

        if (savedInstanceState == null) {
            makeToast("Первый запуск!");
        } else {
            makeToast("Второй запуск");
        }
        }
    @Override
    protected void onResume() {
        super.onResume();
        makeToast("on Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        makeToast("on Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        makeToast("on Stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        makeToast("on Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        makeToast("on Destroy");
    }

    @Override
    protected void onStart(){
        super.onStart();
        makeToast("on Start");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        makeToast("Повторный запуск onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        makeToast("Запись в onSaveInstanceState");
    }

    public void makeToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        Log.d(LIFECYCLE, message);
    }
    }


