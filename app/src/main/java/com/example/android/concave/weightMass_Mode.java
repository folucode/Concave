package com.example.android.concave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class weightMass_Mode extends AppCompatActivity {

    String msg1;
    String msg2;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_mass__mode);
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

        Intent intent = new Intent(weightMass_Mode.this, MainActivity.class);

        startActivity(intent);

    }

    public void goToSolnWm(View v) {

        switch(v.getId()) {

            case R.id.grammes_kilograms:
                intent = new Intent(weightMass_Mode.this, weightMass_solution.class);
                msg1 = "grammes to kilogrammes";
                msg2 = "kilogrammes to grammes";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
                break;

            case R.id.grammes_pounds:
                intent = new Intent(weightMass_Mode.this, weightMass_solution.class);
                msg1 = "grammes to pounds";
                msg2 = "pounds to grammes";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
                break;

            case R.id.kilograms_pounds:
                intent = new Intent(weightMass_Mode.this, weightMass_solution.class);
                msg1 = "kilogrammes to pounds";
                msg2 = "pounds to kilogrammes";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
                break;

        }

    }

}
