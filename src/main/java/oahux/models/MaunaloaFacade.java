package oahux.models;

import javafx.scene.Node;
import oahu.financial.beans.DerivativeBean;
import oahu.financial.beans.StockBean;

import java.util.Collection;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 22.11.12
 * Time: 14:59
 */
public interface MaunaloaFacade {
    Collection<StockBean> stockPrices(String ticker, Date fromDx, int period);
    Collection<StockBean> stockPrices(String ticker, int period);
    StockBean spot(String ticker);
    Collection<DerivativeBean> calls(String ticker);
    Collection<DerivativeBean> puts(String ticker);
    Collection<DerivativeBean> callsAndPuts(String ticker);
    Collection<Node> fibLines(String ticker);
    void addFibLine(String ticker, Node line);
}
