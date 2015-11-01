package oahux.controllers;

import javafx.scene.layout.Pane;
import oahu.dto.Tuple2;
import oahu.financial.Stock;
import oahu.financial.StockPrice;
import oahux.chart.IRuler;

import java.time.LocalDate;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 11/21/12
 * Time: 10:44 PM
 */
public interface MaunaloaChartViewModel {
    Collection<StockPrice> stockPrices(int period);
    Stock getStock();
    IRuler<Double> getVruler();
    void setVruler(IRuler<Double> ruler);
    IRuler<LocalDate> getHruler();
    void setHruler(IRuler<LocalDate> ruler);
    Tuple2<IRuler<LocalDate>,IRuler<Double>> getRulers();
    Pane getPane();
    ControllerEnum getLocation();
}
