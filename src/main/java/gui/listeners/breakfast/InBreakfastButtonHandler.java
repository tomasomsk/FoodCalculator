package gui.listeners.breakfast;

import gui.GuiForm;
import gui.listeners.Handlers;
import interfaces.Forms;
import model.FoodItem;
import model.Portion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Collectors;

import static common.factories.PortionFactory.makePortion;
import static gui.GuiForm.breakfastObject;
import static gui.GuiForm.foodItemsSimpleList;

public class InBreakfastButtonHandler extends Handlers implements ActionListener {

    public InBreakfastButtonHandler(Forms gui) {
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
                if (breakfastObject.getPortions() != null &&
                        !breakfastObject.getPortions().stream()
                                .filter(item -> item.getFoodItem().getName().equals(foodItem.getName()))
                                .collect(Collectors.toList())
                                .isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(),
                            String.format(ADDING_THE_SAME_PRODUCT, breakfastObject.getName(), foodItem.getName()));
                } else {
                    Double portionWeight = Double.parseDouble(gui.getPortionWeight().getText());
                    Portion portion = makePortion(foodItem, portionWeight);

                    breakfastObject.addPortion(portion);

                    calculateFoodIntakeIndicators(portion, breakfastObject, PLUS,
                            gui.getBreakfastListModel(),
                            gui.getBreakfastJList(),
                            gui.getBreakfastProteinsCommon(),
                            gui.getBreakfastCarboCommon(),
                            gui.getBreakfastFatsCommon(),
                            gui.getBreakFastCalloriesCommon(),
                            gui.getBreakfastWeightForItem(),
                            gui.getBreakfastProteinForItem(),
                            gui.getBreakfastCarboForItem(),
                            gui.getBreakfastFatsForItem(),
                            gui.getBreakfastCalloriesForItem());
                }
            }
        }
    }
}