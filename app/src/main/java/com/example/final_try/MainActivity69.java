package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity69 extends AppCompatActivity {
    private Spinner     spinnerFrom, spinnerTo;
    private ImageButton convBtn;
    private EditText    valueToConv;
    private TextView    convRslt;
    private double      value, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main69);
        this.setTitle("Speed unit converter");

        spinnerFrom = findViewById(R.id.spinnerFrom);
        spinnerTo = findViewById(R.id.spinnerTo);
        valueToConv = findViewById(R.id.valueToConv);
        convRslt = findViewById(R.id.convRslt);
        convBtn = findViewById(R.id.convBtn);

        String [] speedUnitList = {"Kilometer/hour", "Meter/second", "Mile/hour", "Feet/minute", "Feet/second",
                "Knot", "Speed of light", "Speed of sound (air)", "Speed of sound (water)"};

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,speedUnitList);
        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);

        DecimalFormat conversion = new DecimalFormat("###,###.##########");

        convBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value = Double.parseDouble(valueToConv.getText().toString());



                // km/h
                if (spinnerFrom.getSelectedItem().toString() == "Kilometer/hour" && spinnerTo.getSelectedItem().toString() == "Kilometer/hour"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }
            }
        });
    }
}