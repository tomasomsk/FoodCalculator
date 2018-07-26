import gui.listeners.breakfast.DeleteFromBreakfastButtonHandler;
import gui.listeners.breakfast.InBreakfastButtonHandler;
import gui.listeners.breakfast.BreakfastListSelectionHandler;
import gui.listeners.FoodItemsListSelectionHandler;
import gui.GuiForm;
import gui.listeners.secondbreakfast.InSecondBreakfastButtonHandler;

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
        gui.getInSecondBreakfastButton().addActionListener(new InSecondBreakfastButtonHandler(gui));
    }

}
