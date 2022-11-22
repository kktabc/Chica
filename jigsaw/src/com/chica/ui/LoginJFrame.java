package com.chica.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    // 登录界面
    // 所有跟登录相关的代码都在这里

    // 空参构造，初始化登录界面
    public LoginJFrame(){
        this.setSize(488,430);
        this.setTitle("login v1.0");
        this.setAlwaysOnTop(true);
        // set frame location
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }
}
