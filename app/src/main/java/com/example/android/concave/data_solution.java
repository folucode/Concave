package com.example.android.concave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class data_solution extends AppCompatActivity {

    String msg1;
    String msg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_solution);

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

        Intent intent = new Intent(data_solution.this, MainActivity.class);

        startActivity(intent);

    }

   public void convert(View view) {

       RadioButton Rad1 = (RadioButton) findViewById(R.id.radioButton);
       Boolean isRad1 = Rad1.isChecked();

       RadioButton Rad2 = (RadioButton) findViewById(R.id.radioButton2);
       Boolean isRad2 = Rad2.isChecked();

       //case when the first radio button is selected
       if(isRad1) {

           //case of bytes to kilobytes
           if(Rad1.getText().toString().equals("bytes to kilobytes")) {

               EditText text1 = (EditText) findViewById(R.id.editText);
               Double fromNumber = Double.parseDouble(text1.getText().toString());

               Double answer = fromNumber / 1000;
               EditText text2 = (EditText) findViewById(R.id.editText3);
               text2.setText(String.valueOf(answer));

               //case of bytes to megabytes
           } else if(Rad1.getText().toString().equals("bytes to megabytes")) {

               EditText text1 = (EditText) findViewById(R.id.editText);
               Double fromNumber = Double.parseDouble(text1.getText().toString());

               Double answer = fromNumber / 1000000;
               EditText text2 = (EditText) findViewById(R.id.editText3);
               text2.setText(String.valueOf(answer));

               //case of bytes to gigabytes
           } else if(Rad1.getText().toString().equals("bytes to gigabytes")) {

               EditText text1 = (EditText) findViewById(R.id.editText);
               Double fromNumber = Double.parseDouble(text1.getText().toString());

               Double answer = fromNumber / 1000000000;
               EditText text2 = (EditText) findViewById(R.id.editText3);
               text2.setText(String.valueOf(answer));

               //case of bytes to terabytes
           } else if(Rad1.getText().toString().equals("bytes to terabytes")) {

               EditText text1 = (EditText) findViewById(R.id.editText);
               Double fromNumber = Double.parseDouble(text1.getText().toString());

               Double answer = fromNumber / 1000000000000L;
               EditText text2 = (EditText) findViewById(R.id.editText3);
               text2.setText(String.valueOf(answer));

               //case of kilobytes to megabytes
           } else if(Rad1.getText().toString().equals("kilobytes to megabytes")) {

               EditText text1 = (EditText) findViewById(R.id.editText);
               Double fromNumber = Double.parseDouble(text1.getText().toString());

               Double answer = fromNumber / 1000;
               EditText text2 = (EditText) findViewById(R.id.editText3);
               text2.setText(String.valueOf(answer));

              //case of kilobytes to gigabytes
           } else if(Rad1.getText().toString().equals("kilobytes to gigabytes")) {

               EditText text1 = (EditText) findViewById(R.id.editText);
               Double fromNumber = Double.parseDouble(text1.getText().toString());

               Double answer = fromNumber / 1000000;
               EditText text2 = (EditText) findViewById(R.id.editText3);
               text2.setText(String.valueOf(answer));

               //case of kilobytes to terabytes
           } else if(Rad1.getText().toString().equals("kilobytes to terabytes")) {

               EditText text1 = (EditText) findViewById(R.id.editText);
               Double fromNumber = Double.parseDouble(text1.getText().toString());

               Double answer = fromNumber / 1000000000;
               EditText text2 = (EditText) findViewById(R.id.editText3);
               text2.setText(String.valueOf(answer));

               //case of megabytes to gigabytes
           } else if(Rad1.getText().toString().equals("megabytes to gigabytes")) {

               EditText text1 = (EditText) findViewById(R.id.editText);
               Double fromNumber = Double.parseDouble(text1.getText().toString());

               Double answer = fromNumber / 1000;
               EditText text2 = (EditText) findViewById(R.id.editText3);
               text2.setText(String.valueOf(answer));

               //case of megabytes to terabytes
           } else if (Rad1.getText().toString().equals("megabytes to terabytes")) {

               EditText text1 = (EditText) findViewById(R.id.editText);
               Double fromNumber = Double.parseDouble(text1.getText().toString());

               Double answer = fromNumber / 1000000;
               EditText text2 = (EditText) findViewById(R.id.editText3);
               text2.setText(String.valueOf(answer));

               //case of gigabytes to terabytes
           } else if(Rad1.getText().toString().equals("gigabytes to terabytes")) {

               EditText text1 = (EditText) findViewById(R.id.editText);
               Double fromNumber = Double.parseDouble(text1.getText().toString());

               Double answer = fromNumber / 1000;
               EditText text2 = (EditText) findViewById(R.id.editText3);
               text2.setText(String.valueOf(answer));
           }

         //case if the second radio button is checked
       } else if(isRad2) {

           //case of kilobytes to bytes
           if(Rad2.getText().toString().equals("kilobytes to bytes")) {

               EditText text1 = (EditText) findViewById(R.id.editText);
               Double fromNumber = Double.parseDouble(text1.getText().toString());

               Double answer = fromNumber * 1000;
               EditText text2 = (EditText) findViewById(R.id.editText3);
               text2.setText(String.valueOf(answer));

           //case of megabytes to bytes
           } else if(Rad2.getText().toString().equals("megabytes to bytes")) {

               EditText text1 = (EditText) findViewById(R.id.editText);
               Double fromNumber = Double.parseDouble(text1.getText().toString());

               Double answer = fromNumber * 1000000;
               EditText text2 = (EditText) findViewById(R.id.editText3);
               text2.setText(String.valueOf(answer));

           //case of gigabytes to bytes
           } else if(Rad2.getText().toString().equals("gigabytes to bytes")) {

               EditText text1 = (EditText) findViewById(R.id.editText);
               Double fromNumber = Double.parseDouble(text1.getText().toString());

               Double answer = fromNumber * 1000000000;
               EditText text2 = (EditText) findViewById(R.id.editText3);
               text2.setText(String.valueOf(answer));

           //case of terabytes to bytes
           } else if(Rad2.getText().equals("terabytes to bytes")) {

               EditText text1 = (EditText) findViewById(R.id.editText);
               Double fromNumber = Double.parseDouble(text1.getText().toString());

               Double answer = fromNumber * 1000000000000L;
               EditText text2 = (EditText) findViewById(R.id.editText3);
               text2.setText(String.valueOf(answer));

           //case of megabytes to kilobytes
           } else if(Rad2.getText().toString().equals("megabytes to kilobytes")) {

               EditText text1 = (EditText) findViewById(R.id.editText);
               Double fromNumber = Double.parseDouble(text1.getText().toString());

               Double answer = fromNumber * 1000;
               EditText text2 = (EditText) findViewById(R.id.editText3);
               text2.setText(String.valueOf(answer));

           //case of gigabytes to kilobytes
           } else if(Rad2.getText().toString().equals("gigabytes to kilobytes")) {

               EditText text1 = (EditText) findViewById(R.id.editText);
               Double fromNumber = Double.parseDouble(text1.getText().toString());

               Double answer = fromNumber * 1000000;
               EditText text2 = (EditText) findViewById(R.id.editText3);
               text2.setText(String.valueOf(answer));

           //case of terabytes to kilobytes
           } else if(Rad2.getText().toString().equals("terabytes to kilobytes")) {

               EditText text1 = (EditText) findViewById(R.id.editText);
               Double fromNumber = Double.parseDouble(text1.getText().toString());

               Double answer = fromNumber * 1000000000;
               EditText text2 = (EditText) findViewById(R.id.editText3);
               text2.setText(String.valueOf(answer));

           //case of gigabytes to megabytes
           } else if(Rad2.getText().toString().equals("gigabytes to megabytes")) {

               EditText text1 = (EditText) findViewById(R.id.editText);
               Double fromNumber = Double.parseDouble(text1.getText().toString());

               Double answer = fromNumber * 1000;
               EditText text2 = (EditText) findViewById(R.id.editText3);
               text2.setText(String.valueOf(answer));

           //case of terabytes to megabytes
           } else if(Rad2.getText().toString().equals("terabytes to megabytes")) {

               EditText text1 = (EditText) findViewById(R.id.editText);
               Double fromNumber = Double.parseDouble(text1.getText().toString());

               Double answer = fromNumber * 1000000;
               EditText text2 = (EditText) findViewById(R.id.editText3);
               text2.setText(String.valueOf(answer));

           //case of terabytes to gigabytes
           } else if(Rad2.getText().toString().equals("terabytes to gigabytes")) {

               EditText text1 = (EditText) findViewById(R.id.editText);
               Double fromNumber = Double.parseDouble(text1.getText().toString());

               Double answer = fromNumber * 1000;
               EditText text2 = (EditText) findViewById(R.id.editText3);
               text2.setText(String.valueOf(answer));

           }
       }
   }
}
