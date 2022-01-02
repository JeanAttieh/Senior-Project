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

public class MainActivity73 extends AppCompatActivity {
    private Spinner     spinnerFrom, spinnerTo;
    private ImageButton convBtn;
    private EditText    valueToConv;
    private TextView    convRslt;
    private double      value, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main73);
        this.setTitle("Weight unit converter");

        spinnerFrom = findViewById(R.id.spinnerFrom);
        spinnerTo   = findViewById(R.id.spinnerTo);
        convBtn     = findViewById(R.id.convBtn);
        valueToConv = findViewById(R.id.valueToConv);
        convRslt    = findViewById(R.id.convRslt);

        DecimalFormat conversion = new DecimalFormat("###,###.###");

        String[] weightUnitlist = {"Kilogram", "Gram", "Milligram", "Pound", "Ounce", "Ton metric", "Ton long(us)", "Ton short(us)", "Stone", "Troy pound" +
                "Troy ounce", "Pennyweight", "Grain", "Carat"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,weightUnitlist);
        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);

        convBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value = Double.parseDouble(valueToConv.getText().toString());



                // kilogram
                if (spinnerFrom.getSelectedItem().toString() == "kilogram" && spinnerTo.getSelectedItem().toString() == "Kilogram"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "kilogram" && spinnerTo.getSelectedItem().toString() == "Gram"){
                    result = value * 1000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "kilogram" && spinnerTo.getSelectedItem().toString() == "Milligram"){
                    result = value * 1000000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "kilogram" && spinnerTo.getSelectedItem().toString() == "Pound"){
                    result = value * 2.204622622;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "kilogram" && spinnerTo.getSelectedItem().toString() == "Ounce"){
                    result = value * 35.27396195;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "kilogram" && spinnerTo.getSelectedItem().toString() == "Ton metric"){
                    result = value * 0.001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "kilogram" && spinnerTo.getSelectedItem().toString() == "Ton long(uk)"){
                    result = value * 0.0009842065276;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "kilogram" && spinnerTo.getSelectedItem().toString() == "Ton short(us)"){
                    result = value * 0.001102311311;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "kilogram" && spinnerTo.getSelectedItem().toString() == "Stone"){
                    result = value * 0.1574730444;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "kilogram" && spinnerTo.getSelectedItem().toString() == "Troy pound"){
                    result = value * 2.679228881;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "kilogram" && spinnerTo.getSelectedItem().toString() == "Troy ounce"){
                    result = value * 32.15074657;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "kilogram" && spinnerTo.getSelectedItem().toString() == "Pennyweight"){
                    result = value * 643.0149314;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "kilogram" && spinnerTo.getSelectedItem().toString() == "Grain"){
                    result = value * 15432.35835;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "kilogram" && spinnerTo.getSelectedItem().toString() == "Carat"){
                    result = value * 5000;
                    convRslt.setText(conversion.format(result));
                }



                // gram
                if (spinnerFrom.getSelectedItem().toString() == "Gram" && spinnerTo.getSelectedItem().toString() == "Kilogram"){
                    result = value * 0.001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Gram" && spinnerTo.getSelectedItem().toString() == "Gram"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Gram" && spinnerTo.getSelectedItem().toString() == "Milligram"){
                    result = value * 1000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Gram" && spinnerTo.getSelectedItem().toString() == "Pound"){
                    result = value * 0.002204622622;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Gram" && spinnerTo.getSelectedItem().toString() == "Ounce"){
                    result = value * 0.03527396195;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Gram" && spinnerTo.getSelectedItem().toString() == "Ton metric"){
                    result = value * 0.000001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Gram" && spinnerTo.getSelectedItem().toString() == "Ton long(uk)"){
                    result = value * 0.0000009842065276;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Gram" && spinnerTo.getSelectedItem().toString() == "Ton short(us)"){
                    result = value * 0.000001102311311;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Gram" && spinnerTo.getSelectedItem().toString() == "Stone"){
                    result = value * 0.0001574730444;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Gram" && spinnerTo.getSelectedItem().toString() == "Troy pound"){
                    result = value * 0.002679228881;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Gram" && spinnerTo.getSelectedItem().toString() == "Troy ounce"){
                    result = value * 0.03215074657;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Gram" && spinnerTo.getSelectedItem().toString() == "Pennyweight"){
                    result = value * 0.6430149314;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Gram" && spinnerTo.getSelectedItem().toString() == "Grain"){
                    result = value * 15.43235835;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Gram" && spinnerTo.getSelectedItem().toString() == "Carat"){
                    result = value * 5;
                    convRslt.setText(conversion.format(result));
                }



                // milligram
                if (spinnerFrom.getSelectedItem().toString() == "Milligram" && spinnerTo.getSelectedItem().toString() == "Kilogram"){
                    result = value * 0.000001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Milligram" && spinnerTo.getSelectedItem().toString() == "Gram"){
                    result = value * 0.001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Milligram" && spinnerTo.getSelectedItem().toString() == "Milligram"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Milligram" && spinnerTo.getSelectedItem().toString() == "Pound"){
                    result = value * 0.000002204622622;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Milligram" && spinnerTo.getSelectedItem().toString() == "Ounce"){
                    result = value * 0.00003527396195;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Milligram" && spinnerTo.getSelectedItem().toString() == "Ton metric"){
                    result = value * 0.000000001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Milligram" && spinnerTo.getSelectedItem().toString() == "Ton long(uk)"){
                    result = value * 0.0000000009842065276;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Milligram" && spinnerTo.getSelectedItem().toString() == "Ton short(us)"){
                    result = value * 0.000000001102311311;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Milligram" && spinnerTo.getSelectedItem().toString() == "Stone"){
                    result = value * 0.0000001574730444;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Milligram" && spinnerTo.getSelectedItem().toString() == "Troy pound"){
                    result = value * 0.000002679228881;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Milligram" && spinnerTo.getSelectedItem().toString() == "Troy ounce"){
                    result = value * 0.00003215074657;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Milligram" && spinnerTo.getSelectedItem().toString() == "Pennyweight"){
                    result = value * 0.0006430149314;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Milligram" && spinnerTo.getSelectedItem().toString() == "Grain"){
                    result = value * 0.01543235835;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Milligram" && spinnerTo.getSelectedItem().toString() == "Carat"){
                    result = value * 0.005;
                    convRslt.setText(conversion.format(result));
                }



                //pound
                if (spinnerFrom.getSelectedItem().toString() == "Pound" && spinnerTo.getSelectedItem().toString() == "Kilogram"){
                    result = value * 0.45359237;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound" && spinnerTo.getSelectedItem().toString() == "Gram"){
                    result = value * 453.59237;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound" && spinnerTo.getSelectedItem().toString() == "Milligram"){
                    result = value * 453592.37;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound" && spinnerTo.getSelectedItem().toString() == "Pound"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound" && spinnerTo.getSelectedItem().toString() == "Ounce"){
                    result = value * 16;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound" && spinnerTo.getSelectedItem().toString() == "Ton metric"){
                    result = value * 0.00045359237;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound" && spinnerTo.getSelectedItem().toString() == "Ton long(uk)"){
                    result = value * 0.0004464285714;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound" && spinnerTo.getSelectedItem().toString() == "Ton short(us)"){
                    result = value * 0.0005;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound" && spinnerTo.getSelectedItem().toString() == "Stone"){
                    result = value * 0.07142857143;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound" && spinnerTo.getSelectedItem().toString() == "Troy pound"){
                    result = value * 1.215277778;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound" && spinnerTo.getSelectedItem().toString() == "Troy ounce"){
                    result = value * 14.58333333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound" && spinnerTo.getSelectedItem().toString() == "Pennyweight"){
                    result = value * 291.6666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound" && spinnerTo.getSelectedItem().toString() == "Grain"){
                    result = value * 7000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound" && spinnerTo.getSelectedItem().toString() == "Carat"){
                    result = value * 2267.96185;
                    convRslt.setText(conversion.format(result));
                }



                // ounce
                if (spinnerFrom.getSelectedItem().toString() == "Ounce" && spinnerTo.getSelectedItem().toString() == "Kilogram"){
                    result = value * 0.02834952312;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ounce" && spinnerTo.getSelectedItem().toString() == "Gram"){
                    result = value * 28.34952312;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ounce" && spinnerTo.getSelectedItem().toString() == "Milligram"){
                    result = value * 28349.52312;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ounce" && spinnerTo.getSelectedItem().toString() == "Pound"){
                    result = value * 0.0625;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ounce" && spinnerTo.getSelectedItem().toString() == "Ounce"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ounce" && spinnerTo.getSelectedItem().toString() == "Ton metric"){
                    result = value * 0.00002834952313;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ounce" && spinnerTo.getSelectedItem().toString() == "Ton long(uk)"){
                    result = value * 0.00002790178571;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ounce" && spinnerTo.getSelectedItem().toString() == "Ton short(us)"){
                    result = value * 0.00003125;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ounce" && spinnerTo.getSelectedItem().toString() == "Stone"){
                    result = value * 0.004464285714;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ounce" && spinnerTo.getSelectedItem().toString() == "Troy pound"){
                    result = value * 0.07595486111;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ounce" && spinnerTo.getSelectedItem().toString() == "Troy ounce"){
                    result = value * 0.9114583333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ounce" && spinnerTo.getSelectedItem().toString() == "Pennyweight"){
                    result = value * 18.22916667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ounce" && spinnerTo.getSelectedItem().toString() == "Grain"){
                    result = value * 437.5;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ounce" && spinnerTo.getSelectedItem().toString() == "Carat"){
                    result = value * 141.7476156;
                    convRslt.setText(conversion.format(result));
                }



                // ton metric
                if (spinnerFrom.getSelectedItem().toString() == "Ton metric" && spinnerTo.getSelectedItem().toString() == "Kilogram"){
                    result = value * 1000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton metric" && spinnerTo.getSelectedItem().toString() == "Gram"){
                    result = value * 1000000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton metric" && spinnerTo.getSelectedItem().toString() == "Milligram"){
                    result = value * 1000000000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton metric" && spinnerTo.getSelectedItem().toString() == "Pound"){
                    result = value * 2204.622622;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton metric" && spinnerTo.getSelectedItem().toString() == "Ounce"){
                    result = value * 35273.96195;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton metric" && spinnerTo.getSelectedItem().toString() == "Ton metric"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton metric" && spinnerTo.getSelectedItem().toString() == "Ton long(uk)"){
                    result = value * 0.9842065276;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton metric" && spinnerTo.getSelectedItem().toString() == "Ton short(us)"){
                    result = value * 1.102311311;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton metric" && spinnerTo.getSelectedItem().toString() == "Stone"){
                    result = value * 157.4730444;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton metric" && spinnerTo.getSelectedItem().toString() == "Troy pound"){
                    result = value * 2679.228881;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton metric" && spinnerTo.getSelectedItem().toString() == "Troy ounce"){
                    result = value * 32150.74657;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton metric" && spinnerTo.getSelectedItem().toString() == "Pennyweight"){
                    result = value * 643014.9314;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton metric" && spinnerTo.getSelectedItem().toString() == "Grain"){
                    result = value * 15432358.35;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton metric" && spinnerTo.getSelectedItem().toString() == "Carat"){
                    result = value * 5000000;
                    convRslt.setText(conversion.format(result));
                }



                // ton long (uk)
                if (spinnerFrom.getSelectedItem().toString() == "Ton long(uk)" && spinnerTo.getSelectedItem().toString() == "Kilogram"){
                    result = value * 1016.046909;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton long(uk)" && spinnerTo.getSelectedItem().toString() == "Gram"){
                    result = value * 1016046.909;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton long(uk)" && spinnerTo.getSelectedItem().toString() == "Milligram"){
                    result = value * 1016046909;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton long(uk)" && spinnerTo.getSelectedItem().toString() == "Pound"){
                    result = value * 2240;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton long(uk)" && spinnerTo.getSelectedItem().toString() == "Ounce"){
                    result = value * 35840;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton long(uk)" && spinnerTo.getSelectedItem().toString() == "Ton metric"){
                    result = value * 1.016046909;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton long(uk)" && spinnerTo.getSelectedItem().toString() == "Ton long(uk)"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton long(uk)" && spinnerTo.getSelectedItem().toString() == "Ton short(us)"){
                    result = value * 1.12;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton long(uk)" && spinnerTo.getSelectedItem().toString() == "Stone"){
                    result = value * 160;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton long(uk)" && spinnerTo.getSelectedItem().toString() == "Troy pound"){
                    result = value * 2722.222222;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton long(uk)" && spinnerTo.getSelectedItem().toString() == "Troy ounce"){
                    result = value * 32666.66667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton long(uk)" && spinnerTo.getSelectedItem().toString() == "Pennyweight"){
                    result = value * 653333.3333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton long(uk)" && spinnerTo.getSelectedItem().toString() == "Grain"){
                    result = value * 15680000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton long(uk)" && spinnerTo.getSelectedItem().toString() == "Carat"){
                    result = value * 5080234.544;
                    convRslt.setText(conversion.format(result));
                }



                // ton short(us)
                if (spinnerFrom.getSelectedItem().toString() == "Ton short(us)" && spinnerTo.getSelectedItem().toString() == "Kilogram"){
                    result = value * 907.18474;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton short(us)" && spinnerTo.getSelectedItem().toString() == "Gram"){
                    result = value * 907184.74;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton short(us)" && spinnerTo.getSelectedItem().toString() == "Milligram"){
                    result = value * 907184740;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton short(us)" && spinnerTo.getSelectedItem().toString() == "Pound"){
                    result = value * 2000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton short(us)" && spinnerTo.getSelectedItem().toString() == "Ounce"){
                    result = value * 32000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton short(us)" && spinnerTo.getSelectedItem().toString() == "Ton metric"){
                    result = value * 0.90718474;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton short(us)" && spinnerTo.getSelectedItem().toString() == "Ton long(uk)"){
                    result = value * 0.8928571429;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton short(us)" && spinnerTo.getSelectedItem().toString() == "Ton short(us)"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton short(us)" && spinnerTo.getSelectedItem().toString() == "Stone"){
                    result = value * 142.8571429;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton short(us)" && spinnerTo.getSelectedItem().toString() == "Troy pound"){
                    result = value * 2430.555556;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton short(us)" && spinnerTo.getSelectedItem().toString() == "Troy ounce"){
                    result = value * 29166.66667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton short(us)" && spinnerTo.getSelectedItem().toString() == "Pennyweight"){
                    result = value * 583333.3333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton short(us)" && spinnerTo.getSelectedItem().toString() == "Grain"){
                    result = value * 14000000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Ton short(us)" && spinnerTo.getSelectedItem().toString() == "Carat"){
                    result = value * 4535923.7;
                    convRslt.setText(conversion.format(result));
                }



                // stone
                if (spinnerFrom.getSelectedItem().toString() == "Stone" && spinnerTo.getSelectedItem().toString() == "Kilogram"){
                    result = value * 6.35029318;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Stone" && spinnerTo.getSelectedItem().toString() == "Gram"){
                    result = value * 6350.29318;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Stone" && spinnerTo.getSelectedItem().toString() == "Milligram"){
                    result = value * 6350293.18;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Stone" && spinnerTo.getSelectedItem().toString() == "Pound"){
                    result = value * 14;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Stone" && spinnerTo.getSelectedItem().toString() == "Ounce"){
                    result = value * 224;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Stone" && spinnerTo.getSelectedItem().toString() == "Ton metric"){
                    result = value * 0.00635029318;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Stone" && spinnerTo.getSelectedItem().toString() == "Ton long(uk)"){
                    result = value * 0.00625;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Stone" && spinnerTo.getSelectedItem().toString() == "Ton short(us)"){
                    result = value * 0.007;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Stone" && spinnerTo.getSelectedItem().toString() == "Stone"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Stone" && spinnerTo.getSelectedItem().toString() == "Troy pound"){
                    result = value * 17.01388889;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Stone" && spinnerTo.getSelectedItem().toString() == "Troy ounce"){
                    result = value * 204.1666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Stone" && spinnerTo.getSelectedItem().toString() == "Pennyweight"){
                    result = value * 4083.333333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Stone" && spinnerTo.getSelectedItem().toString() == "Grain"){
                    result = value * 98000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Stone" && spinnerTo.getSelectedItem().toString() == "Carat"){
                    result = value * 31751.4659;
                    convRslt.setText(conversion.format(result));
                }



                // troy pound
                if (spinnerFrom.getSelectedItem().toString() == "Troy pound" && spinnerTo.getSelectedItem().toString() == "Kilogram"){
                    result = value * 0.3732417216;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy pound" && spinnerTo.getSelectedItem().toString() == "Gram"){
                    result = value * 373.2417216;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy pound" && spinnerTo.getSelectedItem().toString() == "Milligram"){
                    result = value * 373241.7216;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy pound" && spinnerTo.getSelectedItem().toString() == "Pound"){
                    result = value * 0.8228571429;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy pound" && spinnerTo.getSelectedItem().toString() == "Ounce"){
                    result = value * 13.16571429;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy pound" && spinnerTo.getSelectedItem().toString() == "Ton metric"){
                    result = value * 0.0003732417216;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy pound" && spinnerTo.getSelectedItem().toString() == "Ton long(uk)"){
                    result = value * 0.0003673469388;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy pound" && spinnerTo.getSelectedItem().toString() == "Ton short(us)"){
                    result = value * 0.0004114285714;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy pound" && spinnerTo.getSelectedItem().toString() == "Stone"){
                    result = value * 0.0587755102;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy pound" && spinnerTo.getSelectedItem().toString() == "Troy pound"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy pound" && spinnerTo.getSelectedItem().toString() == "Troy ounce"){
                    result = value * 12;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy pound" && spinnerTo.getSelectedItem().toString() == "Pennyweight"){
                    result = value * 240;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy pound" && spinnerTo.getSelectedItem().toString() == "Grain"){
                    result = value * 5760;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy pound" && spinnerTo.getSelectedItem().toString() == "Carat"){
                    result = value * 1866.208608;
                    convRslt.setText(conversion.format(result));
                }



                // troy ounce
                if (spinnerFrom.getSelectedItem().toString() == "Troy ounce" && spinnerTo.getSelectedItem().toString() == "Kilogram"){
                    result = value * 0.0311034768;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy ounce" && spinnerTo.getSelectedItem().toString() == "Gram"){
                    result = value * 31.1034768;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy ounce" && spinnerTo.getSelectedItem().toString() == "Milligram"){
                    result = value * 31103.4768;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy ounce" && spinnerTo.getSelectedItem().toString() == "Pound"){
                    result = value * 0.06857142857;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy ounce" && spinnerTo.getSelectedItem().toString() == "Ounce"){
                    result = value * 1.097142857;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy ounce" && spinnerTo.getSelectedItem().toString() == "Ton metric"){
                    result = value * 0.0000311034768;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy ounce" && spinnerTo.getSelectedItem().toString() == "Ton long(uk)"){
                    result = value * 0.0000306122449;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy ounce" && spinnerTo.getSelectedItem().toString() == "Ton short(us)"){
                    result = value * 0.00003428571429;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy ounce" && spinnerTo.getSelectedItem().toString() == "Stone"){
                    result = value * 0.004897959184;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy ounce" && spinnerTo.getSelectedItem().toString() == "Troy pound"){
                    result = value * 0.08333333333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy ounce" && spinnerTo.getSelectedItem().toString() == "Troy ounce"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy ounce" && spinnerTo.getSelectedItem().toString() == "Pennyweight"){
                    result = value * 20;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy ounce" && spinnerTo.getSelectedItem().toString() == "Grain"){
                    result = value * 480;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Troy ounce" && spinnerTo.getSelectedItem().toString() == "Carat"){
                    result = value * 155.517384;
                    convRslt.setText(conversion.format(result));
                }



                // pennyweight
                if (spinnerFrom.getSelectedItem().toString() == "Pennyweight" && spinnerTo.getSelectedItem().toString() == "Kilogram"){
                    result = value * 0.00155517384;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pennyweight" && spinnerTo.getSelectedItem().toString() == "Gram"){
                    result = value * 1.55517384;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pennyweight" && spinnerTo.getSelectedItem().toString() == "Milligram"){
                    result = value * 1555.17384;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pennyweight" && spinnerTo.getSelectedItem().toString() == "Pound"){
                    result = value * 0.003428571429;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pennyweight" && spinnerTo.getSelectedItem().toString() == "Ounce"){
                    result = value * 0.05485714286;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pennyweight" && spinnerTo.getSelectedItem().toString() == "Ton metric"){
                    result = value * 0.00000155517384;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pennyweight" && spinnerTo.getSelectedItem().toString() == "Ton long(uk)"){
                    result = value * 0.000001530612245;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pennyweight" && spinnerTo.getSelectedItem().toString() == "Ton short(us)"){
                    result = value * 0.000001714285714;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pennyweight" && spinnerTo.getSelectedItem().toString() == "Stone"){
                    result = value * 0.0002448979592;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pennyweight" && spinnerTo.getSelectedItem().toString() == "Troy pound"){
                    result = value * 0.004166666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pennyweight" && spinnerTo.getSelectedItem().toString() == "Troy ounce"){
                    result = value * 0.05;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pennyweight" && spinnerTo.getSelectedItem().toString() == "Pennyweight"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pennyweight" && spinnerTo.getSelectedItem().toString() == "Grain"){
                    result = value * 24;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pennyweight" && spinnerTo.getSelectedItem().toString() == "Carat"){
                    result = value * 7.7758692;
                    convRslt.setText(conversion.format(result));
                }



                // grain
                if (spinnerFrom.getSelectedItem().toString() == "Grain" && spinnerTo.getSelectedItem().toString() == "Kilogram"){
                    result = value * 0.00006479891;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Grain" && spinnerTo.getSelectedItem().toString() == "Gram"){
                    result = value * 0.06479891;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Grain" && spinnerTo.getSelectedItem().toString() == "Milligram"){
                    result = value * 64.79891;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Grain" && spinnerTo.getSelectedItem().toString() == "Pound"){
                    result = value * 0.0001428571429;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Grain" && spinnerTo.getSelectedItem().toString() == "Ounce"){
                    result = value * 0.002285714286;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Grain" && spinnerTo.getSelectedItem().toString() == "Ton metric"){
                    result = value * 0.00000006479891;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Grain" && spinnerTo.getSelectedItem().toString() == "Ton long(uk)"){
                    result = value * 0.0000000637755102;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Grain" && spinnerTo.getSelectedItem().toString() == "Ton short(us)"){
                    result = value * 0.00000007142857143;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Grain" && spinnerTo.getSelectedItem().toString() == "Stone"){
                    result = value * 0.00001020408163;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Grain" && spinnerTo.getSelectedItem().toString() == "Troy pound"){
                    result = value * 0.0001736111111;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Grain" && spinnerTo.getSelectedItem().toString() == "Troy ounce"){
                    result = value * 0.002083333333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Grain" && spinnerTo.getSelectedItem().toString() == "Pennyweight"){
                    result = value * 0.04166666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Grain" && spinnerTo.getSelectedItem().toString() == "Grain"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Grain" && spinnerTo.getSelectedItem().toString() == "Carat"){
                    result = value * 0.32399455;
                    convRslt.setText(conversion.format(result));
                }



                // carat
                if (spinnerFrom.getSelectedItem().toString() == "Carat" && spinnerTo.getSelectedItem().toString() == "Kilogram"){
                    result = value * 0.0002;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Carat" && spinnerTo.getSelectedItem().toString() == "Gram"){
                    result = value * 0.2;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Carat" && spinnerTo.getSelectedItem().toString() == "Milligram"){
                    result = value * 200;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Carat" && spinnerTo.getSelectedItem().toString() == "Pound"){
                    result = value * 0.0004409245244;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Carat" && spinnerTo.getSelectedItem().toString() == "Ounce"){
                    result = value * 0.00705479239;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Carat" && spinnerTo.getSelectedItem().toString() == "Ton metric"){
                    result = value * 0.0000002;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Carat" && spinnerTo.getSelectedItem().toString() == "Ton long(uk)"){
                    result = value * 0.0000001968413055;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Carat" && spinnerTo.getSelectedItem().toString() == "Ton short(us)"){
                    result = value * 0.0000002204622622;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Carat" && spinnerTo.getSelectedItem().toString() == "Stone"){
                    result = value * 0.00003149460888;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Carat" && spinnerTo.getSelectedItem().toString() == "Troy pound"){
                    result = value * 0.0005358457761;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Carat" && spinnerTo.getSelectedItem().toString() == "Troy ounce"){
                    result = value * 0.006430149314;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Carat" && spinnerTo.getSelectedItem().toString() == "Pennyweight"){
                    result = value * 0.1286029863;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Carat" && spinnerTo.getSelectedItem().toString() == "Grain"){
                    result = value * 3.08647671;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Carat" && spinnerTo.getSelectedItem().toString() == "Carat"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }



            }
        });
    }
}