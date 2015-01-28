package com.company;


        import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.io.BufferedWriter;
        import java.io.FileWriter;
        import java.io.IOException;


public class opDelete {
    public void opDelete (final String fileName,JButton bDelete, final JTextArea mainTa) {
        final JOptionPane optionPane = new JOptionPane();
        bDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(optionPane, "Do you really want to delete the data?") == JOptionPane.YES_OPTION) {
                    mainTa.setText("");
                    try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
                        mainTa.write(writer);
                        writer.close();
                    } catch (IOException e1) {
                        System.out.println(e1.getMessage());
                    }
                }
            }
        });
    }
}
