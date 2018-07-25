package gui.listeners;

import gui.GuiForm;
import model.FoodItem;

import javax.swing.*;

import static gui.GuiForm.foodItemsSimpleList;

public class Handlers {

    GuiForm gui;

    public Handlers(GuiForm gui) {
        this.gui = gui;
    }

    public FoodItem getFoodItemFromSelection(ListSelectionModel lsm) {
        int minIndex = lsm.getMinSelectionIndex();
        int maxIndex = lsm.getMaxSelectionIndex();
        FoodItem foodItem = new FoodItem();
        for (int i = minIndex; i <= maxIndex; i++) {
            if (lsm.isSelectedIndex(i)) {
                String foodItemName = (String) gui.getFoodItemsJListModel().get(i);
                foodItem = foodItemsSimpleList.getElementWithName(foodItemName);
                break;
            }
        }
        return foodItem;
    }

}
