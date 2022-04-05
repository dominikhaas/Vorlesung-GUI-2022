package v4.mvp;

import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;

public class IntervalModel {

    private IntegerProperty value = new SimpleIntegerProperty(5);

    public int getValue() {
        return value.get();
    }

    public IntegerProperty valueProperty() {
        return value;
    }

    public void increment() {
        value.setValue(value.get() + 1);
    }

    public void decrement() {
        value.setValue(value.get() - 1);
    }

    public BooleanBinding isMaxReached() {
        return value.greaterThanOrEqualTo(10);
    }

    public BooleanBinding isMinReached() {
        return value.lessThanOrEqualTo(0);
    }
}
