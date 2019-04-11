package com.mvp_logindemo.view;

import com.pojo.LoginResponse;

public interface LoginView  {

    void loginSuccess(LoginResponse.Result result);
    void loginError();

}
