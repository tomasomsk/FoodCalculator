package gui.listeners.lunch;

import gui.GuiForm;
import gui.listeners.Handlers;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import static gui.GuiForm.lunchObject;

public class LunchListSelectionHandler extends Handlers implements ListSelectionListener {

    public LunchListSelectionHandler(GuiForm gui) {
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
