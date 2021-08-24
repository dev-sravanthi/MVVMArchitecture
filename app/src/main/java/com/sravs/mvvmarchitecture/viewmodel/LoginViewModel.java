package com.sravs.mvvmarchitecture.viewmodel;

import android.text.TextUtils;
import android.util.Patterns;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.sravs.mvvmarchitecture.BR;
import com.sravs.mvvmarchitecture.Model.User;

import java.util.regex.Pattern;

public class LoginViewModel extends BaseObservable {
    private User user;
    private String successMessage="Login Successful";
    private String errorMessage="Email or Password not valid";

    @Bindable
    private String toastMessage = null;


    public String getToastMessage() {
        return toastMessage;
    }

    private void setToastMessage(String toastMessage) {

        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    public void setUserEmail(String email){
        user.setEmail(email);
        notifyPropertyChanged(BR.userEmail);
    }

    @Bindable
    public String getUserEmail(){
        return user.getEmail();
    }

    @Bindable
    public String getUserPassword(){
        return user.getPassword();
    }

    public void setUserPassword(String password){
        user.setPassword(password);
        notifyPropertyChanged(BR.userPassword);
    }

    public LoginViewModel(){
        User user=new User("","");
    }

    public boolean isInputDataValid(){
        return !TextUtils.isEmpty(getUserEmail()) && Patterns.EMAIL_ADDRESS.matcher(getUserEmail()).matches() && getUserPassword().length()>5;
    }


    public void onLoginClicked(){
        if(isInputDataValid()){
            setToastMessage(successMessage);
        }else{
            setToastMessage(errorMessage);
        }
    }


}
