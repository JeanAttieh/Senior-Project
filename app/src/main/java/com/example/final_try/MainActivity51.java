package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity51 extends AppCompatActivity {
    private Button      angledProjectileCalc;
    private EditText    angledProjectileAngle, angledProjectileVelocity;
    private TextView    angledProjectileRslt;
    private double      angle, velocity, H, L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main51);
        this.setTitle("Angled projectile");

        angledProjectileAngle = findViewById(R.id.timeDilationTime);
        angledProjectileVelocity = findViewById(R.id.timeDilationSpeed);
        angledProjectileRslt = findViewById(R.id.timeDilationRslt);
        angledProjectileCalc = findViewById(R.id.timeDilationCalc);
        angledProjectileCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angle = Double.parseDouble(angledProjectileAngle.getText().toString());
                velocity = Double.parseDouble(angledProjectileVelocity.getText().toString());

                H = (Math.pow(velocity,2) * Math.pow(Math.sin(Math.toRadians(angle)),2)) / (2 * 9.8);
                L = (Math.pow(velocity,2) * Math.sin(Math.toRadians(2 * angle))) / 9.8;

                DecimalFormat value = new DecimalFormat("0.000000");
                angledProjectileRslt.setText("\nMaximum height (H) is: " + value.format(H) + " m.\n\nMaximum distance (L) is: " + value.format(L) + " m.");
            }
        });

    }
}