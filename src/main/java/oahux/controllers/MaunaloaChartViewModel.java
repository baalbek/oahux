package oahux.controllers;

import oahu.financial.Stock;
import oahu.financial.StockPrice;
import oahux.chart.IRuler;

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
    IRuler getVruler();
    void setVruler(IRuler ruler);
    IRuler getHruler();
    void setHruler(IRuler ruler);
}
