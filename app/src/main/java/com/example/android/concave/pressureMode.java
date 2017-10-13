package com.example.android.concave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class pressureMode extends AppCompatActivity {

    String msg1;
    String msg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure_mode);
    }

    public void goToSolnP(View v) {

        switch (v.getId()) {
            case R.id.atm_pascals:
                Intent intent = new Intent(pressureMode.this, pressure_solution.class);
                msg1 = "ATMs to Pascals";
                msg2 = "Pascals to ATMs";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
                break;
            case R.id.atm_mmhg:
                Intent intent2 = new Intent(pressureMode.this, pressure_solution.class);
                msg1 = "ATMs to MmHg";
                msg2 = "MmHg to ATMs";
                intent2.putExtra("msg1", msg1);
                intent2.putExtra("msg2", msg2);
                startActivity(intent2);
                break;
            case R.id.pascals_mmhg:
                Intent intent3 = new Intent(pressureMode.this, pressure_solution.class);
                msg1 = "Pascals to MmHg";
                msg2 = "MmHg to Pascals";
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

        Intent intent = new Intent(pressureMode.this, MainActivity.class);

        startActivity(intent);

    }

}
