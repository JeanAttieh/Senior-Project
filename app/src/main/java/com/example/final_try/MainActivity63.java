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

public class MainActivity63 extends AppCompatActivity {
    private Spinner     spinnerFrom, spinnerTo;
    private TextView    convRslt;
    private EditText    valueToConv;
    private ImageButton convertBtn;
    private double      value, result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main63);
        this.setTitle("Area unit converter");

        spinnerFrom = findViewById(R.id.spinnerFrom);
        spinnerTo = findViewById(R.id.spinnerTo);
        convRslt = findViewById(R.id.convRslt);
        valueToConv = findViewById(R.id.valueToConv);
        convertBtn = findViewById(R.id.convertBtn);

        DecimalFormat conversion = new DecimalFormat("###,###.##############");

        String[] areaUnitList = {"Hectare", "Are", "Square kilometer", "Square meter", "Square decimeter",
                "Square centimeter", "Square millimeter", "Square mile", "Acre", "Square yard", "Square feet", "Square inch"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,areaUnitList);
        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value = Double.parseDouble(valueToConv.getText().toString());


                // hectare
                if (spinnerFrom.getSelectedItem().toString() == "Hectare" && spinnerTo.getSelectedItem().toString() == "Hectare"){

                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hectare" && spinnerTo.getSelectedItem().toString() == "Are") {
                    result = value * 100;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hectare" && spinnerTo.getSelectedItem().toString() == "Square kilometer") {
                    result = value * 0.01;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hectare" && spinnerTo.getSelectedItem().toString() == "Square meter") {
                    result = value * 10000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hectare" && spinnerTo.getSelectedItem().toString() == "Square decimeter") {
                    result = value * 1000000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hectare" && spinnerTo.getSelectedItem().toString() == "Square centimeter") {
                    result = value * Math.pow(10,8);
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hectare" && spinnerTo.getSelectedItem().toString() == "Square millimeter") {
                    result = value * Math.pow(10,10);
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hectare" && spinnerTo.getSelectedItem().toString() == "Square mile") {
                    result = value * 0.003861021585;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hectare" && spinnerTo.getSelectedItem().toString() == "Acre") {
                    result = value * 2.471053815;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hectare" && spinnerTo.getSelectedItem().toString() == "Square yard") {
                    result = value * 11959.90046;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hectare" && spinnerTo.getSelectedItem().toString() == "Square feet") {
                    result = value * 107639.1042;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hectare" && spinnerTo.getSelectedItem().toString() == "Square inch") {
                    result = value * 15500031;
                    convRslt.setText(conversion.format(result));
                }



                // are
                if (spinnerFrom.getSelectedItem().toString() == "Are" && spinnerTo.getSelectedItem().toString() == "Hectare") {
                    result = value * 0.01;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Are" && spinnerTo.getSelectedItem().toString() == "Are") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Are" && spinnerTo.getSelectedItem().toString() == "Square kilometer") {
                    result = value * 0.0001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Are" && spinnerTo.getSelectedItem().toString() == "Square meter") {
                    result = value * 100;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Are" && spinnerTo.getSelectedItem().toString() == "Square decimeter") {
                    result = value * Math.pow(10,4);
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Are" && spinnerTo.getSelectedItem().toString() == "Square centimeter") {
                    result = value * Math.pow(10,6);
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Are" && spinnerTo.getSelectedItem().toString() == "Square millimeter") {
                    result = value * Math.pow(10,8);
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Are" && spinnerTo.getSelectedItem().toString() == "Square mile") {
                    result = value * 0.00003861021585;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Are" && spinnerTo.getSelectedItem().toString() == "Acre") {
                    result = value * 0.02471053815;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Are" && spinnerTo.getSelectedItem().toString() == "Squared yard") {
                    result = value * 119.5990046;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Are" && spinnerTo.getSelectedItem().toString() == "Square feet") {
                    result = value * 1076.391042;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Are" && spinnerTo.getSelectedItem().toString() == "Square inch") {
                    result = value * 155000.31;
                    convRslt.setText(conversion.format(result));
                }



                // square kilometer
                if (spinnerFrom.getSelectedItem().toString() == "Square kilometer" && spinnerTo.getSelectedItem().toString() == "Hectare") {
                    result = value * 100;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square kilometer" && spinnerTo.getSelectedItem().toString() == "Are") {
                    result = value * Math.pow(10,4);
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square kilometer" && spinnerTo.getSelectedItem().toString() == "Square kilometer") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square kilometer" && spinnerTo.getSelectedItem().toString() == "Square meter") {
                    result = value * Math.pow(10,6);
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square kilometer" && spinnerTo.getSelectedItem().toString() == "Square decimeter") {
                    result = value * Math.pow(10,8);
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square kilometer" && spinnerTo.getSelectedItem().toString() == "Square centimeter") {
                    result = value * Math.pow(10,10);
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square kilometer" && spinnerTo.getSelectedItem().toString() == "Square millimeter") {
                    result = value * Math.pow(10,12);
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square kilometer" && spinnerTo.getSelectedItem().toString() == "Square mile") {
                    result = value * 0.3861021585;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square kilometer" && spinnerTo.getSelectedItem().toString() == "Acre") {
                    result = value * 247.1053815;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square kilometer" && spinnerTo.getSelectedItem().toString() == "Square yard") {
                    result = value * 1195990.046;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square kilometer" && spinnerTo.getSelectedItem().toString() == "Square feet") {
                    result = value * 10763910.42;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square kilometer" && spinnerTo.getSelectedItem().toString() == "Square inch") {
                    result = value * 1550003100;
                    convRslt.setText(conversion.format(result));
                }



                // square meter
                if (spinnerFrom.getSelectedItem().toString() == "Square meter" && spinnerTo.getSelectedItem().toString() == "Hectare") {
                    result = value * 0.0001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square meter" && spinnerTo.getSelectedItem().toString() == "Are") {
                    result = value * 0.01;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square meter" && spinnerTo.getSelectedItem().toString() == "Square kilometer") {
                    result = value * 0.000001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square meter" && spinnerTo.getSelectedItem().toString() == "Square meter") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square meter" && spinnerTo.getSelectedItem().toString() == "Square decimeter") {
                    result = value * 100;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square meter" && spinnerTo.getSelectedItem().toString() == "Square centimeter") {
                    result = value * Math.pow(10,4);
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square meter" && spinnerTo.getSelectedItem().toString() == "Square millimeter") {
                    result = value * Math.pow(10,6);
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square meter" && spinnerTo.getSelectedItem().toString() == "Square mile") {
                    result = value * 0.0000003861021585;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square meter" && spinnerTo.getSelectedItem().toString() == "Acre") {
                    result = value * 0.0002471053815;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square meter" && spinnerTo.getSelectedItem().toString() == "Square yard") {
                    result = value * 1.195990046;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square meter" && spinnerTo.getSelectedItem().toString() == "Square feet") {
                    result = value * 10.76391042;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square meter" && spinnerTo.getSelectedItem().toString() == "Square inch") {
                    result = value * 1550.0031;
                    convRslt.setText(conversion.format(result));
                }



                // square decimeter
                if (spinnerFrom.getSelectedItem().toString() == "Square decimeter" && spinnerTo.getSelectedItem().toString() == "Hectare") {
                    result = value * 0.000001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square decimeter" && spinnerTo.getSelectedItem().toString() == "Are") {
                    result = value * 0.0001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square decimeter" && spinnerTo.getSelectedItem().toString() == "Square kilometer") {
                    result = value * 0.00000001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square decimeter" && spinnerTo.getSelectedItem().toString() == "Square meter") {
                    result = value * 0.01;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square decimeter" && spinnerTo.getSelectedItem().toString() == "Square decimeter") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square decimeter" && spinnerTo.getSelectedItem().toString() == "Square centimeter") {
                    result = value * 100;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square decimeter" && spinnerTo.getSelectedItem().toString() == "Square millimeter") {
                    result = value * Math.pow(10,4);
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square decimeter" && spinnerTo.getSelectedItem().toString() == "Square mile") {
                    result = value * 0.000000003861021585;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square decimeter" && spinnerTo.getSelectedItem().toString() == "Acre") {
                    result = value * 0.000002471053815;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square decimeter" && spinnerTo.getSelectedItem().toString() == "Square yard") {
                    result = value * 0.01195990046;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square decimeter" && spinnerTo.getSelectedItem().toString() == "Square feet") {
                    result = value * 0.1076391042;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square decimeter" && spinnerTo.getSelectedItem().toString() == "Square inch") {
                    result = value * 15.500031;
                    convRslt.setText(conversion.format(result));
                }



                // square centimeter
                if (spinnerFrom.getSelectedItem().toString() == "Square centimeter" && spinnerTo.getSelectedItem().toString() == "Hectare") {
                    result = value * 0.00000001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square centimeter" && spinnerTo.getSelectedItem().toString() == "Are") {
                    result = value * 0.000001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square centimeter" && spinnerTo.getSelectedItem().toString() == "Square kilometer") {
                    result = value * 0.0000000001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square centimeter" && spinnerTo.getSelectedItem().toString() == "Square meter") {
                    result = value * 0.0001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square centimeter" && spinnerTo.getSelectedItem().toString() == "Square decimeter") {
                    result = value * 0.001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square centimeter" && spinnerTo.getSelectedItem().toString() == "Square centimeter") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square centimeter" && spinnerTo.getSelectedItem().toString() == "Square millimeter") {
                    result = value * 100;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square centimeter" && spinnerTo.getSelectedItem().toString() == "Square mile") {
                    result = value * 0.00000000003861021585;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square centimeter" && spinnerTo.getSelectedItem().toString() == "Acre") {
                    result = value * 0.00000002471053815;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square centimeter" && spinnerTo.getSelectedItem().toString() == "Square yard") {
                    result = value * 0.0001195990046;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square centimeter" && spinnerTo.getSelectedItem().toString() == "Square feet") {
                    result = value * 0.001076391042;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square centimeter" && spinnerTo.getSelectedItem().toString() == "Square inch") {
                    result = value * 0.15500031;
                    convRslt.setText(conversion.format(result));
                }



                // square millimeter
                if (spinnerFrom.getSelectedItem().toString() == "Square millimeter" && spinnerTo.getSelectedItem().toString() == "Hectare") {
                    result = value * 0.0000000001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square millimeter" && spinnerTo.getSelectedItem().toString() == "Are") {
                    result = value * 0.00000001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square millimeter" && spinnerTo.getSelectedItem().toString() == "Squared kilometer") {
                    result = value * 0.000000000001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square millimeter" && spinnerTo.getSelectedItem().toString() == "Squared meter") {
                    result = value * 0.000001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square millimeter" && spinnerTo.getSelectedItem().toString() == "Squared decimeter") {
                    result = value * 0.0001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square millimeter" && spinnerTo.getSelectedItem().toString() == "Squared centimeter") {
                    result = value * 0.01;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square millimeter" && spinnerTo.getSelectedItem().toString() == "Squared millimeter") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square millimeter" && spinnerTo.getSelectedItem().toString() == "Squared mile") {
                    result = value * 0.0000000000003861021585;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square millimeter" && spinnerTo.getSelectedItem().toString() == "Acre") {
                    result = value * 0.000000002471053815;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square millimeter" && spinnerTo.getSelectedItem().toString() == "Square yard") {
                    result = value * 0.000001195990046;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square millimeter" && spinnerTo.getSelectedItem().toString() == "Square feet") {
                    result = value * 0.00001076391042;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square millimeter" && spinnerTo.getSelectedItem().toString() == "Are") {
                    result = value * 0.001550031;
                    convRslt.setText(conversion.format(result));
                }



                // square mile
                if (spinnerFrom.getSelectedItem().toString() == "Square mile" && spinnerTo.getSelectedItem().toString() == "Hectare") {
                    result = value * 258.998811;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square mile" && spinnerTo.getSelectedItem().toString() == "Are") {
                    result = value * 25899.8811;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square mile" && spinnerTo.getSelectedItem().toString() == "Square kilometer") {
                    result = value * 2.58998811;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square mile" && spinnerTo.getSelectedItem().toString() == "Square meter") {
                    result = value * 2589988.11;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square mile" && spinnerTo.getSelectedItem().toString() == "Square decimeter") {
                    result = value * 258998811;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square mile" && spinnerTo.getSelectedItem().toString() == "Square centimeter") {
                    result = value * 258998811 * 100;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square mile" && spinnerTo.getSelectedItem().toString() == "Square millimeter") {
                    result = value * 258998811 * Math.pow(10,4);
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square mile" && spinnerTo.getSelectedItem().toString() == "Square mile") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square mile" && spinnerTo.getSelectedItem().toString() == "Acre") {
                    result = value * 640;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square mile" && spinnerTo.getSelectedItem().toString() == "Square yard") {
                    result = value * 3097600;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square mile" && spinnerTo.getSelectedItem().toString() == "Square feet") {
                    result = value * 27878400;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square mile" && spinnerTo.getSelectedItem().toString() == "Square inch") {
                    result = value * 40144896 * 100;
                    convRslt.setText(conversion.format(result));
                }



                // acre
                if (spinnerFrom.getSelectedItem().toString() == "Acre" && spinnerTo.getSelectedItem().toString() == "Hectare") {
                    result = value * 0.4046856422;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Acre" && spinnerTo.getSelectedItem().toString() == "Are") {
                    result = value * 40.46856422;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Acre" && spinnerTo.getSelectedItem().toString() == "Square kilometer") {
                    result = value * 0.004046856422;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Acre" && spinnerTo.getSelectedItem().toString() == "Square meter") {
                    result = value * 4046.856422;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Acre" && spinnerTo.getSelectedItem().toString() == "Square decimeter") {
                    result = value * 404685.6422;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Acre" && spinnerTo.getSelectedItem().toString() == "Square centimeter") {
                    result = value * 40468564.22;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Acre" && spinnerTo.getSelectedItem().toString() == "Square millimeter") {
                    result = value * 40468564.22 * 100;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Acre" && spinnerTo.getSelectedItem().toString() == "Square mile") {
                    result = value * 0.0015625;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Acre" && spinnerTo.getSelectedItem().toString() == "Acre") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Acre" && spinnerTo.getSelectedItem().toString() == "Square yard") {
                    result = value * 4840;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Acre" && spinnerTo.getSelectedItem().toString() == "Square feet") {
                    result = value * 43560;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Acre" && spinnerTo.getSelectedItem().toString() == "Square inch") {
                    result = value * 6272640;
                    convRslt.setText(conversion.format(result));
                }



                // square yard
                if (spinnerFrom.getSelectedItem().toString() == "Square yard" && spinnerTo.getSelectedItem().toString() == "Hectare") {
                    result = value * 0.000083612736;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square yard" && spinnerTo.getSelectedItem().toString() == "Are") {
                    result = value * 0.0083612736;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square yard" && spinnerTo.getSelectedItem().toString() == "Square kilometer") {
                    result = value * 0.00000083612736;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square yard" && spinnerTo.getSelectedItem().toString() == "Square kilometer") {
                    result = value * 0.83612736;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square yard" && spinnerTo.getSelectedItem().toString() == "Square meter") {
                    result = value * 0.83612736;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square yard" && spinnerTo.getSelectedItem().toString() == "Square decimeter") {
                    result = value * 83.612736;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square yard" && spinnerTo.getSelectedItem().toString() == "Square centimeter") {
                    result = value * 8361.2736;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square yard" && spinnerTo.getSelectedItem().toString() == "Square millimeter") {
                    result = value * 836127.36;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square yard" && spinnerTo.getSelectedItem().toString() == "Square mile") {
                    result = value * 0.0000003228305785;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square yard" && spinnerTo.getSelectedItem().toString() == "Acre") {
                    result = value * 0.0002066115702;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square yard" && spinnerTo.getSelectedItem().toString() == "Square yard") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square yard" && spinnerTo.getSelectedItem().toString() == "Square feet") {
                    result = value * 9;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square yard" && spinnerTo.getSelectedItem().toString() == "Square inch") {
                    result = value * 1296;
                    convRslt.setText(conversion.format(result));
                }



                // squared feet
                if (spinnerFrom.getSelectedItem().toString() == "Square feet" && spinnerTo.getSelectedItem().toString() == "Hectare") {
                    result = value * 0.000009290304;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square feet" && spinnerTo.getSelectedItem().toString() == "Are") {
                    result = value * 0.0009290304;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square feet" && spinnerTo.getSelectedItem().toString() == "Square kilometer") {
                    result = value * 0.00000009290304;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square feet" && spinnerTo.getSelectedItem().toString() == "Square meter") {
                    result = value * 0.09290304;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square feet" && spinnerTo.getSelectedItem().toString() == "Square decimeter") {
                    result = value * 9.290304;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square feet" && spinnerTo.getSelectedItem().toString() == "Square centimeter") {
                    result = value * 929.0304;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square feet" && spinnerTo.getSelectedItem().toString() == "Square millimeter") {
                    result = value * 92903.04;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square feet" && spinnerTo.getSelectedItem().toString() == "Square mile") {
                    result = value * 0.00000003587006428;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square feet" && spinnerTo.getSelectedItem().toString() == "Acre") {
                    result = value * 0.00002295684114;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square feet" && spinnerTo.getSelectedItem().toString() == "Square yard") {
                    result = value * 0.1111111111;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square feet" && spinnerTo.getSelectedItem().toString() == "Square feet") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square feet" && spinnerTo.getSelectedItem().toString() == "Square inch") {
                    result = value * 144;
                    convRslt.setText(conversion.format(result));
                }



                // square inch
                if (spinnerFrom.getSelectedItem().toString() == "Square inch" && spinnerTo.getSelectedItem().toString() == "Hectare") {
                    result = value * 0.000000064516;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square inch" && spinnerTo.getSelectedItem().toString() == "Are") {
                    result = value * 0.0000064516;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square inch" && spinnerTo.getSelectedItem().toString() == "Square kilometer") {
                    result = value * 0.00000000064516;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square inch" && spinnerTo.getSelectedItem().toString() == "Square meter") {
                    result = value * 0.00064516;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square inch" && spinnerTo.getSelectedItem().toString() == "Square decimeter") {
                    result = value * 0.064516;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square inch" && spinnerTo.getSelectedItem().toString() == "Square centimeter") {
                    result = value * 6.4516;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square inch" && spinnerTo.getSelectedItem().toString() == "Square millimeter") {
                    result = value * 645.16;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square inch" && spinnerTo.getSelectedItem().toString() == "Square mile") {
                    result = value * 0.0000000002490976686;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square inch" && spinnerTo.getSelectedItem().toString() == "Acre") {
                    result = value * 0.0000001594225079;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square inch" && spinnerTo.getSelectedItem().toString() == "Square yard") {
                    result = value * 0.0007716049383;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square inch" && spinnerTo.getSelectedItem().toString() == "Square feet") {
                    result = value * 0.0069444444444;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Square inch" && spinnerTo.getSelectedItem().toString() == "Square inch") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }
            }
        });
    }
}