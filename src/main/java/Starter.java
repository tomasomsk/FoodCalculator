import gui.listeners.BreakfastButtonHandler;
import gui.listeners.FoodItemsListSelectionHandler;
import gui.GuiForm;

import javax.swing.*;

import static importfromoutside.ImportFromExcel.importFoodItems;

public class Starter {

    public static void main(String[] args) {
        GuiForm gui = new GuiForm();
        gui.foodItemsSimpleList = importFoodItems();
        gui.fillFoodItemsList();

        gui.getFoodItemsJList().getSelectionModel().addListSelectionListener(new FoodItemsListSelectionHandler(gui));
        gui.getInBreakfastButton().addActionListener(new BreakfastButtonHandler(gui));
    }

}
