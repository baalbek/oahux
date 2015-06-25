package oahux.chart;

import javafx.scene.canvas.Canvas;
import oahux.controllers.MaunaloaChartViewModel;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 11/21/12
 * Time: 10:45 PM
 */
public interface MaunaloaChart {
    void draw(Canvas canvas);
    void shiftWeeks(int weeks, Canvas canvas);
    String getNumShiftWeeks();
    void setNumShiftWeeks(String value);
    void shiftToEnd(Canvas canvas);
    void setViewModel(MaunaloaChartViewModel viewModel);
    void setHasVolume(boolean value);
    //void setId(String id);
}
