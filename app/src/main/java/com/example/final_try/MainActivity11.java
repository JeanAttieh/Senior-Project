package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity11 extends AppCompatActivity {
    private double area, perimeter, radius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        this.setTitle("Circle");

        EditText circleRadius = (EditText) findViewById(R.id.circleRadius);
        TextView circleRslt = (TextView) findViewById(R.id.circleRslt);
        Button circleCalculate = (Button) findViewById(R.id.circleCalculate);
        circleCalculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                radius = Double.parseDouble(circleRadius.getText().toString());
                perimeter = 2 * Math.PI * radius;
                area = Math.PI * Math.pow(radius,2);
                DecimalFormat circleArea = new DecimalFormat("0.00");
                circleRslt.setText("Perimeter: " + circleArea.format(perimeter) + " m" + "\nArea: " + circleArea.format(area) + " m\u00B2");
            }
        });
    }
}






