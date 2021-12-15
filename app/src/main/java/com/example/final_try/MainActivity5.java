package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity5 extends AppCompatActivity {
    private double l, perimeter, area;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        this.setTitle("Square");
        EditText squareLength = (EditText) findViewById(R.id.squareLength);
        TextView squareRslt = (TextView) findViewById(R.id.squareRslt);
        Button calculateSquare = (Button) findViewById(R.id.calculateSquare);
        calculateSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = Double.parseDouble(squareLength.getText().toString());
                perimeter = 4 * l;
                area = l*l;
                DecimalFormat rectangleArea = new DecimalFormat("0.00");
                squareRslt.setText("Perimeter: " + rectangleArea.format(perimeter) + " m" + "\n Area: " + rectangleArea.format(area) + " m\u00B2");
            }
        });


    }
}