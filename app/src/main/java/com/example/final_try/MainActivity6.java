package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity6 extends AppCompatActivity {
    private double l, w, perimeter, area;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        this.setTitle("Rectangle");
        EditText rectLength = (EditText) findViewById(R.id.rectLength);
        EditText rectWidth = (EditText) findViewById(R.id.rectWidth);
        TextView rectangleRslt = (TextView) findViewById(R.id.rectangleRslt);
        Button calculateRectangle = (Button) findViewById(R.id.calculateRectangle);
        calculateRectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = Double.parseDouble(rectLength.getText().toString());
                w = Double.parseDouble(rectWidth.getText().toString());
                perimeter = (2*w) + (2*l);
                area = w*l;
                DecimalFormat rectangleArea = new DecimalFormat("0.00");
                rectangleRslt.setText("Perimeter: " + rectangleArea.format(perimeter) + " m" + "\n Area: " + rectangleArea.format(area) + " m\u00B2");
            }
        });


    }
}