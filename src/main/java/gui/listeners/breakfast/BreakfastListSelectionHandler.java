package gui.listeners.breakfast;

import gui.GuiForm;
import gui.listeners.Handlers;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import static gui.GuiForm.breakfastObject;

public class BreakfastListSelectionHandler extends Handlers implements ListSelectionListener {

    public BreakfastListSelectionHandler(GuiForm gui) {
        super(gui);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        setItemsTextFieldsForFoodIntake(e, breakfastObject, gui.getBreakfastListModel(),
                gui.getBreakfastProteinForItem(),
                gui.getBreakfastCarboForItem(),
                gui.getBreakfastFatsForItem(),
                gui.getBreakfastCalloriesForItem(),
                gui.getBreakfastWeightForItem());
    }




}
