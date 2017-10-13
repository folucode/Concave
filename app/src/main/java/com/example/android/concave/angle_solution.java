package com.example.android.concave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class angle_solution extends AppCompatActivity {

    String msg1;
    String msg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angle_solution);

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

        Intent intent = new Intent(angle_solution.this, MainActivity.class);

        startActivity(intent);

    }

    public void convert(View view) {

        RadioButton Rad1 = (RadioButton) findViewById(R.id.radioButton);
        Boolean isRad1 = Rad1.isChecked();

        RadioButton Rad2 = (RadioButton) findViewById(R.id.radioButton2);
        Boolean isRad2 = Rad2.isChecked();

        //case if the first radio button is checked
        if(isRad1) {

            //case of degrees to radians
            if(Rad1.getText().toString().equals("degrees to radians")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber * 0.017453;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

            //case of degrees to gradians
            } else if(Rad1.getText().toString().equals("degrees to gradians")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber * 1.111111;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

                //case of radians to gradians
            } else if(Rad1.getText().toString().equals("radians to gradians")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber * 63.66198;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

            }

            //case if second radio button is clicked
        } else if(isRad2) {

            //case of radians to degrees
            if(Rad2.getText().toString().equals("radians to degrees")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber * 57.29578;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

                //case of gradians to degrees
            } else if(Rad2.getText().toString().equals("gradians to degrees")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromnumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromnumber * 0.9;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

            //case of gradians to radians
            } else if(Rad2.getText().toString().equals("gradians to radians")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber * 0.015708;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));
            }
        }
    }
}
