package com.example.calculator_mvvm;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.calculator_mvvm.fragments.CalculatorFragment;
import com.example.calculator_mvvm.fragments.IntroductionFragment;


public class MainAdapter extends FragmentStateAdapter {
    public MainAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position==0){
            Fragment fragment = new IntroductionFragment();
            return fragment;
        }
        else {
            Fragment fragment = new CalculatorFragment();
            return fragment;
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
