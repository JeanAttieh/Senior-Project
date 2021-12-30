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

public class MainActivity68 extends AppCompatActivity {
    private ImageButton convBtn;
    private EditText    valueToConv;
    private TextView    convRslt;
    private Spinner     spinnerFrom, spinnerTo;
    private double      result, value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main68);
        this.setTitle("Pressure unit converter");

        convBtn = findViewById(R.id.convBtn);
        convRslt = findViewById(R.id.convRslt);
        spinnerFrom = findViewById(R.id.spinnerFrom);
        spinnerTo = findViewById(R.id.spinnerTo);
        valueToConv = findViewById(R.id.valueToConv);

        String[] pressureUnitList = {"Atmosphere", "Bar", "Millibar", "Inch water[4°C]", "Inch mercury",
                "Millimeter mercury", "Mega Pascal", "Kilo Pascal", "Pascal(N/m\u00b2)", "Pound/sq foot", "Pound/sq inch"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,pressureUnitList);

        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);
        DecimalFormat conversion = new DecimalFormat("###,###.##########");
        convBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value = Double.parseDouble(valueToConv.getText().toString());



                // atmosphere
                if (spinnerFrom.getSelectedItem().toString() == "Atmosphere" && spinnerTo.getSelectedItem().toString() == "Atmosphere"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Atmosphere" && spinnerTo.getSelectedItem().toString() == "Bar"){
                    result = value * 1.01325;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Atmosphere" && spinnerTo.getSelectedItem().toString() == "Millibar"){
                    result = value * 1013.25;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Atmosphere" && spinnerTo.getSelectedItem().toString() == "Inch water[4°C]"){
                    result = value * 406.793852;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Atmosphere" && spinnerTo.getSelectedItem().toString() == "Inch mercury"){
                    result = value * 29.92125984;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Atmosphere" && spinnerTo.getSelectedItem().toString() == "Millimeter mercury"){
                    result = value * 760;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Atmosphere" && spinnerTo.getSelectedItem().toString() == "Mega Pascal"){
                    result = value * 0.101325;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Atmosphere" && spinnerTo.getSelectedItem().toString() == "Kilo Pascal"){
                    result = value * 101.325;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Atmosphere" && spinnerTo.getSelectedItem().toString() == "Pascal(N/m\u00b2)"){
                    result = value * 101325;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Atmosphere" && spinnerTo.getSelectedItem().toString() == "Pound/sq foot"){
                    result = value * 2116.216624;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Atmosphere" && spinnerTo.getSelectedItem().toString() == "Pound/sq inch"){
                    result = value * 14.69594878;
                    convRslt.setText(conversion.format(result));
                }



                // bar
                if (spinnerFrom.getSelectedItem().toString() == "Bar" && spinnerTo.getSelectedItem().toString() == "Atmosphere"){
                    result = value * 0.9869232667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Bar" && spinnerTo.getSelectedItem().toString() == "Bar"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Bar" && spinnerTo.getSelectedItem().toString() == "Millibar"){
                    result = value * 1000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Bar" && spinnerTo.getSelectedItem().toString() == "Inch water[4°C]"){
                    result = value * 401.4743173;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Bar" && spinnerTo.getSelectedItem().toString() == "Inch mercury"){
                    result = value * 29.52998751;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Bar" && spinnerTo.getSelectedItem().toString() == "Millimeter mercury"){
                    result = value * 750.0616827;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Bar" && spinnerTo.getSelectedItem().toString() == "Mega Pascal"){
                    result = value * 0.1;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Bar" && spinnerTo.getSelectedItem().toString() == "Kilo Pascal"){
                    result = value * 100;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Bar" && spinnerTo.getSelectedItem().toString() == "Pascal(N/m\u00b2)"){
                    result = value * 100000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Bar" && spinnerTo.getSelectedItem().toString() == "Pound/sq foot"){
                    result = value * 2088.543423;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Bar" && spinnerTo.getSelectedItem().toString() == "Pound/sq inch"){
                    result = value * 14.50377377;
                    convRslt.setText(conversion.format(result));
                }



                // millibar
                if (spinnerFrom.getSelectedItem().toString() == "Millibar" && spinnerTo.getSelectedItem().toString() == "Atmosphere"){
                    result = value * 0.0009869232667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millibar" && spinnerTo.getSelectedItem().toString() == "Bar"){
                    result = value * 0.001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millibar" && spinnerTo.getSelectedItem().toString() == "Millibar"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millibar" && spinnerTo.getSelectedItem().toString() == "Inch water[4°C]"){
                    result = value * 0.4014743173;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millibar" && spinnerTo.getSelectedItem().toString() == "Inch mercury"){
                    result = value * 0.02952998751;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millibar" && spinnerTo.getSelectedItem().toString() == "Millimeter mercury"){
                    result = value * 0.7500616827;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millibar" && spinnerTo.getSelectedItem().toString() == "Mega Pascal"){
                    result = value * 0.0001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millibar" && spinnerTo.getSelectedItem().toString() == "Kilo Pascal"){
                    result = value * 0.1;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millibar" && spinnerTo.getSelectedItem().toString() == "Pascal(N/m\u00b2)"){
                    result = value * 100;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millibar" && spinnerTo.getSelectedItem().toString() == "Pound/sq foot"){
                    result = value * 2.088543423;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millibar" && spinnerTo.getSelectedItem().toString() == "Pound/sq inch"){
                    result = value * 0.01450377377;
                    convRslt.setText(conversion.format(result));
                }



                // Inch water[4°C]
                if (spinnerFrom.getSelectedItem().toString() == "Inch water[4°C]" && spinnerTo.getSelectedItem().toString() == "Atmosphere"){
                    result = value * 0.002458247575;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch water[4°C]" && spinnerTo.getSelectedItem().toString() == "Bar"){
                    result = value * 0.002490819355;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch water[4°C]" && spinnerTo.getSelectedItem().toString() == "Millibar"){
                    result = value * 2.490819355;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch water[4°C]" && spinnerTo.getSelectedItem().toString() == "Inch water[4°C]"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch water[4°C]" && spinnerTo.getSelectedItem().toString() == "Inch mercury"){
                    result = value * 0.07355386443;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch water[4°C]" && spinnerTo.getSelectedItem().toString() == "Millimeter mercury"){
                    result = value * 1.868268157;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch water[4°C]" && spinnerTo.getSelectedItem().toString() == "Mega Pascal"){
                    result = value * 0.0002490819355;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch water[4°C]" && spinnerTo.getSelectedItem().toString() == "Kilo Pascal"){
                    result = value * 0.2490819355;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch water[4°C]" && spinnerTo.getSelectedItem().toString() == "Pascal(N/m\u00b2)"){
                    result = value * 249.0819355;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch water[4°C]" && spinnerTo.getSelectedItem().toString() == "Pound/sq foot"){
                    result = value * 5.202184383;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch water[4°C]" && spinnerTo.getSelectedItem().toString() == "Pound/sq inch"){
                    result = value * 0.03612628043;
                    convRslt.setText(conversion.format(result));
                }



                // inch mercury
                if (spinnerFrom.getSelectedItem().toString() == "Inch mercury" && spinnerTo.getSelectedItem().toString() == "Atmosphere"){
                    result = value * 0.03342105263;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch mercury" && spinnerTo.getSelectedItem().toString() == "Bar"){
                    result = value * 0.03386388158;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch mercury" && spinnerTo.getSelectedItem().toString() == "Millibar"){
                    result = value * 33.86388158;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch mercury" && spinnerTo.getSelectedItem().toString() == "Inch water[4°C]"){
                    result = value * 13.59547874;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch mercury" && spinnerTo.getSelectedItem().toString() == "Inch mercury"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch mercury" && spinnerTo.getSelectedItem().toString() == "Millimeter mercury"){
                    result = value * 25.4;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch mercury" && spinnerTo.getSelectedItem().toString() == "Mega Pascal"){
                    result = value * 0.003386388158;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch mercury" && spinnerTo.getSelectedItem().toString() == "Kilo Pascal"){
                    result = value * 3.386388158;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch mercury" && spinnerTo.getSelectedItem().toString() == "Pascal(N/m\u00b2)"){
                    result = value * 3386.388158;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch mercury" && spinnerTo.getSelectedItem().toString() == "Pound/sq foot"){
                    result = value * 70.72618717;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Inch mercury" && spinnerTo.getSelectedItem().toString() == "Pound/sq inch"){
                    result = value * 0.4911540775;
                    convRslt.setText(conversion.format(result));
                }



                // millimeter mercury
                if (spinnerFrom.getSelectedItem().toString() == "Millimeter mercury" && spinnerTo.getSelectedItem().toString() == "Atmosphere"){
                    result = value * 0.001315789474;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter mercury" && spinnerTo.getSelectedItem().toString() == "Bar"){
                    result = value * 0.001333223684;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter mercury" && spinnerTo.getSelectedItem().toString() == "Millibar"){
                    result = value * 1.333223684;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter mercury" && spinnerTo.getSelectedItem().toString() == "Inch water[4°C]"){
                    result = value * 0.5352550684;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter mercury" && spinnerTo.getSelectedItem().toString() == "Inch mercury"){
                    result = value * 0.0393700874;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter mercury" && spinnerTo.getSelectedItem().toString() == "Millimeter mercury"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter mercury" && spinnerTo.getSelectedItem().toString() == "Mega Pascal"){
                    result = value * 0.0001333223684;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter mercury" && spinnerTo.getSelectedItem().toString() == "Kilo Pascal"){
                    result = value * 0.1333223684;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter mercury" && spinnerTo.getSelectedItem().toString() == "Pascal(N/m\u00b2)"){
                    result = value * 133.3223684;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter mercury" && spinnerTo.getSelectedItem().toString() == "Pound/sq foot"){
                    result = value * 2.784495557;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Millimeter mercury" && spinnerTo.getSelectedItem().toString() == "Pound/sq inch"){
                    result = value * 0.0193367747;
                    convRslt.setText(conversion.format(result));
                }



                // mega pascal
                if (spinnerFrom.getSelectedItem().toString() == "Mega Pascal" && spinnerTo.getSelectedItem().toString() == "Atmosphere"){
                    result = value * 9.869232667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mega Pascal" && spinnerTo.getSelectedItem().toString() == "Bar"){
                    result = value * 10;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mega Pascal" && spinnerTo.getSelectedItem().toString() == "Millibar"){
                    result = value * 10000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mega Pascal" && spinnerTo.getSelectedItem().toString() == "Inch water[4°C]"){
                    result = value * 4014.743173;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mega Pascal" && spinnerTo.getSelectedItem().toString() == "Inch mercury"){
                    result = value * 295.2998751;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mega Pascal" && spinnerTo.getSelectedItem().toString() == "Millimeter mercury"){
                    result = value * 7500.616827;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mega Pascal" && spinnerTo.getSelectedItem().toString() == "Mega Pascal"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mega Pascal" && spinnerTo.getSelectedItem().toString() == "Kilo Pascal"){
                    result = value * 1000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mega Pascal" && spinnerTo.getSelectedItem().toString() == "Pascal(N/m\u00b2)"){
                    result = value * 1000000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mega Pascal" && spinnerTo.getSelectedItem().toString() == "Pound/sq foot"){
                    result = value * 20885.43423;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Mega Pascal" && spinnerTo.getSelectedItem().toString() == "Pound/sq inch"){
                    result = value * 145.0377377;
                    convRslt.setText(conversion.format(result));
                }



                // kilo pascal
                if (spinnerFrom.getSelectedItem().toString() == "Kilo Pascal" && spinnerTo.getSelectedItem().toString() == "Atmosphere"){
                    result = value * 0.009869232667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilo Pascal" && spinnerTo.getSelectedItem().toString() == "Bar"){
                    result = value * 0.01;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilo Pascal" && spinnerTo.getSelectedItem().toString() == "Millibar"){
                    result = value * 10;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilo Pascal" && spinnerTo.getSelectedItem().toString() == "Inch water[4°C]"){
                    result = value * 4.014743173;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilo Pascal" && spinnerTo.getSelectedItem().toString() == "Inch mercury"){
                    result = value * 0.2952998751;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilo Pascal" && spinnerTo.getSelectedItem().toString() == "Millimeter mercury"){
                    result = value * 7.500616827;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilo Pascal" && spinnerTo.getSelectedItem().toString() == "Mega Pascal"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilo Pascal" && spinnerTo.getSelectedItem().toString() == "Kilo Pascal"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilo Pascal" && spinnerTo.getSelectedItem().toString() == "Pascal(N/m\u00b2)"){
                    result = value * 1000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilo Pascal" && spinnerTo.getSelectedItem().toString() == "Pound/sq foot"){
                    result = value * 20.88543423;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilo Pascal" && spinnerTo.getSelectedItem().toString() == "Pound/sq inch"){
                    result = value * 0.1450377377;
                    convRslt.setText(conversion.format(result));
                }



                // pascal (n/m\u00b2)
                if (spinnerFrom.getSelectedItem().toString() == "Pascal(N/m\u00b2)" && spinnerTo.getSelectedItem().toString() == "Atmosphere"){
                    result = value * 0.000009869232667;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pascal(N/m\u00b2)" && spinnerTo.getSelectedItem().toString() == "Bar"){
                    result = value * 0.00001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pascal(N/m\u00b2)" && spinnerTo.getSelectedItem().toString() == "Millibar"){
                    result = value * 0.01;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pascal(N/m\u00b2)" && spinnerTo.getSelectedItem().toString() == "Inch water[4°C]"){
                    result = value * 0.004014743173;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pascal(N/m\u00b2)" && spinnerTo.getSelectedItem().toString() == "Inch mercury"){
                    result = value * 0.0002952998751;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pascal(N/m\u00b2)" && spinnerTo.getSelectedItem().toString() == "Millimeter mercury"){
                    result = value * 0.007500616827;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pascal(N/m\u00b2)" && spinnerTo.getSelectedItem().toString() == "Mega Pascal"){
                    result = value * 0.000001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pascal(N/m\u00b2)" && spinnerTo.getSelectedItem().toString() == "Kilo Pascal"){
                    result = value * 0.001;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pascal(N/m\u00b2)" && spinnerTo.getSelectedItem().toString() == "Pascal(N/m\u00b2)"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pascal(N/m\u00b2)" && spinnerTo.getSelectedItem().toString() == "Pound/sq foot"){
                    result = value * 0.02088543423;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pascal(N/m\u00b2)" && spinnerTo.getSelectedItem().toString() == "Pound/sq inch"){
                    result = value * 0.0001450377377;
                    convRslt.setText(conversion.format(result));
                }



                // pound/sq foot
                if (spinnerFrom.getSelectedItem().toString() == "Pound/sq foot" && spinnerTo.getSelectedItem().toString() == "Atmosphere"){
                    result = value * 0.000472541416;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound/sq foot" && spinnerTo.getSelectedItem().toString() == "Bar"){
                    result = value * 0.0004788025898;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound/sq foot" && spinnerTo.getSelectedItem().toString() == "Millibar"){
                    result = value * 0.4788025898;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound/sq foot" && spinnerTo.getSelectedItem().toString() == "Inch water[4°C]"){
                    result = value * 0.1922269429;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound/sq foot" && spinnerTo.getSelectedItem().toString() == "Inch mercury"){
                    result = value * 0.01413903449;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound/sq foot" && spinnerTo.getSelectedItem().toString() == "Millimeter mercury"){
                    result = value * 0.3591314762;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound/sq foot" && spinnerTo.getSelectedItem().toString() == "Mega Pascal"){
                    result = value * 0.00004788025898;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound/sq foot" && spinnerTo.getSelectedItem().toString() == "Kilo Pascal"){
                    result = value * 0.04788025898;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound/sq foot" && spinnerTo.getSelectedItem().toString() == "Pascal(N/m\u00b2)"){
                    result = value * 47.88025898;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound/sq foot" && spinnerTo.getSelectedItem().toString() == "Pound/sq foot"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound/sq foot" && spinnerTo.getSelectedItem().toString() == "Pound/sq inch"){
                    result = value * 0.006944444444;
                    convRslt.setText(conversion.format(result));
                }



                // pound/sq inch
                if (spinnerFrom.getSelectedItem().toString() == "Pound/sq inch" && spinnerTo.getSelectedItem().toString() == "Atmosphere"){
                    result = value * 0.06804596391;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound/sq inch" && spinnerTo.getSelectedItem().toString() == "Bar"){
                    result = value * 0.06894757293;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound/sq inch" && spinnerTo.getSelectedItem().toString() == "Millibar"){
                    result = value * 68.94757293;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound/sq inch" && spinnerTo.getSelectedItem().toString() == "Inch water[4°C]"){
                    result = value * 27.68067977;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound/sq inch" && spinnerTo.getSelectedItem().toString() == "Inch mercury"){
                    result = value * 2.036020967;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound/sq inch" && spinnerTo.getSelectedItem().toString() == "Millimeter mercury"){
                    result = value * 51.71493257;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound/sq inch" && spinnerTo.getSelectedItem().toString() == "Mega Pascal"){
                    result = value * 0.006894757293;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound/sq inch" && spinnerTo.getSelectedItem().toString() == "Kilo Pascal"){
                    result = value * 6.894757293;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound/sq inch" && spinnerTo.getSelectedItem().toString() == "Pascal(N/m\u00b2)"){
                    result = value * 6894.757293;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound/sq inch" && spinnerTo.getSelectedItem().toString() == "Pound/sq foot"){
                    result = value * 144;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Pound/sq inch" && spinnerTo.getSelectedItem().toString() == "Pound/sq inch"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }
            }
        });


    }
}