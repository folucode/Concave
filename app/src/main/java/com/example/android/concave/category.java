package com.example.android.concave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }

    public void move(View v) {

        //Button button = (Button) findViewById(R.id.v);
        switch(v.getId()) {
            case R.id.Temperature:
                Intent intent = new Intent(category.this, TempMode.class);
                startActivity(intent);
                break;
            case R.id.Pressure:
                Intent intent2 = new Intent(category.this, pressureMode.class);
                startActivity(intent2);
                break;
            case R.id.Angle:
                Intent intent3 = new Intent(category.this, angleMode.class);
                startActivity(intent3);
                break;
            case R.id.Data:
                Intent intent4 = new Intent(category.this, dataMode.class);
                startActivity(intent4);
                break;
            case R.id.Power:
                Intent intent5 = new Intent(category.this, powerMode.class);
                startActivity(intent5);
                break;
            case R.id.Volume:
                Intent intent6 = new Intent(category.this, volumeMode.class);
                startActivity(intent6);
                break;
            case R.id.Length:
                Intent intent7 = new Intent(category.this, lengthMode.class);
                startActivity(intent7);
                break;
            case R.id.Weight_Mass:
                Intent intent8 = new Intent(category.this, weightMass_Mode.class);
                startActivity(intent8);
                break;
            case R.id.Energy:
                Intent intent9 = new Intent(category.this, energy.class);
                startActivity(intent9);
                break;
            case R.id.Speed:
                Intent intent10 = new Intent(category.this, speed.class);
                startActivity(intent10);
                break;
        }


    }
}
