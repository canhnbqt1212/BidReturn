package com.gengbk.bidreturn.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.gengbk.bidreturn.MainActivity;
import com.gengbk.bidreturn.R;
import com.gengbk.bidreturn.auth.PhoneAuthActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by gengbk on 01/09/2017.
 */

public class Login extends Activity {

    @BindView(R.id.btn_login)
    Button login;

    @BindView(R.id.tv_account)
    EditText account;

    @BindView(R.id.tv_password)
    EditText password;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        ButterKnife.bind(this);
    }



    @OnClick(R.id.btn_login)
    public void getlogin(){
//        if(account.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
            Intent intent = new Intent(this, PhoneAuthActivity.class);
            startActivity(intent);
//        }
    }

}


