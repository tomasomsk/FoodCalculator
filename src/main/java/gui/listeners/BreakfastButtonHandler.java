package gui.listeners;

import gui.GuiForm;
import model.FoodItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static gui.GuiForm.breakfastObject;

public class BreakfastButtonHandler extends Handlers implements ActionListener {

    public BreakfastButtonHandler(GuiForm gui) {
        super(gui);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FoodItem foodItem = getFoodItemFromSelection(gui.getFoodItemsJList().getSelectionModel());
//        breakfastObject.

    }
}
