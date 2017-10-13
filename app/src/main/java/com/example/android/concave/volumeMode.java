package com.example.android.concave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class volumeMode extends AppCompatActivity {

    String msg1;
    String msg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_mode);
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

        Intent intent = new Intent(volumeMode.this, MainActivity.class);

        startActivity(intent);

    }

    public void goToSolnV(View v) {

        switch(v.getId()) {

            case R.id.milliliter_liter:
                Intent intent = new Intent(volumeMode.this, volume_solution.class);
                msg1 = "milliliter to liter";
                msg2 = "liter to milliliter";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
                break;

            case R.id.milliliter_gallons_us:
                Intent intent2 = new Intent(volumeMode.this, volume_solution.class);
                msg1 = "milliliter to gallons(us)";
                msg2 = "gallons(us) to milliliter";
                intent2.putExtra("msg1", msg1);
                intent2.putExtra("msg2", msg2);
                startActivity(intent2);
                break;

            case R.id.liter_gallons_us:
                Intent intent3 = new Intent(volumeMode.this, volume_solution.class);
                msg1 = "liter to gallons(us)";
                msg2 = "gallons(us) to liter";
                intent3.putExtra("msg1", msg1);
                intent3.putExtra("msg2", msg2);
                startActivity(intent3);
                break;
        }

    }

}
