package com.example.highestnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText skaiciusEditText;
    EditText skaiciusEditText2;
    Button rezultatasButton;
    TextView atsakymasTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        skaiciusEditText = findViewById(R.id.skaiciusEditText);
        skaiciusEditText2 = findViewById(R.id.skaiciusEditText2);
        rezultatasButton = findViewById(R.id.rezultatasButton);
        atsakymasTextView = findViewById(R.id.atsakymasTextView);


        rezultatasButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)   {
                int firstNumber = Integer.parseInt(skaiciusEditText.getText().toString());
                int secondNumber = Integer.parseInt(skaiciusEditText2.getText().toString());


                if (firstNumber > secondNumber) {
                    atsakymasTextView.setText("Pirmas skaicius didesnis");
                } else if (firstNumber < secondNumber) {
                    atsakymasTextView.setText("Antras skaicius didesnis");

                } else {
                    atsakymasTextView.setText("Skaiciai vienodi");
                }





            }
        } );
    } }

