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
    void shiftToEnd(Canvas canvas);
    void shiftToDate(LocalDate date, Canvas canvas);
    void setViewModel(MaunaloaChartViewModel viewModel);
    LocalDate getLastCurrentDateShown();
    //void setId(String id);
}
