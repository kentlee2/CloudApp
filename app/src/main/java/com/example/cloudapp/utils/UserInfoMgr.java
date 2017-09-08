package com.example.cloudapp.utils;

import com.example.cloudapp.bean.UserBean;

import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

/**
 * Created by Administrator on 2017/9/8.
 */

public class UserInfoMgr {
    private UserBean userBean;
    private UserInfoMgr() {
        userBean = new UserBean();
    }

    private static UserInfoMgr instance = new UserInfoMgr();

    public static UserInfoMgr getInstance() { return instance; }

    public UserBean getUserBean() {
        return userBean;
    }

    /**
     * 添加用户数据
     * @param userInfo
     */
    public void setUserInfo(UserBean userInfo){

        userInfo.save(new SaveListener<String>() {
            @Override
            public void done(String objectId,BmobException e) {
                if(e==null){
                    ToastUtil.showToast("添加数据成功，返回objectId为："+objectId);
                }else{
                    ToastUtil.showToast("创建数据失败：" + e.getMessage());
                }
            }
        });
    }
}
