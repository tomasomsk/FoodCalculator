package helpers;

import apiobjectswithname.ObjectsWithNameList;
import model.FoodIntake;
import model.FoodItem;
import model.NutrititionalValue;
import org.apache.commons.io.IOUtils;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

import static gui.GuiFormWithScroll.getFoodIntakesObjects;
import static properties.Props.getProperty;

/**
 * Импорт продуктов питания из файла Excel
 */
public class ExcelHelper {

    /**
     * Считывание из файла Excel списка продуктов
     * @return - список продуктов с их пищевой ценностью на 100 граммов
     */
    public static ObjectsWithNameList<FoodItem> importFoodItems() {
        ObjectsWithNameList<FoodItem> result = new ObjectsWithNameList<>(new ArrayList<>());

        XSSFSheet sheet = getSheetFromFile(getProperty("food.items.file"), 0);
        Iterator<Row> rows = sheet.iterator();

        rows.next();

        while (rows.hasNext()) {
            XSSFRow row = (XSSFRow) rows.next();
            FoodItem foodItem = new FoodItem();
            foodItem.setName(getValueFromCell(row.getCell(0)));
            NutrititionalValue nutrValue = new NutrititionalValue();
            nutrValue.setNutritionalValues(Double.parseDouble(getValueFromCell(row.getCell(1))),
                    Double.parseDouble(getValueFromCell(row.getCell(2))),
                    Double.parseDouble(getValueFromCell(row.getCell(3))),
                    Double.parseDouble(getValueFromCell(row.getCell(4))));
            foodItem.setNutrValue(nutrValue);
            result.add(foodItem);
        }
        return result;
    }

    /**
     *
     * @param fileName - имя файла
     * @param sheetNum - номер листа (начинается с 0)
     * @return - указанный лист из указанного файла Excel
     */
    private static XSSFSheet getSheetFromFile(String fileName, int sheetNum) {
        InputStream fis = null;
        try {
            ClassLoader classLoader = ExcelHelper.class.getClassLoader();
            //Create helpers book from file
            fis = classLoader.getResourceAsStream(fileName);
            XSSFWorkbook book = new XSSFWorkbook(fis);
            //Create helpers sheet
            return book.getSheetAt(sheetNum);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при извлечении листа из книги Excel " + fileName, e);
        } finally {
            IOUtils.closeQuietly(fis);
        }
    }

    /**
     *
     * @param cell - ячейка
     * @return - значение из ячейки
     */
    private static String getValueFromCell(XSSFCell cell) {
        if (cell != null) {
            cell.setCellType(1);
            return cell.getStringCellValue();
        } else {
            return "";
        }
    }

    public static void writeToFile(String absolutePath) {
        Workbook workbook = new XSSFWorkbook();
        ObjectsWithNameList<FoodIntake> foodIntakes = getFoodIntakesObjects();

    }
}
