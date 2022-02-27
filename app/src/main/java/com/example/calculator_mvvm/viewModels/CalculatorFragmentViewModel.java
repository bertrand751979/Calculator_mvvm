package com.example.calculator_mvvm.viewModels;

import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.calculator_mvvm.ApplicationData;

public class CalculatorFragmentViewModel extends ViewModel {
    private MutableLiveData<Integer> result = new MutableLiveData<>();
    public LiveData<Integer> resultLiveData = result;

    public void toPostResult(){
        result.postValue(ApplicationData.getInstance().getResult());
    }


    public void toCalculate( int amountFirst, int amountSecond, String operatorCalculator){
        ApplicationData.getInstance().calculate(amountFirst,amountSecond, operatorCalculator);
        toPostResult();
    }



}
