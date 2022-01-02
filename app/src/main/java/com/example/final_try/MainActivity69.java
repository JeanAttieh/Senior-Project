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

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer/hour" && spinnerTo.getSelectedItem().toString() == "Meter/second"){
                    result = value * 0.2777777778;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer/hour" && spinnerTo.getSelectedItem().toString() == "Mile/hour"){
                    result = value * 0.6213711922;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer/hour" && spinnerTo.getSelectedItem().toString() == "Feet/minute"){
                    result = value * 54.68066492;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer/hour" && spinnerTo.getSelectedItem().toString() == "Feet/second"){
                    result = value * 0.9113444153;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer/hour" && spinnerTo.getSelectedItem().toString() == "Knot"){
                    result = value * 0.5399568035;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer/hour" && spinnerTo.getSelectedItem().toString() == "Speed of light"){
                    result = value * 0.0000000009265669311;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer/hour" && spinnerTo.getSelectedItem().toString() == "Speed of sound (air)"){
                    result = value * 0.0008093758094;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilometer/hour" && spinnerTo.getSelectedItem().toString() == "Speed of sound (water)"){
                    result = value * 0.000187181791;
                    convRslt.setText(conversion.format(result));
                }



                // meter/second
                if (spinnerFrom.getSelectedItem().toString() == "Meter/second" && spinnerTo.getSelectedItem().toString() == "Kilometer/hour"){
                    result = value * 3.6;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter/second" && spinnerTo.getSelectedItem().toString() == "Meter/second"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter/second" && spinnerTo.getSelectedItem().toString() == "Mile/hour"){
                    result = value * 2.236936292;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter/second" && spinnerTo.getSelectedItem().toString() == "Feet/minute"){
                    result = value * 196.8503937;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter/second" && spinnerTo.getSelectedItem().toString() == "Feet/second"){
                    result = value * 3.280839895;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter/second" && spinnerTo.getSelectedItem().toString() == "Knot"){
                    result = value * 1.943844492;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter/second" && spinnerTo.getSelectedItem().toString() == "Speed of light"){
                    result = value * 0.000000003335640952;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter/second" && spinnerTo.getSelectedItem().toString() == "Speed of sound (air)"){
                    result = value * 0.002913752914;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Meter/second" && spinnerTo.getSelectedItem().toString() == "Speed of sound (water)"){
                    result = value * 0.0006738544474;
                    convRslt.setText(conversion.format(result));
                }



                // mile/hour
                if (spinnerFrom.getSelectedItem().toString() == "Mile/hour" && spinnerTo.getSelectedItem().toString() == "Kilometer/hour"){
                    result = value * 1.609344;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile/hour" && spinnerTo.getSelectedItem().toString() == "Meter/second"){
                    result = value * 0.44704;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile/hour" && spinnerTo.getSelectedItem().toString() == "Mile/hour"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile/hour" && spinnerTo.getSelectedItem().toString() == "Feet/minute"){
                    result = value * 88;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile/hour" && spinnerTo.getSelectedItem().toString() == "Feet/second"){
                    result = value * 1.466666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile/hour" && spinnerTo.getSelectedItem().toString() == "Knot"){
                    result = value * 0.8689762419;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile/hour" && spinnerTo.getSelectedItem().toString() == "Speed of light"){
                    result = value * 0.000000001491164931;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile/hour" && spinnerTo.getSelectedItem().toString() == "Speed of sound (air)"){
                    result = value * 0.001302564103;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mile/hour" && spinnerTo.getSelectedItem().toString() == "Speed of sound (water)"){
                    result = value * 0.0003012398922;
                    convRslt.setText(conversion.format(result));
                }



                // feet/minute
                if (spinnerFrom.getSelectedItem().toString() == "Feet/minute" && spinnerTo.getSelectedItem().toString() == "Kilometer/hour"){
                    result = value * 0.018288;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet/minute" && spinnerTo.getSelectedItem().toString() == "Meter/second"){
                    result = value * 0.00508;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet/minute" && spinnerTo.getSelectedItem().toString() == "Mile/hour"){
                    result = value * 0.01136363636;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet/minute" && spinnerTo.getSelectedItem().toString() == "Feet/minute"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet/minute" && spinnerTo.getSelectedItem().toString() == "Feet/second"){
                    result = value * 0.01666666667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet/minute" && spinnerTo.getSelectedItem().toString() == "Knot"){
                    result = value * 0.009874730022;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet/minute" && spinnerTo.getSelectedItem().toString() == "Speed of light"){
                    result = value * 0.00000000001694505604;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet/minute" && spinnerTo.getSelectedItem().toString() == "Speed of sound (air)"){
                    result = value * 0.0000148018648;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet/minute" && spinnerTo.getSelectedItem().toString() == "Speed of sound (water)"){
                    result = value * 0.000003423180593;
                    convRslt.setText(conversion.format(result));
                }



                // feet/second
                if (spinnerFrom.getSelectedItem().toString() == "Feet/second" && spinnerTo.getSelectedItem().toString() == "Kilometer/hour"){
                    result = value * 1.09728;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet/second" && spinnerTo.getSelectedItem().toString() == "Meter/second"){
                    result = value * 0.3048;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet/second" && spinnerTo.getSelectedItem().toString() == "Mile/hour"){
                    result = value * 0.6818181818;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet/second" && spinnerTo.getSelectedItem().toString() == "Feet/minute"){
                    result = value * 60;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet/second" && spinnerTo.getSelectedItem().toString() == "Feet/second"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet/second" && spinnerTo.getSelectedItem().toString() == "Knot"){
                    result = value * 0.5924838013;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet/second" && spinnerTo.getSelectedItem().toString() == "Speed of light"){
                    result = value * 0.000000001016703362;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet/second" && spinnerTo.getSelectedItem().toString() == "Speed of sound (air)"){
                    result = value * 0.0008881118881;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Feet/second" && spinnerTo.getSelectedItem().toString() == "Speed of sound (water)"){
                    result = value * 0.0002053908356;
                    convRslt.setText(conversion.format(result));
                }



                // knot
                if (spinnerFrom.getSelectedItem().toString() == "Knot" && spinnerTo.getSelectedItem().toString() == "Kilometer/hour"){
                    result = value * 1.852;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Knot" && spinnerTo.getSelectedItem().toString() == "Meter/second"){
                    result = value * 0.5144444444;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Knot" && spinnerTo.getSelectedItem().toString() == "Mile/hour"){
                    result = value * 1.150779448;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Knot" && spinnerTo.getSelectedItem().toString() == "Feet/minute"){
                    result = value * 101.2685914;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Knot" && spinnerTo.getSelectedItem().toString() == "Feet/second"){
                    result = value * 1.687809857;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Knot" && spinnerTo.getSelectedItem().toString() == "Knot"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Knot" && spinnerTo.getSelectedItem().toString() == "Speed of light"){
                    result = value * 0.000000001716001956;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Knot" && spinnerTo.getSelectedItem().toString() == "Speed of sound (air)"){
                    result = value * 0.001498963999;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Knot" && spinnerTo.getSelectedItem().toString() == "Speed of sound (water)"){
                    result = value * 0.0003466606768;
                    convRslt.setText(conversion.format(result));
                }



                // speed of light
                if (spinnerFrom.getSelectedItem().toString() == "Speed of light" && spinnerTo.getSelectedItem().toString() == "Kilometer/hour"){
                    result = value * 1079252849;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of light" && spinnerTo.getSelectedItem().toString() == "Meter/second"){
                    result = value * 299792458;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of light" && spinnerTo.getSelectedItem().toString() == "Mile/hour"){
                    result = value * 670616629.4;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of light" && spinnerTo.getSelectedItem().toString() == "Feet/minute"){
                    result = value * 590142633.9 * 100;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of light" && spinnerTo.getSelectedItem().toString() == "Feet/second"){
                    result = value * 983571056.4;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of light" && spinnerTo.getSelectedItem().toString() == "Knot"){
                    result = value * 582749918.4;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of light" && spinnerTo.getSelectedItem().toString() == "Speed of light"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of light" && spinnerTo.getSelectedItem().toString() == "Speed of sound (air)"){
                    result = value * 873521.148;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of light" && spinnerTo.getSelectedItem().toString() == "Speed of sound (water)"){
                    result = value * 202016.4811;
                    convRslt.setText(conversion.format(result));
                }



                // speed of sound (air)
                if (spinnerFrom.getSelectedItem().toString() == "Speed of sound (air)" && spinnerTo.getSelectedItem().toString() == "Kilometer/hour"){
                    result = value * 1235.52;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of sound (air)" && spinnerTo.getSelectedItem().toString() == "Meter/second"){
                    result = value * 343.2;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of sound (air)" && spinnerTo.getSelectedItem().toString() == "Mile/hour"){
                    result = value * 767.7165354;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of sound (air)" && spinnerTo.getSelectedItem().toString() == "Feet/minute"){
                    result = value * 67559.05512;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of sound (air)" && spinnerTo.getSelectedItem().toString() == "Feet/second"){
                    result = value * 1125.984252;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of sound (air)" && spinnerTo.getSelectedItem().toString() == "Knot"){
                    result = value * 667.1274298;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of sound (air)" && spinnerTo.getSelectedItem().toString() == "Speed of light"){
                    result = value * 0.000001144791975;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of sound (air)" && spinnerTo.getSelectedItem().toString() == "Speed of sound (air)"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of sound (air)" && spinnerTo.getSelectedItem().toString() == "Speed of sound (water)"){
                    result = value * 0.2312668464;
                    convRslt.setText(conversion.format(result));
                }



                // speed of sound (water)
                if (spinnerFrom.getSelectedItem().toString() == "Speed of sound (water)" && spinnerTo.getSelectedItem().toString() == "Kilometer/hour"){
                    result = value * 5342.4;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of sound (water)" && spinnerTo.getSelectedItem().toString() == "Meter/second"){
                    result = value * 1484;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of sound (water)" && spinnerTo.getSelectedItem().toString() == "Mile/hour"){
                    result = value * 3319.613457;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of sound (water)" && spinnerTo.getSelectedItem().toString() == "Feet/minute"){
                    result = value * 292125.9843;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of sound (water)" && spinnerTo.getSelectedItem().toString() == "Feet/second"){
                    result = value * 4868.766404;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of sound (water)" && spinnerTo.getSelectedItem().toString() == "Knot"){
                    result = value * 2884.665227;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of sound (water)" && spinnerTo.getSelectedItem().toString() == "Speed of light"){
                    result = value * 0.000004950091173;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of sound (water)" && spinnerTo.getSelectedItem().toString() == "Speed of sound (air)"){
                    result = value * 4.324009324;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Speed of sound (water)" && spinnerTo.getSelectedItem().toString() == "Speed of sound (water)"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }
            }
        });
    }
}