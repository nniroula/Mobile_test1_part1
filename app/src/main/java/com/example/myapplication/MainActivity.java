package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    // declare the variables
    private TextView displayRadioButton; // to display radio button value

   // radio buttons
    private RadioButton firstYearStd;
    private RadioButton sophomore;
    private RadioButton junior;
    private RadioButton senior;

    // int values
    int one = 1;
    int two = 2;
    int three = 3;
    int four = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // select a radio button on click
        firstYearStd = findViewById(R.id.radioButtonFirst);
        sophomore = findViewById(R.id.radioButtonSophomore);
        junior = findViewById(R.id.radioButtonJunior);
        senior = findViewById(R.id.radioButtonSenior);

        // set the values
        if(firstYearStd.isChecked()){
            firstYearStd.setText(one);
        }else if(sophomore.isChecked()){
            sophomore.setText(two);
        }else if(junior.isChecked()){
            junior.setText(three);
        } else if(senior.isChecked()){
            senior.setText(four);
        }

        // access the values -> text view

    }

    public void onRadioButtonClick(View v){

    }
}