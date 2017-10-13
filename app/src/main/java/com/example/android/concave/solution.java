package com.example.android.concave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class solution extends AppCompatActivity {

    String msg1;
    String msg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution);

        Intent intent = getIntent();
        msg1 = intent.getStringExtra("msg1");
        msg2 = intent.getStringExtra("msg2");

        RadioButton rad1 = (RadioButton) findViewById(R.id.radioButton);
        rad1.setText(msg1);
        RadioButton rad2 = (RadioButton) findViewById(R.id.radioButton2);
        rad2.setText(msg2);

        EditText text2 = (EditText) findViewById(R.id.editText3);
        text2.setKeyListener(null);

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

        Intent intent = new Intent(solution.this, MainActivity.class);

        startActivity(intent);

    }

    public void convert(View v) {

        RadioButton Rad1 = (RadioButton) findViewById(R.id.radioButton);
        Boolean isRad1 = Rad1.isChecked();

        RadioButton Rad2 = (RadioButton) findViewById(R.id.radioButton2);
        Boolean isRad2 = Rad2.isChecked();

        //  this specifies the several cases for the first radio button
        if (isRad1) {

            //case of celcius to fahrenheit
            if (Rad1.getText().equals("celcius to fahrenheit")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double space1 = Double.parseDouble(text1.getText().toString());

                Double answer = space1 * 1.8 + 32;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

                //case of celcius to kelvin
            } else if(Rad1.getText().equals("kelvin to celcius")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double space1 = Double.parseDouble(text1.getText().toString());

                Double answer = space1 - 273.15;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

                //case of fahrenheit to kelvin
            } else if(Rad1.getText().equals("fahrenheit to kelvin")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double space1 = Double.parseDouble(text1.getText().toString());

                Double answer = (space1 + 459.67) * 5/9;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

            }

            //  this specifies the several cases for the second radio button
        } else if(isRad2) {

            //case of fahrenheit to celcius
            if (Rad2.getText().equals("fahrenheit to celcius")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double space1 = Double.parseDouble(text1.getText().toString());

                Double answer = (space1 - 32) / 1.8;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

                //case of fahrenheit to celcius
            } else if(Rad2.getText().equals("celcius to kelvin")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double space1 = Double.parseDouble(text1.getText().toString());

                Double answer = (space1 + 273.15);
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

                //case of fahrenheit to celcius
            } else if(Rad2.getText().equals("kelvin to fahrenheit")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double space1 = Double.parseDouble(text1.getText().toString());

                Double answer = (space1 * 9/5) - 459.67;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

            }

        }
    }

}
