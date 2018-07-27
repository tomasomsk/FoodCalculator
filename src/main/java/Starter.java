import gui.listeners.breakfast.DeleteFromBreakfastButtonHandler;
import gui.listeners.breakfast.InBreakfastButtonHandler;
import gui.listeners.breakfast.BreakfastListSelectionHandler;
import gui.listeners.FoodItemsListSelectionHandler;
import gui.GuiForm;
import gui.listeners.secondbreakfast.DeleteFromSecondBreakfastButtonHandler;
import gui.listeners.secondbreakfast.InSecondBreakfastButtonHandler;
import gui.listeners.secondbreakfast.SecondBreakfastListSelectionHandler;

import static gui.GuiForm.*;
import static importfromoutside.ImportFromExcel.importFoodItems;

public class Starter {

    public static void main(String[] args) {
        GuiForm gui = new GuiForm();
        foodItemsSimpleList = importFoodItems();
        gui.fillFoodItemsList();

        gui.getFoodItemsJList().getSelectionModel().addListSelectionListener(new FoodItemsListSelectionHandler(gui));

        gui.getInBreakfastButton().addActionListener(new InBreakfastButtonHandler(gui));
        gui.getDeleteFromBreakfastButton().addActionListener(new DeleteFromBreakfastButtonHandler(gui));
        gui.getBreakfastJList().getSelectionModel().addListSelectionListener(new BreakfastListSelectionHandler(gui));

        gui.getInSecondBreakfastButton().addActionListener(new InSecondBreakfastButtonHandler(gui));
        gui.getDeleteFromSecondBreakfastButton().addActionListener(new DeleteFromSecondBreakfastButtonHandler(gui));
        gui.getSecondBreakfastJList().getSelectionModel().addListSelectionListener(new SecondBreakfastListSelectionHandler(gui));



    }
}
