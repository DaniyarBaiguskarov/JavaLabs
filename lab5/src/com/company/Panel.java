package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.awt.Graphics;
public class Panel extends JFrame {
    private JPanel window=new JPanel();
    private String filename;
    private JLabel label;
    private BufferedImage image;
    public Panel() throws IOException {
        super("Окно");
        Scanner scanner=new Scanner(System.in);
        filename= scanner.nextLine();
        setSize(1600,700);
        image= ImageIO.read(new File(filename));
        this.label=new JLabel(new ImageIcon(image));
        add(label);
    }
}
