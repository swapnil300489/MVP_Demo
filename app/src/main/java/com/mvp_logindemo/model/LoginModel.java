package com.mvp_logindemo.model;

import com.global.Config;
import com.mvp_logindemo.presenter.LoginPresenter;
import com.mvp_logindemo.view.LoginView;
import com.pojo.LoginResponse;
import com.retrofit.APIClient;
import com.retrofit.APIInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginModel implements LoginPresenter {

    private LoginView loginView;
    private APIClient apiClient;
    private APIInterface apiInterface;
    private String osType = Config.OS_Type;

    public LoginModel(LoginView loginView){

        this.loginView = loginView;
    }



    @Override
    public void perfromLogin(String username, String password) {

        Call<LoginResponse> responseCall = apiInterface.LOGIN_RESPONSE_CALL(username, password, osType);

        responseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {

                LoginResponse loginResponse = response.body();

                if (loginResponse.getMsg().equals("1")){

                    LoginResponse.Result result = loginResponse.getResult();


                    loginView.loginSuccess(result);


                }else {
                    loginView.loginError();
                }


            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {

                loginView.loginError();

            }
        });


    }

    @Override
    public void initRetrofit() {

        apiClient = new APIClient();
        apiInterface = apiClient.getConnection();

    }
}
