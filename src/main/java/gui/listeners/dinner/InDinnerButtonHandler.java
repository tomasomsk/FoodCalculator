package gui.listeners.dinner;

import applaunch.Starter;
import gui.listeners.Handlers;
import interfaces.Forms;
import model.FoodItem;
import model.Portion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Collectors;

import static applaunch.Starter.foodItemsSimpleList;
import static common.factories.PortionFactory.makePortion;
import static gui.GuiFormWithScroll.dinnerObject;

public class InDinnerButtonHandler extends Handlers implements ActionListener {

    public InDinnerButtonHandler(Forms gui) {
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
                if (dinnerObject.getPortions() != null &&
                        !dinnerObject.getPortions().stream()
                                .filter(item -> item.getFoodItem().getName().equals(foodItem.getName()))
                                .collect(Collectors.toList())
                                .isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(),
                            String.format(ADDING_THE_SAME_PRODUCT, dinnerObject.getName(), foodItem.getName()));
                } else {
                    Double portionWeight = Double.parseDouble(gui.getPortionWeight().getText());
                    Portion portion = makePortion(foodItem, portionWeight);

                    dinnerObject.addPortion(portion);

                    calculateFoodIntakeIndicators(portion, dinnerObject, PLUS,
                            gui.getDinnerListModel(),
                            gui.getDinnerJList(),
                            gui.getDinnerProteinsCommon(),
                            gui.getDinnerCarboCommon(),
                            gui.getDinnerFatsCommon(),
                            gui.getDinnerCalloriesCommon(),
                            gui.getDinnerWeightForItem(),
                            gui.getDinnerProteinForItem(),
                            gui.getDinnerCarboForItem(),
                            gui.getDinnerFatsForItem(),
                            gui.getDinnerCalloriesForItem());
                }
            }
        }
    }
}