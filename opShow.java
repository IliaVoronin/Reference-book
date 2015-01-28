package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class opShow {
    public void opShow (final JTextField tfName,final JTextField tfSurname,
                        final JTextField tfAge,final JTextField tfLocation,
                        final JTextArea mainTa, JButton bShow, final String fileName) {
        bShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(fileName));
                    mainTa.read(reader, null);
                    reader.close();
                } catch (IOException e1) {
                    System.out.println(e1.getMessage());
                }
            }
        });
    }
}
