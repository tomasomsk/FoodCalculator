package gui.listeners.breakfast;

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
import static gui.GuiFormWithScroll.breakfastObject;

public class DeleteFromBreakfastButtonHandler extends Handlers implements ActionListener {

    public DeleteFromBreakfastButtonHandler(Forms gui) {
        super(gui);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (getValueFromSelection(gui.getBreakfastJList().getSelectionModel(), gui.getBreakfastListModel()) == null) {
            JOptionPane.showMessageDialog(new JFrame(), NO_SELECTION_IN_FOODINTAKE_SECTION);
        } else {
            Portion portion = getPortionToDelete(gui.getBreakfastJList(), gui.getBreakfastListModel(), breakfastObject);

            breakfastObject.removePortion(portion);

            calculateFoodIntakeIndicators(portion, breakfastObject, MINUS,
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
