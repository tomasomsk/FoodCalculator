package gui.listeners.dinner;

import gui.GuiForm;
import gui.listeners.Handlers;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import static gui.GuiForm.dinnerObject;

public class DinnerListSelectionHandler extends Handlers implements ListSelectionListener {

    public DinnerListSelectionHandler(GuiForm gui) {
        super(gui);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        setItemsTextFieldsForFoodIntake(e, dinnerObject, gui.getDinnerListModel(),
                gui.getDinnerProteinForItem(),
                gui.getDinnerCarboForItem(),
                gui.getDinnerFatsForItem(),
                gui.getDinnerCalloriesForItem(),
                gui.getDinnerWeightForItem());
    }




}
