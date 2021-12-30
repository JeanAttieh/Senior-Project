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

public class MainActivity65 extends AppCompatActivity {
    private Spinner     spinnerFrom, spinnerTo;
    private ImageButton convBtn;
    private EditText    valueToConv;
    private TextView    convRslt;
    private double      value, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main65);
        this.setTitle("Fuel mileage unit converter");

        spinnerFrom = findViewById(R.id.spinnerFrom);
        spinnerTo = findViewById(R.id.spinnerTo);
        valueToConv = findViewById(R.id.valueToConv);
        convRslt = findViewById(R.id.convRslt);
        convBtn = findViewById(R.id.convBtn);

        String[] fuelUnitList = {"Miles/Gallon(US)", "Miles/Gallon(UK)", "Liters/100 km", "Liters/km", "Kilometers/Liter"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,fuelUnitList);
        spinnerTo.setAdapter(adapter);
        spinnerFrom.setAdapter(adapter);

        DecimalFormat conversion = new DecimalFormat("###,###.############");

        convBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value = Double.parseDouble(valueToConv.getText().toString());



                // miles/gallon (us)
                if (spinnerFrom.getSelectedItem().toString() == "Miles/Gallon(US)" && spinnerTo.getSelectedItem().toString() == "Miles/Gallon(US)"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Miles/Gallon(US)" && spinnerTo.getSelectedItem().toString() == "Miles/Gallon(UK)"){
                    result = value * 1.20106;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Miles/Gallon(US)" && spinnerTo.getSelectedItem().toString() == "Liters/100 km"){
                    result = 235.239 / value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Miles/Gallon(US)" && spinnerTo.getSelectedItem().toString() == "Liters/km"){
                    result = 2.35239 / value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Miles/Gallon(US)" && spinnerTo.getSelectedItem().toString() == "Kilometers/Liter"){
                    result = value * 0.425099074;
                    convRslt.setText(conversion.format(result));
                }

                // miles/gallon (uk)
                if (spinnerFrom.getSelectedItem().toString() == "Miles/Gallon(UK)" && spinnerTo.getSelectedItem().toString() == "Miles/Gallon(US)"){
                    result = value * 0.8325978719;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Miles/Gallon(UK)" && spinnerTo.getSelectedItem().toString() == "Miles/Gallon(UK)"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Miles/Gallon(UK)" && spinnerTo.getSelectedItem().toString() == "Liters/100 km"){
                    result = 282.536 / value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Miles/Gallon(UK)" && spinnerTo.getSelectedItem().toString() == "Liters/km"){
                    result = 2.8253 /value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Miles/Gallon(UK)" && spinnerTo.getSelectedItem().toString() == "Kilometers/Liter"){
                    result = value * 0.3539365844;
                    convRslt.setText(conversion.format(result));
                }



                // liters/100km
                if (spinnerFrom.getSelectedItem().toString() == "Liters/100 km" && spinnerTo.getSelectedItem().toString() == "Miles/Gallon(US)"){
                    result = 235.239 / value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liters/100 km" && spinnerTo.getSelectedItem().toString() == "Miles/Gallon(UK)"){
                    result = 282.536 / value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liters/100 km" && spinnerTo.getSelectedItem().toString() == "Liters/100 km"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liters/100 km" && spinnerTo.getSelectedItem().toString() == "Liters/km"){
                    result = value * 0.01;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liters/100 km" && spinnerTo.getSelectedItem().toString() == "Kilometers/Liter"){
                    result = 100 / value;
                    convRslt.setText(conversion.format(result));
                }



                // liters/km
                if (spinnerFrom.getSelectedItem().toString() == "Liters/km" && spinnerTo.getSelectedItem().toString() == "Miles/Gallon(US)"){
                    result = 2.3523 / value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liters/km" && spinnerTo.getSelectedItem().toString() == "Miles/Gallon(UK)"){
                    result = 2.8253 / value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liters/km" && spinnerTo.getSelectedItem().toString() == "Liters/100 km"){
                    result = value * 100;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liters/km" && spinnerTo.getSelectedItem().toString() == "Liters/km"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liters/km" && spinnerTo.getSelectedItem().toString() == "Kilometers/Liter"){
                    result =  1 / value;
                    convRslt.setText(conversion.format(result));
                }



                // kilometers/liter
                if (spinnerFrom.getSelectedItem().toString() == "Kilometers/Liter" && spinnerTo.getSelectedItem().toString() == "Miles/Gallon(US)"){
                    result = value * 2.352392798;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometers/Liter" && spinnerTo.getSelectedItem().toString() == "Miles/Gallon(UK)"){
                    result = value * 2.825364894;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometers/Liter" && spinnerTo.getSelectedItem().toString() == "Liters/100 km"){
                    result = 100 / value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometers/Liter" && spinnerTo.getSelectedItem().toString() == "Liters/km"){
                    result = 1 / value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometers/Liter" && spinnerTo.getSelectedItem().toString() == "Kilometers/Liter"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

            }
        });


    }
}