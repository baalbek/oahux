package oahux.chart;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 22.10.13
 * Time: 14:40
 */
public interface IDateBoundaryRuler<T> extends IRuler<T> {
    Date getStartDate();
    Date getEndDate();
}
