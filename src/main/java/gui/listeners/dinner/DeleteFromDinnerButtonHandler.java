package gui.listeners.dinner;

import gui.listeners.Handlers;
import interfaces.Forms;
import model.Portion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static gui.GuiFormWithScroll.dinnerObject;

public class DeleteFromDinnerButtonHandler extends Handlers implements ActionListener {

    public DeleteFromDinnerButtonHandler(Forms gui) {
        super(gui);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (getValueFromSelection(gui.getDinnerJList().getSelectionModel(), gui.getDinnerListModel()) == null) {
            JOptionPane.showMessageDialog(new JFrame(), NO_SELECTION_IN_FOODINTAKE_SECTION);
        } else {
            Portion portion = getPortionToDelete(gui.getDinnerJList(), gui.getDinnerListModel(), dinnerObject);

            dinnerObject.removePortion(portion);

            calculateFoodIntakeIndicators(portion, dinnerObject, MINUS,
                    gui.getDinnerListModel(),
                    gui.getDinnerJList(),
                    gui.getDinnerProteinsCommon(),
                    gui.getDinnerCarboCommon(),
                    gui.getDinnerFatsCommon(),
                    gui.getDinnerCalloriesCommon(),
                    gui.getDinnerWeightForItem(),
                    gui.getDinnerProteinForItem(),
                    gui.getDinnerCarboForItem(),
                    gui.getDinnerFatsForItem(),
                    gui.getDinnerCalloriesForItem());
        }
    }
}
