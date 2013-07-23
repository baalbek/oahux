package oahux.models;

import javafx.scene.Node;
import oahu.financial.Derivative;
import oahu.financial.StockPrice;

import java.util.Collection;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 22.11.12
 * Time: 14:59
 */
public interface MaunaloaFacade {
    Collection<StockPrice> stockPrices(String ticker, Date fromDx, int period);
    Collection<StockPrice> stockPrices(String ticker, int period);
    StockPrice spot(String ticker);
    Collection<Derivative> calls(String ticker);
    Collection<Derivative> puts(String ticker);
    Collection<Derivative> callsAndPuts(String ticker);
    Collection<Node> fibLines(String ticker);
    void addFibLine(String ticker, Node line);
}
