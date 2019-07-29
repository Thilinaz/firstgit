package com.example.student.intentsproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //public variables
    private EditText num1, num2; //references
    private TextView display; //display answer
    String input1, input2, displayAns; //store values
    private int n1, n2, ans; //calculations

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1 = findViewById(R.id.txtNum1);
        num2 = findViewById(R.id.txtNum2);
        display = findViewById(R.id.txtAns);

        Intent intent = getIntent(); //get intent from First activity

        input1 = intent.getStringExtra(FirstActivity.NUMBER_1);
        input2 = intent.getStringExtra(FirstActivity.NUMBER_2);

        num1.setText(input1);
        num2.setText(input2);

        n1 = Integer.parseInt(input1);
        n2 = Integer.parseInt(input2);

    } //end of onCreate method

    //button methods

    //additon
    public void Addition(View view) {
        ans = n1 + n2;
        displayAns = input1 + "+" + input2 + "=" + ans;
        displayAnswer(displayAns);
    }

    //subtraction
    public void Substraction(View view) {
        ans = n1 - n2;
        displayAns = input1 + "-" + input2 + "=" + ans;
        displayAnswer(displayAns);
    }

    //multiplication
    public void Multiplication(View view) {
        ans = n1 * n2;
        displayAns = input1 + "*" + input2 + "=" + ans;
        displayAnswer(displayAns);
    }

    //divison
    public void Division(View view) {
        ans = n1 / n2;
        displayAns = input1 + "/" + input2 + "=" + ans;
        displayAnswer(displayAns);
    }

    //display Answer
    public void displayAnswer(String displayAns){
        display.setText(displayAns);
    }

}

