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

    public BreakfastListSelectionHandler(GuiForm gui) {
        super(gui);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        setItemsTextFieldsForFoodIntake(e, gui.getBreakfastProteinForItem(),
                gui.getBreakfastCarboForItem(),
                gui.getBreakfastFatsForItem(),
                gui.getBreakfastCalloriesForItem(),
                gui.getBreakfastWeightForItem());
    }




}
