package gui.listeners;

import gui.GuiForm;
import model.FoodItem;
import model.Portion;

import javax.sound.sampled.Port;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static common.factories.PortionFactory.makePortion;
import static gui.GuiForm.breakfastObject;
import static gui.GuiForm.foodItemsSimpleList;

public class BreakfastButtonHandler extends Handlers implements ActionListener {

    public BreakfastButtonHandler(GuiForm gui) {
        super(gui);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (getValueFromSelection(gui.getFoodItemsJList().getSelectionModel()) == null) {
            JOptionPane.showMessageDialog(new JFrame(), "Не выбран продукт из списка продуктов");
        } else {
            if (gui.getPortionWeight().getText().equals("")) {
                JOptionPane.showMessageDialog(new JFrame(), "Не задан вес порции");
            } else {
                FoodItem foodItem = foodItemsSimpleList.getElementWithName(
                        getValueFromSelection(
                                gui.getFoodItemsJList().getSelectionModel()));
                Double portionWeight = Double.parseDouble(gui.getPortionWeight().getText());
                Portion portion = makePortion(foodItem, portionWeight);

                breakfastObject.addPortion(portion);
                gui.getBreakfastListModel().clear();
                Double breakfastProteinCommon = 0d;
                Double breakfastCarboCommon = 0d;
                Double breakfastFatsCommon = 0d;
                Double breakfastCalloriesCommon = 0d;
                for (Portion portionInFoodIntake : breakfastObject.getPortions()) {
                    gui.getBreakfastListModel().addElement(portionInFoodIntake.getFoodItem().getName());
                    breakfastProteinCommon += portionInFoodIntake.getNutrValue().getProtein();
                    breakfastCarboCommon += portionInFoodIntake.getNutrValue().getCarbo();
                    breakfastFatsCommon += portionInFoodIntake.getNutrValue().getFats();
                    breakfastCalloriesCommon += portionInFoodIntake.getNutrValue().getCallories();
                }
                gui.getBreakfastList().setModel(gui.getBreakfastListModel());
                gui.getBreakfastProteinsCommon().setText(String.valueOf(breakfastProteinCommon));
                gui.getBreakfastCarboCommon().setText(String.valueOf(breakfastCarboCommon));
                gui.getBreakfastFatsCommon().setText(String.valueOf(breakfastFatsCommon));
                gui.getBreakFastCalloriesCommon().setText(String.valueOf(breakfastCalloriesCommon));
            }
        }


    }
}
