package com.example.android.concave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class lengthMode extends AppCompatActivity {

    String msg1;
    String msg2;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_mode);
    }

    public void goToHome() {

        Intent intent = new Intent(lengthMode.this, MainActivity.class);
        startActivity(intent);

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

    public void goToSoln(View v) {

        switch (v.getId()) {
            case R.id.meters_centimeter:
                intent = new Intent(lengthMode.this, length_solution.class);
                msg1 = "meters to centimeter";
                msg2 = "centimeter to meters";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
                break;

            case R.id.meters_kilometer:
                intent = new Intent(lengthMode.this, length_solution.class);
                msg1 = "meters to kilometer";
                msg2 = "kilometer to meters";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
                break;

            case R.id.meters_millimeters:
                intent = new Intent(lengthMode.this, length_solution.class);
                msg1 = "meters to millimeters";
                msg2 = "millimeters to meters";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
                break;

            case R.id.centimeter_kilometer:
                intent = new Intent(lengthMode.this, length_solution.class);
                msg1 = "centimeter to kilometer";
                msg2 = "kilometer to centimeter";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
                break;

            case R.id.centimeter_millimeters:
                intent = new Intent(lengthMode.this, length_solution.class);
                msg1 = "centimeter to millimeters";
                msg2 = "millimeters to centimeter";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
                break;

            case R.id.kilometer_millimeters:
                intent = new Intent(lengthMode.this, length_solution.class);
                msg1 = "kilometer to millimeters";
                msg2 = "millimeters to kilometer";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
                break;

        }
    }

    public void Home(View v) {

        Intent intent = new Intent(lengthMode.this, MainActivity.class);

        startActivity(intent);

    }

}