package oahux.chart;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 22.10.13
 * Time: 14:40
 */
public interface IDateBoundaryRuler extends IRuler {
    Date getStartDate();
    Date getEndDate();
}
