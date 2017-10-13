package com.example.android.concave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class speed extends AppCompatActivity {

    String msg1;
    String msg2;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);
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

        Intent intent = new Intent(speed.this, MainActivity.class);

        startActivity(intent);

    }

    public void goToSolnS(View v) {

        switch(v.getId()) {

            case R.id.cms_ms:
                intent = new Intent(speed.this, speed_solution.class);
                msg1 = "centimeters per secs to meter per secs";
                msg2 = "meter per secs to centimeters per secs";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
                break;

            case R.id.cms_kmh:
                intent = new Intent(speed.this, speed_solution.class);
                msg1 = "centimeters per secs to kilometer per hour";
                msg2 = "kilometer per hour to centimeters per secs";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
                break;

            case R.id.ms_kmh:
                intent = new Intent(speed.this, speed_solution.class);
                msg1 = "meter per secs to kilometer per hour";
                msg2 = "kilometer per hour to meter per secs";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
                break;

        }

    }
}
