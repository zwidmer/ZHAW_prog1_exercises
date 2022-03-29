package ch.zhaw.prog2.fxmlcalculator;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Main-Application. Opens the first window (MainWindow) and the common ValueHandler
 *
 * @author widmer
 * @version 1.0
 */
public class Main extends Application {

    private ValueHandler valueHandler;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        valueHandler = new ValueHandler();
        mainWindow(primaryStage);
    }

    private void mainWindow(Stage primaryStage) {

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("MainWindow.fxml"));
            Pane rootNode = loader.load();
            MainWindowController mainWindowController = loader.getController();
            mainWindowController.setValueHandler(valueHandler);
            Scene scene = new Scene(rootNode);
            primaryStage.setScene(scene);
            primaryStage.show();
            scene.setOnKeyPressed(event -> {
                if (event.getCode() == KeyCode.F1) {
                    mainWindowController.doShowHelp();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

