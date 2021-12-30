package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity55 extends AppCompatActivity {
    private Button      linearExpansionCalc;
    private EditText    linearExpansionLength, linearExpansionTemperature, linearExpansionCoefficient;
    private TextView    linearExpansionRslt;
    private double      length, temperature, coefficient, changeOfLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main55);
        this.setTitle("Linear expansion");

        linearExpansionLength = findViewById(R.id.timeDilationSpeed);
        linearExpansionTemperature = findViewById(R.id.timeDilationTime);
        linearExpansionCoefficient = findViewById(R.id.linearExpansionCoefficient);
        linearExpansionRslt = findViewById(R.id.timeDilationRslt);
        linearExpansionCalc = findViewById(R.id.timeDilationCalc);
        linearExpansionCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                length = Double.parseDouble(linearExpansionLength.getText().toString());
                temperature = Double.parseDouble(linearExpansionTemperature.getText().toString());
                coefficient = Double.parseDouble(linearExpansionCoefficient.getText().toString());

                changeOfLength = length * temperature * coefficient;
                DecimalFormat value = new DecimalFormat("0.00");

                linearExpansionRslt.setText("\nChange of length (\u0394l) is: " + value.format(changeOfLength) + " m.");
            }
        });
    }
}