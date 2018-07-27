package gui.listeners.lunch;

import gui.GuiForm;
import gui.listeners.Handlers;
import model.FoodItem;
import model.Portion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Collectors;

import static common.factories.PortionFactory.makePortion;
import static gui.GuiForm.lunchObject;
import static gui.GuiForm.foodItemsSimpleList;

public class InLunchButtonHandler extends Handlers implements ActionListener {

    public InLunchButtonHandler(GuiForm gui) {
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
                if (lunchObject.getPortions() != null &&
                        !lunchObject.getPortions().stream()
                                .filter(item -> item.getFoodItem().getName().equals(foodItem.getName()))
                                .collect(Collectors.toList())
                                .isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(),
                            String.format(ADDING_THE_SAME_PRODUCT, lunchObject.getName(), foodItem.getName()));
                } else {
                    Double portionWeight = Double.parseDouble(gui.getPortionWeight().getText());
                    Portion portion = makePortion(foodItem, portionWeight);

                    lunchObject.addPortion(portion);

                    calculateFoodIntakeIndicators(portion, lunchObject, PLUS,
                            gui.getLunchListModel(),
                            gui.getLunchJList(),
                            gui.getLunchProteinsCommon(),
                            gui.getLunchCarboCommon(),
                            gui.getLunchFatsCommon(),
                            gui.getLunchCalloriesCommon(),
                            gui.getLunchWeightForItem(),
                            gui.getLunchProteinForItem(),
                            gui.getLunchCarboForItem(),
                            gui.getLunchFatsForItem(),
                            gui.getLunchCalloriesForItem());
                }
            }
        }
    }
}