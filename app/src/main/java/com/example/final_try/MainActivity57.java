package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity57 extends AppCompatActivity {
    private Button      soundSpeedCalc;
    private EditText    soundSpeedTemperature;
    private TextView    soundSpeedRslt;
    private double      temperature, v;

    public MainActivity57() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main57);
        this.setTitle("Sound speed");

        soundSpeedTemperature = findViewById(R.id.timeDilationSpeed);
        soundSpeedRslt = findViewById(R.id.timeDilationRslt);
        soundSpeedCalc = findViewById(R.id.timeDilationCalc);
        soundSpeedCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                temperature = Double.parseDouble(soundSpeedTemperature.getText().toString());
                v = 331.4 + (0.61 * temperature);

                DecimalFormat value = new DecimalFormat("0.00");
                soundSpeedRslt.setText("\nSound speed (v) is: " + value.format(v) + " m/s.");
            }
        });

    }
}