package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity7 extends AppCompatActivity {
    private double a, b, c, h, perimeter, area;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        this.setTitle("Triangle");

        EditText triangleFirstSide = (EditText) findViewById(R.id.triangleFirstSide);
        EditText triangleBase = (EditText) findViewById(R.id.triangleBase);
        EditText triangleSecondSide = (EditText) findViewById(R.id.triangleSecondSide);
        EditText triangleHeight = (EditText) findViewById(R.id.triangleHeight);
        TextView triangleRslt = (TextView) findViewById(R.id.triangleRslt);
        Button triangleCalculate = (Button) findViewById(R.id.triangleCalculate);
        triangleCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Double.parseDouble(triangleFirstSide.getText().toString());
                b = Double.parseDouble(triangleBase.getText().toString());
                c = Double.parseDouble(triangleSecondSide.getText().toString());
                h = Double.parseDouble(triangleHeight.getText().toString());
                perimeter = a + b + c;
                area = (b * h) / 2;
                DecimalFormat triangleArea = new DecimalFormat("0.00");
                triangleRslt.setText("Perimeter: " + triangleArea.format(perimeter) + " m" + "\n Area: " + triangleArea.format(area) + " m\u00B2");
            }
        });
    };
}

