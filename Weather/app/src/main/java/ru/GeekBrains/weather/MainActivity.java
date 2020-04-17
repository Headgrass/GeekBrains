package ru.GeekBrains.weather;
//Продолжаю работать
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnCity = findViewById(R.id.btnCity);

        btnCity.setOnClickListener(changeCity);


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
    }


