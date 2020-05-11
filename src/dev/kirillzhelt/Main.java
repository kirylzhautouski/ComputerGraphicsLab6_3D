package dev.kirillzhelt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(loader.load(), 800, 475));
        primaryStage.show();

        Controller controller = loader.getController();
        controller.init();
    }

    public static void main(String[] args) {
        launch(args);
    }
}