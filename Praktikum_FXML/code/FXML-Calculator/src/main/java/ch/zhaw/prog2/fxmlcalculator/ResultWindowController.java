package ch.zhaw.prog2.fxmlcalculator;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * Controller for the MainWindow. One controller per mask (or FXML file)
 * Contains everything the controller has to reach in the view (controls)
 * and all methods the view calls based on events.
 *
 * @author widmer
 * @version 1.0
 */
public class ResultWindowController {
    ValueHandler valueHandler;

    @FXML
    private TextArea results;

    @FXML
    private void closeWindow(ActionEvent event) {
        Stage stage = (Stage) results.getScene().getWindow();
        stage.close();
    }

    public void setValueHandler(ValueHandler valueHandler) {
        this.valueHandler = valueHandler;
        valueHandler.resultBoundProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
               setResults();
            }
        });
    }

    public void setResults() {
        results.setText(valueHandler.getResultBound());
    }
}
