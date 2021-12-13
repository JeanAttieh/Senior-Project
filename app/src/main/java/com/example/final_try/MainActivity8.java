package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity8 extends AppCompatActivity {
    private double l, D, d, perimeter, area;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        this.setTitle("Diamond");

        EditText diamondLength = (EditText) findViewById(R.id.diamondLength);
        EditText diamondBigDiag = (EditText) findViewById(R.id.diamondBigDiag);
        EditText diamondSmallDiag = (EditText) findViewById(R.id.diamondSmallDiag);
        TextView diamondRslt = (TextView) findViewById(R.id.diamondRslt);
        Button diamondCalculate = (Button) findViewById(R.id.diamondCalculate);
        diamondCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = Double.parseDouble(diamondLength.getText().toString());
                D = Double.parseDouble(diamondBigDiag.getText().toString());
                d = Double.parseDouble(diamondSmallDiag.getText().toString());
                perimeter = 4 * l;
                area = (D * d) / 2;
                DecimalFormat diamondArea = new DecimalFormat("0.00");
                diamondRslt.setText("Perimeter: " + diamondArea.format(perimeter) + " m" + "\n Area: " + diamondArea.format(area) + " m\u00B2");
            }
        });
    };
}

