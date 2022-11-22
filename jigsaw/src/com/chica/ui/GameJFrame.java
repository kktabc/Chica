package com.chica.ui;

import javax.swing.*;
import java.nio.channels.DatagramChannel;

public class GameJFrame extends JFrame {

    // constructor
    public GameJFrame(){
        initJFrame();

        initJMenubar();

        this.setVisible(true);
    }




    private void initJMenubar() {
        // initiate menu
        JMenuBar jMenuBar = new JMenuBar();

        JMenu functionjmenu = new JMenu("功能");
        JMenu aboutjmenu = new JMenu("about");

        JMenuItem replayItem = new JMenuItem("replay");
        JMenuItem reloginItem = new JMenuItem("relogin");
        JMenuItem closeItem = new JMenuItem("close");

        JMenuItem accountItem = new JMenuItem("contact us");

        functionjmenu.add(replayItem);
        functionjmenu.add(reloginItem);
        functionjmenu.add(closeItem);

        aboutjmenu.add(accountItem);

        jMenuBar.add(functionjmenu);
        jMenuBar.add(aboutjmenu);

        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        this.setSize(603,680);
        this.setTitle("jigsaw v1.0");
        this.setAlwaysOnTop(true);
        // set frame location
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
    }


}
