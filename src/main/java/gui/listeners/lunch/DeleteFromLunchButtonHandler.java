package gui.listeners.lunch;

import gui.GuiForm;
import gui.listeners.Handlers;
import interfaces.Forms;
import model.FoodIntake;
import model.FoodItem;
import model.Portion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Collectors;

import static applaunch.Starter.foodItemsSimpleList;
import static gui.GuiForm.lunchObject;

public class DeleteFromLunchButtonHandler extends Handlers implements ActionListener {

    public DeleteFromLunchButtonHandler(Forms gui) {
        super(gui);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (getValueFromSelection(gui.getLunchJList().getSelectionModel(), gui.getLunchListModel()) == null) {
            JOptionPane.showMessageDialog(new JFrame(), NO_SELECTION_IN_FOODINTAKE_SECTION);
        } else {
            Portion portion = getPortionToDelete(gui.getLunchJList(), gui.getLunchListModel(), lunchObject);

            lunchObject.removePortion(portion);

            calculateFoodIntakeIndicators(portion, lunchObject, MINUS,
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

    public Portion getPortionToDelete(JList jlist, DefaultListModel jlistModel, FoodIntake foodIntakeObject) {
        FoodItem foodItem = foodItemsSimpleList.getElementWithName(
                getValueFromSelection(
                        jlist.getSelectionModel(),
                        jlistModel));
        return foodIntakeObject.getPortions().stream()
                .filter(item -> item.getFoodItem().getName().equals(foodItem.getName()))
                .collect(Collectors.toList()).get(0);
    }
}
