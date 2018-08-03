package applaunch;

import apiobjectswithname.ObjectsWithNameList;
import gui.GuiFormWithScroll;
import gui.listeners.FoodItemsListSelectionHandler;
import gui.listeners.breakfast.BreakfastListSelectionHandler;
import gui.listeners.breakfast.DeleteFromBreakfastButtonHandler;
import gui.listeners.breakfast.InBreakfastButtonHandler;
import gui.listeners.dinner.DeleteFromDinnerButtonHandler;
import gui.listeners.dinner.DinnerListSelectionHandler;
import gui.listeners.dinner.InDinnerButtonHandler;
import gui.listeners.lunch.DeleteFromLunchButtonHandler;
import gui.listeners.lunch.InLunchButtonHandler;
import gui.listeners.lunch.LunchListSelectionHandler;
import gui.listeners.secondbreakfast.DeleteFromSecondBreakfastButtonHandler;
import gui.listeners.secondbreakfast.InSecondBreakfastButtonHandler;
import gui.listeners.secondbreakfast.SecondBreakfastListSelectionHandler;
import gui.listeners.seconddinner.DeleteFromSecondDinnerButtonHandler;
import gui.listeners.seconddinner.InSecondDinnerButtonHandler;
import gui.listeners.seconddinner.SecondDinnerListSelectionHandler;
import model.FoodItem;

import static excel.ExcelHelper.importFoodItems;

public class Starter {

    public static ObjectsWithNameList<FoodItem> foodItemsSimpleList;

    public static void main(String[] args) {

        GuiFormWithScroll guiFormWithScroll = new GuiFormWithScroll();
        foodItemsSimpleList = importFoodItems();
        guiFormWithScroll.fillFoodItemsList();

        guiFormWithScroll.getFoodItemsJList().getSelectionModel().addListSelectionListener(new FoodItemsListSelectionHandler(guiFormWithScroll));

        guiFormWithScroll.getInBreakfastButton().addActionListener(new InBreakfastButtonHandler(guiFormWithScroll));
        guiFormWithScroll.getDeleteFromBreakfastButton().addActionListener(new DeleteFromBreakfastButtonHandler(guiFormWithScroll));
        guiFormWithScroll.getBreakfastJList().getSelectionModel().addListSelectionListener(new BreakfastListSelectionHandler(guiFormWithScroll));

        guiFormWithScroll.getInSecondBreakfastButton().addActionListener(new InSecondBreakfastButtonHandler(guiFormWithScroll));
        guiFormWithScroll.getDeleteFromSecondBreakfastButton().addActionListener(new DeleteFromSecondBreakfastButtonHandler(guiFormWithScroll));
        guiFormWithScroll.getSecondBreakfastJList().getSelectionModel().addListSelectionListener(new SecondBreakfastListSelectionHandler(guiFormWithScroll));

        guiFormWithScroll.getInLunchButton().addActionListener(new InLunchButtonHandler(guiFormWithScroll));
        guiFormWithScroll.getDeleteFromLunchButton().addActionListener(new DeleteFromLunchButtonHandler(guiFormWithScroll));
        guiFormWithScroll.getLunchJList().getSelectionModel().addListSelectionListener(new LunchListSelectionHandler(guiFormWithScroll));

        guiFormWithScroll.getInDinnerButton().addActionListener(new InDinnerButtonHandler(guiFormWithScroll));
        guiFormWithScroll.getDeleteFromDinnerButton().addActionListener(new DeleteFromDinnerButtonHandler(guiFormWithScroll));
        guiFormWithScroll.getDinnerJList().getSelectionModel().addListSelectionListener(new DinnerListSelectionHandler(guiFormWithScroll));

        guiFormWithScroll.getInSecondDinnerButton().addActionListener(new InSecondDinnerButtonHandler(guiFormWithScroll));
        guiFormWithScroll.getDeleteFromSecondDinnerButton().addActionListener(new DeleteFromSecondDinnerButtonHandler(guiFormWithScroll));
        guiFormWithScroll.getSecondDinnerJList().getSelectionModel().addListSelectionListener(new SecondDinnerListSelectionHandler(guiFormWithScroll));
        

//        GuiForm gui = new GuiForm();
//        foodItemsSimpleList = importFoodItems();
//        gui.fillFoodItemsList();
//
//        gui.getFoodItemsJList().getSelectionModel().addListSelectionListener(new FoodItemsListSelectionHandler(gui));
//
//        gui.getInBreakfastButton().addActionListener(new InBreakfastButtonHandler(gui));
//        gui.getDeleteFromBreakfastButton().addActionListener(new DeleteFromBreakfastButtonHandler(gui));
//        gui.getBreakfastJList().getSelectionModel().addListSelectionListener(new BreakfastListSelectionHandler(gui));
//
//        gui.getInSecondBreakfastButton().addActionListener(new InSecondBreakfastButtonHandler(gui));
//        gui.getDeleteFromSecondBreakfastButton().addActionListener(new DeleteFromSecondBreakfastButtonHandler(gui));
//        gui.getSecondBreakfastJList().getSelectionModel().addListSelectionListener(new SecondBreakfastListSelectionHandler(gui));
//
//        gui.getInLunchButton().addActionListener(new InLunchButtonHandler(gui));
//        gui.getDeleteFromLunchButton().addActionListener(new DeleteFromLunchButtonHandler(gui));
//        gui.getLunchJList().getSelectionModel().addListSelectionListener(new LunchListSelectionHandler(gui));
//
//        gui.getInDinnerButton().addActionListener(new InDinnerButtonHandler(gui));
//        gui.getDeleteFromDinnerButton().addActionListener(new DeleteFromDinnerButtonHandler(gui));
//        gui.getDinnerJList().getSelectionModel().addListSelectionListener(new DinnerListSelectionHandler(gui));
//
//        gui.getInSecondDinnerButton().addActionListener(new InSecondDinnerButtonHandler(gui));
//        gui.getDeleteFromSecondDinnerButton().addActionListener(new DeleteFromSecondDinnerButtonHandler(gui));
//        gui.getSecondDinnerJList().getSelectionModel().addListSelectionListener(new SecondDinnerListSelectionHandler(gui));
    }
}
