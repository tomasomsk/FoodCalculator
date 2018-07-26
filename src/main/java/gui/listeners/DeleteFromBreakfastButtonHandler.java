package gui.listeners;

import gui.GuiForm;
import model.FoodItem;
import model.Portion;

import javax.sound.sampled.Port;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Collectors;

import static common.factories.PortionFactory.makePortion;
import static gui.GuiForm.breakfastObject;
import static gui.GuiForm.foodItemsSimpleList;

public class DeleteFromBreakfastButtonHandler extends Handlers implements ActionListener {

    public DeleteFromBreakfastButtonHandler(GuiForm gui) {
        super(gui);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (getValueFromSelection(gui.getBreakfastJList().getSelectionModel(), gui.getBreakfastListModel()) == null) {
            JOptionPane.showMessageDialog(new JFrame(), String.format(NO_SELECTION_IN_FOODINTAKE_SECTION, " завтраке "));
        } else {
            FoodItem foodItem = foodItemsSimpleList.getElementWithName(
                    getValueFromSelection(
                            gui.getBreakfastJList().getSelectionModel(),
                            gui.getBreakfastListModel()));
            Portion portion = breakfastObject.getPortions().stream()
                    .filter(item -> item.getFoodItem().getName().equals(foodItem.getName()))
                    .collect(Collectors.toList()).get(0);

            breakfastObject.removePortion(portion);

            calculateBreakfastIndicators(portion, MINUS);


        }
    }
}
