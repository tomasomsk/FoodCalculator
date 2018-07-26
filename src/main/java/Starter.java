import gui.listeners.DeleteFromBreakfastButtonHandler;
import gui.listeners.InBreakfastButtonHandler;
import gui.listeners.BreakfastListSelectionHandler;
import gui.listeners.FoodItemsListSelectionHandler;
import gui.GuiForm;

import static importfromoutside.ImportFromExcel.importFoodItems;

public class Starter {

    public static void main(String[] args) {
        GuiForm gui = new GuiForm();
        gui.foodItemsSimpleList = importFoodItems();
        gui.fillFoodItemsList();

        gui.getFoodItemsJList().getSelectionModel().addListSelectionListener(new FoodItemsListSelectionHandler(gui));
        gui.getInBreakfastButton().addActionListener(new InBreakfastButtonHandler(gui));
        gui.getBreakfastJList().getSelectionModel().addListSelectionListener(new BreakfastListSelectionHandler(gui));
        gui.getDeleteFromBreakfastButton().addActionListener(new DeleteFromBreakfastButtonHandler(gui));
    }

}
