package oahux.domain;

import oahu.financial.Derivative;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 8/1/13
 * Time: 9:20 AM
 */
public interface DerivativeFx extends Derivative {
    boolean getIsChecked();
    void setIsChecked(boolean value);
}
