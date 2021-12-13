package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity15 extends AppCompatActivity {
    private EditText cubeVolLength;
    private TextView cubeVolRslt;
    private Button cubeVolCalc;
    private double l, volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        this.setTitle("Cube");

        cubeVolLength = findViewById(R.id.cubeVolLength);
        cubeVolRslt = findViewById(R.id.cubeVolRslt);
        cubeVolCalc = findViewById(R.id.cubeVolCalc);
        cubeVolCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = Double.parseDouble(cubeVolLength.getText().toString());
                volume = Math.pow(l, 3);
                DecimalFormat cubeVol = new DecimalFormat("0.00");
                cubeVolRslt.setText("Volume: " + cubeVol.format(volume) + " m\u00B3");
            }
        });


    }
}