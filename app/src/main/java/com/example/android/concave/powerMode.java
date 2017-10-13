package com.example.android.concave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class powerMode extends AppCompatActivity {

    String msg1;
    String msg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power_mode);
    }

    public void goToSolnPwr(View v) {

        switch (v.getId()) {

            case R.id.watts_kilowatts:
                Intent intent = new Intent(powerMode.this, power_solution.class);
                msg1 = "watts to kilowatts";
                msg2 = "kilowatts to watts";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
                break;

            case R.id.watts_horsepower:
                Intent intent2 = new Intent(powerMode.this, power_solution.class);
                msg1 = "watts to horsepower";
                msg2 = "horsepower to watts";
                intent2.putExtra("msg1", msg1);
                intent2.putExtra("msg2", msg2);
                startActivity(intent2);
                break;

            case R.id.kilowatts_horsepower:
                Intent intent3 = new Intent(powerMode.this, power_solution.class);
                msg1 = "kilowatts to horsepower";
                msg2 = "horsepower to kilowatts";
                intent3.putExtra("msg1", msg1);
                intent3.putExtra("msg2", msg2);
                startActivity(intent3);
                break;

        }
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

        Intent intent = new Intent(powerMode.this, MainActivity.class);

        startActivity(intent);

    }

}
