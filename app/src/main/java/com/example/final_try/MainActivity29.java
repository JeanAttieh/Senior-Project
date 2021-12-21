package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity29 extends AppCompatActivity {
    private EditText    angleDegree;
    private TextView    ratioRslt, angleRadian;
    private Button      sinBtn, cosBtn, tanBtn;
    private double      sin, cos, tan, degree, radian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main29);
        this.setTitle("Trigonometry ratios");
        angleDegree = findViewById(R.id.angleDegree);
        angleRadian = findViewById(R.id.angleRadian);
        ratioRslt = findViewById(R.id.ratioRslt);

        DecimalFormat radianFormat = new DecimalFormat("0.000000");

        sinBtn = findViewById(R.id.sinBtn);
        sinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                degree = Double.parseDouble(angleDegree.getText().toString());
                angleRadian.setText(degree + " degrees is equal to " + radianFormat.format(degree * 0.0174533) + " radian.");
                sin = Math.sin(Math.toRadians(degree));
                ratioRslt.setText("The sine of " + degree + " is: " + radianFormat.format(sin) + "\nThe sine of " + degree + " in radian is: " + radianFormat.format(Math.sin(degree)));
            }
        });

        cosBtn = findViewById(R.id.cosBtn);
        cosBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                degree = Double.parseDouble(angleDegree.getText().toString());
                angleRadian.setText(degree + " degrees is equal to " + radianFormat.format(degree * 0.0174533) + " radian.");
                cos = Math.cos(Math.toRadians(degree));
                ratioRslt.setText("The cosine of " + degree + " is: " + radianFormat.format(cos) + "\nThe cosine of " + degree + " in radian is: " + radianFormat.format(Math.cos(degree)));
            }
        });

        tanBtn = findViewById(R.id.tanBtn);
        tanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                degree = Double.parseDouble(angleDegree.getText().toString());
                angleRadian.setText(degree + " degrees is equal to " + radianFormat.format(degree * 0.0174533) + " radian.");
                tan = Math.tan(Math.toRadians(degree));
                ratioRslt.setText("The tangent of " + degree + " is: " + radianFormat.format(tan) + "\nThe tangent of " + degree + " in radian is: " + radianFormat.format(Math.tan(degree)));

            }
        });


    }
}