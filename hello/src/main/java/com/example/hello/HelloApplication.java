package com.example.hello;

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
       String name;
       name="Arthur";
       name= "Brasil";
       name="Jesse";
       System.out.println("Olá," + name);
       int a;
       int b = 2;
       a = 3;
       int soma = a + b;
       int subtracao = a-b;
       int multiplicacao = a*b;
       float divisao = (float) a/b;

       System.out.println(soma);
       System.out.println(subtracao);
       System.out.println(multiplicacao);
       System.out.println(divisao);
    }
}