package com.example.android.concave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class angleMode extends AppCompatActivity {

    String msg1;
    String msg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angle_mode);
    }

    public void goToSolnA(View v) {

        switch (v.getId()) {
            case R.id.deg_rad:
                Intent intent = new Intent(angleMode.this, angle_solution.class);
                msg1 = "degrees to radians";
                msg2 = "radians to degrees";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
                break;
            case R.id.deg_grad:
                Intent intent2 = new Intent(angleMode.this, angle_solution.class);
                msg1 = "degrees to gradians";
                msg2 = "gradians to degrees";
                intent2.putExtra("msg1", msg1);
                intent2.putExtra("msg2", msg2);
                startActivity(intent2);
                break;
            case R.id.rad_grad:
                Intent intent3 = new Intent(angleMode.this, angle_solution.class);
                msg1 = "radians to gradians";
                msg2 = "gradians to radians";
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

        Intent intent = new Intent(angleMode.this, MainActivity.class);

        startActivity(intent);

    }

}
