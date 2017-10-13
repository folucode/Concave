package com.example.android.concave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class length_solution extends AppCompatActivity {

    String msg1;
    String msg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_solution);

        //getting the appropriate text from the intent and displaying them accordingly
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

    public void convert(View view) {

        RadioButton Rad1 = (RadioButton) findViewById(R.id.radioButton);
        Boolean isRad1 = Rad1.isChecked();

        RadioButton Rad2 = (RadioButton) findViewById(R.id.radioButton2);
        Boolean isRad2 = Rad2.isChecked();

        if(isRad1) {

            //case of meters to centimeter
            if (Rad1.getText().equals("meters to centimeter")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber * 100;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

                //case of meters to kilometer
            } else if(Rad1.getText().equals("meters to kilometer")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber / 1000;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

                //case of meters to millimeters
            } else if(Rad1.getText().equals("meters to millimeters")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber * 1000;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

                //case of centimeter to kilometer
            } else if(Rad1.getText().equals("centimeter to kilometer")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber / 100000;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

                //case of centimeter to millimeters
            } else if(Rad1.getText().equals("centimeter to millimeters")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber * 10;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

                //case of kilometer to millimeters
            } else  if(Rad1.getText().equals("kilometer to millimeters")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber * 1000000;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

            }
        } else if(isRad2) {

            //case of centimeter of meters
            if (Rad2.getText().equals("centimeter to meters")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber / 100;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

                //case of kilometer to meters
            } else if(Rad2.getText().equals("kilometer to meters")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber * 1000;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

                //case of millimeters to meters
            } else if(Rad2.getText().equals("millimeters to meters")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber / 1000;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

                //case of kilometer of centimeter
            } else if(Rad2.getText().equals("kilometer to centimeter")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber * 100000;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

                //case of millimeters to centimeter
            }  else if(Rad2.getText().equals("millimeters to centimeter")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber / 10;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

                //case of millimeters to kilometer
            } else if(Rad2.getText().equals("millimeters to kilometer")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber / 1000000;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

            }

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

        Intent intent = new Intent(length_solution.this, MainActivity.class);

        startActivity(intent);

    }

}
