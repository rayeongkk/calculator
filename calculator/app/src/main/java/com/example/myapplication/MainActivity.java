package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btn_add, btn_sub, btn_mul, btn_div;
    TextView text_Result;
    String num1, num2;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = findViewById(R.id.Edit_1);
        edit2 = findViewById(R.id.Edit_2);

        btn_add = findViewById(R.id.Btn_add);
        btn_sub = findViewById(R.id.Btn_sub);
        btn_mul = findViewById(R.id.Btn_mul);
        btn_div = findViewById(R.id.Btn_div);

        text_Result = findViewById(R.id.Text_result);

        btn_add.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                text_Result.setText("계산결과 : " + result.toString());
                return false;
            }
        });

        btn_sub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                text_Result.setText("계산결과 : " + result.toString());
                return false;
            }
        });

        btn_mul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                text_Result.setText("계산결과 : " + result.toString());
                return false;
            }
        });

        btn_div.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                text_Result.setText("계산결과 : " + result.toString());
                return false;
            }
        });

    }
}
