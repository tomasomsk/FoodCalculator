package gui.listeners.secondbreakfast;

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
import static gui.GuiFormWithScroll.secondBreakfastObject;

public class DeleteFromSecondBreakfastButtonHandler extends Handlers implements ActionListener {

    public DeleteFromSecondBreakfastButtonHandler(Forms gui) {
        super(gui);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (getValueFromSelection(gui.getSecondBreakfastJList().getSelectionModel(), gui.getSecondBreakfastListModel()) == null) {
            JOptionPane.showMessageDialog(new JFrame(), NO_SELECTION_IN_FOODINTAKE_SECTION);
        } else {
            Portion portion = getPortionToDelete(gui.getSecondBreakfastJList(), gui.getSecondBreakfastListModel(), secondBreakfastObject);

            secondBreakfastObject.removePortion(portion);

            calculateFoodIntakeIndicators(portion, secondBreakfastObject, MINUS,
                    gui.getSecondBreakfastListModel(),
                    gui.getSecondBreakfastJList(),
                    gui.getSecondBreakfastProteinsCommon(),
                    gui.getSecondBreakfastCarboCommon(),
                    gui.getSecondBreakfastFatsCommon(),
                    gui.getSecondBreakfastCalloriesCommon(),
                    gui.getSecondBreakfastWeightForItem(),
                    gui.getSecondBreakfastProteinForItem(),
                    gui.getSecondBreakfastCarboForItem(),
                    gui.getSecondBreakfastFatsForItem(),
                    gui.getSecondBreakfastCalloriesForItem());
        }
    }
}
