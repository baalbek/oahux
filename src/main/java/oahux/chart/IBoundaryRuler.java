package oahux.chart;

import javafx.geometry.Point2D;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 3/30/13
 * Time: 7:03 PM
 */
public interface IBoundaryRuler extends IRuler {
    Point2D getLowerRight();
    Point2D getUpperLeft();
}
