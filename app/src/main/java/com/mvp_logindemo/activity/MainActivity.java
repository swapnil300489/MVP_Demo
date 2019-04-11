package com.mvp_logindemo.activity;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.global.Config;
import com.mvp_logindemo.R;
import com.mvp_logindemo.model.LoginModel;
import com.mvp_logindemo.presenter.LoginPresenter;
import com.mvp_logindemo.view.LoginView;
import com.pojo.LoginResponse;

public class MainActivity extends AppCompatActivity implements LoginView {

    private EditText userEDtxt, passEDtxt;
    private Button loginBtn;
    private String usrName = "", password = "";
    private String userid, userContact, userEmail, userName, user_uniqueId, term_condition, access_token;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {

        userEDtxt = findViewById(R.id.id_username);
        passEDtxt = findViewById(R.id.id_password);
        loginBtn  = findViewById(R.id.id_loginBtn);

        loginPresenter = new LoginModel(this);
        loginPresenter.initRetrofit();

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usrName = userEDtxt.getText().toString().trim();
                password = passEDtxt.getText().toString().trim();

                loginValidation();
            }
        });


    }

    public void loginValidation() {

        if(userEDtxt.getText().toString().length() == 0)
        {
            userEDtxt.setError("Enter username");
            userEDtxt.requestFocus();

        }else if(passEDtxt.getText().toString().length() == 0)
        {
            passEDtxt.setError("Enter password");
            passEDtxt.requestFocus();
        }else{

            loginPresenter.perfromLogin(usrName, new Config().passwordSHA(password));
        }



    }

    @Override
    public void loginSuccess(LoginResponse.Result result) {

         userid = result.getUserid();
         userContact = result.getUserContact();
         userEmail = result.getUserEmail();
         userName = result.getUserName();
         user_uniqueId = result.getUserUniqueId();
         term_condition = result.getTermCondition();
         access_token = result.getAccessToken();


         startActivity(new Intent(MainActivity.this, BookingStatus_Activity.class).putExtra("userId",userid));

        Log.e("Login_done_with ",userid+" "+userContact+" "+userEmail+" "+userName+" "+user_uniqueId+" "+term_condition+" "+access_token);


    }

    @Override
    public void loginError() {

        Toast.makeText(getApplicationContext(),"Something went wrong.",Toast.LENGTH_LONG).show();

    }
}
