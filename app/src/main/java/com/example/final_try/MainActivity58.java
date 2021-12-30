package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity58 extends AppCompatActivity {
    private Button      timeDilationCalc;
    private EditText    timeDilationSpeed, timeDilationTime;
    private TextView    timeDilationRslt;
    private double      v, properTime, timeInterval, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main58);
        this.setTitle("Time dilation");

        timeDilationSpeed = findViewById(R.id.timeDilationSpeed);
        timeDilationTime = findViewById(R.id.timeDilationTime);
        timeDilationRslt = findViewById(R.id.timeDilationRslt);
        timeDilationCalc = findViewById(R.id.timeDilationCalc);
        timeDilationCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                v = Double.parseDouble(timeDilationSpeed.getText().toString());
                properTime = Double.parseDouble(timeDilationTime.getText().toString());
                c = 3 * Math.pow(10,8);

                timeInterval = properTime / (Math.sqrt(1 - (Math.pow(v,2) / Math.pow(c,2))));
                DecimalFormat value = new DecimalFormat("0.00");

                timeDilationRslt.setText("\nObserved time interval (\u0394t) is: " + value.format(timeInterval) + " s.");
            }
        });
    }
}