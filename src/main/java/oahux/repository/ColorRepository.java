package oahux.repository;

import javafx.scene.paint.Color;

/**
 * Created by rcs on 09.09.15.
 *
 */
public interface ColorRepository {
    Color colorFor(ColorReposEnum c);
    //<T> Color colorFor2(ColorReposEnum c, T param);
    Color colorForCycle(int days);
}
