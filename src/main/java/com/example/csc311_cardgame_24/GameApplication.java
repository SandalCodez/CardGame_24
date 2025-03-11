package com.example.csc311_cardgame_24;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GameApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GameApplication.class.getResource("gameview.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 400);

        scene.getStylesheets().add(GameApplication.class.getResource("style.css").toExternalForm());
        stage.setTitle("Card 24 Game: Make an expression that equals 24 using the provided cards!");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}