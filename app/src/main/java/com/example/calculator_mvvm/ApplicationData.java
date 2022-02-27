package com.example.calculator_mvvm;

import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calculator_mvvm.models.Operation;

public class ApplicationData {
    //public int amountFirst;
    //public int amountSecond;
    public int result;
    public int sum=0;

    private ApplicationData() {
    }

    private static ApplicationData INSTANCE = null;

    public static ApplicationData getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ApplicationData();
        }
        return INSTANCE;
    }



    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }




    public void calculate( int amountFirst, int amountSecond, String operatorCalculator) {
        sum=0;
        if (operatorCalculator.equalsIgnoreCase("+")) {
            sum = (amountFirst + amountSecond);
            setResult(sum);
            //Log.d("la somme", String.valueOf());
        }
        if (operatorCalculator.equalsIgnoreCase("-")) {
            sum = (amountFirst - amountSecond);
            setResult(sum);
            //theResult.setText(String.valueOf(sum));
        }
        if (operatorCalculator.equalsIgnoreCase("*")) {
            sum = (amountFirst * amountSecond);
            setResult(sum);

            //theResult.setText(String.valueOf(sum));
        }
        if (operatorCalculator.equalsIgnoreCase("/")) {
            sum = (amountFirst / amountSecond);
            setResult(sum);

            //theResult.setText(String.valueOf(sum));
        }
    }

    public void reset(TextView operatorCalculator,TextView theResult, TextView amount1, TextView amount2 ){
        operatorCalculator.setText("");
        amount1.setText("");
        amount2.setText("");
        theResult.setText("");
    }




}
