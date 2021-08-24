package com.sravs.mvvmarchitecture.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.sravs.mvvmarchitecture.R;
import com.sravs.mvvmarchitecture.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.heading.setText("Welcome MVVM Architecture");
        binding.subHeading.setText("Welcome Data Binding");
    }
}