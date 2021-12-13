package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity19 extends AppCompatActivity {
    private EditText coneVolRadius, coneVolHeight;
    private TextView coneVolRslt;
    private Button coneVolCalc;
    private double radius, height, volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);
        this.setTitle("Cone");

        coneVolRadius = findViewById(R.id.coneVolRadius);
        coneVolHeight = findViewById(R.id.coneVolHeight);
        coneVolRslt = findViewById(R.id.coneVolRslt);
        coneVolCalc = findViewById(R.id.coneVolCalc);
        coneVolCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radius = Double.parseDouble(coneVolRadius.getText().toString());
                height = Double.parseDouble(coneVolHeight.getText().toString());

                volume = (Math.PI * Math.pow(radius, 2) * height) / 3;
                DecimalFormat coneVol = new DecimalFormat("0.00");
                coneVolRslt.setText(String.format("Volume: " + coneVol.format(volume) + " m\u00B3"));
            }
        });


    }
}