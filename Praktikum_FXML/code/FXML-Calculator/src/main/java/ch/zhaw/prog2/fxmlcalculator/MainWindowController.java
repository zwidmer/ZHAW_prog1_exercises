package ch.zhaw.prog2.fxmlcalculator;


import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Controller for the MainWindow. One controller per mask (or FXML file)
 * Contains everything the controller has to reach in the view (controls)
 * and all methods the view calls based on events.
 *
 * @author widmer
 * @version 1.0
 */
public class MainWindowController {

    ValueHandler valueHandler;

    private static final String INFO_TEXT = """
        Enter valid values to
        - Initial amount (> 0)
        - Return in % (can be +/- or 0)
        - Annual Costs (> 0)
        - Number of years (> 0)
        Calculate displays the annual balance development!";
        """;

    @FXML
    private TextField initialAmount;

    @FXML
    private TextField returnRate;

    @FXML
    private TextField annualCost;

    @FXML
    private TextField numberOfYears;

    @FXML
    private TextArea textArea;

    @FXML
    private CheckMenuItem checkInitialAmount;

    @FXML
    private CheckMenuItem checkReturn;

    @FXML
    private CheckMenuItem checkAnnualCost;

    @FXML
    private CheckMenuItem checkNumberOfYears;


    @FXML
    void close(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void doCalculation(ActionEvent event) {
        valueHandler.checkValuesAndCalculateResult(initialAmount.getText(), returnRate.getText(), annualCost.getText(), numberOfYears.getText());
        if (valueHandler.areValuesOk()) {
            setBorderColor(Color.GREEN);
        } else {
            setBorderColor(Color.RED);
        }
        textArea.setText(valueHandler.getResultBound());
    }

    @FXML
    void doClearValues(ActionEvent event) {
        if (checkInitialAmount.isSelected()) {
            initialAmount.clear();
        }
        if (checkReturn.isSelected()) {
            returnRate.clear();
        }
        if (checkAnnualCost.isSelected()) {
            annualCost.clear();
        }
        if (checkNumberOfYears.isSelected()) {
            numberOfYears.clear();
        }
    }
    
    @FXML
    void doClearResults() {
        textArea.clear();
        setBorderColor(Color.GRAY);
        valueHandler.clearResult();
    }

    @FXML
    void doShowHelp() {
        setBorderColor(Color.BLUE);
        textArea.setText(INFO_TEXT);
    }

    @FXML
    void openResultWindow(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("ResultWindow.fxml"));
            Pane rootNodeTwo = loader.load();
            ResultWindowController resultWindowController = loader.getController();
            resultWindowController.setValueHandler(valueHandler);
            resultWindowController.setResults();
            Scene scene = new Scene(rootNodeTwo);
            Stage secondaryStage = new Stage();
            secondaryStage.setScene(scene);
            secondaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void setValueHandler(ValueHandler valueHandler) {
        this.valueHandler = valueHandler;
        valueHandler.resultBoundProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                textArea.setText(valueHandler.getResultBound());
            }
        });
    }

    private void setBorderColor(Color color) {
        textArea.setBorder(new Border(new BorderStroke(color, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
    }
}
