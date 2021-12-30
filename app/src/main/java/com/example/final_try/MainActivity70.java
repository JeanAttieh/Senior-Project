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

public class MainActivity70 extends AppCompatActivity {
    private Spinner     spinnerFrom, spinnerTo;
    private ImageButton convBtn;
    private EditText    valueToConv;
    private TextView    convRslt;
    private double      value, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main70);
        this.setTitle("Temperature unit converter");

        spinnerFrom = findViewById(R.id.spinnerFrom);
        spinnerTo   = findViewById(R.id.spinnerTo);
        convRslt    = findViewById(R.id.convRslt);
        convBtn     = findViewById(R.id.convBtn);

        String[] temperatureUnitList = {"Celsius", "Fahrenheit", "Kelvin", "Rankine"};
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,temperatureUnitList);

        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);

        DecimalFormat   conversion = new DecimalFormat("###.###");

        convBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value = Double.parseDouble(valueToConv.getText().toString());

            }
        });
    }
}