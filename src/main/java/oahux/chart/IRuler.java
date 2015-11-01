package oahux.chart;

//import javafx.geometry.Point2D;

import javafx.geometry.Point2D;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 3/25/13
 * Time: 4:14 PM
 */
public interface IRuler<T> {
    int SNAP_UNIT_DAY = 1;
    int SNAP_UNIT_WEEK = 2;
    double calcPix(T value);
    T calcValue(double pix);
    double snapTo(double pix);
}
