package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity20 extends AppCompatActivity {
    private EditText    sphereVolRadius;
    private TextView    sphereVolRslt;
    private Button      sphereVolCalc;
    private double      radius, volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
        this.setTitle("Sphere");

        sphereVolRadius = findViewById(R.id.sphereVolRadius);
        sphereVolRslt = findViewById(R.id.sphereVolRslt);
        sphereVolCalc = findViewById(R.id.sphereVolCalc);
        sphereVolCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radius = Double.parseDouble(sphereVolRadius.getText().toString());

                volume = (Math.PI * Math.pow(radius,3))* 4/3;
                DecimalFormat sphereVol = new DecimalFormat("0.00");
                sphereVolRslt.setText("Volume: " + sphereVol.format(volume) + " m\u00B3");

            }

        });
    }
}