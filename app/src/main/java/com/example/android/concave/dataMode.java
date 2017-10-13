package com.example.android.concave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

import static android.R.attr.data;

public class dataMode extends AppCompatActivity {

    String msg1;
    String msg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_mode);
    }

    public void goToSolnD(View v) {

        switch(v.getId()) {

            case R.id.bytes_kilobytes:
                Intent intent = new Intent(dataMode.this, data_solution.class);
                msg1 = "bytes to kilobytes";
                msg2 = "kilobytes to bytes";
                intent.putExtra("msg1", msg1);
                intent.putExtra("msg2", msg2);
                startActivity(intent);
                break;

            case R.id.bytes_megabytes:
                Intent intent1 = new Intent(dataMode.this, data_solution.class);
                msg1 = "bytes to megabytes";
                msg2 = "megabytes to bytes";
                intent1.putExtra("msg1", msg1);
                intent1.putExtra("msg2", msg2);
                startActivity(intent1);
                break;

            case R.id.bytes_gigabytes:
                Intent intent2 = new Intent(dataMode.this, data_solution.class);
                msg1 = "bytes to gigabytes";
                msg2 = "gigabytes to bytes";
                intent2.putExtra("msg1", msg1);
                intent2.putExtra("msg2", msg2);
                startActivity(intent2);
                break;

            case R.id.bytes_terabytes:
                Intent intent3 = new Intent(dataMode.this, data_solution.class);
                msg1 = "bytes to terabytes";
                msg2 = "terabytes to bytes";
                intent3.putExtra("msg1", msg1);
                intent3.putExtra("msg2", msg2);
                startActivity(intent3);
                break;

            case R.id.kilobytes_megabytes:
                Intent intent4 = new Intent(dataMode.this, data_solution.class);
                msg1 = "kilobytes to megabytes";
                msg2 = "megabytes to kilobytes";
                intent4.putExtra("msg1", msg1);
                intent4.putExtra("msg2", msg2);
                startActivity(intent4);
                break;

            case R.id.kilobytes_gigabytes:
                Intent intent5 = new Intent(dataMode.this, data_solution.class);
                msg1 = "kilobytes to gigabytes";
                msg2 = "gigabytes to kilobytes";
                intent5.putExtra("msg1", msg1);
                intent5.putExtra("msg2", msg2);
                startActivity(intent5);
                break;

            case R.id.kilobytes_terabytes:
                Intent intent6 = new Intent(dataMode.this, data_solution.class);
                msg1 = "kilobytes to terabytes";
                msg2 = "terabytes to kilobytes";
                intent6.putExtra("msg1", msg1);
                intent6.putExtra("msg2", msg2);
                startActivity(intent6);
                break;

            case R.id.megabytes_gigabytes:
                Intent intent7 = new Intent(dataMode.this, data_solution.class);
                msg1 = "megabytes to gigabytes";
                msg2 = "gigabytes to megabytes";
                intent7.putExtra("msg1", msg1);
                intent7.putExtra("msg2", msg2);
                startActivity(intent7);
                break;

            case R.id.megabytes_terabytes:
                Intent intent8 = new Intent(dataMode.this, data_solution.class);
                msg1 = "megabytes to terabytes";
                msg2 = "terabytes to megabytes";
                intent8.putExtra("msg1", msg1);
                intent8.putExtra("msg2", msg2);
                startActivity(intent8);
                break;

            case R.id.gigabytes_terabytes:
                Intent intent9 = new Intent(dataMode.this, data_solution.class);
                msg1 = "gigabytes to terabytes";
                msg2 = "terabytes to gigabytes";
                intent9.putExtra("msg1", msg1);
                intent9.putExtra("msg2", msg2);
                startActivity(intent9);
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

        Intent intent = new Intent(dataMode.this, MainActivity.class);

        startActivity(intent);

    }

}

