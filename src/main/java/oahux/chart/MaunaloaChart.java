package oahux.chart;

import javafx.scene.canvas.Canvas;
import oahux.controllers.MaunaloaChartViewModel;

import java.time.LocalDate;

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
    void shiftToDate(LocalDate date, Canvas canvas);
    void setViewModel(MaunaloaChartViewModel viewModel);
    //void setId(String id);
}
