package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;
import java.text.DecimalFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity18 extends AppCompatActivity {
    private EditText    cylinderVolRadius, cylinderVolHeight;
    private TextView    cylinderVolRslt;
    private Button      cylinderVolCalc;
    private double      radius, height, volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);

        cylinderVolHeight = findViewById(R.id.cylinderVolHeight);
        cylinderVolRadius = findViewById(R.id.cylinderVolRadius);
        cylinderVolRslt = findViewById(R.id.cylinderVolRslt);
        cylinderVolCalc = findViewById(R.id.cylinderVolCalc);
        cylinderVolCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radius = Double.parseDouble(cylinderVolRadius.getText().toString());
                height = Double.parseDouble(cylinderVolHeight.getText().toString());

                volume = (Math.PI * Math.pow(radius,2)) * height;

                DecimalFormat cylinderVolume = new DecimalFormat("0.00");
                cylinderVolRslt.setText("Volume: " + cylinderVolume.format(volume));
            }
        });


    }
}