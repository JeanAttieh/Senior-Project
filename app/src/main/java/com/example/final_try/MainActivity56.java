package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity56 extends AppCompatActivity {
    private Button      relativisticMassCalc;
    private EditText    relativisticMassSpeed, relativisticMassRestMass;
    private TextView    relativisticMassRslt;
    private double      v, restMass, m, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main56);
        this.setTitle("Relativistic mass");

        relativisticMassSpeed = findViewById(R.id.timeDilationSpeed);
        relativisticMassRestMass = findViewById(R.id.timeDilationTime);
        relativisticMassRslt = findViewById(R.id.timeDilationRslt);
        relativisticMassCalc = findViewById(R.id.timeDilationCalc);
        relativisticMassCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                v = Double.parseDouble(relativisticMassSpeed.getText().toString());
                restMass = Double.parseDouble(relativisticMassRestMass.getText().toString());
                c = 3 * Math.pow(10,8);
                m = restMass / (Math.sqrt(1 - (Math.pow(v,2) / Math.pow(c,2))));

                DecimalFormat value = new DecimalFormat("0.00");
                relativisticMassRslt.setText("\nRelativistic mass (m) is: " + value.format(m) + " KG.");
            }
        });
    }
}