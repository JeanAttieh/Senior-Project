package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity52 extends AppCompatActivity {
    private Button      slidingMotionCalc;
    private EditText    slidingMotionAngle, slidingMotionCoefficient;
    private TextView    slidingMotionRslt;
    private double      angle, coefficient, a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main52);
        this.setTitle("Sliding motion");

        slidingMotionAngle = findViewById(R.id.timeDilationSpeed);
        slidingMotionCoefficient = findViewById(R.id.timeDilationTime);
        slidingMotionRslt = findViewById(R.id.timeDilationRslt);
        slidingMotionCalc = findViewById(R.id.timeDilationCalc);
        slidingMotionCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angle = Double.parseDouble(slidingMotionAngle.getText().toString());
                coefficient = Double.parseDouble(slidingMotionCoefficient.getText().toString());

                a = 9.8 * (Math.sin(Math.toRadians(angle)) - (coefficient * Math.cos(Math.toRadians(angle))));
                DecimalFormat value = new DecimalFormat("0.000000");

                slidingMotionRslt.setText("\nAcceleration (a) is: " + value.format(a) + " m/s\u00b2.");
            }
        });
    }
}