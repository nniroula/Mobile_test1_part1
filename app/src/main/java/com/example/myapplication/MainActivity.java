package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.RadioButton;

import com.example.myapplication.databinding.ActivityMainBinding;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    /* view binding variable */
    private ActivityMainBinding binding;

    /* declare variables */
    private TextView buttonValue; // just to display radio button value when clicked
    int one = 1;
    int two = 2;
    int three = 3;
    int four = 4;

   /* radio buttons */
    private RadioButton firstYearStd;
    private RadioButton sophomore;
    private RadioButton junior;
    private RadioButton senior;

    /* variable to hold a selected class variable value */
    int selectedRadioButtonValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        firstYearStd = binding.radioButtonFirst;
        sophomore = binding.radioButtonSophomore;
        junior = binding.radioButtonJunior;
        senior = binding.radioButtonSenior;

        buttonValue = findViewById(R.id.buttonValue); // use it to check assigned button values
    }

    public void onRadioButtonClick(View v){
        DecimalFormat df = new DecimalFormat("0");
        if(firstYearStd.isChecked()){
            selectedRadioButtonValue = one;
        }else if(sophomore.isChecked()){
            selectedRadioButtonValue = two;
        }else if(junior.isChecked()){
            selectedRadioButtonValue = three;
        } else if(senior.isChecked()){
            selectedRadioButtonValue = four;
        }
        buttonValue.setText(df.format(selectedRadioButtonValue));
    }
}