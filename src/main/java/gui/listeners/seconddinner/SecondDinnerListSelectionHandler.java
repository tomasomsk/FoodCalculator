package gui.listeners.seconddinner;

import gui.GuiForm;
import gui.listeners.Handlers;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import static gui.GuiForm.secondDinnerObject;

public class SecondDinnerListSelectionHandler extends Handlers implements ListSelectionListener {

    public SecondDinnerListSelectionHandler(GuiForm gui) {
        super(gui);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        setItemsTextFieldsForFoodIntake(e, secondDinnerObject, gui.getSecondDinnerListModel(),
                gui.getSecondDinnerProteinForItem(),
                gui.getSecondDinnerCarboForItem(),
                gui.getSecondDinnerFatsForItem(),
                gui.getSecondDinnerCalloriesForItem(),
                gui.getSecondDinnerWeightForItem());
    }




}
