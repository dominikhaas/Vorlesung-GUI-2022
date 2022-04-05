package v4.mvp;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class IntervalPresenter implements Initializable {

    public Button buttonUp;
    public Button buttonDown;
    public ProgressBar valueProgressbar;
    @FXML
    private TextField valueTextField;

    private final IntervalModel model = new IntervalModel();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        valueTextField.textProperty().bind(model.valueProperty().asString());
        valueProgressbar.progressProperty().bind(model.valueProperty().divide(10d));

        buttonUp.setOnAction(event -> model.increment());
        buttonDown.addEventHandler(ActionEvent.ANY, event -> model.decrement());

        buttonUp.disableProperty().bind(model.isMaxReached());
        buttonDown.disableProperty().bind(model.isMinReached());
        Bindings.
    }
}
