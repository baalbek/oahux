package oahux.financial;

import javafx.beans.property.DoubleProperty;
import oahu.financial.StockPrice;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 9/16/13
 * Time: 10:30 AM
 */
public interface StockPriceFx extends StockPrice {
    DoubleProperty opnProperty();
    DoubleProperty hiProperty();
    DoubleProperty loProperty();
    DoubleProperty clsProperty();
}
