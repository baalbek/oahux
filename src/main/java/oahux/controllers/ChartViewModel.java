package oahux.controllers;

import oahu.financial.Stock;
import oahux.chart.IRuler;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 11/21/12
 * Time: 10:44 PM
 */
public interface ChartViewModel {
    static int CHART_A1_HRULER = 1;
    static int CHART_A1_VRULER = 2;
    static int CHART_B1_HRULER = 3;
    static int CHART_B1_VRULER = 4;
    Collection<Stock> stockPrices(int period);
    String getTicker();
    IRuler getRuler(int id);
    void setRuler(int id, IRuler ruler);
}
