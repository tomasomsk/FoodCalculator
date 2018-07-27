package gui.listeners;

import gui.GuiForm;
import model.FoodItem;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import static gui.GuiForm.foodItemsSimpleList;

public class FoodItemsListSelectionHandler extends Handlers implements ListSelectionListener {

    public FoodItemsListSelectionHandler(GuiForm gui) {
        super(gui);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        ListSelectionModel lsm = (ListSelectionModel) e.getSource();
        if (!lsm.isSelectionEmpty()) {
            FoodItem foodItem = foodItemsSimpleList.getElementWithName(getValueFromSelection(lsm, gui.getFoodItemsJListModel()));
            gui.getProteinsOn100g().setText(String.valueOf(foodItem.getNutrValue().getProtein()));
            gui.getCarboOn100g().setText(String.valueOf(foodItem.getNutrValue().getCarbo()));
            gui.getFatsOn100g().setText(String.valueOf(foodItem.getNutrValue().getFats()));
            gui.getCalloriesOn100g().setText(String.valueOf(foodItem.getNutrValue().getCallories()));
            gui.getPortionWeight().setText("");
        }
    }
}
