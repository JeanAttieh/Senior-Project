package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity54 extends AppCompatActivity {
    private EditText    attractiveForceMass1,attractiveForceMass2, attractiveForceDistance;
    private TextView    attractiveForceRslt;
    private Button      attractiveForceCalc;
    private double      m1, m2, distance, F;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main54);
        this.setTitle("Attractive force");

        attractiveForceMass1 = findViewById(R.id.timeDilationSpeed);
        attractiveForceMass2 = findViewById(R.id.timeDilationTime);
        attractiveForceDistance = findViewById(R.id.linearExpansionCoefficient);
        attractiveForceRslt = findViewById(R.id.timeDilationRslt);
        attractiveForceCalc = findViewById(R.id.timeDilationCalc);
        attractiveForceCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m1 = Double.parseDouble(attractiveForceMass1.getText().toString());
                m2 = Double.parseDouble(attractiveForceMass2.getText().toString());
                distance = Double.parseDouble(attractiveForceDistance.getText().toString());

                F = (m1 * m2) / (Math.pow(distance,2)) * (6.67 * Math.pow(10,-11));
                DecimalFormat value = new DecimalFormat("0.00000000000");
                attractiveForceRslt.setText("\nAttractive force (F) is: " + value.format(F) + " N.");
            }
        });
    }
}