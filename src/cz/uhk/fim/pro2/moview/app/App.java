package cz.uhk.fim.pro2.moview.app;

import cz.uhk.fim.pro2.moview.gui.MainFrame;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });
    }



}
