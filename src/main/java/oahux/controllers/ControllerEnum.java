package oahux.controllers;

/**
 * Created by rcs on 23.08.15.
 *
 */
public enum ControllerEnum {
    EMPTY, DAY, WEEK, OSEBX_DAY, OSEBX_WEEK;
    public static ControllerEnum fromInt(int i) {
        switch (i) {
            case 2: return DAY;
            case 3: return WEEK;
            case 4: return OSEBX_DAY;
            case 5: return OSEBX_WEEK;
            default: return EMPTY;
        }
    }
}
