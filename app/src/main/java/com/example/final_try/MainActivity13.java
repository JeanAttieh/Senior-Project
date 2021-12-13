package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity13 extends AppCompatActivity {
 private    EditText    radiusSphere;
 private    TextView    sphereRslt;
 private    Button      sphereCalculate;
 private    double      r, area;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        radiusSphere = findViewById(R.id.radiusSphere);
        sphereRslt = findViewById(R.id.squareRslt);
        sphereCalculate = findViewById(R.id.sphereCalculate);
        sphereCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r = Double.parseDouble(radiusSphere.getText().toString());
                area = 4 * Math.PI * Math.pow(r,2);

                DecimalFormat sphereArea = new DecimalFormat("0.00");
                sphereRslt.setText("Area: " + sphereArea.format(area) + " m\u00b2");
            }
        });

    }
}