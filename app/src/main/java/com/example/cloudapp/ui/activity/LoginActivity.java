package com.example.cloudapp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.cloudapp.R;
import com.example.cloudapp.bean.UserBean;
import com.example.cloudapp.utils.ToastUtil;

import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.LogInListener;

public class LoginActivity extends AppCompatActivity {
   private static String TAG =LoginActivity.class.getSimpleName();
    private TextView etAccount,etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etAccount =(TextView) findViewById(R.id.et_account);
        etPass =(TextView)findViewById(R.id.et_pass);
    }
    public void toRegister(View view){
        startActivity(new Intent(this,RegisterActivity.class));
    }
    public void login(View view){
        UserBean.loginByAccount(etAccount.getText().toString(), etPass.getText().toString(),
                       new LogInListener<UserBean>() {

            @Override
            public void done(UserBean user, BmobException e) {
                if(user!=null){
                    ToastUtil.showToast("登录成功:");
                }
            }
        });
    }
}
