package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity10 extends AppCompatActivity {
    private double area, a, perimeter, l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        this.setTitle("Regular polygon");

        EditText polygonLength = (EditText) findViewById(R.id.polygonLength);
        EditText polygonApothem = (EditText) findViewById(R.id.polygonApothem);
        TextView polygonRslt = (TextView) findViewById(R.id.polygonRslt);
        Button polygonCalculate = (Button) findViewById(R.id.polygonCalculate);
        polygonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = Double.parseDouble(polygonLength.getText().toString());
                a = Double.parseDouble(polygonApothem.getText().toString());
                perimeter = l * 8;
                area = (perimeter / 2) * a;
                DecimalFormat polygonArea = new DecimalFormat("0.00");
                polygonRslt.setText("Perimeter: " + polygonArea.format(perimeter) + " m" +"\nArea: " + polygonArea.format(area) + " m\u00B2");
            }
        });
    }
}