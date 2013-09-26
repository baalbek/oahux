package oahux.chart;

//import javafx.geometry.Point2D;

import javafx.geometry.Point2D;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 3/25/13
 * Time: 4:14 PM
 */
public interface IRuler {
    double calcPix(Object value);
    Object calcValue(double pix);
    double roundPix(double pix);
}
