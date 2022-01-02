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

public class MainActivity72 extends AppCompatActivity {
    private Spinner     spinnerFrom, spinnerTo;
    private EditText    valueToConv;
    private TextView    convRslt;
    private ImageButton convBtn;
    private double      value, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main72);
        this.setTitle("Volume unit converter");

        convBtn = findViewById(R.id.convBtn);
        convRslt = findViewById(R.id.convRslt);
        valueToConv = findViewById(R.id.valueToConv);
        spinnerFrom = findViewById(R.id.spinnerFrom);
        spinnerTo   = findViewById(R.id.spinnerTo);

        String [] volumeUnitList = {"Cubic meter", "Liter(cubic dm)", "Deciliter", "Centiliter", "Millimeter", "Cubic millimeter", "Tablespoon", "Teaspoon",
        "Cubic yard", "Cubic foot", "Cubic inch", "US bushel", "US barrel, US liquid gallon", "US dry gallon", "US fluid ounce", "US pint", "US quart", "US tablespoon",
        "US teaspoon", "US cup", "UK barrel", "UK gallon", "UK fluid ounce", "UK pint", "UK quart"};


        DecimalFormat conversion = new DecimalFormat("###,###.###############");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,volumeUnitList);
        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);
        convBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = Double.parseDouble(valueToConv.getText().toString());



                // cubic meter
                if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 1000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 10000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 100000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * Math.pow(10,6);
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * Math.pow(10,9);
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 666666.6667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 200000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 1.307950619;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 35.31466672;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 6123.74409;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 28.37759326;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 6.28981077;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 264.1720524;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 227.0207461;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 33814.0227;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 2113.376419;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 1056.688209;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 67628.0454;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 202884.1362;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 4226.752838;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 6.110256897;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 219.9692483;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 35195.07973;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 1759.753986;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic meter" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 879.876932;
                    convRslt.setText(conversion.format(result));
                }



                // liter (cubic dm)
                if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 10;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 100;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * Math.pow(10,3);
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * Math.pow(10,6);
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 66.66666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 200;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.001307950619;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 0.03531466672;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 61.02374409;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.02837759326;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.00628981077;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 0.2641720524;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 0.2270207461;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 33.8140227;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 2.113376419;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 1.056688209;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 67.6280454;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 202.8841362;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 4.226752838;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.006110256897;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 0.2199692483;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 35.19507973;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 1.759753986;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Liter(cubic dm)" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 0.8798769932;
                    convRslt.setText(conversion.format(result));
                }



                // deciliter
                if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.0001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 0.1;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 10;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 100;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 100000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 6.666666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 20;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.0001307950619;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 0.003531466672;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 6.102374409;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.002837759326;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.000628981077;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 0.02641720524;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 0.02270207461;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 3.38140227;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 0.2113376419;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 0.1056688209;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 6.76280454;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 20.28841362;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 0.4226752838;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.0006110256897;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 0.02199692483;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 3.519507973;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 0.1759753986;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Deciliter" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 0.08798769932;
                    convRslt.setText(conversion.format(result));
                }



                // centiliter
                if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.00001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 0.01;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 0.1;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 10;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 10000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 0.6666666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 2;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.00001307950619;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 0.0003531466672;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 0.6102374409;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.0002837759326;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.0000628981077;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 0.002641720524;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 0.002270207461;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 0.338140227;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 0.02113376419;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 0.01056688209;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 0.676280454;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 2.028841362;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 0.04226752838;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.00006110256897;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 0.002199692483;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 0.3519507973;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 0.01759753986;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centiliter" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 0.008798769932;
                    convRslt.setText(conversion.format(result));
                }



                // millimeter
                if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.000001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 0.001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 0.01;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 0.1;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 1000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 0.06666666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 0.2;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.000001307950619;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 0.00003531466672;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 0.06102374409;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.00002837759326;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.00000628981077;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 0.0002641720524;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 0.0002270207461;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 0.0338140227;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 0.002113376419;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 0.001056688209;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 0.0676280454;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 0.2028841362;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 0.004226752838;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.000006110256897;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 0.0002199692483;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 0.03519507973;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 0.001759753986;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 0.0008798769932;
                    convRslt.setText(conversion.format(result));
                }



                // cubic millimeter
                if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.000000001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 0.000001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 0.00001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 0.0001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 0.001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 0.00006666666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 0.0002;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.000000001307950619;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 0.00000003531466672;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 0.00006102374409;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.00000002837759326;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.00000000628981077;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 0.0000002641720524;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 0.0000002270207461;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 0.0000338140227;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 0.000002113376419;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 0.000001056688209;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 0.0000676280454;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 0.0002028841362;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 0.000004226752838;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.000000006110256897;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 0.0000002199692483;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 0.00003519507973;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 0.000001759753986;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic millimeter" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 0.0000008798769932;
                    convRslt.setText(conversion.format(result));
                }



                // tablespoon
                if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.000015;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 0.015;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 0.15;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 1.5;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 15;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 15000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 3;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.00001961925929;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 0.0005297200008;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 0.9153561614;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.0004256638989;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.0000943476156;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 0.003962580785;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 0.003405311191;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 0.5072103405;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 0.03170064628;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 0.01585032314;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 1.014420681;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 3.043262043;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 0.06340129257;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.00009165385346;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 0.003299538724;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 0.5279261959;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 0.0263963098;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Tablespoon" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 0.0131981549;
                    convRslt.setText(conversion.format(result));
                }



                // teaspoon
                if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.000005;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 0.005;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 0.05;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 0.5;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 5;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 5000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 0.3333333333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.000006539753096;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 0.0001765733336;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 0.3051187205;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.0001418879663;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.00003144905385;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 0.001320860262;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 0.00113510373;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 0.1690701135;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 0.01056688209;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 0.005283441047;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 0.338140227;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 1.014420681;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 0.02113376419;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.00003055128449;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 0.001099846241;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 0.1759753986;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 0.008798769932;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Teaspoon" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 0.004399384966;
                    convRslt.setText(conversion.format(result));
                }



                // cubic yard
                if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.764554858;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 764.554858;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 7645.54858;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 76455.4858;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 764554.858;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 764554858;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 50970.32387;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 152910.9716;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 27;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 46656;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 21.69622678;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 4.80890538;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 201.974026;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 173.5698143;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 25852.67532;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 1615.792208;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 807.8961039;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 51705.35065;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 155116.0519;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 3231.584416;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 4.671626594;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 168.1785574;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 26908.56918;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 1345.428459;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic yard" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 672.7142296;
                    convRslt.setText(conversion.format(result));
                }



                // cubic foot
                if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.02831684659;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 28.31684659;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 283.1684659;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 2831.684659;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 28316.84659;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 28316846.59;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 1887.789773;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 5663.369318;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.03703703704;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 1728;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.8035639549;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.1781076067;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 7.480519481;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 6.42851164;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 957.5064935;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 59.84415584;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 29.92207792;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 1915.012987;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 5745.038961;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 119.6883117;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.1730232072;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 6.228835459;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 996.6136735;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 49.83068367;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic foot" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 24.91534184;
                    convRslt.setText(conversion.format(result));
                }



                // cubic inch
                if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.000016387064;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 0.016387064;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 0.16387064;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 1.6387064;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 16.387064;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 16387.064;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 1.092470933;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 3.2774128;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.00002143347051;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 0.0005787037037;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.000465254369;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.0001030715316;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 0.004329004329;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 0.003720203495;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 0.5541125541;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 0.03463203463;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 0.01731601732;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 1.108225108;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 3.324675325;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 0.06926406926;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.0001001291708;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 0.00360465015;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 0.576744024;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 0.0288372012;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Cubic inch" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 0.0144186006;
                    convRslt.setText(conversion.format(result));
                }



                // us bushel
                if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.03523907017;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 35.23907017;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 352.3907017;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 3523.907017;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 35239.07017;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 35239070.17;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 2349.271344;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 7047.814033;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.04609096365;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 1.244456019;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 2150.42;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.2216470831;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 9.309177489;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 8;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 1191.574719;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 74.47341991;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 37.23670996;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 2383.149437;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 7149.448312;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 148.9468398;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.2153197715;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 7.751511775;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 1240.241884;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 62.0120942;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US bushel" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 31.0060471;
                    convRslt.setText(conversion.format(result));
                }



                // us barrel
                if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.1589872949;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 158.9872949;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 1589.872949;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 15898.72949;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 158987.2949;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 158987294.9;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 10599.153;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 31797.45899;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.2079475309;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 5.614583333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 9702;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 4.511676789;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 42;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 36.09341431;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 5376;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 336;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 168;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 10752;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 32256;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 672;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.9714532154;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 34.97231575;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 5595.570521;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 279.778526;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US barrel" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 139.889263;
                    convRslt.setText(conversion.format(result));
                }



                // us liquid gallon
                if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.003785411784;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 3.785411784;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 37.85411784;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 378.5411784;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 3785.411784;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 3785411.784;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 252.3607856;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 757.0823568;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.004951131687;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 0.1336805556;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 231;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.1074208759;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.02380952381;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 0.8593670074;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 128;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 8;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 4;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 256;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 768;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 16;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.02312983846;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 0.8326741846;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 133.2278695;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 6.661393477;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US liquid gallon" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 3.330696739;
                    convRslt.setText(conversion.format(result));
                }



                // us dry gallon
                if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.004404883771;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 4.404883771;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 44.0488371;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 440.4883771;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 4404.883771;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 4404883.771;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 293.6589181;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 880.9767542;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.005761370456;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 0.1555570023;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 268.8025;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.125;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.02770588538;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 1.163647186;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 148.9468398;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 9.309177489;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 4.654588745;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 297.8936797;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 893.681039;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 18.61835498;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.02691497144;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 0.9689389719;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 155.0302355;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 7.751511775;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US dry gallon" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 3.875755888;
                    convRslt.setText(conversion.format(result));
                }



                // us fluid ounce
                if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.00002957352956;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 0.02957352956;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 0.2957352956;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 2.957352956;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 29.57352956;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 29573.52956;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 1.971568638;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 5.914705913;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.00003868071631;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 0.00104437934;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 1.8046875;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.0008392255931;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.0001860119048;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 0.0078125;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 0.006713804745;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 0.0625;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 0.03125;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 2;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 6;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 0.125;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.000180701863;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 0.006505267067;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 1.040842731;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 0.05204213654;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US fluid ounce" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 0.02602106827;
                    convRslt.setText(conversion.format(result));
                }



                // us pint
                if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.0004731176473;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 0.473176473;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 4.73176473;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 47.3176473;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 473.176473;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 473176.473;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 31.5450982;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 94.6352946;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.0006188914609;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 0.01671006944;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 28.875;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.01342760949;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.002976190476;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 0.125;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 0.1074208759;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 16;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 0.5;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 32;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 96;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 2;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.002891229808;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 0.1040842731;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 16.65348369;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 0.8326741846;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US pint" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 0.4163370923;
                    convRslt.setText(conversion.format(result));
                }



                // us quart
                if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.000946352946;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 0.946352946;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 9.46352946;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 94.6352946;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 946.352946;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 946352.946;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 63.0901964;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 189.2705892;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.001237782922;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 0.03342013889;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 57.75;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.02685521898;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.005952380952;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 0.25;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 0.2148417518;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 32;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 2;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 64;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 192;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 4;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.0057;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 0.1040842731;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 16.65348369;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 0.8326741846;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US quart" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 0.4163370923;
                    convRslt.setText(conversion.format(result));
                }



                // us tablespoon
                if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.00001478676478;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 0.01478676478;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 0.1478676478;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 1.478676478;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 14.78676478;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 14786.76478;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 0.9857843188;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 2.957352956;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.00001934035815;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 0.0005221896701;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 0.90234375;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.0004196127966;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.00009300595238;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 0.00390625;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 0.003356902373;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 0.5;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 0.03125;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 0.015625;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 3;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 0.0625;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.00009035093149;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 0.003252633534;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 0.5204213654;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 0.02602106827;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US tablespoon" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 0.01301053413;
                    convRslt.setText(conversion.format(result));
                }



                // us teaspoon
                if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.000004928921594;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 0.004928921594;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 0.04928921594;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 0.4928921594;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 4.928921594;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 4928.921594;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 0.3285947729;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 0.9857843188;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.000006446786051;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 0.0001740632234;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 0.30078125;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.0001398709322;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.00003100198413;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 0.001302083333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 0.001118967458;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 0.1666666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 0.01041666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 0.005208333333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 0.3333333333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 0.0208333333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.00003011697716;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 0.001084211178;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 0.1734737885;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 0.008673689423;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US teaspoon" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 0.004336844712;
                    convRslt.setText(conversion.format(result));
                }



                // us cup
                if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.0002365882365;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 0.2365882365;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 2.365882365;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 23.65882365;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 236.5882365;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 236588.2365;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 15.7725491;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 47.3176473;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.0003094457305;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 0.008355034722;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 14.4375;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.006713804745;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.001488095238;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 0.0625;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 0.05371043796;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 8;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 0.5;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 0.25;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 16;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 48;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.001445614904;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 0.05204213654;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 8.326741846;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 0.4163370923;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "US cup" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 0.2081685462;
                    convRslt.setText(conversion.format(result));
                }



                // uk barrel
                if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.16365924;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 163.65924;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 1636.5924;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 16365.924;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 163659.24;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 163659240;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 10910.616;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 32731.848;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.2140582043;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 5.779571516;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 9987.09958;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 4.644255346;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 1.02938565;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 43.23419732;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 37.15404277;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 5533.977257;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 345.8735785;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 172.9367893;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 11067.95451;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 33203.86354;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 691.7471571;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 36;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 5760;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 288;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK barrel" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 144;
                    convRslt.setText(conversion.format(result));
                }



                // uk gallon
                if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.00454609;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 4.54609;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 45.4609;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 454.609;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 4546.09;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 4546090;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 303.0726667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 909.218;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.005946061231;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 0.1605436532;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 277.4194328;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.1290070929;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.02859404585;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 1.200949925;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 1.032056743;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 153.7215905;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 9.607599404;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 4.803799702;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 307.4431809;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 922.3295428;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 19.21519881;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.02777777778;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 160;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 8;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK gallon" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 4;
                    convRslt.setText(conversion.format(result));
                }



                // uk fluid ounce
                if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.0000284130625;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 0.0284130625;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 0.284130625;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 2.84130625;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 28.4130625;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 28416.0625;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 1.894204167;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 5.6826125;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.00003716288269;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 0.001003397833;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 1.733871455;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.0008062943308;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.0001787127865;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 0.007505937034;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 0.006450354647;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 0.9607599404;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 0.06004749627;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 0.03002374814;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 1.921519881;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 5.764559642;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 0.1200949925;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.0001736111111;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 0.00625;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 0.05;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK fluid ounce" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 0.025;
                    convRslt.setText(conversion.format(result));
                }



                // uk pint
                if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.00056826125;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 0.56826125;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 5.6826125;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 56.826125;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 568.26125;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 568261.25;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 37.88408333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 113.65225;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.0007432576539;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 0.02006795665;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 34.6774291;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.01612588662;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.003574255731;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 0.1501187407;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 0.1290070929;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 19.21519881;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 1.200949925;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 0.6004749627;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 38.43039762;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 115.2911928;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 2.401899851;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.003472222222;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 0.125;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 20;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK pint" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value * 0.5;
                    convRslt.setText(conversion.format(result));
                }



                // uk quart
                if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "Cubic meter"){
                    result = value * 0.0011365225;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "Liter(cubic dm)"){
                    result = value * 1.1365225;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "Deciliter"){
                    result = value * 11.365225;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "Centiliter"){
                    result = value * 113.65225;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "Milliliter"){
                    result = value * 1136.5225;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "Cubic millimeter"){
                    result = value * 1136522.5;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "Tablespoon"){
                    result = value * 75.76816667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "Teaspoon"){
                    result = value * 227.3045;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "Cubic yard"){
                    result = value * 0.001486515308;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "Cubic foot"){
                    result = value * 0.04013591331;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "Cubic inch"){
                    result = value * 69.3548582;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "US bushel"){
                    result = value * 0.03225177323;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "US barrel"){
                    result = value * 0.007148511461;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "US liquid gallon"){
                    result = value * 0.3002374814;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "US dry gallon"){
                    result = value * 0.2580141859;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "US fluid ounce"){
                    result = value * 38.43039762;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "US pint"){
                    result = value * 2.401899851;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "US quart"){
                    result = value * 1.20949925;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "US tablespoon"){
                    result = value * 76.86079523;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "US teaspoon"){
                    result = value * 230.5823857;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "US cup"){
                    result = value * 4.803799702;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "UK barrel"){
                    result = value * 0.06944444444;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "UK gallon"){
                    result = value * 0.25;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "UK fluid ounce"){
                    result = value * 40;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "UK pint"){
                    result = value * 2;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "UK quart" && spinnerTo.getSelectedItem().toString() == "UK quart"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }
            }
        });

    }
}