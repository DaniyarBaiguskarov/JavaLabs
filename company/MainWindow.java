package com.company;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionListener;
public class MainWindow extends JFrame {

    private JMenuBar menu;

    public MainWindow() {
        super("application");
        setSize(500, 500);
        setLayout(new FlowLayout());
        createMenu();
        setResizable(false);
        setVisible(true);
    }
    private void createMenu() {
        menu = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu create = new JMenu("Create");
        JMenu openFile = new JMenu("Open");
        JMenuItem saveFile = new JMenuItem("Save");
        file.add(create);
        file.add(openFile);
        file.add(saveFile);
        JButton button=new JButton("create");
        ActionListener list=new OpenListener();
        button.addActionListener(list);
        create.add(button);
        menu.add(file);
        setJMenuBar(menu);
    }

}
