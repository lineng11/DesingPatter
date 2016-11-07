package com.neng.app.activity;

import android.view.View;

import com.neng.app.R;
import com.neng.app.prototype.InterfaceLogin;
import com.neng.app.prototype.LoginSession;
import com.neng.app.prototype.entity.Address;
import com.neng.app.prototype.entity.User;

public class PrototypeActivity extends BaseActivity implements InterfaceLogin {


    @Override
    protected int getContentView() {
        return R.layout.activity_prototype;
    }

    @Override
    protected void initCreate() {
    }


    public void onLoginBut(View view) {
        User loginUser = login();
        LoginSession.getSingleton().setLoginUser(loginUser);
        toastShow("登录成功,User保存到Session.");


    }


    public void onUpdateUserBut(View view) {
        User user = LoginSession.getSingleton().getLoginUser();

        //换了工作,修改信息
        User newUser = user.clone();
        newUser.phone = "10101010";
        newUser.address = new Address("北京", "海淀区", "金融大厦");

        log(user.toString());
        log(newUser.toString());
    }

    @Override
    public User login() {
        //登录成功后获取到User信息
        User loginUser = new User();
        loginUser.age = 22;
        loginUser.name = "Jack";
        loginUser.phone = "123456789";
        loginUser.address = new Address("上海", "静安区", "南京西路");
        return loginUser;
    }
}
