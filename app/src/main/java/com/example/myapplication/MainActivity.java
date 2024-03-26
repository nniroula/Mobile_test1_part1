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
    private TextView displayRadioButton; // to display radio button value

   /* radio buttons */
    private RadioButton firstYearStd;
    private RadioButton sophomore;
    private RadioButton junior;
    private RadioButton senior;

    private TextView buttonValue;

    /* int values */
    int one = 1;
    int two = 2;
    int three = 3;
    int four = 4;

    /* variable to hold a selected class variable value */
    int selectedRadioButtonValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // binding variable
        //setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        firstYearStd = binding.radioButtonFirst;   // firstYearStd = findViewById(R.id.radioButtonFirst);
        sophomore = binding.radioButtonSophomore;
        junior = binding.radioButtonJunior;
        senior = binding.radioButtonSenior;

        buttonValue = findViewById(R.id.buttonValue); // to check assigned values
    }

    public void onRadioButtonClick(View v){
        if(firstYearStd.isChecked()){
            selectedRadioButtonValue = one;
            buttonValue.setText("1");
        }else if(sophomore.isChecked()){
            selectedRadioButtonValue = two;
            buttonValue.setText("2");
        }else if(junior.isChecked()){
            selectedRadioButtonValue = three;
            buttonValue.setText("3");
        } else if(senior.isChecked()){
            selectedRadioButtonValue = four;
            DecimalFormat df = new DecimalFormat("0");
            buttonValue.setText(df.format(selectedRadioButtonValue));
        }

    }
}