package com.example.assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radio_group);
        btn1 = findViewById(R.id.submit);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRadioButtoId = radioGroup.getCheckedRadioButtonId();
                if(selectedRadioButtoId != -1){
                    radioButton  =findViewById(selectedRadioButtoId);
                    String result =  radioButton.getText().toString();
                    Toast.makeText(MainActivity.this, "You setected  " +result, Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "not selected" , Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}