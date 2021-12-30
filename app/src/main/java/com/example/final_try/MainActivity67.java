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

public class MainActivity67 extends AppCompatActivity {
    private Spinner     spinnerFrom, spinnerTo;
    private ImageButton convBtn;
    private EditText    valueToConv;
    private TextView    convRslt;
    private double      value, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main67);
        this.setTitle("Power unit converter");

        spinnerFrom = findViewById(R.id.spinnerFrom);
        spinnerTo = findViewById(R.id.spinnerTo);
        convRslt = findViewById(R.id.convRslt);
        convBtn = findViewById(R.id.convBtn);
        valueToConv = findViewById(R.id.valueToConv);

        String [] powerUnitList= {"Btu/h", "Horse power", "Kilowatt", "Watt", "Ton of refrigeration"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,powerUnitList);

        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);
        DecimalFormat conversion = new DecimalFormat("###,###.##########");
        convBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value = Double.parseDouble(valueToConv.getText().toString());




                // btu/h
                if (spinnerFrom.getSelectedItem().toString() == "Btu/h" && spinnerTo.getSelectedItem().toString() == "Btu/h"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if(spinnerFrom.getSelectedItem().toString() == "Btu/h" && spinnerTo.getSelectedItem().toString() == "Horse power"){
                    result = value * 0.0003984656256;
                    convRslt.setText(conversion.format(result));
                }

                else if(spinnerFrom.getSelectedItem().toString() == "Btu/h" && spinnerTo.getSelectedItem().toString() == "Kilowatt"){
                    result = value * 0.0002930710703;
                    convRslt.setText(conversion.format(result));
                }

                else if(spinnerFrom.getSelectedItem().toString() == "Btu/h" && spinnerTo.getSelectedItem().toString() == "Watt"){
                    result = value * 0.2930710703;
                    convRslt.setText(conversion.format(result));
                }

                else if(spinnerFrom.getSelectedItem().toString() == "Btu/h" && spinnerTo.getSelectedItem().toString() == "Ton of refrigeration"){
                    result = value * 0.00008333333336;
                    convRslt.setText(conversion.format(result));
                }



                // horse power
                if (spinnerFrom.getSelectedItem().toString() == "Horse power" && spinnerTo.getSelectedItem().toString() == "Btu/h"){
                    result = value * 2509.626768;
                    convRslt.setText(conversion.format(result));
                }

                else if(spinnerFrom.getSelectedItem().toString() == "Horse power" && spinnerTo.getSelectedItem().toString() == "Horse power"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if(spinnerFrom.getSelectedItem().toString() == "Horse power" && spinnerTo.getSelectedItem().toString() == "Kilowatt"){
                    result = value * 0.7354990028;
                    convRslt.setText(conversion.format(result));
                }

                else if(spinnerFrom.getSelectedItem().toString() == "Horse power" && spinnerTo.getSelectedItem().toString() == "Watt"){
                    result = value * 735.4990028;
                    convRslt.setText(conversion.format(result));
                }

                else if(spinnerFrom.getSelectedItem().toString() == "Horse power" && spinnerTo.getSelectedItem().toString() == "Ton of refrigeration"){
                    result = value * 0.2091355641;
                    convRslt.setText(conversion.format(result));
                }



                // kilowatt
                if (spinnerFrom.getSelectedItem().toString() == "Kilowatt" && spinnerTo.getSelectedItem().toString() == "Btu/h"){
                    result = value * 3412.141632;
                    convRslt.setText(conversion.format(result));
                }

                else if(spinnerFrom.getSelectedItem().toString() == "Kilowatt" && spinnerTo.getSelectedItem().toString() == "Horse power"){
                    result = value * 1.35962115;
                    convRslt.setText(conversion.format(result));
                }

                else if(spinnerFrom.getSelectedItem().toString() == "Kilowatt" && spinnerTo.getSelectedItem().toString() == "Kilowatt"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if(spinnerFrom.getSelectedItem().toString() == "Kilowatt" && spinnerTo.getSelectedItem().toString() == "Watt"){
                    result = value * 1000;
                    convRslt.setText(conversion.format(result));
                }

                else if(spinnerFrom.getSelectedItem().toString() == "Kilowatt" && spinnerTo.getSelectedItem().toString() == "Ton of refrigeration"){
                    result = value * 0.2843451361;
                    convRslt.setText(conversion.format(result));
                }



                // watt
                if (spinnerFrom.getSelectedItem().toString() == "Watt" && spinnerTo.getSelectedItem().toString() == "Btu/h"){
                    result = value * 3.412141632;
                    convRslt.setText(conversion.format(result));
                }

                else if(spinnerFrom.getSelectedItem().toString() == "Watt" && spinnerTo.getSelectedItem().toString() == "Horse power"){
                    result = value * 0.00135962115;
                    convRslt.setText(conversion.format(result));
                }

                else if(spinnerFrom.getSelectedItem().toString() == "Watt" && spinnerTo.getSelectedItem().toString() == "Kilowatt"){
                    result = value * 0.001;
                    convRslt.setText(conversion.format(result));
                }

                else if(spinnerFrom.getSelectedItem().toString() == "Watt" && spinnerTo.getSelectedItem().toString() == "Watt"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }

                else if(spinnerFrom.getSelectedItem().toString() == "Watt" && spinnerTo.getSelectedItem().toString() == "Ton of refrigeration"){
                    result = value * 0.0002843451361;
                    convRslt.setText(conversion.format(result));
                }


                // ton of refrigeration
                if (spinnerFrom.getSelectedItem().toString() == "Ton of refrigeration" && spinnerTo.getSelectedItem().toString() == "Btu/h"){
                    result = value * 12000;
                    convRslt.setText(conversion.format(result));
                }

                else if(spinnerFrom.getSelectedItem().toString() == "Ton of refrigeration" && spinnerTo.getSelectedItem().toString() == "Horse power"){
                    result = value * 4.781587505;
                    convRslt.setText(conversion.format(result));
                }

                else if(spinnerFrom.getSelectedItem().toString() == "Ton of refrigeration" && spinnerTo.getSelectedItem().toString() == "Kilowatt"){
                    result = value * 3.516852842;
                    convRslt.setText(conversion.format(result));
                }

                else if(spinnerFrom.getSelectedItem().toString() == "Ton of refrigeration" && spinnerTo.getSelectedItem().toString() == "Watt"){
                    result = value * 3516.852842;
                    convRslt.setText(conversion.format(result));
                }

                else if(spinnerFrom.getSelectedItem().toString() == "Ton of refrigeration" && spinnerTo.getSelectedItem().toString() == "Ton of refrigeration"){
                    result = value;
                    convRslt.setText(conversion.format(result));
                }
            }
        });
    }
}