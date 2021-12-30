package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity59 extends AppCompatActivity {
    private Button  periodicTable, definition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main59);
        this.setTitle("Chemistry");

        periodicTable = findViewById(R.id.periodicTable);
        periodicTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity60.class);
                startActivity(startIntent);
            }
        });

        definition = findViewById(R.id.definition);
        definition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity61.class);
                startActivity(startIntent);
            }
        });
    }
}