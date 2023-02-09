/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.williamsampaio.javasistemasolar;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author william
 */
public class Javasistemasolar extends JFrame {

    SistemaSolar sl;

    public Javasistemasolar() {
        setLayout(new BorderLayout());
        //setSize(1366,700);
        sl = new SistemaSolar();
        getContentPane().setBackground(Color.black);
        add(BorderLayout.CENTER, sl);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(0, 0);
        setTitle("Sistema Solar V2");
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    public static void main(String[] args) {

        Javasistemasolar javasistemasolar;
        javasistemasolar = new Javasistemasolar();
    }
}
