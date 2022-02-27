package com.example.calculator_mvvm.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.calculator_mvvm.ApplicationData;
import com.example.calculator_mvvm.R;
import com.example.calculator_mvvm.models.Operation;
import com.example.calculator_mvvm.viewModels.CalculatorFragmentViewModel;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class CalculatorFragment extends Fragment {
    private EditText amountA;
    private EditText amountB;
    private TextView operator;
    private TextView result;
    private int theSum =0;
    private MaterialCardView reset;
    private MaterialCardView mat0;
    private MaterialCardView mat1;
    private MaterialCardView mat2;
    private MaterialCardView mat3;
    private MaterialCardView mat4;
    private MaterialCardView mat5;
    private MaterialCardView mat6;
    private MaterialCardView mat7;
    private MaterialCardView mat8;
    private MaterialCardView mat9;
    private MaterialCardView matAdd;
    private MaterialCardView matDivid;
    private MaterialCardView matMulti;
    private MaterialCardView matMin;
    private MaterialCardView matEquals;
    private ArrayList<Operation>listOperation = new ArrayList<>();
    private int amountFirst;
    private int amountSecond;

    private CalculatorFragmentViewModel viewModelCalculator;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModelCalculator = new ViewModelProvider(this).get(CalculatorFragmentViewModel.class);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calculator,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        amountA = view.findViewById(R.id.amountA);
        amountB = view.findViewById(R.id.amountB);
        mat0 = view.findViewById(R.id.mat_card_zero);
        mat1 = view.findViewById(R.id.mat_card_one);
        mat2 = view.findViewById(R.id.mat_card_two);
        mat3 = view.findViewById(R.id.mat_card_three);
        mat4 = view.findViewById(R.id.mat_card_four);
        mat5 = view.findViewById(R.id.mat_card_five);
        mat6 = view.findViewById(R.id.mat_card_six);
        mat7 = view.findViewById(R.id.mat_card_seven);
        mat8 = view.findViewById(R.id.mat_card_eight);
        mat9 = view.findViewById(R.id.mat_card_nine);
        matAdd = view.findViewById(R.id.mat_card_plus);
        matDivid = view.findViewById(R.id.mat_card_divided);
        matMulti = view.findViewById(R.id.mat_card_multiplication);
        matMin = view.findViewById(R.id.mat_card_minus);
        matEquals = view.findViewById(R.id.mat_card_equals);
        operator = view.findViewById(R.id.operator);
        matEquals = view.findViewById(R.id.mat_card_equals);
        result = view.findViewById(R.id.view_result);
        reset = view.findViewById(R.id.mat_card_reset);

        mat0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mat0 == view) {
                    if(amountA.getText().toString().equalsIgnoreCase("")){
                        amountA.setText(String.valueOf(0));
                    }else{
                        amountB.setText(String.valueOf(0));
                    }
                }
            }
        });

        mat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mat1 == view) {
                        if(amountA.getText().toString().equalsIgnoreCase("")){
                         amountA.setText(String.valueOf(1));
                            }else{
                            amountB.setText(String.valueOf(1));
                        }
                    }
                Log.d("montant A", (amountA.getText().toString()));
                Log.d("montant B", (amountB.getText().toString()));
            }
        });

        mat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mat2 == view) {
                    if(amountA.getText().toString().equalsIgnoreCase("")){
                        amountA.setText(String.valueOf(2));
                    }else{
                        amountB.setText(String.valueOf(2));
                    }
                }
            }
        });

        mat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mat3 == view) {
                    if(amountA.getText().toString().equalsIgnoreCase("")){
                        amountA.setText(String.valueOf(3));
                    }else{
                        amountB.setText(String.valueOf(3));
                    }
                }
            }
        });

        mat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mat4 == view) {
                    if(amountA.getText().toString().equalsIgnoreCase("")){
                        amountA.setText(String.valueOf(4));
                    }else{
                        amountB.setText(String.valueOf(4));
                    }
                }
            }
        });

        mat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mat5 == view) {
                    if(amountA.getText().toString().equalsIgnoreCase("")){
                        amountA.setText(String.valueOf(5));
                    }else{
                        amountB.setText(String.valueOf(5));
                    }
                }
            }
        });

        mat6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mat6 == view) {
                    if(amountA.getText().toString().equalsIgnoreCase("")){
                        amountA.setText(String.valueOf(6));
                    }else{
                        amountB.setText(String.valueOf(6));
                    }
                }
            }
        });

        mat7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mat7 == view) {
                    if(amountA.getText().toString().equalsIgnoreCase("")){
                        amountA.setText(String.valueOf(7));
                    }else{
                        amountB.setText(String.valueOf(7));
                    }
                }
            }
        });

        mat8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mat8 == view) {
                    if(amountA.getText().toString().equalsIgnoreCase("")){
                        amountA.setText(String.valueOf(8));
                    }else{
                        amountB.setText(String.valueOf(8));
                    }
                }
            }
        });

        mat9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mat9 == view) {
                    if(amountA.getText().toString().equalsIgnoreCase("")){
                        amountA.setText(String.valueOf(9));
                    }else{
                        amountB.setText(String.valueOf(9));
                    }
                }
            }
        });

        matDivid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(matDivid == view) {
                        operator.setText("/");
                }
            }
        });

        matMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(matMin == view) {
                    operator.setText("-");
                }
            }
        });

        matMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(matMulti == view) {
                    operator.setText("*");
                }
            }
        });

        matAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(matAdd == view) {
                    operator.setText("+");
                }
            }
        });
        Log.d("montant A", (amountA.getText().toString()));
        Log.d("montant B", (amountB.getText().toString()));

        matEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amountFirst= Integer.parseInt(amountA.getText().toString());
                amountSecond=Integer.parseInt(amountB.getText().toString());

                //addOperation();
                //toCalculate();
                viewModelCalculator.toCalculate(amountFirst,amountSecond, operator.getText().toString());
                //ApplicationData.getInstance().calculate(amountFirst, amountSecond,operator.getText().toString());
                //amountFirst= Integer.parseInt(amountA.getText().toString());
                //amountSecond=Integer.parseInt(amountB.getText().toString());
                //ApplicationData.getInstance().calculate(amountFirst,amountSecond,operator.getText().toString());
                //result.setText(operation.getResultat());
               // Log.d("resultat", String.valueOf((operation.getResultat())));


            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //reset();
                ApplicationData.getInstance().reset(operator,amountA,amountB,result);
            }
        });

        setViewResult();
    }

    /*private void addOperation(){
        Operation operation = new Operation();
        operation.setAmountA(Integer.parseInt(amountA.getText().toString()));
        operation.setAmountB(Integer.parseInt(amountB.getText().toString()));
        operation.setOperator(operator.getText().toString());
        listOperation.add(operation);
    }*/

    private void toCalculate(){
        int sum = 0;
        amountFirst= Integer.parseInt(amountA.getText().toString());
        amountSecond=Integer.parseInt(amountB.getText().toString());
        if(operator.getText().toString().equalsIgnoreCase("+")){
            sum = (amountFirst+amountSecond);
            result.setText(String.valueOf(sum));
        }
        if(operator.getText().toString().equalsIgnoreCase("-")){
            sum = (amountFirst-amountSecond);
            result.setText(String.valueOf(sum));
        }
        if(operator.getText().toString().equalsIgnoreCase("*")){
            sum = (amountFirst*amountSecond);
            result.setText(String.valueOf(sum));
        }
        if(operator.getText().toString().equalsIgnoreCase("/")){
            sum = (amountFirst/amountSecond);
            result.setText(String.valueOf(sum));
        }

    }


    private void setViewResult(){
        viewModelCalculator.resultLiveData.observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer sum) {
                result.setText(String.valueOf(sum));
            }
        });
    }
}
