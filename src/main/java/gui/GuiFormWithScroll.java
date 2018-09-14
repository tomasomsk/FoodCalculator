package gui;

import apiobjectswithname.ObjectsWithNameList;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import interfaces.Forms;
import model.FoodIntake;
import model.FoodItem;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static applaunch.Starter.foodItemsSimpleList;

public class GuiFormWithScroll extends JFrame implements Forms {
    private JPanel mainPanel;

    private JList foodItemsJList;
    private DefaultListModel foodItemsJListModel = new DefaultListModel();
    private JTextField proteinsOn100g;
    private JTextField carboOn100g;
    private JTextField fatsOn100g;
    private JTextField calloriesOn100g;

    private JTextField portionWeight;

    private JList breakfastJList;
    private DefaultListModel breakfastListModel = new DefaultListModel();
    public static FoodIntake breakfastObject = new FoodIntake("Завтрак");
    private JButton inBreakfastButton;
    private JButton deleteFromBreakfastButton;
    private JTextField breakfastProteinsCommon;
    private JTextField breakfastCarboCommon;
    private JTextField breakfastFatsCommon;
    private JTextField breakFastCalloriesCommon;
    private JTextField breakfastWeightForItem;
    private JTextField breakfastProteinForItem;
    private JTextField breakfastCarboForItem;
    private JTextField breakfastFatsForItem;
    private JTextField breakfastCalloriesForItem;

    private JList secondBreakfastJList;
    private DefaultListModel secondBreakfastListModel = new DefaultListModel();
    public static FoodIntake secondBreakfastObject = new FoodIntake("Второй завтрак");
    private JButton inSecondBreakfastButton;
    private JButton deleteFromSecondBreakfastButton;
    private JTextField secondBreakfastProteinsCommon;
    private JTextField secondBreakfastCarboCommon;
    private JTextField secondBreakfastFatsCommon;
    private JTextField secondBreakfastCalloriesCommon;
    private JTextField secondBreakfastWeightForItem;
    private JTextField secondBreakfastProteinForItem;
    private JTextField secondBreakfastCarboForItem;
    private JTextField secondBreakfastFatsForItem;
    private JTextField secondBreakfastCalloriesForItem;

    private JList lunchJList;
    private DefaultListModel lunchListModel = new DefaultListModel();
    public static FoodIntake lunchObject = new FoodIntake("Обед");
    private JButton inLunchButton;
    private JButton deleteFromLunchButton;
    private JTextField lunchProteinsCommon;
    private JTextField lunchCarboCommon;
    private JTextField lunchFatsCommon;
    private JTextField lunchCalloriesCommon;
    private JTextField lunchWeightForItem;
    private JTextField lunchProteinForItem;
    private JTextField lunchCarboForItem;
    private JTextField lunchFatsForItem;
    private JTextField lunchCalloriesForItem;

    private JList dinnerJList;
    private DefaultListModel dinnerListModel = new DefaultListModel();
    public static FoodIntake dinnerObject = new FoodIntake("Ужин");
    private JButton inDinnerButton;
    private JButton deleteFromDinnerButton;
    private JTextField dinnerProteinsCommon;
    private JTextField dinnerCarboCommon;
    private JTextField dinnerFatsCommon;
    private JTextField dinnerCalloriesCommon;
    private JTextField dinnerWeightForItem;
    private JTextField dinnerProteinForItem;
    private JTextField dinnerCarboForItem;
    private JTextField dinnerFatsForItem;
    private JTextField dinnerCalloriesForItem;

    private JList secondDinnerJList;
    private DefaultListModel secondDinnerListModel = new DefaultListModel();
    public static FoodIntake secondDinnerObject = new FoodIntake("Второй ужин");
    private JButton inSecondDinnerButton;
    private JButton deleteFromSecondDinnerButton;
    private JTextField secondDinnerProteinsCommon;
    private JTextField secondDinnerCarboCommon;
    private JTextField secondDinnerFatsCommon;
    private JTextField secondDinnerCalloriesCommon;
    private JTextField secondDinnerWeightForItem;
    private JTextField secondDinnerProteinForItem;
    private JTextField secondDinnerCarboForItem;
    private JTextField secondDinnerFatsForItem;
    private JTextField secondDinnerCalloriesForItem;

    private JTextField proteinSum;
    private JTextField carboSum;
    private JTextField fatsSum;
    private JTextField calloriesSum;

    private JPanel rootPanel;

    private JButton saveButton;

