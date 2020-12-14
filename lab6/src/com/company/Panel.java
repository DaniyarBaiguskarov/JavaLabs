package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Panel extends JFrame {
    JPanel window=new JPanel();
    public Panel(){
        super("okno");
        setSize(500,300);
        setLayout(new BorderLayout());
        JButton j1= new JButton("South");
        add(j1,BorderLayout.SOUTH);
        j1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Абха");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        JButton j2= new JButton("North");
        add(j2,BorderLayout.NORTH);
        j2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        JButton j3= new JButton("Center");
        add(j3,BorderLayout.CENTER);
        j3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Абха");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        JButton j4= new JButton("West");
        add(j4,BorderLayout.WEST);
        j4.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Джидда");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        JButton j5= new JButton("East");
        add(j5,BorderLayout.EAST);
        j5.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Дахране");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

}
