package com.example.mycalculater;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDisp;
    int num1, num2, result;
    String op;
    String num1_str, num2_str, result_str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        tvDisp = (TextView) findViewById(R.id.tvDisp);

        num1 =0;
        num2=0;
        result = 0;
        op = "";
        num1_str ="";
        num2_str = "";
        result_str = "";


    }
    // button click event
    public void press7 (View v){
        if ( op.equals("")){
        num1 = num1*10+7;
        num1_str = Integer.toString(num1);
        tvDisp.setText(num1_str);
        } else {
            num2 = num2*10+7;
            num2_str = Integer.toString(num2);
            tvDisp.setText(num2_str);
        }
    }

    public void press8 (View v ) {
        if (op.equals("")) {
            num1 = num1 * 10 + 8;
            num1_str = Integer.toString(num1);
            tvDisp.setText(num1_str);
        } else {
            num2 = num2 * 10 + 8;
            num2_str = Integer.toString(num2);
            tvDisp.setText(num2_str);
        }
    }
    public void press9 (View v ){
        if ( op.equals("")){
            num1 = num1*10+9;
            num1_str = Integer.toString(num1);
            tvDisp.setText(num1_str);
        } else {
            num2 = num2*10+9;
            num2_str = Integer.toString(num2);
            tvDisp.setText(num2_str);
        }

    }
    public void pressPluse (View v ){
        op = "+";

    }
    public void press4 (View v ){

        if ( op.equals("")){
            num1 = num1*10+4;
            num1_str = Integer.toString(num1);
            tvDisp.setText(num1_str);
        } else {
            num2 = num2*10+4;
            num2_str = Integer.toString(num2);
            tvDisp.setText(num2_str);
        }
    }
    public void press5 (View v ){
        if ( op.equals("")){
            num1 = num1*10+5;
            num1_str = Integer.toString(num1);
            tvDisp.setText(num1_str);
        } else {
            num2 = num2*10+5;
            num2_str = Integer.toString(num2);
            tvDisp.setText(num2_str);
        }
    }
    public void press6 (View v ){
        if ( op.equals("")){
            num1 = num1*10+6;
            num1_str = Integer.toString(num1);
            tvDisp.setText(num1_str);
        } else {
            num2 = num2*10+6;
            num2_str = Integer.toString(num2);
            tvDisp.setText(num2_str);
        }
    }
    public void pressMines (View v ){
        op = "-";
    }
    public void press1 (View v ){
        if ( op.equals("")){
            num1 = num1*10+1;
            num1_str = Integer.toString(num1);
            tvDisp.setText(num1_str);
        } else {
            num2 = num2*10+1;
            num2_str = Integer.toString(num2);
            tvDisp.setText(num2_str);
        }
    }
    public void press2 (View v ){
        if ( op.equals("")){
            num1 = num1*10+2;
            num1_str = Integer.toString(num1);
            tvDisp.setText(num1_str);
        } else {
            num2 = num2*10+2;
            num2_str = Integer.toString(num2);
            tvDisp.setText(num2_str);
        }

    }
    public void press3 (View v ){
        if ( op.equals("")){
            num1 = num1*10+3;
            num1_str = Integer.toString(num1);
            tvDisp.setText(num1_str);
        } else {
            num2 = num2*10+3;
            num2_str = Integer.toString(num2);
            tvDisp.setText(num2_str);
        }

    }
    public void pressX (View v ){

        op = "X";

    }
    public void press0 (View v ) {
        if (op.equals("")) {
            num1 = num1 * 10 + 0;
            num1_str = Integer.toString(num1);
            tvDisp.setText(num1_str);
        } else {
            num2 = num2 * 10 + 0;
            num2_str = Integer.toString(num2);
            tvDisp.setText(num2_str);
        }


    }
    public void pressSubtract (View v ) {

        op = "/";


    }
    public void pressEquals (View v ){

        if ( op.equals("=")){
            result = num1 + num2;
    }

        result_str=Integer.toString(result);
        tvDisp.setText(result_str);
    }

    public void pressC(View v)
    {
        num1 =0;
        num2=0;
        result = 0;
        op = "";
        num1_str ="";
        num2_str = "";
        result_str = "";
        tvDisp.setText(result_str);
    }

}