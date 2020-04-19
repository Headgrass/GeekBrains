package ru.GeekBrains.weather;
//Продолжаю работать
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LIFECYCLE = "LIFE_CYCLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       // Button btnCity = findViewById(R.id.btnCity);

       // btnCity.setOnClickListener(changeCity);

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

    private  View.OnClickListener changeCity = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, Activitytwo.class);
            startActivity();
        }

        private void startActivity() {
            setContentView(R.layout.settings);
        }
    };
    public void makeToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        Log.d(LIFECYCLE, message);
    }
    }


