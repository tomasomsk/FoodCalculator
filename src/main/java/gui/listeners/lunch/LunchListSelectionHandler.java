package gui.listeners.lunch;

import gui.listeners.Handlers;
import interfaces.Forms;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import static gui.GuiFormWithScroll.lunchObject;

public class LunchListSelectionHandler extends Handlers implements ListSelectionListener {

    public LunchListSelectionHandler(Forms gui) {
        super(gui);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        setItemsTextFieldsForFoodIntake(e, lunchObject, gui.getLunchListModel(),
                gui.getLunchProteinForItem(),
                gui.getLunchCarboForItem(),
                gui.getLunchFatsForItem(),
                gui.getLunchCalloriesForItem(),
                gui.getLunchWeightForItem());
    }




}
