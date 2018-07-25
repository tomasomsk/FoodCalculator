package gui.listeners;

import apiobjectswithname.ObjectsWithNameList;
import gui.GuiForm;
import model.FoodItem;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import static gui.GuiForm.foodItemsSimpleList;

public class FoodItemsListSelectionHandler implements ListSelectionListener {

    private GuiForm gui;

    public FoodItemsListSelectionHandler(GuiForm gui) {
        this.gui = gui;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        ListSelectionModel lsm = (ListSelectionModel) e.getSource();
        int minIndex = lsm.getMinSelectionIndex();
        int maxIndex = lsm.getMaxSelectionIndex();
        for (int i = minIndex; i <= maxIndex; i++) {
            if (lsm.isSelectedIndex(i)) {
                String foodItemName = (String) gui.getFoodItemsJListModel().get(i);
                FoodItem foodItem = foodItemsSimpleList.getElementWithName(foodItemName);
                gui.getProteinsOn100g().setText(String.valueOf(foodItem.getNutrValue().getProtein()));
                gui.getCarboOn100g().setText(String.valueOf(foodItem.getNutrValue().getCarbo()));
                gui.getFatsOn100g().setText(String.valueOf(foodItem.getNutrValue().getFats()));
                gui.getCalloriesOn100g().setText(String.valueOf(foodItem.getNutrValue().getCallories()));
                break;
            }
        }
    }
}
