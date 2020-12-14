package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class OpenListener extends CreateDocument implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        createNew();
    }
    public OpenListener() {
    }

}
