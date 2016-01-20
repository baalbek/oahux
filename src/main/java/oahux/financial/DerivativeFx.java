package oahux.financial;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import oahu.financial.DerivativePrice;
import oahu.financial.OptionCalculator;

import java.time.LocalDate;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 8/1/13
 * Time: 9:20 AM
 */
public interface DerivativeFx extends DerivativePrice {
    OptionCalculator getCalculator();
    BooleanProperty isCheckedProperty();
    DoubleProperty riskProperty();
    void setRisk(double value);
    DoubleProperty stockPriceRiskProperty();
    double getDelta();
    double getSpread();
    double getBreakeven();
    String getTicker();
    LocalDate getExpiry();
    int getDerivativeOid();
}
