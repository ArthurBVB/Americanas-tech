package com.example.aula;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        // 1 2 3 4 5 6 7 8 9 10
        // para uma variavel que inicia em 1, e vai ate 10, mudando 1 - por- 1

        for (int i = 1; i<=10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + "x" + i + "=" + j * i);
            }
        }
    }
}