package gui.listeners.seconddinner;


import gui.listeners.Handlers;
import interfaces.Forms;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import static gui.GuiFormWithScroll.secondDinnerObject;


public class SecondDinnerListSelectionHandler extends Handlers implements ListSelectionListener {

    public SecondDinnerListSelectionHandler(Forms gui) {
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
