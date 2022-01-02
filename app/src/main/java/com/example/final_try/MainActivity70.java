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
        valueToConv = findViewById(R.id.valueToConv);

        String[] temperatureUnitList = {"Celsius", "Fahrenheit", "Kelvin", "Rankine"};
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,temperatureUnitList);

        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);

        DecimalFormat   conversion = new DecimalFormat("###.##");

        convBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value = Double.parseDouble(valueToConv.getText().toString());



                // celsius
                if (spinnerFrom.getSelectedItem().toString() == "Celsius" && spinnerTo.getSelectedItem().toString() == "Celsius"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Celsius" && spinnerTo.getSelectedItem().toString() == "Fahrenheit"){
                    result = (value * 9 / 5) + 32;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Celsius" && spinnerTo.getSelectedItem().toString() == "Kelvin"){
                    result = value + 273.15;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Celsius" && spinnerTo.getSelectedItem().toString() == "Rankine"){
                    result = (value * 9 / 5) + 491.67;
                    convRslt.setText(conversion.format(result));
                }



                // fahrenheit
                if (spinnerFrom.getSelectedItem().toString() == "Fahrenheit" && spinnerTo.getSelectedItem().toString() == "Celsius"){
                    result = (value - 32) * 5 / 9;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Fahrenheit" && spinnerTo.getSelectedItem().toString() == "Fahrenheit"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Fahrenheit" && spinnerTo.getSelectedItem().toString() == "Kelvin"){
                    result = ((value - 32) * 5 / 9) + 273.15;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Fahrenheit" && spinnerTo.getSelectedItem().toString() == "Rankine"){
                    result = value + 459.67;
                    convRslt.setText(conversion.format(result));
                }



                // kelvin
                if (spinnerFrom.getSelectedItem().toString() == "Kelvin" && spinnerTo.getSelectedItem().toString() == "Celsius"){
                    result = value - 273.15;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kelvin" && spinnerTo.getSelectedItem().toString() == "Fahrenheit"){
                    result = ((value - 273.15) * 9 / 5) + 32;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kelvin" && spinnerTo.getSelectedItem().toString() == "Kelvin"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kelvin" && spinnerTo.getSelectedItem().toString() == "Rankine"){
                    result = value * 1.8;
                    convRslt.setText(conversion.format(result));
                }



                // rankine
                if (spinnerFrom.getSelectedItem().toString() == "Rankine" && spinnerTo.getSelectedItem().toString() == "Celsius"){
                    result = (value - 491.67) * 5 / 9;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Rankine" && spinnerTo.getSelectedItem().toString() == "Fahrenheit"){
                    result = value - 459.67;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Rankine" && spinnerTo.getSelectedItem().toString() == "Kelvin"){
                    result = 5 * value / 9;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Rankine" && spinnerTo.getSelectedItem().toString() == "Rankine"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

            }
        });
    }
}