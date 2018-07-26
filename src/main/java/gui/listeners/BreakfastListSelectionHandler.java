package gui.listeners;

import gui.GuiForm;
import model.FoodItem;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import static gui.GuiForm.foodItemsSimpleList;

public class BreakfastListSelectionHandler extends Handlers implements ListSelectionListener {

//    private GuiForm gui;

    public BreakfastListSelectionHandler(GuiForm gui) {
        super(gui);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        ListSelectionModel lsm = (ListSelectionModel) e.getSource();
        FoodItem foodItem = foodItemsSimpleList.getElementWithName(getValueFromSelection(lsm, gui.getBreakfastListModel()));
        gui.getBreakfastProteinForItem().setText(String.valueOf(foodItem.getNutrValue().getProtein()));
        gui.getBreakfastCarboForItem().setText(String.valueOf(foodItem.getNutrValue().getCarbo()));
        gui.getBreakfastFatsForItem().setText(String.valueOf(foodItem.getNutrValue().getFats()));
        gui.getBreakfastCalloriesForItem().setText(String.valueOf(foodItem.getNutrValue().getCallories()));
    }


}
