package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultLabel;
    EditText editText;
    Button resultButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultLabel = findViewById(R.id.textView);
        editText = findViewById(R.id.editTextText);
        resultButton = findViewById(R.id.button);

        editText.setText("");

        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputText = editText.getText().toString();

                double kilo = Double.parseDouble(inputText);

                double pounds = conversion(kilo);

                resultLabel.setText("" + pounds);
            }
        });

    }

    double conversion(double kilo) {
        return kilo * 2.20462;

    }
}