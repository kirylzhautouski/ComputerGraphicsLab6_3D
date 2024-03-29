package dev.kirillzhelt;

import dev.kirillzhelt.viewcontrollers.letter.LetterViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("layouts/letter.fxml"));

        primaryStage.setTitle("3D letter");
        primaryStage.setScene(new Scene(loader.load(), 800, 475));
        primaryStage.show();

        LetterViewController letterViewController = loader.getController();
        letterViewController.init();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
