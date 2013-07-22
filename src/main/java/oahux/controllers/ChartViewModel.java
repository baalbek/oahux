package oahux.controllers;

import oahu.financial.beans.StockBean;
import oahu.views.chart.IRuler;

import java.util.Collection;
import java.util.Date;
import java.util.List;

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
    Collection<StockBean> stockPrices(int period);
    String getTicker();
    IRuler getRuler(int id);
    void setRuler(int id, IRuler ruler);
}
