package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity12 extends AppCompatActivity {
    private EditText slantCone, radiusCone;
    private TextView coneRslt;
    private Button coneCalculate;
    private double slant, radius, area, perimeter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        this.setTitle("Cone");

        slantCone = (EditText) findViewById(R.id.slantCone);
        radiusCone = (EditText) findViewById(R.id.radiusCone);
        coneRslt = (TextView) findViewById(R.id.coneRslt);
        coneCalculate = (Button) findViewById(R.id.coneCalculate);
        coneCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slant = Double.parseDouble(slantCone.getText().toString());
                radius = Double.parseDouble(radiusCone.getText().toString());
                perimeter = Math.PI * 2 * radius;
                area = Math.PI * radius * slant;
                DecimalFormat coneArea = new DecimalFormat("0.00");
                coneRslt.setText("Perimeter: " + coneArea.format(perimeter) + " m" + "\nArea:" + coneArea.format(area) + " m\u00B2");

            }
        });


    }
}