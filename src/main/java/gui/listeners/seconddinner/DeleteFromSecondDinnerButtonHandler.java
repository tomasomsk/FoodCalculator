package gui.listeners.seconddinner;

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

import static gui.GuiForm.secondDinnerObject;
import static gui.GuiForm.foodItemsSimpleList;

public class DeleteFromSecondDinnerButtonHandler extends Handlers implements ActionListener {

    public DeleteFromSecondDinnerButtonHandler(Forms gui) {
        super(gui);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (getValueFromSelection(gui.getSecondDinnerJList().getSelectionModel(), gui.getSecondDinnerListModel()) == null) {
            JOptionPane.showMessageDialog(new JFrame(), NO_SELECTION_IN_FOODINTAKE_SECTION);
        } else {
            Portion portion = getPortionToDelete(gui.getSecondDinnerJList(), gui.getSecondDinnerListModel(), secondDinnerObject);

            secondDinnerObject.removePortion(portion);

            calculateFoodIntakeIndicators(portion, secondDinnerObject, MINUS,
                    gui.getSecondDinnerListModel(),
                    gui.getSecondDinnerJList(),
                    gui.getSecondDinnerProteinsCommon(),
                    gui.getSecondDinnerCarboCommon(),
                    gui.getSecondDinnerFatsCommon(),
                    gui.getSecondDinnerCalloriesCommon(),
                    gui.getSecondDinnerWeightForItem(),
                    gui.getSecondDinnerProteinForItem(),
                    gui.getSecondDinnerCarboForItem(),
                    gui.getSecondDinnerFatsForItem(),
                    gui.getSecondDinnerCalloriesForItem());
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
