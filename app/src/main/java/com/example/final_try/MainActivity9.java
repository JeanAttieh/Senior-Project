package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity9 extends AppCompatActivity {
    private double B, b, h, area;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        this.setTitle("Trapezoid");

        EditText trapHeight = (EditText) findViewById(R.id.trapHeight);
        EditText trapBigBase = (EditText) findViewById(R.id.trapBigBase);
        EditText trapSmallBase = (EditText) findViewById(R.id.trapSmallBase);
        TextView trapRslt = (TextView) findViewById(R.id.trapRslt);
        Button tarpCalculate = (Button) findViewById(R.id.tarpCalculate);
        tarpCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                h = Double.parseDouble(trapHeight.getText().toString());
                B = Double.parseDouble(trapBigBase.getText().toString());
                b = Double.parseDouble(trapSmallBase.getText().toString());
                area = ((B + b) / 2) * h;
                DecimalFormat trapArea = new DecimalFormat("0.00");
                trapRslt.setText("Area: " + trapArea.format(area) + " m\u00B2");
            }
        });
    };
}

