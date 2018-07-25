import gui.GuiForm;

import javax.swing.*;

import static importfromoutside.ImportFromExcel.importFoodItems;

public class Starter {

    public static void main(String[] args) {
        GuiForm gui = new GuiForm();
        gui.setFoodItemsSimpleList(importFoodItems());
        gui.setFoodItemsJListModel(new DefaultListModel());
        gui.fillFoodItemsList();
    }

}
