package com.neng.app.prototype;

import com.neng.app.prototype.entity.User;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/8.
 */
public class LoginSession {


    private User loginUser;


    public static LoginSession getSingleton() {
        return LoginSessionHolder.loginSession;
    }

    private static class LoginSessionHolder {
        private static final LoginSession loginSession = new LoginSession();
    }


    public void setLoginUser(User user) {
        this.loginUser = user;
    }

    public User getLoginUser() {
        return loginUser;
    }


}
