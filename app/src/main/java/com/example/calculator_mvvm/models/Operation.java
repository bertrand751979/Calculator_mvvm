package com.example.calculator_mvvm.models;

import java.io.Serializable;

public class Operation  {
    private int amountA;
    private int amountB;
    private String operator ;
    private  int resultat;

    public Operation(int amountA, int amountB, String operator, int resultat) {
        this.amountA = amountA;
        this.amountB = amountB;
        this.operator = operator;
        this.resultat = resultat;
    }
     public Operation(){}


    public int getAmountA() {
        return amountA;
    }

    public void setAmountA(int amountA) {
        this.amountA = amountA;
    }

    public int getAmountB() {
        return amountB;
    }

    public void setAmountB(int amountB) {
        this.amountB = amountB;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getResultat() {
        return resultat;
    }

    public void setResultat(int resultat) {
        this.resultat = resultat;
    }
}
