package gui.listeners.secondbreakfast;

import gui.GuiForm;
import gui.listeners.Handlers;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import static gui.GuiForm.secondBreakfastObject;

public class SecondBreakfastListSelectionHandler extends Handlers implements ListSelectionListener {

    public SecondBreakfastListSelectionHandler(GuiForm gui) {
        super(gui);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        setItemsTextFieldsForFoodIntake(e, secondBreakfastObject, gui.getSecondBreakfastListModel(),
                gui.getSecondBreakfastProteinForItem(),
                gui.getSecondBreakfastCarboForItem(),
                gui.getSecondBreakfastFatsForItem(),
                gui.getSecondBreakfastCalloriesForItem(),
                gui.getSecondBreakfastWeightForItem());
    }
}
