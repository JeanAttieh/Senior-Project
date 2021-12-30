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

public class MainActivity71 extends AppCompatActivity {
    private Spinner     spinnerFrom, spinnerTo;
    private ImageButton convBtn;
    private EditText    valueToConv;
    private TextView    convRslt;
    private double      value, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main71);
        this.setTitle("Time unit converter");

        convBtn = findViewById(R.id.convBtn);
        spinnerFrom = findViewById(R.id.spinnerFrom);
        spinnerTo = findViewById(R.id.spinnerTo);
        convRslt = findViewById(R.id.convRslt);
        valueToConv = findViewById(R.id.valueToConv);

        String[] timeUnitList = {"Millennium", "Century", "Decade", "Year", "Month", "Week",
                "Day", "Hour", "Minute", "Second", "Millisecond"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, timeUnitList);
        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);

        DecimalFormat conversion = new DecimalFormat("###,###.####################");

        convBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value = Double.parseDouble(valueToConv.getText().toString());


                // millennium
                if (spinnerFrom.getSelectedItem().toString() == "Millennium" && spinnerTo.getSelectedItem().toString() == "Millennium") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millennium" && spinnerTo.getSelectedItem().toString() == "Century") {
                    result = value * 10;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millennium" && spinnerTo.getSelectedItem().toString() == "Decade") {
                    result = value * 100;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millennium" && spinnerTo.getSelectedItem().toString() == "Year") {
                    result = value * 1000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millennium" && spinnerTo.getSelectedItem().toString() == "Month") {
                    result = value * 12000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millennium" && spinnerTo.getSelectedItem().toString() == "Week") {
                    result = value * 52142.85714;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millennium" && spinnerTo.getSelectedItem().toString() == "Day") {
                    result = value * 365000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millennium" && spinnerTo.getSelectedItem().toString() == "Hour") {
                    result = value * 8760000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millennium" && spinnerTo.getSelectedItem().toString() == "Minute") {
                    result = value * 525600000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millennium" && spinnerTo.getSelectedItem().toString() == "Second") {
                    result = value * 31536000 * 1000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millennium" && spinnerTo.getSelectedItem().toString() == "Millisecond") {
                    result = value * 31536000 * 1000 * 1000;
                    convRslt.setText(conversion.format(result));
                }



                // century
                if (spinnerFrom.getSelectedItem().toString() == "Century" && spinnerTo.getSelectedItem().toString() == "Millennium") {
                    result = value * 0.1;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Century" && spinnerTo.getSelectedItem().toString() == "Century") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Century" && spinnerTo.getSelectedItem().toString() == "Decade") {
                    result = value * 10;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Century" && spinnerTo.getSelectedItem().toString() == "Year") {
                    result = value * 100;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Century" && spinnerTo.getSelectedItem().toString() == "Month") {
                    result = value * 1200;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Century" && spinnerTo.getSelectedItem().toString() == "Week") {
                    result = value * 5214.285714;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Century" && spinnerTo.getSelectedItem().toString() == "Day") {
                    result = value * 36500;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Century" && spinnerTo.getSelectedItem().toString() == "Hour") {
                    result = value * 876000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Century" && spinnerTo.getSelectedItem().toString() == "Minute") {
                    result = value * 52560000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Century" && spinnerTo.getSelectedItem().toString() == "Second") {
                    result = value * 31536000 * 100;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Century" && spinnerTo.getSelectedItem().toString() == "Millisecond") {
                    result = value * 3153600 * 1000 * 1000;
                    convRslt.setText(conversion.format(result));
                }



                // decade
                if (spinnerFrom.getSelectedItem().toString() == "Decade" && spinnerTo.getSelectedItem().toString() == "Millennium") {
                    result = value * 0.01;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decade" && spinnerTo.getSelectedItem().toString() == "Century") {
                    result = value * 0.1;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decade" && spinnerTo.getSelectedItem().toString() == "Decade") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decade" && spinnerTo.getSelectedItem().toString() == "Year") {
                    result = value * 10;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decade" && spinnerTo.getSelectedItem().toString() == "Month") {
                    result = value * 120;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decade" && spinnerTo.getSelectedItem().toString() == "Week") {
                    result = value * 521.4285714;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decade" && spinnerTo.getSelectedItem().toString() == "Day") {
                    result = value * 3650;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decade" && spinnerTo.getSelectedItem().toString() == "Hour") {
                    result = value * 87600;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decade" && spinnerTo.getSelectedItem().toString() == "Minute") {
                    result = value * 5256000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decade" && spinnerTo.getSelectedItem().toString() == "Second") {
                    result = value * 3153600 * 100;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Decade" && spinnerTo.getSelectedItem().toString() == "Millisecond") {
                    result = value * 315360 * 1000 * 1000;
                    convRslt.setText(conversion.format(result));
                }



                // year
                if (spinnerFrom.getSelectedItem().toString() == "Year" && spinnerTo.getSelectedItem().toString() == "Millennium") {
                    result = value * 0.001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Year" && spinnerTo.getSelectedItem().toString() == "Century") {
                    result = value * 0.01;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Year" && spinnerTo.getSelectedItem().toString() == "Decade") {
                    result = value * 0.1;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Year" && spinnerTo.getSelectedItem().toString() == "Year") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Year" && spinnerTo.getSelectedItem().toString() == "Month") {
                    result = value * 12;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Year" && spinnerTo.getSelectedItem().toString() == "Week") {
                    result = value * 52.14285714;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Year" && spinnerTo.getSelectedItem().toString() == "Day") {
                    result = value * 365;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Year" && spinnerTo.getSelectedItem().toString() == "Hour") {
                    result = value * 8760;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Year" && spinnerTo.getSelectedItem().toString() == "Minute") {
                    result = value * 525600;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Year" && spinnerTo.getSelectedItem().toString() == "Second") {
                    result = value * 31536000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Year" && spinnerTo.getSelectedItem().toString() == "Millisecond") {
                    result = value * 31536000 * 1000;
                    convRslt.setText(conversion.format(result));
                }



                // month
                if (spinnerFrom.getSelectedItem().toString() == "Month" && spinnerTo.getSelectedItem().toString() == "Millennium") {
                    result = value * 0.00008333333333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Month" && spinnerTo.getSelectedItem().toString() == "Century") {
                    result = value * 0.0008333333333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Month" && spinnerTo.getSelectedItem().toString() == "Decade") {
                    result = value * 0.008333333333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Month" && spinnerTo.getSelectedItem().toString() == "Year") {
                    result = value * 0.08333333333;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Month" && spinnerTo.getSelectedItem().toString() == "Month") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Month" && spinnerTo.getSelectedItem().toString() == "Week") {
                    result = value * 4.345238095;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Month" && spinnerTo.getSelectedItem().toString() == "Day") {
                    result = value * 30.41666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Month" && spinnerTo.getSelectedItem().toString() == "Hour") {
                    result = value * 730;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Month" && spinnerTo.getSelectedItem().toString() == "Minute") {
                    result = value * 43800;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Month" && spinnerTo.getSelectedItem().toString() == "Second") {
                    result = value * 2628000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Month" && spinnerTo.getSelectedItem().toString() == "Millisecond") {
                    result = value * 2628000 * 1000;
                    convRslt.setText(conversion.format(result));
                }



                // week
                if (spinnerFrom.getSelectedItem().toString() == "Week" && spinnerTo.getSelectedItem().toString() == "Millennium") {
                    result = value * 0.0000191788219;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Week" && spinnerTo.getSelectedItem().toString() == "Century") {
                    result = value * 0.000191788219;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Week" && spinnerTo.getSelectedItem().toString() == "Decade") {
                    result = value * 0.00191788219;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Week" && spinnerTo.getSelectedItem().toString() == "Year") {
                    result = value * 0.0191788219;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Week" && spinnerTo.getSelectedItem().toString() == "Month") {
                    result = value * 0.2301369863;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Week" && spinnerTo.getSelectedItem().toString() == "Week") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Week" && spinnerTo.getSelectedItem().toString() == "Day") {
                    result = value * 7;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Week" && spinnerTo.getSelectedItem().toString() == "Hour") {
                    result = value * 168;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Week" && spinnerTo.getSelectedItem().toString() == "Minute") {
                    result = value * 10080;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Week" && spinnerTo.getSelectedItem().toString() == "Second") {
                    result = value * 604800;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Week" && spinnerTo.getSelectedItem().toString() == "Millisecond") {
                    result = value * 604800 * 1000;
                    convRslt.setText(conversion.format(result));
                }



                // day
                if (spinnerFrom.getSelectedItem().toString() == "Day" && spinnerTo.getSelectedItem().toString() == "Millennium") {
                    result = value * 0.000002739726027;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Day" && spinnerTo.getSelectedItem().toString() == "Century") {
                    result = value * 0.00002739726027;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Day" && spinnerTo.getSelectedItem().toString() == "Decade") {
                    result = value * 0.0002739726027;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Day" && spinnerTo.getSelectedItem().toString() == "Year") {
                    result = value * 0.002739726027;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Day" && spinnerTo.getSelectedItem().toString() == "Month") {
                    result = value * 0.03287671233;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Day" && spinnerTo.getSelectedItem().toString() == "Week") {
                    result = value * 0.1428571429;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Day" && spinnerTo.getSelectedItem().toString() == "Day") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Day" && spinnerTo.getSelectedItem().toString() == "Hour") {
                    result = value * 24;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Day" && spinnerTo.getSelectedItem().toString() == "Minute") {
                    result = value * 1440;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Day" && spinnerTo.getSelectedItem().toString() == "Second") {
                    result = value * 86400;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Day" && spinnerTo.getSelectedItem().toString() == "Millisecond") {
                    result = value * 86400 * 1000;
                    convRslt.setText(conversion.format(result));
                }



                // hour
                if (spinnerFrom.getSelectedItem().toString() == "Hour" && spinnerTo.getSelectedItem().toString() == "Millennium") {
                    result = value * 0.0000001141552511;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hour" && spinnerTo.getSelectedItem().toString() == "Century") {
                    result = value * 0.000001141552511;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hour" && spinnerTo.getSelectedItem().toString() == "Decade") {
                    result = value * 0.00001141552511;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hour" && spinnerTo.getSelectedItem().toString() == "Year") {
                    result = value * 0.0001141552511;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hour" && spinnerTo.getSelectedItem().toString() == "Month") {
                    result = value * 0.001369863014;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hour" && spinnerTo.getSelectedItem().toString() == "Week") {
                    result = value * 0.005952380952;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hour" && spinnerTo.getSelectedItem().toString() == "Day") {
                    result = value * 0.04166666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hour" && spinnerTo.getSelectedItem().toString() == "Hour") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hour" && spinnerTo.getSelectedItem().toString() == "Minute") {
                    result = value * 60;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hour" && spinnerTo.getSelectedItem().toString() == "Second") {
                    result = value * 3600;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Hour" && spinnerTo.getSelectedItem().toString() == "Millisecond") {
                    result = value * 3600 * 1000;
                    convRslt.setText(conversion.format(result));
                }



                // minute
                if (spinnerFrom.getSelectedItem().toString() == "Minute" && spinnerTo.getSelectedItem().toString() == "Millennium") {
                    result = value * 0.000000001902587519;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Minute" && spinnerTo.getSelectedItem().toString() == "Century") {
                    result = value * 0.00000001902587519;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Minute" && spinnerTo.getSelectedItem().toString() == "Decade") {
                    result = value * 0.0000001902587519;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Minute" && spinnerTo.getSelectedItem().toString() == "Year") {
                    result = value * 0.000001902587519;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Minute" && spinnerTo.getSelectedItem().toString() == "Month") {
                    result = value * 0.00002283105023;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Minute" && spinnerTo.getSelectedItem().toString() == "Week") {
                    result = value * 0.00009920634921;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Minute" && spinnerTo.getSelectedItem().toString() == "Day") {
                    result = value * 0.0006944444444;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Minute" && spinnerTo.getSelectedItem().toString() == "Hour") {
                    result = value * 0.01666666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Minute" && spinnerTo.getSelectedItem().toString() == "Minute") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Minute" && spinnerTo.getSelectedItem().toString() == "Second") {
                    result = value * 60;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Minute" && spinnerTo.getSelectedItem().toString() == "Millisecond") {
                    result = value * 60 * 1000;
                    convRslt.setText(conversion.format(result));
                }



                // second
                if (spinnerFrom.getSelectedItem().toString() == "Second" && spinnerTo.getSelectedItem().toString() == "Millennium") {
                    result = value * 0.00000000003170979198;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Second" && spinnerTo.getSelectedItem().toString() == "Century") {
                    result = value * 0.0000000003170979198;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Second" && spinnerTo.getSelectedItem().toString() == "Decade") {
                    result = value * 0.000000003170979198;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Second" && spinnerTo.getSelectedItem().toString() == "Year") {
                    result = value * 0.00000003170979198;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Second" && spinnerTo.getSelectedItem().toString() == "Month") {
                    result = value * 0.0000003805175038;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Second" && spinnerTo.getSelectedItem().toString() == "Week") {
                    result = value * 0.000001653439153;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Second" && spinnerTo.getSelectedItem().toString() == "Day") {
                    result = value * 0.00001157407407;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Second" && spinnerTo.getSelectedItem().toString() == "Hour") {
                    result = value * 0.00027777777778;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Second" && spinnerTo.getSelectedItem().toString() == "Minute") {
                    result = value * 0.01666666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Second" && spinnerTo.getSelectedItem().toString() == "Second") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Second" && spinnerTo.getSelectedItem().toString() == "Millisecond") {
                    result = value * 1000;
                    convRslt.setText(conversion.format(result));
                }



                // millisecond
                if (spinnerFrom.getSelectedItem().toString() == "Millisecond" && spinnerTo.getSelectedItem().toString() == "Millennium") {
                    result = value * 0.00000000000003170979198;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millisecond" && spinnerTo.getSelectedItem().toString() == "Century") {
                    result = value * 0.0000000000003170979198;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millisecond" && spinnerTo.getSelectedItem().toString() == "Decade") {
                    result = value * 0.000000000003170979198;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millisecond" && spinnerTo.getSelectedItem().toString() == "Year") {
                    result = value * 0.00000000003170979198;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millisecond" && spinnerTo.getSelectedItem().toString() == "Month") {
                    result = value * 0.0000000003805175038;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millisecond" && spinnerTo.getSelectedItem().toString() == "Week") {
                    result = value * 0.000000001653439153;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millisecond" && spinnerTo.getSelectedItem().toString() == "Day") {
                    result = value * 0.00000001157407407;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millisecond" && spinnerTo.getSelectedItem().toString() == "Hour") {
                    result = value * 0.00000027777777778;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millisecond" && spinnerTo.getSelectedItem().toString() == "Minute") {
                    result = value * 0.00001666666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millisecond" && spinnerTo.getSelectedItem().toString() == "Second") {
                    result = value * 0.001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millisecond" && spinnerTo.getSelectedItem().toString() == "Millisecond") {
                    result = value;
                    convRslt.setText(conversion.format(result));
                }
            }
        });
    }
}
