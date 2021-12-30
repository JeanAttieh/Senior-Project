package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity50 extends AppCompatActivity {

    private EditText    freeFallingHeight;
    private TextView    freeFallingRslt;
    private Button      freeFallingCalc;
    private double      t, vel, h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main50);
        this.setTitle("Free falling");

        freeFallingHeight = findViewById(R.id.timeDilationSpeed);
        freeFallingRslt = findViewById(R.id.timeDilationRslt);
        freeFallingCalc = findViewById(R.id.timeDilationCalc);

        freeFallingCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                h = Double.parseDouble(freeFallingHeight.getText().toString());
                t = Math.sqrt((2 * h) / 9.8);
                vel = Math.sqrt(2 * h * 9.8);
                DecimalFormat value = new DecimalFormat("0.000000");
                freeFallingRslt.setText("\nTime to touchdown (t): " + value.format(t) + " s." + "\n\nTouchdown velocity (v): " + value.format(vel) + " m/s.");
            }
        });



    }
}