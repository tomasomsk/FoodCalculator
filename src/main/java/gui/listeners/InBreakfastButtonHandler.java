package gui.listeners;

import gui.GuiForm;
import model.FoodItem;
import model.Portion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static common.factories.PortionFactory.makePortion;
import static gui.GuiForm.breakfastObject;
import static gui.GuiForm.foodItemsSimpleList;

public class InBreakfastButtonHandler extends Handlers implements ActionListener {

    public InBreakfastButtonHandler(GuiForm gui) {
        super(gui);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (getValueFromSelection(gui.getFoodItemsJList().getSelectionModel(), gui.getFoodItemsJListModel()) == null) {
            JOptionPane.showMessageDialog(new JFrame(), "Не выбран продукт из списка продуктов");
        } else {
            if (gui.getPortionWeight().getText().equals("")) {
                JOptionPane.showMessageDialog(new JFrame(), "Не задан вес порции");
            } else {
                FoodItem foodItem = foodItemsSimpleList.getElementWithName(
                        getValueFromSelection(
                                gui.getFoodItemsJList().getSelectionModel(),
                                gui.getFoodItemsJListModel()));
                Double portionWeight = Double.parseDouble(gui.getPortionWeight().getText());
                Portion portion = makePortion(foodItem, portionWeight);
                breakfastObject.addPortion(portion);

                calculateBreakfastIndicators(portion, PLUS);

            }
        }


    }


}