    public GuiFormWithScroll() {
        setContentPane(rootPanel);
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void fillFoodItemsList() {
        for (FoodItem foodItem : foodItemsSimpleList.getList()) {
            foodItemsJListModel.addElement(foodItem.getName());
        }
        foodItemsJList.setModel(foodItemsJListModel);
    }

    public static ObjectsWithNameList<FoodIntake> getFoodIntakesObjects() {
        ObjectsWithNameList<FoodIntake> result = new ObjectsWithNameList<>(new ArrayList<>());
        result.add(breakfastObject);
        result.add(secondBreakfastObject);
        result.add(lunchObject);
        result.add(dinnerObject);
        result.add(secondDinnerObject);
        return result;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JList getFoodItemsJList() {
        return foodItemsJList;
    }

    public void setFoodItemsJList(JList foodItemsJList) {
        this.foodItemsJList = foodItemsJList;
    }

    public DefaultListModel getFoodItemsJListModel() {
        return foodItemsJListModel;
    }

    public void setFoodItemsJListModel(DefaultListModel foodItemsJListModel) {
        this.foodItemsJListModel = foodItemsJListModel;
    }

    public static ObjectsWithNameList<FoodItem> getFoodItemsSimpleList() {
        return foodItemsSimpleList;
    }

    public static void setFoodItemsSimpleList(ObjectsWithNameList<FoodItem> foodItemsSimpleList) {
        foodItemsSimpleList = foodItemsSimpleList;
    }

    public JTextField getProteinsOn100g() {
        return proteinsOn100g;
    }

    public void setProteinsOn100g(JTextField proteinsOn100g) {
        this.proteinsOn100g = proteinsOn100g;
    }

    public JTextField getCarboOn100g() {
        return carboOn100g;
    }

    public void setCarboOn100g(JTextField carboOn100g) {
        this.carboOn100g = carboOn100g;
    }

    public JTextField getFatsOn100g() {
        return fatsOn100g;
    }

    public void setFatsOn100g(JTextField fatsOn100g) {
        this.fatsOn100g = fatsOn100g;
    }

    public JTextField getCalloriesOn100g() {
        return calloriesOn100g;
    }

    public void setCalloriesOn100g(JTextField calloriesOn100g) {
        this.calloriesOn100g = calloriesOn100g;
    }

    public JTextField getPortionWeight() {
        return portionWeight;
    }

    public void setPortionWeight(JTextField portionWeight) {
        this.portionWeight = portionWeight;
    }

    public JList getBreakfastJList() {
        return breakfastJList;
    }

    public void setBreakfastJList(JList breakfastJList) {
        this.breakfastJList = breakfastJList;
    }

    public DefaultListModel getBreakfastListModel() {
        return breakfastListModel;
    }

    public void setBreakfastListModel(DefaultListModel breakfastListModel) {
        this.breakfastListModel = breakfastListModel;
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public void setSaveButton(JButton saveButton) {
        this.saveButton = saveButton;
    }

    public static FoodIntake getBreakfastObject() {
        return breakfastObject;
    }

    public static void setBreakfastObject(FoodIntake breakfastObject) {
        GuiFormWithScroll.breakfastObject = breakfastObject;
    }

    public JButton getInBreakfastButton() {
        return inBreakfastButton;
    }

    public void setInBreakfastButton(JButton inBreakfastButton) {
        this.inBreakfastButton = inBreakfastButton;
    }

    public JButton getDeleteFromBreakfastButton() {
        return deleteFromBreakfastButton;
    }

    public void setDeleteFromBreakfastButton(JButton deleteFromBreakfastButton) {
        this.deleteFromBreakfastButton = deleteFromBreakfastButton;
    }

    public JTextField getBreakfastProteinsCommon() {
        return breakfastProteinsCommon;
    }

    public void setBreakfastProteinsCommon(JTextField breakfastProteinsCommon) {
        this.breakfastProteinsCommon = breakfastProteinsCommon;
    }

    public JTextField getBreakfastCarboCommon() {
        return breakfastCarboCommon;
    }

    public void setBreakfastCarboCommon(JTextField breakfastCarboCommon) {
        this.breakfastCarboCommon = breakfastCarboCommon;
    }

    public JTextField getBreakfastFatsCommon() {
        return breakfastFatsCommon;
    }

    public void setBreakfastFatsCommon(JTextField breakfastFatsCommon) {
        this.breakfastFatsCommon = breakfastFatsCommon;
    }

    public JTextField getBreakFastCalloriesCommon() {
        return breakFastCalloriesCommon;
    }

    public void setBreakFastCalloriesCommon(JTextField breakFastCalloriesCommon) {
        this.breakFastCalloriesCommon = breakFastCalloriesCommon;
    }

    public JTextField getBreakfastWeightForItem() {
        return breakfastWeightForItem;
    }

    public void setBreakfastWeightForItem(JTextField breakfastWeightForItem) {
        this.breakfastWeightForItem = breakfastWeightForItem;
    }

    public JTextField getBreakfastProteinForItem() {
        return breakfastProteinForItem;
    }

    public void setBreakfastProteinForItem(JTextField breakfastProteinForItem) {
        this.breakfastProteinForItem = breakfastProteinForItem;
    }

    public JTextField getBreakfastCarboForItem() {
        return breakfastCarboForItem;
    }

    public void setBreakfastCarboForItem(JTextField breakfastCarboForItem) {
        this.breakfastCarboForItem = breakfastCarboForItem;
    }

    public JTextField getBreakfastFatsForItem() {
        return breakfastFatsForItem;
    }

    public void setBreakfastFatsForItem(JTextField breakfastFatsForItem) {
        this.breakfastFatsForItem = breakfastFatsForItem;
    }

    public JTextField getBreakfastCalloriesForItem() {
        return breakfastCalloriesForItem;
    }

    public void setBreakfastCalloriesForItem(JTextField breakfastCalloriesForItem) {
        this.breakfastCalloriesForItem = breakfastCalloriesForItem;
    }

    public JList getSecondBreakfastJList() {
        return secondBreakfastJList;
    }

    public void setSecondBreakfastJList(JList secondBreakfastJList) {
        this.secondBreakfastJList = secondBreakfastJList;
    }

    public DefaultListModel getSecondBreakfastListModel() {
        return secondBreakfastListModel;
    }

    public void setSecondBreakfastListModel(DefaultListModel secondBreakfastListModel) {
        this.secondBreakfastListModel = secondBreakfastListModel;
    }

    public static FoodIntake getSecondBreakfastObject() {
        return secondBreakfastObject;
    }

    public static void setSecondBreakfastObject(FoodIntake secondBreakfastObject) {
        GuiFormWithScroll.secondBreakfastObject = secondBreakfastObject;
    }

    public JButton getInSecondBreakfastButton() {
        return inSecondBreakfastButton;
    }

    public void setInSecondBreakfastButton(JButton inSecondBreakfastButton) {
        this.inSecondBreakfastButton = inSecondBreakfastButton;
    }

    public JButton getDeleteFromSecondBreakfastButton() {
        return deleteFromSecondBreakfastButton;
    }

    public void setDeleteFromSecondBreakfastButton(JButton deleteFromSecondBreakfastButton) {
        this.deleteFromSecondBreakfastButton = deleteFromSecondBreakfastButton;
    }

    public JTextField getSecondBreakfastProteinsCommon() {
        return secondBreakfastProteinsCommon;
    }

    public void setSecondBreakfastProteinsCommon(JTextField secondBreakfastProteinsCommon) {
        this.secondBreakfastProteinsCommon = secondBreakfastProteinsCommon;
    }

    public JTextField getSecondBreakfastCarboCommon() {
        return secondBreakfastCarboCommon;
    }

    public void setSecondBreakfastCarboCommon(JTextField secondBreakfastCarboCommon) {
        this.secondBreakfastCarboCommon = secondBreakfastCarboCommon;
    }

    public JTextField getSecondBreakfastFatsCommon() {
        return secondBreakfastFatsCommon;
    }

    public void setSecondBreakfastFatsCommon(JTextField secondBreakfastFatsCommon) {
        this.secondBreakfastFatsCommon = secondBreakfastFatsCommon;
    }

    public JTextField getSecondBreakfastCalloriesCommon() {
        return secondBreakfastCalloriesCommon;
    }

    public void setSecondBreakfastCalloriesCommon(JTextField secondBreakfastCalloriesCommon) {
        this.secondBreakfastCalloriesCommon = secondBreakfastCalloriesCommon;
    }

    public JTextField getSecondBreakfastWeightForItem() {
        return secondBreakfastWeightForItem;
    }

    public void setSecondBreakfastWeightForItem(JTextField secondBreakfastWeightForItem) {
        this.secondBreakfastWeightForItem = secondBreakfastWeightForItem;
    }

    public JTextField getSecondBreakfastProteinForItem() {
        return secondBreakfastProteinForItem;
    }

    public void setSecondBreakfastProteinForItem(JTextField secondBreakfastProteinForItem) {
        this.secondBreakfastProteinForItem = secondBreakfastProteinForItem;
    }

    public JTextField getSecondBreakfastCarboForItem() {
        return secondBreakfastCarboForItem;
    }

    public void setSecondBreakfastCarboForItem(JTextField secondBreakfastCarboForItem) {
        this.secondBreakfastCarboForItem = secondBreakfastCarboForItem;
    }

    public JTextField getSecondBreakfastFatsForItem() {
        return secondBreakfastFatsForItem;
    }

    public void setSecondBreakfastFatsForItem(JTextField secondBreakfastFatsForItem) {
        this.secondBreakfastFatsForItem = secondBreakfastFatsForItem;
    }

    public JTextField getSecondBreakfastCalloriesForItem() {
        return secondBreakfastCalloriesForItem;
    }

    public void setSecondBreakfastCalloriesForItem(JTextField secondBreakfastCalloriesForItem) {
        this.secondBreakfastCalloriesForItem = secondBreakfastCalloriesForItem;
    }

    public JList getLunchJList() {
        return lunchJList;
    }

    public void setLunchJList(JList lunchJList) {
        this.lunchJList = lunchJList;
    }

    public DefaultListModel getLunchListModel() {
        return lunchListModel;
    }

    public void setLunchListModel(DefaultListModel lunchListModel) {
        this.lunchListModel = lunchListModel;
    }

    public static FoodIntake getLunchObject() {
        return lunchObject;
    }

    public static void setLunchObject(FoodIntake lunchObject) {
        GuiFormWithScroll.lunchObject = lunchObject;
    }

    public JButton getInLunchButton() {
        return inLunchButton;
    }

    public void setInLunchButton(JButton inLunchButton) {
        this.inLunchButton = inLunchButton;
    }

    public JButton getDeleteFromLunchButton() {
        return deleteFromLunchButton;
    }

    public void setDeleteFromLunchButton(JButton deleteFromLunchButton) {
        this.deleteFromLunchButton = deleteFromLunchButton;
    }

    public JTextField getLunchProteinsCommon() {
        return lunchProteinsCommon;
    }

    public void setLunchProteinsCommon(JTextField lunchProteinsCommon) {
        this.lunchProteinsCommon = lunchProteinsCommon;
    }

    public JTextField getLunchCarboCommon() {
        return lunchCarboCommon;
    }

    public void setLunchCarboCommon(JTextField lunchCarboCommon) {
        this.lunchCarboCommon = lunchCarboCommon;
    }

    public JTextField getLunchFatsCommon() {
        return lunchFatsCommon;
    }

    public void setLunchFatsCommon(JTextField lunchFatsCommon) {
        this.lunchFatsCommon = lunchFatsCommon;
    }

    public JTextField getLunchCalloriesCommon() {
        return lunchCalloriesCommon;
    }

    public void setLunchCalloriesCommon(JTextField lunchCalloriesCommon) {
        this.lunchCalloriesCommon = lunchCalloriesCommon;
    }

    public JTextField getLunchWeightForItem() {
        return lunchWeightForItem;
    }

    public void setLunchWeightForItem(JTextField lunchWeightForItem) {
        this.lunchWeightForItem = lunchWeightForItem;
    }

    public JTextField getLunchProteinForItem() {
        return lunchProteinForItem;
    }

    public void setLunchProteinForItem(JTextField lunchProteinForItem) {
        this.lunchProteinForItem = lunchProteinForItem;
    }

    public JTextField getLunchCarboForItem() {
        return lunchCarboForItem;
    }

    public void setLunchCarboForItem(JTextField lunchCarboForItem) {
        this.lunchCarboForItem = lunchCarboForItem;
    }

    public JTextField getLunchFatsForItem() {
        return lunchFatsForItem;
    }

    public void setLunchFatsForItem(JTextField lunchFatsForItem) {
        this.lunchFatsForItem = lunchFatsForItem;
    }

    public JTextField getLunchCalloriesForItem() {
        return lunchCalloriesForItem;
    }

    public void setLunchCalloriesForItem(JTextField lunchCalloriesForItem) {
        this.lunchCalloriesForItem = lunchCalloriesForItem;
    }

    public JList getDinnerJList() {
        return dinnerJList;
    }

    public void setDinnerJList(JList dinnerJList) {
        this.dinnerJList = dinnerJList;
    }

    public DefaultListModel getDinnerListModel() {
        return dinnerListModel;
    }

    public void setDinnerListModel(DefaultListModel dinnerListModel) {
        this.dinnerListModel = dinnerListModel;
    }

    public static FoodIntake getDinnerObject() {
        return dinnerObject;
    }

    public static void setDinnerObject(FoodIntake dinnerObject) {
        GuiFormWithScroll.dinnerObject = dinnerObject;
    }

    public JButton getInDinnerButton() {
        return inDinnerButton;
    }

    public void setInDinnerButton(JButton inDinnerButton) {
        this.inDinnerButton = inDinnerButton;
    }

    public JButton getDeleteFromDinnerButton() {
        return deleteFromDinnerButton;
    }

    public void setDeleteFromDinnerButton(JButton deleteFromDinnerButton) {
        this.deleteFromDinnerButton = deleteFromDinnerButton;
    }

    public JTextField getDinnerProteinsCommon() {
        return dinnerProteinsCommon;
    }

    public void setDinnerProteinsCommon(JTextField dinnerProteinsCommon) {
        this.dinnerProteinsCommon = dinnerProteinsCommon;
    }

    public JTextField getDinnerCarboCommon() {
        return dinnerCarboCommon;
    }

    public void setDinnerCarboCommon(JTextField dinnerCarboCommon) {
        this.dinnerCarboCommon = dinnerCarboCommon;
    }

    public JTextField getDinnerFatsCommon() {
        return dinnerFatsCommon;
    }

    public void setDinnerFatsCommon(JTextField dinnerFatsCommon) {
        this.dinnerFatsCommon = dinnerFatsCommon;
    }

    public JTextField getDinnerCalloriesCommon() {
        return dinnerCalloriesCommon;
    }

    public void setDinnerCalloriesCommon(JTextField dinnerCalloriesCommon) {
        this.dinnerCalloriesCommon = dinnerCalloriesCommon;
    }

    public JTextField getDinnerWeightForItem() {
        return dinnerWeightForItem;
    }

    public void setDinnerWeightForItem(JTextField dinnerWeightForItem) {
        this.dinnerWeightForItem = dinnerWeightForItem;
    }

    public JTextField getDinnerProteinForItem() {
        return dinnerProteinForItem;
    }

    public void setDinnerProteinForItem(JTextField dinnerProteinForItem) {
        this.dinnerProteinForItem = dinnerProteinForItem;
    }

    public JTextField getDinnerCarboForItem() {
        return dinnerCarboForItem;
    }

    public void setDinnerCarboForItem(JTextField dinnerCarboForItem) {
        this.dinnerCarboForItem = dinnerCarboForItem;
    }

    public JTextField getDinnerFatsForItem() {
        return dinnerFatsForItem;
    }

    public void setDinnerFatsForItem(JTextField dinnerFatsForItem) {
        this.dinnerFatsForItem = dinnerFatsForItem;
    }

    public JTextField getDinnerCalloriesForItem() {
        return dinnerCalloriesForItem;
    }

    public void setDinnerCalloriesForItem(JTextField dinnerCalloriesForItem) {
        this.dinnerCalloriesForItem = dinnerCalloriesForItem;
    }

    public JList getSecondDinnerJList() {
        return secondDinnerJList;
    }

    public void setSecondDinnerJList(JList secondDinnerJList) {
        this.secondDinnerJList = secondDinnerJList;
    }

    public DefaultListModel getSecondDinnerListModel() {
        return secondDinnerListModel;
    }

    public void setSecondDinnerListModel(DefaultListModel secondDinnerListModel) {
        this.secondDinnerListModel = secondDinnerListModel;
    }

    public static FoodIntake getSecondDinnerObject() {
        return secondDinnerObject;
    }

    public static void setSecondDinnerObject(FoodIntake secondDinnerObject) {
        GuiFormWithScroll.secondDinnerObject = secondDinnerObject;
    }

    public JButton getInSecondDinnerButton() {
        return inSecondDinnerButton;
    }

    public void setInSecondDinnerButton(JButton inSecondDinnerButton) {
        this.inSecondDinnerButton = inSecondDinnerButton;
    }

    public JButton getDeleteFromSecondDinnerButton() {
        return deleteFromSecondDinnerButton;
    }

    public void setDeleteFromSecondDinnerButton(JButton deleteFromSecondDinnerButton) {
        this.deleteFromSecondDinnerButton = deleteFromSecondDinnerButton;
    }

    public JTextField getSecondDinnerProteinsCommon() {
        return secondDinnerProteinsCommon;
    }

    public void setSecondDinnerProteinsCommon(JTextField secondDinnerProteinsCommon) {
        this.secondDinnerProteinsCommon = secondDinnerProteinsCommon;
    }

    public JTextField getSecondDinnerCarboCommon() {
        return secondDinnerCarboCommon;
    }

    public void setSecondDinnerCarboCommon(JTextField secondDinnerCarboCommon) {
        this.secondDinnerCarboCommon = secondDinnerCarboCommon;
    }

    public JTextField getSecondDinnerFatsCommon() {
        return secondDinnerFatsCommon;
    }

    public void setSecondDinnerFatsCommon(JTextField secondDinnerFatsCommon) {
        this.secondDinnerFatsCommon = secondDinnerFatsCommon;
    }

    public JTextField getSecondDinnerCalloriesCommon() {
        return secondDinnerCalloriesCommon;
    }

    public void setSecondDinnerCalloriesCommon(JTextField secondDinnerCalloriesCommon) {
        this.secondDinnerCalloriesCommon = secondDinnerCalloriesCommon;
    }

    public JTextField getSecondDinnerWeightForItem() {
        return secondDinnerWeightForItem;
    }

    public void setSecondDinnerWeightForItem(JTextField secondDinnerWeightForItem) {
        this.secondDinnerWeightForItem = secondDinnerWeightForItem;
    }

    public JTextField getSecondDinnerProteinForItem() {
        return secondDinnerProteinForItem;
    }

    public void setSecondDinnerProteinForItem(JTextField secondDinnerProteinForItem) {
        this.secondDinnerProteinForItem = secondDinnerProteinForItem;
    }

    public JTextField getSecondDinnerCarboForItem() {
        return secondDinnerCarboForItem;
    }

    public void setSecondDinnerCarboForItem(JTextField secondDinnerCarboForItem) {
        this.secondDinnerCarboForItem = secondDinnerCarboForItem;
    }

    public JTextField getSecondDinnerFatsForItem() {
        return secondDinnerFatsForItem;
    }

    public void setSecondDinnerFatsForItem(JTextField secondDinnerFatsForItem) {
        this.secondDinnerFatsForItem = secondDinnerFatsForItem;
    }

    public JTextField getSecondDinnerCalloriesForItem() {
        return secondDinnerCalloriesForItem;
    }

    public void setSecondDinnerCalloriesForItem(JTextField secondDinnerCalloriesForItem) {
        this.secondDinnerCalloriesForItem = secondDinnerCalloriesForItem;
    }

    public JTextField getProteinSum() {
        return proteinSum;
    }

    public void setProteinSum(JTextField proteinSum) {
        this.proteinSum = proteinSum;
    }

    public JTextField getCarboSum() {
        return carboSum;
    }

    public void setCarboSum(JTextField carboSum) {
        this.carboSum = carboSum;
    }

    public JTextField getFatsSum() {
        return fatsSum;
    }

    public void setFatsSum(JTextField fatsSum) {
        this.fatsSum = fatsSum;
    }

    public JTextField getCalloriesSum() {
        return calloriesSum;
    }

    public void setCalloriesSum(JTextField calloriesSum) {
        this.calloriesSum = calloriesSum;
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void setRootPanel(JPanel rootPanel) {
        this.rootPanel = rootPanel;
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        final JScrollPane scrollPane1 = new JScrollPane();
        rootPanel.add(scrollPane1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(4, 5, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.setBackground(new Color(-872532));
        scrollPane1.setViewportView(mainPanel);
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-872532));
        mainPanel.add(panel1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel2.setBackground(new Color(-872532));
        mainPanel.add(panel2, new GridConstraints(3, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayoutManager(4, 5, new Insets(0, 0, 0, 0), -1, -1));
        panel3.setBackground(new Color(-872532));
        panel2.add(panel3, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(-1, 250), new Dimension(-1, 250), null, 0, false));
        final JScrollPane scrollPane2 = new JScrollPane();
        panel3.add(scrollPane2, new GridConstraints(0, 0, 1, 5, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        dinnerJList = new JList();
        dinnerJList.setBackground(new Color(-11272));
        scrollPane2.setViewportView(dinnerJList);
        deleteFromDinnerButton = new JButton();
        deleteFromDinnerButton.setText("Удалить");
        panel3.add(deleteFromDinnerButton, new GridConstraints(3, 0, 1, 5, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dinnerCalloriesForItem = new JTextField();
        dinnerCalloriesForItem.setBackground(new Color(-11272));
        panel3.add(dinnerCalloriesForItem, new GridConstraints(1, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(50, -1), new Dimension(50, -1), null, 0, false));
        dinnerFatsForItem = new JTextField();
        dinnerFatsForItem.setBackground(new Color(-11272));
        panel3.add(dinnerFatsForItem, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(35, -1), null, 0, false));
        dinnerCarboForItem = new JTextField();
        dinnerCarboForItem.setBackground(new Color(-11272));
        panel3.add(dinnerCarboForItem, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(35, -1), null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("Вес");
        panel3.add(label1, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("Углеводы");
        panel3.add(label2, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("Жиры");
        panel3.add(label3, new GridConstraints(2, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("Каллории");
        panel3.add(label4, new GridConstraints(2, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setText("Белки");
        panel3.add(label5, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dinnerWeightForItem = new JTextField();
        dinnerWeightForItem.setBackground(new Color(-11272));
        panel3.add(dinnerWeightForItem, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(50, -1), new Dimension(50, -1), null, 0, false));
        dinnerProteinForItem = new JTextField();
        dinnerProteinForItem.setBackground(new Color(-11272));
        panel3.add(dinnerProteinForItem, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(35, -1), null, 0, false));
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayoutManager(9, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel4.setBackground(new Color(-872532));
        panel2.add(panel4, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(-1, 250), new Dimension(-1, 250), null, 0, false));
        final JLabel label6 = new JLabel();
        label6.setText("Белки");
        panel4.add(label6, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dinnerProteinsCommon = new JTextField();
        dinnerProteinsCommon.setBackground(new Color(-11272));
        panel4.add(dinnerProteinsCommon, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label7 = new JLabel();
        label7.setText("Углеводы");
        panel4.add(label7, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dinnerCarboCommon = new JTextField();
        dinnerCarboCommon.setBackground(new Color(-11272));
        panel4.add(dinnerCarboCommon, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label8 = new JLabel();
        label8.setText("Жиры");
        panel4.add(label8, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dinnerFatsCommon = new JTextField();
        dinnerFatsCommon.setBackground(new Color(-11272));
        panel4.add(dinnerFatsCommon, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label9 = new JLabel();
        label9.setText("Каллории");
        panel4.add(label9, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dinnerCalloriesCommon = new JTextField();
        dinnerCalloriesCommon.setBackground(new Color(-11272));
        panel4.add(dinnerCalloriesCommon, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label10 = new JLabel();
        Font label10Font = this.$$$getFont$$$(null, Font.BOLD, -1, label10.getFont());
        if (label10Font != null) label10.setFont(label10Font);
        label10.setText("Итого");
        panel4.add(label10, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label11 = new JLabel();
        label11.setText("Ужин (18:00)");
        panel2.add(label11, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel5.setBackground(new Color(-872532));
        mainPanel.add(panel5, new GridConstraints(3, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel6 = new JPanel();
        panel6.setLayout(new GridLayoutManager(2, 3, new Insets(0, 0, 0, 0), -1, -1));
        panel6.setBackground(new Color(-872532));
        mainPanel.add(panel6, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel7 = new JPanel();
        panel7.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel7.setBackground(new Color(-872532));
        panel6.add(panel7, new GridConstraints(0, 0, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(610, -1), new Dimension(710, -1), null, 0, false));
        inBreakfastButton = new JButton();
        inBreakfastButton.setText("В завтрак");
        panel7.add(inBreakfastButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        inSecondDinnerButton = new JButton();
        inSecondDinnerButton.setText("Во второй ужин");
        panel7.add(inSecondDinnerButton, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        inSecondBreakfastButton = new JButton();
        inSecondBreakfastButton.setText("Во второй завтрак");
        panel7.add(inSecondBreakfastButton, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        inDinnerButton = new JButton();
        inDinnerButton.setText("В ужин");
        panel7.add(inDinnerButton, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        inLunchButton = new JButton();
        inLunchButton.setText("В обед");
        panel7.add(inLunchButton, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel6.add(spacer1, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        panel6.add(spacer2, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        saveButton = new JButton();
        saveButton.setText("Сохранить");
        panel6.add(saveButton, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel8 = new JPanel();
        panel8.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel8.setBackground(new Color(-872532));
        mainPanel.add(panel8, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel9 = new JPanel();
        panel9.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel9.setBackground(new Color(-872532));
        mainPanel.add(panel9, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel10 = new JPanel();
        panel10.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel10.setBackground(new Color(-872532));
        panel9.add(panel10, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(250, 220), new Dimension(250, 224), null, 5, false));
        final JPanel panel11 = new JPanel();
        panel11.setLayout(new GridLayoutManager(8, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel11.setBackground(new Color(-872532));
        panel10.add(panel11, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(-1, 220), new Dimension(414, 220), null, 0, false));
        panel11.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), null));
        final JLabel label12 = new JLabel();
        label12.setText("Белки");
        panel11.add(label12, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        proteinSum = new JTextField();
        proteinSum.setBackground(new Color(-11272));
        panel11.add(proteinSum, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label13 = new JLabel();
        label13.setText("Углеводы");
        panel11.add(label13, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        carboSum = new JTextField();
        carboSum.setBackground(new Color(-11272));
        panel11.add(carboSum, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label14 = new JLabel();
        label14.setText("Жиры");
        panel11.add(label14, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label15 = new JLabel();
        label15.setText("Каллории");
        panel11.add(label15, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        calloriesSum = new JTextField();
        calloriesSum.setBackground(new Color(-11272));
        panel11.add(calloriesSum, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        fatsSum = new JTextField();
        fatsSum.setBackground(new Color(-11272));
        panel11.add(fatsSum, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label16 = new JLabel();
        Font label16Font = this.$$$getFont$$$(null, Font.BOLD, 14, label16.getFont());
        if (label16Font != null) label16.setFont(label16Font);
        label16.setText("Итого:");
        panel10.add(label16, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel12 = new JPanel();
        panel12.setLayout(new GridLayoutManager(4, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel12.setBackground(new Color(-872532));
        mainPanel.add(panel12, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel13 = new JPanel();
        panel13.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel13.setBackground(new Color(-872532));
        panel12.add(panel13, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(84, 86), null, 0, false));
        final JLabel label17 = new JLabel();
        label17.setText("Белки");
        panel13.add(label17, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_SOUTHEAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        proteinsOn100g = new JTextField();
        proteinsOn100g.setBackground(new Color(-11272));
        panel13.add(proteinsOn100g, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_NORTHEAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(80, -1), null, 0, false));
        final JPanel panel14 = new JPanel();
        panel14.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel14.setBackground(new Color(-872532));
        panel12.add(panel14, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label18 = new JLabel();
        label18.setText("Углеводы");
        panel14.add(label18, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_SOUTHEAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        carboOn100g = new JTextField();
        carboOn100g.setBackground(new Color(-11272));
        panel14.add(carboOn100g, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_NORTHEAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(80, -1), null, 0, false));
        final JPanel panel15 = new JPanel();
        panel15.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel15.setBackground(new Color(-872532));
        panel12.add(panel15, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label19 = new JLabel();
        label19.setText("Жиры");
        panel15.add(label19, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_SOUTHEAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        fatsOn100g = new JTextField();
        fatsOn100g.setBackground(new Color(-11272));
        panel15.add(fatsOn100g, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_NORTHEAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(80, -1), null, 0, false));
        final JPanel panel16 = new JPanel();
        panel16.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel16.setBackground(new Color(-872532));
        panel12.add(panel16, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label20 = new JLabel();
        label20.setText("Каллории");
        panel16.add(label20, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_SOUTHEAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        calloriesOn100g = new JTextField();
        calloriesOn100g.setBackground(new Color(-11272));
        panel16.add(calloriesOn100g, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_NORTHEAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(80, -1), null, 0, false));
        final JPanel panel17 = new JPanel();
        panel17.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel17.setBackground(new Color(-872532));
        mainPanel.add(panel17, new GridConstraints(0, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel18 = new JPanel();
        panel18.setLayout(new GridLayoutManager(4, 5, new Insets(0, 0, 0, 0), -1, -1));
        panel18.setBackground(new Color(-872532));
        panel17.add(panel18, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(-1, 250), new Dimension(-1, 250), null, 0, false));
        final JScrollPane scrollPane3 = new JScrollPane();
        panel18.add(scrollPane3, new GridConstraints(0, 0, 1, 5, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        secondBreakfastJList = new JList();
        secondBreakfastJList.setBackground(new Color(-11272));
        scrollPane3.setViewportView(secondBreakfastJList);
        deleteFromSecondBreakfastButton = new JButton();
        deleteFromSecondBreakfastButton.setText("Удалить");
        panel18.add(deleteFromSecondBreakfastButton, new GridConstraints(3, 0, 1, 5, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        secondBreakfastCalloriesForItem = new JTextField();
        secondBreakfastCalloriesForItem.setBackground(new Color(-11272));
        panel18.add(secondBreakfastCalloriesForItem, new GridConstraints(1, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(50, -1), new Dimension(50, -1), null, 0, false));
        secondBreakfastCarboForItem = new JTextField();
        secondBreakfastCarboForItem.setBackground(new Color(-11272));
        panel18.add(secondBreakfastCarboForItem, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(35, -1), null, 0, false));
        secondBreakfastFatsForItem = new JTextField();
        secondBreakfastFatsForItem.setBackground(new Color(-11272));
        panel18.add(secondBreakfastFatsForItem, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(35, -1), null, 0, false));
        final JLabel label21 = new JLabel();
        label21.setText("Вес");
        panel18.add(label21, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label22 = new JLabel();
        label22.setText("Углеводы");
        panel18.add(label22, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label23 = new JLabel();
        label23.setText("Жиры");
        panel18.add(label23, new GridConstraints(2, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label24 = new JLabel();
        label24.setText("Каллории");
        panel18.add(label24, new GridConstraints(2, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label25 = new JLabel();
        label25.setText("Белки");
        panel18.add(label25, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        secondBreakfastWeightForItem = new JTextField();
        secondBreakfastWeightForItem.setBackground(new Color(-11272));
        panel18.add(secondBreakfastWeightForItem, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(50, -1), new Dimension(50, -1), null, 0, false));
        secondBreakfastProteinForItem = new JTextField();
        secondBreakfastProteinForItem.setBackground(new Color(-11272));
        panel18.add(secondBreakfastProteinForItem, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(35, -1), null, 0, false));
        final JPanel panel19 = new JPanel();
        panel19.setLayout(new GridLayoutManager(9, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel19.setBackground(new Color(-872532));
        panel17.add(panel19, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(-1, 250), new Dimension(-1, 250), null, 0, false));
        final JLabel label26 = new JLabel();
        label26.setText("Белки");
        panel19.add(label26, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        secondBreakfastProteinsCommon = new JTextField();
        secondBreakfastProteinsCommon.setBackground(new Color(-11272));
        panel19.add(secondBreakfastProteinsCommon, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label27 = new JLabel();
        label27.setText("Углеводы");
        panel19.add(label27, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        secondBreakfastCarboCommon = new JTextField();
        secondBreakfastCarboCommon.setBackground(new Color(-11272));
        panel19.add(secondBreakfastCarboCommon, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label28 = new JLabel();
        label28.setText("Жиры");
        panel19.add(label28, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        secondBreakfastFatsCommon = new JTextField();
        secondBreakfastFatsCommon.setBackground(new Color(-11272));
        panel19.add(secondBreakfastFatsCommon, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label29 = new JLabel();
        label29.setText("Каллории");
        panel19.add(label29, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        secondBreakfastCalloriesCommon = new JTextField();
        secondBreakfastCalloriesCommon.setBackground(new Color(-11272));
        panel19.add(secondBreakfastCalloriesCommon, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label30 = new JLabel();
        Font label30Font = this.$$$getFont$$$(null, Font.BOLD, -1, label30.getFont());
        if (label30Font != null) label30.setFont(label30Font);
        label30.setText("Итого");
        panel19.add(label30, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label31 = new JLabel();
        label31.setText("Второй завтрак (11:00)");
        panel17.add(label31, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel20 = new JPanel();
        panel20.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel20.setBackground(new Color(-872532));
        mainPanel.add(panel20, new GridConstraints(1, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel21 = new JPanel();
        panel21.setLayout(new GridLayoutManager(5, 5, new Insets(0, 0, 0, 0), -1, -1));
        panel21.setBackground(new Color(-872532));
        panel20.add(panel21, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(-1, 250), new Dimension(-1, 250), null, 0, false));
        final JScrollPane scrollPane4 = new JScrollPane();
        panel21.add(scrollPane4, new GridConstraints(1, 0, 1, 5, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        lunchJList = new JList();
        lunchJList.setBackground(new Color(-11272));
        scrollPane4.setViewportView(lunchJList);
        lunchCalloriesForItem = new JTextField();
        lunchCalloriesForItem.setBackground(new Color(-11272));
        panel21.add(lunchCalloriesForItem, new GridConstraints(2, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(50, -1), new Dimension(50, -1), null, 0, false));
        lunchCarboForItem = new JTextField();
        lunchCarboForItem.setBackground(new Color(-11272));
        panel21.add(lunchCarboForItem, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(35, -1), null, 0, false));
        lunchFatsForItem = new JTextField();
        lunchFatsForItem.setBackground(new Color(-11272));
        panel21.add(lunchFatsForItem, new GridConstraints(2, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(35, -1), null, 0, false));
        final JLabel label32 = new JLabel();
        label32.setText("Вес");
        panel21.add(label32, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label33 = new JLabel();
        label33.setText("Угеводы");
        panel21.add(label33, new GridConstraints(3, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label34 = new JLabel();
        label34.setText("Жиры");
        panel21.add(label34, new GridConstraints(3, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label35 = new JLabel();
        label35.setText("Каллории");
        panel21.add(label35, new GridConstraints(3, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        deleteFromLunchButton = new JButton();
        deleteFromLunchButton.setText("Удалить");
        panel21.add(deleteFromLunchButton, new GridConstraints(4, 0, 1, 5, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label36 = new JLabel();
        label36.setText("Белки");
        panel21.add(label36, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lunchProteinForItem = new JTextField();
        lunchProteinForItem.setBackground(new Color(-11272));
        panel21.add(lunchProteinForItem, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(35, -1), null, 0, false));
        lunchWeightForItem = new JTextField();
        lunchWeightForItem.setBackground(new Color(-11272));
        panel21.add(lunchWeightForItem, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(50, -1), new Dimension(50, -1), null, 0, false));
        final JLabel label37 = new JLabel();
        label37.setText("Обед (15:00)");
        panel21.add(label37, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel22 = new JPanel();
        panel22.setLayout(new GridLayoutManager(9, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel22.setBackground(new Color(-872532));
        panel20.add(panel22, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(-1, 250), new Dimension(-1, 250), null, 0, false));
        final JLabel label38 = new JLabel();
        label38.setText("Белки");
        panel22.add(label38, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lunchProteinsCommon = new JTextField();
        lunchProteinsCommon.setBackground(new Color(-11272));
        panel22.add(lunchProteinsCommon, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label39 = new JLabel();
        label39.setText("Углеводы");
        panel22.add(label39, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lunchCarboCommon = new JTextField();
        lunchCarboCommon.setBackground(new Color(-11272));
        panel22.add(lunchCarboCommon, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label40 = new JLabel();
        label40.setText("Жиры");
        panel22.add(label40, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lunchFatsCommon = new JTextField();
        lunchFatsCommon.setBackground(new Color(-11272));
        panel22.add(lunchFatsCommon, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label41 = new JLabel();
        label41.setText("Каллории");
        panel22.add(label41, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lunchCalloriesCommon = new JTextField();
        lunchCalloriesCommon.setBackground(new Color(-11272));
        panel22.add(lunchCalloriesCommon, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label42 = new JLabel();
        Font label42Font = this.$$$getFont$$$(null, Font.BOLD, -1, label42.getFont());
        if (label42Font != null) label42.setFont(label42Font);
        label42.setText("Итого");
        panel22.add(label42, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel23 = new JPanel();
        panel23.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel23.setBackground(new Color(-872532));
        mainPanel.add(panel23, new GridConstraints(3, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel24 = new JPanel();
        panel24.setLayout(new GridLayoutManager(4, 5, new Insets(0, 0, 0, 0), -1, -1));
        panel24.setBackground(new Color(-872532));
        panel23.add(panel24, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(-1, 250), new Dimension(-1, 250), null, 0, false));
        final JScrollPane scrollPane5 = new JScrollPane();
        panel24.add(scrollPane5, new GridConstraints(0, 0, 1, 5, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        secondDinnerJList = new JList();
        secondDinnerJList.setBackground(new Color(-11272));
        scrollPane5.setViewportView(secondDinnerJList);
        deleteFromSecondDinnerButton = new JButton();
        deleteFromSecondDinnerButton.setText("Удалить");
        panel24.add(deleteFromSecondDinnerButton, new GridConstraints(3, 0, 1, 5, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        secondDinnerCalloriesForItem = new JTextField();
        secondDinnerCalloriesForItem.setBackground(new Color(-11272));
        panel24.add(secondDinnerCalloriesForItem, new GridConstraints(1, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(50, -1), new Dimension(50, -1), null, 0, false));
        secondDinnerCarboForItem = new JTextField();
        secondDinnerCarboForItem.setBackground(new Color(-11272));
        panel24.add(secondDinnerCarboForItem, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(35, -1), null, 0, false));
        secondDinnerFatsForItem = new JTextField();
        secondDinnerFatsForItem.setBackground(new Color(-11272));
        panel24.add(secondDinnerFatsForItem, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(35, -1), null, 0, false));
        final JLabel label43 = new JLabel();
        label43.setText("Вес");
        panel24.add(label43, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label44 = new JLabel();
        label44.setText("Углеводы");
        panel24.add(label44, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label45 = new JLabel();
        label45.setText("Жиры");
        panel24.add(label45, new GridConstraints(2, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label46 = new JLabel();
        label46.setText("Каллории");
        panel24.add(label46, new GridConstraints(2, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        secondDinnerWeightForItem = new JTextField();
        secondDinnerWeightForItem.setBackground(new Color(-11272));
        panel24.add(secondDinnerWeightForItem, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(50, -1), new Dimension(50, -1), null, 0, false));
        final JLabel label47 = new JLabel();
        label47.setText("Белки");
        panel24.add(label47, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        secondDinnerProteinForItem = new JTextField();
        secondDinnerProteinForItem.setBackground(new Color(-11272));
        panel24.add(secondDinnerProteinForItem, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(35, -1), null, 0, false));
        final JPanel panel25 = new JPanel();
        panel25.setLayout(new GridLayoutManager(9, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel25.setBackground(new Color(-872532));
        panel23.add(panel25, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(-1, 250), new Dimension(-1, 250), null, 0, false));
        final JLabel label48 = new JLabel();
        label48.setText("Белки");
        panel25.add(label48, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        secondDinnerProteinsCommon = new JTextField();
        secondDinnerProteinsCommon.setBackground(new Color(-11272));
        panel25.add(secondDinnerProteinsCommon, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label49 = new JLabel();
        label49.setText("Углеводы");
        panel25.add(label49, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        secondDinnerCarboCommon = new JTextField();
        secondDinnerCarboCommon.setBackground(new Color(-11272));
        panel25.add(secondDinnerCarboCommon, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label50 = new JLabel();
        label50.setText("Жиры");
        panel25.add(label50, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        secondDinnerFatsCommon = new JTextField();
        secondDinnerFatsCommon.setBackground(new Color(-11272));
        panel25.add(secondDinnerFatsCommon, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label51 = new JLabel();
        label51.setText("Каллории");
        panel25.add(label51, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        secondDinnerCalloriesCommon = new JTextField();
        secondDinnerCalloriesCommon.setBackground(new Color(-11272));
        panel25.add(secondDinnerCalloriesCommon, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label52 = new JLabel();
        Font label52Font = this.$$$getFont$$$(null, Font.BOLD, -1, label52.getFont());
        if (label52Font != null) label52.setFont(label52Font);
        label52.setText("Итого");
        panel25.add(label52, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label53 = new JLabel();
        label53.setText("Второй ужин (21:00)");
        panel23.add(label53, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel26 = new JPanel();
        panel26.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel26.setBackground(new Color(-872532));
        mainPanel.add(panel26, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel27 = new JPanel();
        panel27.setLayout(new GridLayoutManager(4, 5, new Insets(0, 0, 0, 0), -1, -1));
        panel27.setBackground(new Color(-872532));
        panel26.add(panel27, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(-1, 250), new Dimension(-1, 250), null, 0, false));
        final JScrollPane scrollPane6 = new JScrollPane();
        panel27.add(scrollPane6, new GridConstraints(0, 0, 1, 5, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        breakfastJList = new JList();
        breakfastJList.setBackground(new Color(-11272));
        scrollPane6.setViewportView(breakfastJList);
        breakfastWeightForItem = new JTextField();
        breakfastWeightForItem.setBackground(new Color(-11272));
        panel27.add(breakfastWeightForItem, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(50, -1), new Dimension(50, -1), null, 0, false));
        breakfastFatsForItem = new JTextField();
        breakfastFatsForItem.setBackground(new Color(-11272));
        breakfastFatsForItem.setText("");
        panel27.add(breakfastFatsForItem, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(35, -1), null, 0, false));
        breakfastCalloriesForItem = new JTextField();
        breakfastCalloriesForItem.setBackground(new Color(-11272));
        panel27.add(breakfastCalloriesForItem, new GridConstraints(1, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(50, -1), new Dimension(50, -1), null, 0, false));
        breakfastCarboForItem = new JTextField();
        breakfastCarboForItem.setBackground(new Color(-11272));
        panel27.add(breakfastCarboForItem, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(35, -1), null, 0, false));
        final JLabel label54 = new JLabel();
        label54.setText("Углеводы");
        panel27.add(label54, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label55 = new JLabel();
        label55.setText("Жиры");
        panel27.add(label55, new GridConstraints(2, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label56 = new JLabel();
        label56.setText("Каллории");
        panel27.add(label56, new GridConstraints(2, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        deleteFromBreakfastButton = new JButton();
        deleteFromBreakfastButton.setText("Удалить");
        panel27.add(deleteFromBreakfastButton, new GridConstraints(3, 0, 1, 5, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label57 = new JLabel();
        label57.setText("Белки");
        panel27.add(label57, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label58 = new JLabel();
        label58.setText("Вес");
        panel27.add(label58, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        breakfastProteinForItem = new JTextField();
        breakfastProteinForItem.setBackground(new Color(-11272));
        panel27.add(breakfastProteinForItem, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(35, -1), null, 0, false));
        final JPanel panel28 = new JPanel();
        panel28.setLayout(new GridLayoutManager(9, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel28.setBackground(new Color(-872532));
        panel26.add(panel28, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(-1, 250), new Dimension(-1, 250), null, 0, false));
        final JLabel label59 = new JLabel();
        label59.setText("Белки");
        panel28.add(label59, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        breakfastProteinsCommon = new JTextField();
        breakfastProteinsCommon.setBackground(new Color(-11272));
        panel28.add(breakfastProteinsCommon, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label60 = new JLabel();
        label60.setText("Углеводы");
        panel28.add(label60, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label61 = new JLabel();
        label61.setText("Жиры");
        panel28.add(label61, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        breakfastFatsCommon = new JTextField();
        breakfastFatsCommon.setBackground(new Color(-11272));
        panel28.add(breakfastFatsCommon, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label62 = new JLabel();
        label62.setText("Каллории");
        panel28.add(label62, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        breakFastCalloriesCommon = new JTextField();
        breakFastCalloriesCommon.setBackground(new Color(-11272));
        panel28.add(breakFastCalloriesCommon, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label63 = new JLabel();
        label63.setText("Итого");
        panel28.add(label63, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        breakfastCarboCommon = new JTextField();
        breakfastCarboCommon.setBackground(new Color(-11272));
        panel28.add(breakfastCarboCommon, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label64 = new JLabel();
        label64.setText("Завтрак (8:00)");
        panel26.add(label64, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel29 = new JPanel();
        panel29.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel29.setBackground(new Color(-872532));
        mainPanel.add(panel29, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel30 = new JPanel();
        panel30.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel30.setBackground(new Color(-872532));
        mainPanel.add(panel30, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(710, 400), new Dimension(710, 400), null, 0, false));
        final JScrollPane scrollPane7 = new JScrollPane();
        panel30.add(scrollPane7, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        foodItemsJList = new JList();
        foodItemsJList.setBackground(new Color(-11272));
        final DefaultListModel defaultListModel1 = new DefaultListModel();
        foodItemsJList.setModel(defaultListModel1);
        scrollPane7.setViewportView(foodItemsJList);
        final JPanel panel31 = new JPanel();
        panel31.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel31.setBackground(new Color(-872532));
        mainPanel.add(panel31, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel32 = new JPanel();
        panel32.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        panel32.setBackground(new Color(-872532));
        mainPanel.add(panel32, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        portionWeight = new JTextField();
        portionWeight.setBackground(new Color(-11272));
        panel32.add(portionWeight, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        final JLabel label65 = new JLabel();
        label65.setText("гр");
        panel32.add(label65, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label66 = new JLabel();
        label66.setBackground(new Color(-872532));
        label66.setText("Вес в порции");
        panel32.add(label66, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}
