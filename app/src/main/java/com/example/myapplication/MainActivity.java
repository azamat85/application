package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;
    private EditText namber_1;
    private EditText namber_2;
    private Button addbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTextView = findViewById(R.id.resultTextView);
        namber_1 = findViewById(R.id.namber_1);
        namber_2 = findViewById(R.id.namber_2);
        addbutton = findViewById(R.id.addbutton);

        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1= Float.parseFloat(namber_1.getText().toString());
                float num2= Float.parseFloat(namber_2.getText().toString());
                float res= num1+num2;
                resultTextView.setText(String.valueOf(res));
            }
        });
    }
}