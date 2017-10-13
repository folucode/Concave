package com.example.android.concave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class weightMass_solution extends AppCompatActivity {

    String msg1;
    String msg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_mass_solution);

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

        Intent intent = new Intent(weightMass_solution.this, MainActivity.class);

        startActivity(intent);

    }

    public void convert(View view) {

        RadioButton Rad1 = (RadioButton) findViewById(R.id.radioButton);
        Boolean isRad1 = Rad1.isChecked();

        RadioButton Rad2 = (RadioButton) findViewById(R.id.radioButton2);
        Boolean isRad2 = Rad2.isChecked();

        if (isRad1) {

            //case of grammes to kilogrammes
            if (Rad1.getText().equals("grammes to kilogrammes")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber / 1000;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

                //case of grammes to pounds
            } else if (Rad1.getText().equals("grammes to pounds")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber / 453.59237;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

                //case of kilogrammes to pounds
            } else if (Rad1.getText().equals("kilogrammes to pounds")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber / 0.45359237;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

            }

        } else if (isRad2) {

            //case of kilogrammes to grammes
            if (Rad2.getText().equals("kilogrammes to grammes")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber * 1000;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

                //case of pounds to grammes
            } else if (Rad2.getText().equals("pounds to grammes")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber * 453.59237;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

                //case of pounds to kilogrammes
            } else if (Rad2.getText().equals("pounds to kilogrammes")) {

                EditText text1 = (EditText) findViewById(R.id.editText);
                Double fromNumber = Double.parseDouble(text1.getText().toString());

                Double answer = fromNumber * 0.45359237;
                EditText text2 = (EditText) findViewById(R.id.editText3);
                text2.setText(String.valueOf(answer));

            }

        }

    }
}
