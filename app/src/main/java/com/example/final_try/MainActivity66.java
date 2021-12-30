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

public class MainActivity66 extends AppCompatActivity {
    private Spinner     spinnerFrom, spinnerTo;
    private ImageButton convBtn;
    private EditText    valueToConv;
    private TextView    convRslt;
    private double      value, result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main66);
        this.setTitle("Length unit converter");

        spinnerFrom = findViewById(R.id.spinnerFrom);
        spinnerTo = findViewById(R.id.spinnerTo);
        valueToConv = findViewById(R.id.valueToConv);
        convRslt = findViewById(R.id.convRslt);
        convBtn = findViewById(R.id.convBtn);

        String[] lengthUnitList = {"Kilometer", "Meter", "Decimeter", "Centimeter", "Millimeter",
                "Mile", "Yard", "Feet", "Inch", "Nautical mile", "League", "Furlong", "Rod", "Chain"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, lengthUnitList);
        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);

        DecimalFormat conversion = new DecimalFormat("###,###.############");
        convBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value = Double.parseDouble(valueToConv.getText().toString());



                // kilometer
                if (spinnerFrom.getSelectedItem().toString() == "Kilometer" && spinnerTo.getSelectedItem().toString() == "Kilometer"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer" && spinnerTo.getSelectedItem().toString() == "Meter"){
                    result = value * 1000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer" && spinnerTo.getSelectedItem().toString() == "Decimeter"){
                    result = value * 10000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer" && spinnerTo.getSelectedItem().toString() == "Centimeter"){
                    result = value * 100000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer" && spinnerTo.getSelectedItem().toString() == "Millimeter"){
                    result = value * Math.pow(10,6);
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer" && spinnerTo.getSelectedItem().toString() == "Mile"){
                    result = value * 0.6213711922;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer" && spinnerTo.getSelectedItem().toString() == "Yard"){
                    result = value * 1093613298;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer" && spinnerTo.getSelectedItem().toString() == "Feet"){
                    result = value * 3280.839895;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer" && spinnerTo.getSelectedItem().toString() == "Inch"){
                    result = value * 39370.07874;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer" && spinnerTo.getSelectedItem().toString() == "Nautical mile"){
                    result = value * 0.5399568035;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer" && spinnerTo.getSelectedItem().toString() == "League"){
                    result = value * 02071237307;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer" && spinnerTo.getSelectedItem().toString() == "Furlong"){
                    result = value * 4.970969538;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer" && spinnerTo.getSelectedItem().toString() == "Rod"){
                    result = value * 198.8387815;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer" && spinnerTo.getSelectedItem().toString() == "Chain"){
                    result = value * 49.70969538;
                    convRslt.setText(conversion.format(result));
                }



                // meter
                if (spinnerFrom.getSelectedItem().toString() == "Meter" && spinnerTo.getSelectedItem().toString() == "Kilometer"){
                    result = value * 0.001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter" && spinnerTo.getSelectedItem().toString() == "Meter"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter" && spinnerTo.getSelectedItem().toString() == "Decimeter"){
                    result = value * 10;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter" && spinnerTo.getSelectedItem().toString() == "Centimeter"){
                    result = value * 100;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter" && spinnerTo.getSelectedItem().toString() == "Millimeter"){
                    result = value * 1000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter" && spinnerTo.getSelectedItem().toString() == "Mile"){
                    result = value * 0.0006213711922;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter" && spinnerTo.getSelectedItem().toString() == "Yard"){
                    result = value * 1.093613298;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter" && spinnerTo.getSelectedItem().toString() == "Feet"){
                    result = value * 3.280839895;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter" && spinnerTo.getSelectedItem().toString() == "Inch"){
                    result = value * 39.37007874;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter" && spinnerTo.getSelectedItem().toString() == "Nautical mile"){
                    result = value * 0.0005399568035;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter" && spinnerTo.getSelectedItem().toString() == "League"){
                    result = value * 0.0002071237307;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter" && spinnerTo.getSelectedItem().toString() == "Furlong"){
                    result = value * 0.004970969538;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter" && spinnerTo.getSelectedItem().toString() == "Rod"){
                    result = value * 0.1988387815;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter" && spinnerTo.getSelectedItem().toString() == "Chain"){
                    result = value * 0.04970969538;
                    convRslt.setText(conversion.format(result));
                }



                // decimeter
                if (spinnerFrom.getSelectedItem().toString() == "Decimeter" && spinnerTo.getSelectedItem().toString() == "Kilometer"){
                    result = value * 0.0001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decimeter" && spinnerTo.getSelectedItem().toString() == "Meter"){
                    result = value * 0.1;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decimeter" && spinnerTo.getSelectedItem().toString() == "Decimeter"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decimeter" && spinnerTo.getSelectedItem().toString() == "Centimeter"){
                    result = value * 10;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decimeter" && spinnerTo.getSelectedItem().toString() == "Millimeter"){
                    result = value * 100;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decimeter" && spinnerTo.getSelectedItem().toString() == "Mile"){
                    result = value * 0.00006213711922;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decimeter" && spinnerTo.getSelectedItem().toString() == "Yard"){
                    result = value * 0.1093613298;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decimeter" && spinnerTo.getSelectedItem().toString() == "Feet"){
                    result = value * 0.3280839895;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decimeter" && spinnerTo.getSelectedItem().toString() == "Inch"){
                    result = value * 3.937007874;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decimeter" && spinnerTo.getSelectedItem().toString() == "Nautical mile"){
                    result = value * 0.00005399568035;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decimeter" && spinnerTo.getSelectedItem().toString() == "League"){
                    result = value * 0.00002071237307;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decimeter" && spinnerTo.getSelectedItem().toString() == "Furlong"){
                    result = value * 0.0004970969538;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decimeter" && spinnerTo.getSelectedItem().toString() == "Rod"){
                    result = value * 0.01988387815;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decimeter" && spinnerTo.getSelectedItem().toString() == "Chain"){
                    result = value * 0.004970969538;
                    convRslt.setText(conversion.format(result));
                }



                // centimeter
                if (spinnerFrom.getSelectedItem().toString() == "Centimeter" && spinnerTo.getSelectedItem().toString() == "Kilometer"){
                    result = value * 0.00001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centimeter" && spinnerTo.getSelectedItem().toString() == "Meter"){
                    result = value * 0.01;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centimeter" && spinnerTo.getSelectedItem().toString() == "Decimeter"){
                    result = value * 0.1;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centimeter" && spinnerTo.getSelectedItem().toString() == "Centimeter"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centimeter" && spinnerTo.getSelectedItem().toString() == "Millimeter"){
                    result = value * 10;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centimeter" && spinnerTo.getSelectedItem().toString() == "Mile"){
                    result = value * 0.000006213711922;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centimeter" && spinnerTo.getSelectedItem().toString() == "Yard"){
                    result = value * 0.01093613298;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centimeter" && spinnerTo.getSelectedItem().toString() == "Feet"){
                    result = value * 0.03280839895;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centimeter" && spinnerTo.getSelectedItem().toString() == "Inch"){
                    result = value * 0.3937007874;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centimeter" && spinnerTo.getSelectedItem().toString() == "Nautical mile"){
                    result = value * 0.000005399568035;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centimeter" && spinnerTo.getSelectedItem().toString() == "League"){
                    result = value * 0.000002071237307;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centimeter" && spinnerTo.getSelectedItem().toString() == "Furlong"){
                    result = value * 0.00004970969538;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centimeter" && spinnerTo.getSelectedItem().toString() == "Rod"){
                    result = value * 0.001988387815;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Centimeter" && spinnerTo.getSelectedItem().toString() == "Chain"){
                    result = value * 0.0004970969538;
                    convRslt.setText(conversion.format(result));
                }



                // millimeter
                if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Kilometer"){
                    result = value * 0.000001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Meter"){
                    result = value * 0.001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Decimeter"){
                    result = value * 0.01;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Centimeter"){
                    result = value * 0.1;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Millimeter"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Mile"){
                    result = value * 0.0000006213711922;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Yard"){
                    result = value * 0.001093613298;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Feet"){
                    result = value * 0.003280839895;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Inch"){
                    result = value * 0.03937007874;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Nautical mile"){
                    result = value * 0.0000005399568035;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "League"){
                    result = value * 0.0000002071237307;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Furlong"){
                    result = value * 0.000004970969538;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Rod"){
                    result = value * 0.0001988387815;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter" && spinnerTo.getSelectedItem().toString() == "Chain"){
                    result = value * 0.00004970969538;
                    convRslt.setText(conversion.format(result));
                }



                // mile
                if (spinnerFrom.getSelectedItem().toString() == "Mile" && spinnerTo.getSelectedItem().toString() == "Kilometer"){
                    result = value * 1.609344;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile" && spinnerTo.getSelectedItem().toString() == "Meter"){
                    result = value * 1609.344;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile" && spinnerTo.getSelectedItem().toString() == "Decimeter"){
                    result = value * 16093.44;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile" && spinnerTo.getSelectedItem().toString() == "Centimeter"){
                    result = value * 160934.4;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile" && spinnerTo.getSelectedItem().toString() == "Millimeter"){
                    result = value * 1609344;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile" && spinnerTo.getSelectedItem().toString() == "Mile"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile" && spinnerTo.getSelectedItem().toString() == "Yard"){
                    result = value * 1760;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile" && spinnerTo.getSelectedItem().toString() == "Feet"){
                    result = value * 5280;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile" && spinnerTo.getSelectedItem().toString() == "Inch"){
                    result = value * 63360;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile" && spinnerTo.getSelectedItem().toString() == "Nautical mile"){
                    result = value * 0.8689762419;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile" && spinnerTo.getSelectedItem().toString() == "League"){
                    result = value * 0.3333333333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile" && spinnerTo.getSelectedItem().toString() == "Furlong"){
                    result = value * 8;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile" && spinnerTo.getSelectedItem().toString() == "Rod"){
                    result = value * 320;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile" && spinnerTo.getSelectedItem().toString() == "Chain"){
                    result = value * 80;
                    convRslt.setText(conversion.format(result));
                }



                // yard
                if (spinnerFrom.getSelectedItem().toString() == "Yard" && spinnerTo.getSelectedItem().toString() == "Kilometer"){
                    result = value * 0.0009144;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Yard" && spinnerTo.getSelectedItem().toString() == "Meter"){
                    result = value * 0.9144;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Yard" && spinnerTo.getSelectedItem().toString() == "Decimeter"){
                    result = value * 9.144;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Yard" && spinnerTo.getSelectedItem().toString() == "Centimeter"){
                    result = value * 91.44;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Yard" && spinnerTo.getSelectedItem().toString() == "Millimeter"){
                    result = value * 914.4;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Yard" && spinnerTo.getSelectedItem().toString() == "Mile"){
                    result = value * 0.0005681818182;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Yard" && spinnerTo.getSelectedItem().toString() == "Yard"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Yard" && spinnerTo.getSelectedItem().toString() == "Feet"){
                    result = value * 3;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Yard" && spinnerTo.getSelectedItem().toString() == "Inch"){
                    result = value * 36;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Yard" && spinnerTo.getSelectedItem().toString() == "Nautical mile"){
                    result = value * 0.0004937365011;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Yard" && spinnerTo.getSelectedItem().toString() == "League"){
                    result = value * 0.0001893939394;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Yard" && spinnerTo.getSelectedItem().toString() == "Furlong"){
                    result = value * 0.004545454545;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Yard" && spinnerTo.getSelectedItem().toString() == "Rod"){
                    result = value * 0.1818181818;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Yard" && spinnerTo.getSelectedItem().toString() == "Chain"){
                    result = value * 0.04545454545;
                    convRslt.setText(conversion.format(result));
                }



                // feet
                if (spinnerFrom.getSelectedItem().toString() == "Feet" && spinnerTo.getSelectedItem().toString() == "Kilometer"){
                    result = value * 0.0003048;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet" && spinnerTo.getSelectedItem().toString() == "Meter"){
                    result = value * 0.3048;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet" && spinnerTo.getSelectedItem().toString() == "Decimeter"){
                    result = value * 3.048;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet" && spinnerTo.getSelectedItem().toString() == "Centimeter"){
                    result = value * 30.48;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet" && spinnerTo.getSelectedItem().toString() == "Millimeter"){
                    result = value * 304.8;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet" && spinnerTo.getSelectedItem().toString() == "Mile"){
                    result = value * 0.0001893939394;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet" && spinnerTo.getSelectedItem().toString() == "Yard"){
                    result = value * 0.3333333333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet" && spinnerTo.getSelectedItem().toString() == "Feet"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet" && spinnerTo.getSelectedItem().toString() == "Inch"){
                    result = value * 12;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet" && spinnerTo.getSelectedItem().toString() == "Nautical mile"){
                    result = value * 0.0001645788337;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet" && spinnerTo.getSelectedItem().toString() == "League"){
                    result = value * 0.00006313131313;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet" && spinnerTo.getSelectedItem().toString() == "Furlong"){
                    result = value * 0.001515151515;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet" && spinnerTo.getSelectedItem().toString() == "Rod"){
                    result = value * 0.06060606061;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet" && spinnerTo.getSelectedItem().toString() == "Chain"){
                    result = value * 0.01515151515;
                    convRslt.setText(conversion.format(result));
                }



                // inch
                if (spinnerFrom.getSelectedItem().toString() == "Inch" && spinnerTo.getSelectedItem().toString() == "Kilometer"){
                    result = value * 0.0000254;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch" && spinnerTo.getSelectedItem().toString() == "Meter"){
                    result = value * 0.0254;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch" && spinnerTo.getSelectedItem().toString() == "Decimeter"){
                    result = value * 0.254;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch" && spinnerTo.getSelectedItem().toString() == "Centimeter"){
                    result = value * 2.54;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch" && spinnerTo.getSelectedItem().toString() == "Millimeter"){
                    result = value * 25.4;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch" && spinnerTo.getSelectedItem().toString() == "Mile"){
                    result = value * 0.00001578282828;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch" && spinnerTo.getSelectedItem().toString() == "Yard"){
                    result = value * 0.02777777778;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch" && spinnerTo.getSelectedItem().toString() == "Feet"){
                    result = value * 0.08333333333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch" && spinnerTo.getSelectedItem().toString() == "Inch"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch" && spinnerTo.getSelectedItem().toString() == "Nautical mile"){
                    result = value * 0.00001371490281;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch" && spinnerTo.getSelectedItem().toString() == "League"){
                    result = value * 0.000005260942761;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch" && spinnerTo.getSelectedItem().toString() == "Furlong"){
                    result = value * 0.0001262626263;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch" && spinnerTo.getSelectedItem().toString() == "Rod"){
                    result = value * 0.005050505051;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch" && spinnerTo.getSelectedItem().toString() == "Chain"){
                    result = value * 0.001262626263;
                    convRslt.setText(conversion.format(result));
                }



                // nautical mile
                if (spinnerFrom.getSelectedItem().toString() == "Nautical mile" && spinnerTo.getSelectedItem().toString() == "Kilometer"){
                    result = value * 1.852;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Nautical mile" && spinnerTo.getSelectedItem().toString() == "Meter"){
                    result = value * 1852;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Nautical mile" && spinnerTo.getSelectedItem().toString() == "Decimeter"){
                    result = value * 18520;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Nautical mile" && spinnerTo.getSelectedItem().toString() == "Centimeter"){
                    result = value * 185200;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Nautical mile" && spinnerTo.getSelectedItem().toString() == "Millimeter"){
                    result = value * 1852000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Nautical mile" && spinnerTo.getSelectedItem().toString() == "Mile"){
                    result = value * 1.150779448;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Nautical mile" && spinnerTo.getSelectedItem().toString() == "Yard"){
                    result = value * 2025.371829;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Nautical mile" && spinnerTo.getSelectedItem().toString() == "Feet"){
                    result = value * 6076.115486;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Nautical mile" && spinnerTo.getSelectedItem().toString() == "Inch"){
                    result = value * 72913.38583;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Nautical mile" && spinnerTo.getSelectedItem().toString() == "Nautical mile"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Nautical mile" && spinnerTo.getSelectedItem().toString() == "League"){
                    result = value * 0.3835931493;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Nautical mile" && spinnerTo.getSelectedItem().toString() == "Furlong"){
                    result = value * 9.206235584;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Nautical mile" && spinnerTo.getSelectedItem().toString() == "Rod"){
                    result = value * 368.2494234;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Nautical mile" && spinnerTo.getSelectedItem().toString() == "Chain"){
                    result = value * 92.06235584;
                    convRslt.setText(conversion.format(result));
                }



                // league
                if (spinnerFrom.getSelectedItem().toString() == "League" && spinnerTo.getSelectedItem().toString() == "Kilometer"){
                    result = value * 4.828032;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "League" && spinnerTo.getSelectedItem().toString() == "Meter"){
                    result = value * 4828.032;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "League" && spinnerTo.getSelectedItem().toString() == "Decimeter"){
                    result = value * 48280.32;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "League" && spinnerTo.getSelectedItem().toString() == "Centimeter"){
                    result = value * 482803.2;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "League" && spinnerTo.getSelectedItem().toString() == "Millimeter"){
                    result = value * 4828032;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "League" && spinnerTo.getSelectedItem().toString() == "Mile"){
                    result = value * 3;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "League" && spinnerTo.getSelectedItem().toString() == "Yard"){
                    result = value * 5280;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "League" && spinnerTo.getSelectedItem().toString() == "Feet"){
                    result = value * 15840;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "League" && spinnerTo.getSelectedItem().toString() == "Inch"){
                    result = value * 190080;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "League" && spinnerTo.getSelectedItem().toString() == "Nautical mile"){
                    result = value * 2.606928726;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "League" && spinnerTo.getSelectedItem().toString() == "League"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "League" && spinnerTo.getSelectedItem().toString() == "Furlong"){
                    result = value * 24;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "League" && spinnerTo.getSelectedItem().toString() == "Rod"){
                    result = value * 960;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "League" && spinnerTo.getSelectedItem().toString() == "Chain"){
                    result = value * 240;
                    convRslt.setText(conversion.format(result));
                }



                // furlong
                if (spinnerFrom.getSelectedItem().toString() == "Furlong" && spinnerTo.getSelectedItem().toString() == "Kilometer"){
                    result = value * 0.201168;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Furlong" && spinnerTo.getSelectedItem().toString() == "Meter"){
                    result = value * 201.168;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Furlong" && spinnerTo.getSelectedItem().toString() == "Decimeter"){
                    result = value * 2011.68;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Furlong" && spinnerTo.getSelectedItem().toString() == "Centimeter"){
                    result = value * 20116.8;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Furlong" && spinnerTo.getSelectedItem().toString() == "Millimeter"){
                    result = value * 201168;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Furlong" && spinnerTo.getSelectedItem().toString() == "Mile"){
                    result = value * 0.125;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Furlong" && spinnerTo.getSelectedItem().toString() == "Yard"){
                    result = value * 220;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Furlong" && spinnerTo.getSelectedItem().toString() == "Feet"){
                    result = value * 660;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Furlong" && spinnerTo.getSelectedItem().toString() == "Inch"){
                    result = value * 7920;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Furlong" && spinnerTo.getSelectedItem().toString() == "Nautical mile"){
                    result = value * 0.1086220302;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Furlong" && spinnerTo.getSelectedItem().toString() == "League"){
                    result = value * 0.04166666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Furlong" && spinnerTo.getSelectedItem().toString() == "Furlong"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Furlong" && spinnerTo.getSelectedItem().toString() == "Rod"){
                    result = value * 40;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Furlong" && spinnerTo.getSelectedItem().toString() == "Chain"){
                    result = value * 10;
                    convRslt.setText(conversion.format(result));
                }



                // rod
                if (spinnerFrom.getSelectedItem().toString() == "Rod" && spinnerTo.getSelectedItem().toString() == "Kilometer"){
                    result = value * 0.0050292;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Rod" && spinnerTo.getSelectedItem().toString() == "Meter"){
                    result = value * 5.0292;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Rod" && spinnerTo.getSelectedItem().toString() == "Decimeter"){
                    result = value * 50.292;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Rod" && spinnerTo.getSelectedItem().toString() == "Centimeter"){
                    result = value * 502.92;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Rod" && spinnerTo.getSelectedItem().toString() == "Millimeter"){
                    result = value * 5029.2;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Rod" && spinnerTo.getSelectedItem().toString() == "Mile"){
                    result = value * 0.003125;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Rod" && spinnerTo.getSelectedItem().toString() == "Yard"){
                    result = value * 5.5;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Rod" && spinnerTo.getSelectedItem().toString() == "Feet"){
                    result = value * 16.5;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Rod" && spinnerTo.getSelectedItem().toString() == "Inch"){
                    result = value * 198;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Rod" && spinnerTo.getSelectedItem().toString() == "Nautical mile"){
                    result = value * 0.002715550756;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Rod" && spinnerTo.getSelectedItem().toString() == "League"){
                    result = value * 0.001041666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Rod" && spinnerTo.getSelectedItem().toString() == "Furlong"){
                    result = value * 0.025;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Rod" && spinnerTo.getSelectedItem().toString() == "Rod"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Rod" && spinnerTo.getSelectedItem().toString() == "Chain"){
                    result = value * 0.25;
                    convRslt.setText(conversion.format(result));
                }



                // chain
                if (spinnerFrom.getSelectedItem().toString() == "Chain" && spinnerTo.getSelectedItem().toString() == "Kilometer"){
                    result = value * 0.0201168;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Chain" && spinnerTo.getSelectedItem().toString() == "Meter"){
                    result = value * 20.1168;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Chain" && spinnerTo.getSelectedItem().toString() == "Decimeter"){
                    result = value * 201.168;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Chain" && spinnerTo.getSelectedItem().toString() == "Centimeter"){
                    result = value * 2011.68;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Chain" && spinnerTo.getSelectedItem().toString() == "Millimeter"){
                    result = value * 20116.8;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Chain" && spinnerTo.getSelectedItem().toString() == "Mile"){
                    result = value * 0.0125;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Chain" && spinnerTo.getSelectedItem().toString() == "Yard"){
                    result = value * 22;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Chain" && spinnerTo.getSelectedItem().toString() == "Feet"){
                    result = value * 66;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Chain" && spinnerTo.getSelectedItem().toString() == "Inch"){
                    result = value * 792;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Chain" && spinnerTo.getSelectedItem().toString() == "Nautical mile"){
                    result = value * 0.01086220302;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Chain" && spinnerTo.getSelectedItem().toString() == "League"){
                    result = value * 0.004166666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Chain" && spinnerTo.getSelectedItem().toString() == "Furlong"){
                    result = value * 0.1;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Chain" && spinnerTo.getSelectedItem().toString() == "Rod"){
                    result = value * 4;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Chain" && spinnerTo.getSelectedItem().toString() == "Chain"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }
            }
        });


    }
}