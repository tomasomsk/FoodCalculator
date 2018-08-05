package gui.listeners.breakfast;

import gui.listeners.Handlers;
import interfaces.Forms;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import static gui.GuiFormWithScroll.breakfastObject;


public class BreakfastListSelectionHandler extends Handlers implements ListSelectionListener {

    public BreakfastListSelectionHandler(Forms gui) {
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
