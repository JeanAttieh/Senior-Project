package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity53 extends AppCompatActivity {
    private EditText        pressureTemperature, initialPressure;
    private TextView        pressureRslt;
    private Button          pressureCalc;
    private double          t, p0, p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main53);
        this.setTitle("Pressure");

        pressureTemperature = findViewById(R.id.timeDilationSpeed);
        initialPressure = findViewById(R.id.timeDilationTime);
        pressureRslt = findViewById(R.id.timeDilationRslt);
        pressureCalc = findViewById(R.id.timeDilationCalc);
        pressureCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t = Double.parseDouble(pressureTemperature.getText().toString());
                p0 = Double.parseDouble(initialPressure.getText().toString());

                p = p0 * (1 + (t/273));
                DecimalFormat value = new DecimalFormat("0.000000");
                pressureRslt.setText("\nPressure (p) is: " + value.format(p) + " Pa.");
            }
        });
    }
}