import gui.listeners.FoodItemsListSelectionHandler;
import gui.GuiForm;

import javax.swing.*;

import static importfromoutside.ImportFromExcel.importFoodItems;

public class Starter {

    public static void main(String[] args) {
        GuiForm gui = new GuiForm();
        gui.foodItemsSimpleList = importFoodItems();
        gui.setFoodItemsJListModel(new DefaultListModel());
        gui.fillFoodItemsList();

        gui.getFoodItemsJList().getSelectionModel().addListSelectionListener(new FoodItemsListSelectionHandler(gui));
    }

}
