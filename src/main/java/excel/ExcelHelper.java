package excel;

import apiobjectswithname.ObjectsWithNameList;
import model.FoodItem;
import model.NutrititionalValue;
import org.apache.commons.io.IOUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import static properties.Props.getProperty;

/**
 * Импорт продуктов питания из файла Excel
 */
public class ExcelHelper {

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



    private static XSSFSheet getSheetFromFile(String fileName, int sheetNum) {
        FileInputStream fis = null;
        try {
            File file = new File(fileName);
            //Create excel book from file
            fis = new FileInputStream(file);
            XSSFWorkbook book = new XSSFWorkbook(fis);
            //Create excel sheet
            return book.getSheetAt(sheetNum);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при извлечении листа из книги Excel " + fileName, e);
        } finally {
            IOUtils.closeQuietly(fis);
        }
    }

    private static String getValueFromCell(XSSFCell cell) {
        if (cell != null) {
            cell.setCellType(1);
            return cell.getStringCellValue();
        } else {
            return "";
        }
    }
}
