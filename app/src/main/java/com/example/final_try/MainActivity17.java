package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity17 extends AppCompatActivity {
    private EditText    prismVolHeight, prismVolBase;
    private TextView    prismVolRslt;
    private Button      prismVolCalc;
    private double      h, b, volume;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        this.setTitle("Prism");

        prismVolBase = findViewById(R.id.prismVolBase);
        prismVolHeight = findViewById(R.id.prismVolHeight);
        prismVolRslt = findViewById(R.id.prismVolRslt);
        prismVolCalc = findViewById(R.id.prismVolCalc);
        prismVolCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             h = Double.parseDouble(prismVolHeight.getText().toString());
             b = Double.parseDouble(prismVolBase.getText().toString());

             volume = h * b;
             DecimalFormat prismVolume = new DecimalFormat("0.00");
             prismVolRslt.setText("Volume: " + prismVolume.format(volume) + " m\u00b3");
            }
        });
    }
}