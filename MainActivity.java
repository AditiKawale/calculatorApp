package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{


    private EditText et1,et2,et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         et1 = (EditText) findViewById(R.id.editTextNumber);
         et2 = (EditText) findViewById(R.id.editTextNumber2);
         et3 = (EditText) findViewById(R.id.editTextNumber3);


    }
        public void add(View v){

            
            int n1=Integer.parseInt(et1.getText().toString());
            int n2=Integer.parseInt(et2.getText().toString());
            int result=n1+n2;

            et3.setText("Total value" + result);

        }

        public void subtract(View v){


            int n1=Integer.parseInt(et1.getText().toString());
            int n2=Integer.parseInt(et2.getText().toString());
            int result=n1-n2;

            et3.setText("Subtract value" + result);

        }

        public void multiply(View v){

            int n1=Integer.parseInt(et1.getText().toString());
            int n2=Integer.parseInt(et2.getText().toString());
            int result=n1*n2;

            et3.setText("Multiply value" + result);

        }

        public void divide(View v){


            int n1=Integer.parseInt(et1.getText().toString());
            int n2=Integer.parseInt(et2.getText().toString());
            int result=n1/n2;

            et3.setText("Divide value" + result);

        }





}




