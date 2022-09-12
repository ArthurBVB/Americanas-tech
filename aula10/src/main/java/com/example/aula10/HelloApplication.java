package com.example.aula10;

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
        String nome12= "Arthur";
        saudacao(nome12);
        int result = soma(2,3);
        System.out.println(result);
    }

    public static void saudacao(String nome){
        System.out.println("hello, " + nome);
    }
    public static int soma(int a, int b){
        return a + b;
    }
}