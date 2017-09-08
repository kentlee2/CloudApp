package com.example.cloudapp.utils;

import android.widget.Toast;

import com.example.cloudapp.App;


/**
 * Created by Administrator on 2016/8/25.
 */
public class ToastUtil {
    private static Toast toast;
    public static void showToast(String msg){
        if (toast==null){
            toast = Toast.makeText(App.getContext(),msg, Toast.LENGTH_SHORT);
        }else{
            toast.setText(msg);
        }
        toast.show();
    }
    public static void showToast(int msg){
        if (toast==null){
            toast = Toast.makeText(App.getContext(),msg, Toast.LENGTH_SHORT);
        }else{
            toast.setText(msg);
        }
        toast.show();
    }
}
