package ru.GeekBrains.weather;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activitytwo extends AppCompatActivity implements Constants{
    EditText changeCity1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        changeCity1 = findViewById(R.id.changeCity);



        Button backtoMain = findViewById(R.id.btnCity);
        backtoMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra(TEXT, createParcel());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
    private Parcel createParcel(){
        Parcel parcel = new Parcel();
        parcel.city = changeCity1.getText().toString();
        return parcel;
    }
}