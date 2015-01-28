package com.company;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class opAdd {
    int i = 1;
    public void opAdd (final JTextField tfName,final JTextField tfSurname,final JTextField tfAge,
                       final JTextField tfLocation, JButton bAdd,final String fileName,
                       final JTextArea mainTa) {
        final JOptionPane optionPane = new JOptionPane();
        bAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfName.setBackground(Color.white);
                tfSurname.setBackground(Color.white);
                tfAge.setBackground(Color.white);
                tfLocation.setBackground(Color.white);
                    try {

                        if (tfName.getText().length() == 0){
                            tfName.setBackground(Color.red);
                            mainTa.setText("Make sure to fill in all the gaps!");
                        }
                        if (tfSurname.getText().length() == 0){
                            tfSurname.setBackground(Color.red);
                            mainTa.setText("Make sure to fill in all the gaps!");
                        }
                        if (tfAge.getText().length() == 0){
                            tfAge.setBackground(Color.red);
                            mainTa.setText("Make sure to fill in all the gaps!");
                        }
                        if (tfLocation.getText().length() == 0){
                            tfLocation.setBackground(Color.red);
                            mainTa.setText("Make sure to fill in all the gaps!");
                        }

                        if (tfName.getText().length() > 0 && tfSurname.getText().length() > 0 &&
                                tfAge.getText().length() > 0 && tfLocation.getText().length() > 0) {
                            PrintWriter writer = new PrintWriter(new FileWriter(fileName, true));
                            writer.println("User number " + i + " ->");
                            writer.println("Name:" + tfName.getText() + ".");
                            writer.println("Surname:" + tfSurname.getText() + ".");
                            writer.println("Age:" + tfAge.getText() + ".");
                            writer.println("Location:" + tfLocation.getText() + ".");
                            writer.println("-----------------------");
                            writer.close();
                            tfName.setText("");
                            tfSurname.setText("");
                            tfAge.setText("");
                            tfLocation.setText("");
                            mainTa.setText("User " + i + " has been added!");
                            i++;
                        }
                    } catch (IOException e1) {
                        System.out.println(e1.getMessage());
                    }
                }
        });
    }
}
