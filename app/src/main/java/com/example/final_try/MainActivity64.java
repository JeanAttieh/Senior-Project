package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity64 extends AppCompatActivity {
    private Spinner     spinnerFrom, spinnerTo;
    private EditText    valueToConv;
    private TextView    convRslt;
    private ImageButton convBtn;
    private double      value, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main64);
        this.setTitle("Data unit converter");

        spinnerFrom = findViewById(R.id.spinnerFrom);
        spinnerTo = findViewById(R.id.spinnerTo);
        valueToConv = findViewById(R.id.valueToConv);
        convRslt = findViewById(R.id.convRslt);
        convBtn = findViewById(R.id.convBtn);

        String[] dataUnitList = {"Bit", "Byte", "Kilobyte", "Megabyte", "Gigabyte", "Terabyte"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,dataUnitList);
        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);

        DecimalFormat conversion = new DecimalFormat("###,###,###,###.####################");

        convBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value = Double.parseDouble(valueToConv.getText().toString());



                // bit
                if (spinnerFrom.getSelectedItem().toString() == "Bit" && spinnerTo.getSelectedItem().toString() == "Bit"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Bit" && spinnerTo.getSelectedItem().toString() == "Byte"){
                    result = value * 0.125;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Bit" && spinnerTo.getSelectedItem().toString() == "Kilobyte"){
                    result = value * 0.0001220703125;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Bit" && spinnerTo.getSelectedItem().toString() == "Megabyte"){
                    result = value * 0.000000119292896;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Bit" && spinnerTo.getSelectedItem().toString() == "Gigabyte"){
                    result = value * 0.0000000001164153218;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Bit" && spinnerTo.getSelectedItem().toString() == "Terabyte"){
                    result = value * 0.0000000000001136868377;
                    convRslt.setText(conversion.format(result));
                }



                // byte
                if (spinnerFrom.getSelectedItem().toString() == "Byte" && spinnerTo.getSelectedItem().toString() == "Bit"){
                    result = value * 8;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Byte" && spinnerTo.getSelectedItem().toString() == "Byte"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Byte" && spinnerTo.getSelectedItem().toString() == "Kilobyte"){
                    result = value * 0.0009765625;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Byte" && spinnerTo.getSelectedItem().toString() == "Megabyte"){
                    result = value * 0.0000009536743164;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Byte" && spinnerTo.getSelectedItem().toString() == "Gigabyte"){
                    result = value * 0.0000000009313225746;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Byte" && spinnerTo.getSelectedItem().toString() == "Terabyte"){
                    result = value * 0.0000000000009094947018;
                    convRslt.setText(conversion.format(result));
                }



                // kilobyte
                if (spinnerFrom.getSelectedItem().toString() == "Kilobyte" && spinnerTo.getSelectedItem().toString() == "Bit"){
                    result = value * 8192;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilobyte" && spinnerTo.getSelectedItem().toString() == "Byte"){
                    result = value * 1024;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilobyte" && spinnerTo.getSelectedItem().toString() == "Kilobyte"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilobyte" && spinnerTo.getSelectedItem().toString() == "Megabyte"){
                    result = value * 0.0009765625;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilobyte" && spinnerTo.getSelectedItem().toString() == "Gigabyte"){
                    result = value * 0.0000009536743164;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Kilobyte" && spinnerTo.getSelectedItem().toString() == "Terabyte"){
                    result = value * 0.0000000009313225746;
                    convRslt.setText(conversion.format(result));
                }



                // megabyte
                if (spinnerFrom.getSelectedItem().toString() == "Megabyte" && spinnerTo.getSelectedItem().toString() == "Bit"){
                    result = value * 8388608;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Megabyte" && spinnerTo.getSelectedItem().toString() == "Byte"){
                    result = value * 1048576;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Megabyte" && spinnerTo.getSelectedItem().toString() == "Kilobyte"){
                    result = value * 1024;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Megabyte" && spinnerTo.getSelectedItem().toString() == "Megabyte"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Megabyte" && spinnerTo.getSelectedItem().toString() == "Gigabyte"){
                    result = value * 0.0009765625;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Megabyte" && spinnerTo.getSelectedItem().toString() == "Terabyte"){
                    result = value * 0.0000009536743164;
                    convRslt.setText(conversion.format(result));
                }



                // gigabyte
                if (spinnerFrom.getSelectedItem().toString() == "Gigabyte" && spinnerTo.getSelectedItem().toString() == "Bit"){
                    result = value * 858993459.2 * 10;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Gigabyte" && spinnerTo.getSelectedItem().toString() == "Byte"){
                    result = value * 1073741824;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Gigabyte" && spinnerTo.getSelectedItem().toString() == "Kilobyte"){
                    result = value * 1048576;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Gigabyte" && spinnerTo.getSelectedItem().toString() == "Megabyte"){
                    result = value * 1024;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Gigabyte" && spinnerTo.getSelectedItem().toString() == "Gigabyte"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Gigabyte" && spinnerTo.getSelectedItem().toString() == "Terabyte"){
                    result = value * 0.0009765625;
                    convRslt.setText(conversion.format(result));
                }



                // terabyte
                if (spinnerFrom.getSelectedItem().toString() == "Terabyte" && spinnerTo.getSelectedItem().toString() == "Bit"){
                    result = value * 879609302.2 * 1000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Terabyte" && spinnerTo.getSelectedItem().toString() == "Byte"){
                    result = value * 1099511628 * 1000;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Terabyte" && spinnerTo.getSelectedItem().toString() == "Kilobyte"){
                    result = value * 1073741824;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Terabyte" && spinnerTo.getSelectedItem().toString() == "Megabyte"){
                    result = value * 1048576;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Terabyte" && spinnerTo.getSelectedItem().toString() == "Gigabyte"){
                    result = value * 1024;
                    convRslt.setText(conversion.format(result));
                }

                else if (spinnerFrom.getSelectedItem().toString() == "Terabyte" && spinnerTo.getSelectedItem().toString() == "Terabyte"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }
            }
        });


    }
}