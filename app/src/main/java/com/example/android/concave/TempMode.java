package com.example.android.concave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TempMode extends AppCompatActivity {

    String msg1;
    String msg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_mode);
    }

    public void Share(View v) {

        String msg = "I just used ConcaveApp, it's the best converter for android. You should try it\n";
        msg += "Download Here! https://bit.ly/2u2hwLz";

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, msg);
        sendIntent.setType("text/plain");
        startActivity(sendIntent);

    }

    public void Home(View v) {

        Intent intent = new Intent(TempMode.this, MainActivity.class);

        startActivity(intent);

    }

    public void goToSoln(View v) {

        switch (v.getId()) {
            case R.id.celcius_fahrenheit:
                Intent intent = new Intent(TempMode.this, solution.class);
                msg1 = "celcius to fahrenheit";
                msg2 = "fahrenheit to celcius";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
                break;
            case R.id.kelvin_celcius:
                Intent intent2 = new Intent(TempMode.this, solution.class);
                 msg1 = "kelvin to celcius";
                 msg2 = "celcius to kelvin";
                intent2.putExtra("msg1", msg1);
                intent2.putExtra("msg2", msg2);
                startActivity(intent2);
                break;
            case R.id.fahrenheit_kelvin:
                Intent intent3 = new Intent(TempMode.this, solution.class);
                msg1 = "fahrenheit to kelvin";
                msg2 = "kelvin to fahrenheit";
                intent3.putExtra("msg1", msg1);
                intent3.putExtra("msg2", msg2);
                startActivity(intent3);
                break;

        }

    }
}
