/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.williamsampaio.javasistemasolar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author william
 */
public class Container extends JFrame {

    private final SistemaSolar sl;
    private boolean labels;

    public Container() {

        setLayout(new BorderLayout());
        //setSize(800, 600);
        sl = new SistemaSolar();
        getContentPane().setBackground(Color.black);
        add(BorderLayout.CENTER, sl);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(0, 0);
        setTitle("Sistema Solar V2");
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setVisible(true);
        addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_SPACE) {
                    sl.setLabels(!sl.isLabels());
                }
            }
        });
    }
}
