package com.sravs.mvvmarchitecture.View;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import com.sravs.mvvmarchitecture.R;
import com.sravs.mvvmarchitecture.databinding.LoginScreenBinding;
import com.sravs.mvvmarchitecture.viewmodel.LoginViewModel;

public class LoginScreen extends AppCompatActivity {
    LoginScreenBinding loginScreenBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginScreenBinding= DataBindingUtil.setContentView(this, R.layout.login_screen);

        loginScreenBinding.setViewModel(new LoginViewModel());
        loginScreenBinding.executePendingBindings();

    }

    @BindingAdapter({"toastMessage"})
    public static void runMe(View view,String message){
        if(message!=null){
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
        }

    }
}
