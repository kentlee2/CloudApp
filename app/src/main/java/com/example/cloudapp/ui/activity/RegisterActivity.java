package com.example.cloudapp.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.cloudapp.R;
import com.example.cloudapp.bean.UserBean;
import com.example.cloudapp.utils.ToastUtil;

import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class RegisterActivity extends AppCompatActivity {

    private EditText etName,etPass,etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etPass = (EditText)findViewById(R.id.et_pass);
        etName = (EditText)findViewById(R.id.et_account);
        etEmail = (EditText)findViewById(R.id.et_email);
    }
    public void register(View v){
        UserBean userBean = new UserBean();
        userBean.setUsername(etName.getText().toString());
        userBean.setPassword(etPass.getText().toString());
        userBean.setEmail(etEmail.getText().toString());
        //注意：不能用save方法进行注册
        userBean.signUp(new SaveListener<UserBean>() {
            @Override
            public void done(UserBean s, BmobException e) {
                if(e==null){
                    ToastUtil.showToast("注册成功");
                }else{
                    Log.e("RegisterActivity",e.getMessage());
                }
            }
        });
    }
}
