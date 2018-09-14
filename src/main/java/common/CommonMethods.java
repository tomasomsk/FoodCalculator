package common;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CommonMethods {

    /**
     * Округление числа до указанного кол-ва знаков после запятой
     * @param value - число, которое необходимо округлить
     * @param places - кол-во знаков после запятой
     * @return - округленное число
     */
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}
