package com.example.android.concave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class energy extends AppCompatActivity {

    String msg1;
    String msg2;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy);
    }

    public void goToSoln(View v) {

        switch(v.getId()) {

            case R.id.joules_electronvolts:
                intent = new Intent(energy.this, energy_solution.class);
                msg1 = "joules to electronvolts";
                msg2 = "electronvolts to joules";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
                break;

            case R.id.joules_kilojoules:
                intent = new Intent(energy.this, energy_solution.class);
                msg1 = "joules to kilojoules";
                msg2 = "kilojoules to joules";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
                break;

            case R.id.electronvolts_kilojoules:
                intent = new Intent(energy.this, energy_solution.class);
                msg1 = "electronvolts to kilojoules";
                msg2 = "kilojoules to electronvolts";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
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

        Intent intent = new Intent(energy.this, MainActivity.class);

        startActivity(intent);

    }

}
