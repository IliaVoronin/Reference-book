package com.company;

import javax.swing.*;
import java.awt.*;

public class mainGui {
    public static void makeGui() {
        JFrame f = new JFrame("Reference Book v.1");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(300,300,600,370);
        f.setResizable(false);
        f.setLocationRelativeTo(null);

        // Bottom (south) panel

        JButton bAdd = new JButton("Add");
        JButton bDelete = new JButton("Delete");
        JButton bClear = new JButton("Clear");
        JButton bShow = new JButton("Show");

        JPanel pSouth = new JPanel();
        pSouth.setBackground(Color.gray);
        pSouth.add(bAdd);
        pSouth.add(bDelete);
        pSouth.add(bClear);
        pSouth.add(bShow);

        //Left (east) panel

        JTextArea taName  = new JTextArea("Name:");
        taName.setEditable(false);
        taName.setBackground(Color.gray);
        JTextArea taSurname  = new JTextArea("Surname:");
        taSurname.setEditable(false);
        taSurname.setBackground(Color.gray);
        JTextArea taAge  = new JTextArea("Age:");
        taAge.setEditable(false);
        taAge.setBackground(Color.gray);
        JTextArea taLocation  = new JTextArea("Location:");
        taLocation.setEditable(false);
        taLocation.setBackground(Color.gray);

        JTextField tfName = new JTextField(8);
        JTextField tfSurname = new JTextField(8);
        JTextField tfAge = new JTextField(8);
        JTextField tfLocation = new JTextField(8);

        JPanel pEast = new JPanel();
        pEast.setBackground(Color.gray);
        pEast.setLayout(new BoxLayout(pEast,BoxLayout.Y_AXIS));

        pEast.add(taName);
        pEast.add(tfName);
        pEast.add(taSurname);
        pEast.add(tfSurname);
        pEast.add(taAge);
        pEast.add(tfAge);
        pEast.add(taLocation);
        pEast.add(tfLocation);

        //Center Text Area

        JTextArea mainTa = new JTextArea();
        mainTa.setBackground(Color.lightGray);
        mainTa.setEditable(false);
        mainTa.setText("Welcome to Reference book v.1");

        //Adding actions to buttons

        opClear opClear = new opClear();
        opClear.opClear(tfName,tfSurname,tfAge,tfLocation,mainTa,bClear);

        opAdd opAdd = new opAdd();
        opAdd.opAdd(tfName,tfSurname,tfAge,tfLocation,bAdd, "filter.txt",mainTa);

        opShow opShow = new opShow();
        opShow.opShow(tfName,tfSurname,tfAge,tfLocation,mainTa,bShow,"filter.txt");

        opDelete opDelete = new opDelete();
        opDelete.opDelete("filter.txt",bDelete,mainTa);

        //Adding components to the main frame

        f.getContentPane().add(BorderLayout.SOUTH, pSouth);
        f.getContentPane().add(BorderLayout.EAST,pEast);
        f.getContentPane().add(BorderLayout.CENTER, mainTa);

        f.setVisible(true);
    }
}
