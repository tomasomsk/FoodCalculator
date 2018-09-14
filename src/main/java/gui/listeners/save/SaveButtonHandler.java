package gui.listeners.save;

import gui.listeners.Handlers;
import helpers.ExcelHelper;
import interfaces.Forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveButtonHandler extends Handlers implements ActionListener {

    public SaveButtonHandler(Forms gui) {
        super(gui);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int rVal = fileChooser.showSaveDialog((Component) gui);

        if (rVal == JFileChooser.APPROVE_OPTION) {
//            System.out.println(fileChooser.getSelectedFile().getAbsolutePath());
            ExcelHelper.writeToFile(fileChooser.getSelectedFile().getAbsolutePath());
        }
        if (rVal == JFileChooser.CANCEL_OPTION) {
            //do nothing
        }
    }
}
