package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
    private Button square, rectangle, triangle, diamond, trapezoid, regularPolygon, circle, cone, sphere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        this.setTitle("Areas and perimeters");

        square = findViewById(R.id.square);
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity5.class);
                startActivity(startIntent);
            }
        });

        rectangle = findViewById(R.id.rectangle);
        rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(startIntent);
            }
        });

        triangle = findViewById(R.id.triangle);
        triangle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity7.class);
                startActivity(startIntent);
            }
        });

        diamond = findViewById(R.id.diamond);
        diamond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity8.class);
                startActivity(startIntent);
            }
        });

        trapezoid = findViewById(R.id.trapezoid);
        trapezoid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity9.class);
                startActivity(startIntent);
            }
        });

        regularPolygon = findViewById(R.id.regularPolygon);
        regularPolygon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity10.class);
                startActivity(startIntent);
            }
        });

        circle = findViewById(R.id.circle);
        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity11.class);
                startActivity(startIntent);
            }
        });

        cone = findViewById(R.id.cone);
        cone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity12.class);
                startActivity(startIntent);

            }
        });

        sphere = findViewById(R.id.sphere);
        sphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity13.class);
                startActivity(startIntent);
            }
        });

    }
}