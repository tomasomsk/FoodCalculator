package gui.listeners;

import gui.GuiForm;
import model.FoodItem;
import model.Portion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static gui.GuiForm.breakfastObject;
import static gui.GuiForm.foodItemsSimpleList;

public class BreakfastButtonHandler extends Handlers implements ActionListener {

    public BreakfastButtonHandler(GuiForm gui) {
        super(gui);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FoodItem foodItem = foodItemsSimpleList.getElementWithName(
                getValueFromSelection(
                        gui.getFoodItemsJList().getSelectionModel()));
        String portionWeight = gui.getPortionWeight().getText();
        Portion portion = new Portion();
        portion.setFoodItem(foodItem);

        breakfastObject.addPortion();

    }
}
