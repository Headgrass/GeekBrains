package ru.geekbrains.sendsms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText sms = findViewById(R.id.editText);
        Button send = findViewById(R.id.button);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String smsBody = sms.getText().toString();
                Intent smsSend = new Intent(Intent.ACTION_SEND);
                smsSend.setData(Uri.parse("smsto:"));
                smsSend.putExtra("smsBody", smsBody);
                startActivity(smsSend);
            }
        });
    }
}
