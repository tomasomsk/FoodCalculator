package gui.listeners.breakfast;

import gui.GuiForm;
import gui.listeners.Handlers;
import model.FoodItem;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.util.stream.Collectors;

import static gui.GuiForm.breakfastObject;
import static gui.GuiForm.foodItemsSimpleList;

public class BreakfastListSelectionHandler extends Handlers implements ListSelectionListener {

//    private GuiForm gui;

    public BreakfastListSelectionHandler(GuiForm gui) {
        super(gui);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        ListSelectionModel lsm = (ListSelectionModel) e.getSource();
        if (!lsm.isSelectionEmpty()) {
            FoodItem foodItem = foodItemsSimpleList.getElementWithName(getValueFromSelection(lsm, gui.getBreakfastListModel()));
            gui.getBreakfastProteinForItem().setText(String.valueOf(foodItem.getNutrValue().getProtein()));
            gui.getBreakfastCarboForItem().setText(String.valueOf(foodItem.getNutrValue().getCarbo()));
            gui.getBreakfastFatsForItem().setText(String.valueOf(foodItem.getNutrValue().getFats()));
            gui.getBreakfastCalloriesForItem().setText(String.valueOf(foodItem.getNutrValue().getCallories()));
            gui.getBreakfastWeightForItem().setText(String.valueOf(breakfastObject.getPortions().stream()
                    .filter(item -> item.getFoodItem().getName().equals(foodItem.getName()))
                    .collect(Collectors.toList()).get(0).getWeight()));
        }
    }


}
