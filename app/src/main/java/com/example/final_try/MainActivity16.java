package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity16 extends AppCompatActivity {
    private EditText cuboidVolLength, cuboidVolHeight, cuboidVolDepth;
    private TextView cuboidVolRslt;
    private Button cuboidVolCalc;
    private double length, height, depth, volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        this.setTitle("Cuboid");
        cuboidVolLength = findViewById(R.id.cuboidVolLength);
        cuboidVolHeight = findViewById(R.id.cuboidVolHeight);
        cuboidVolDepth = findViewById(R.id.cuboidVolDepth);
        cuboidVolRslt = findViewById(R.id.cuboidVolRslt);
        cuboidVolCalc = findViewById(R.id.cuboidVolCalc);
        cuboidVolCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                length = Double.parseDouble(cuboidVolLength.getText().toString());
                height = Double.parseDouble(cuboidVolHeight.getText().toString());
                depth = Double.parseDouble(cuboidVolDepth.getText().toString());

                volume = length * height * depth;
                DecimalFormat cuboidVol = new DecimalFormat("0.00");
                cuboidVolRslt.setText("Volume: " + cuboidVol.format(volume) + " m\u00B3");

            }
        });


    }
}