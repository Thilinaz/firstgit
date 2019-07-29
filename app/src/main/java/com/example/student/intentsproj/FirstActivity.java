package com.example.student.intentsproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    public static final String NUMBER_1 = "1";
    public static final String NUMBER_2 = "2";

    private EditText num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        num1 = findViewById(R.id.txtNum1);
        num2 = findViewById(R.id.txtNum2);

    }

    //onClick
    public void onClick(View view) {

        String no1 = num1.getText().toString();
        String no2 = num2.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(NUMBER_1, no1);
        intent.putExtra(NUMBER_2, no2);
        startActivity(intent);
    }
}
