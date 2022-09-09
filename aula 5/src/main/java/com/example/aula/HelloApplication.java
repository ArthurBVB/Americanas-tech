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
        int nota = 100;
        String graduacao;

        // nota maior ou igual a 70, então aprovado
        // if else

        if (nota >= 70) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
        // A>80 < B>70 <C>60<D>=0
        if (nota >= 80) {
            graduacao = "Nota A";
        } else if (nota < 80 && nota >= 70 ) {
            graduacao = "Nota B";
        }else if (nota < 70 && nota >= 60 ) {
            graduacao = "Nota C";
        }else if (nota < 60 && nota >= 0 ) {
            graduacao = "Nota D";
        }
        else {
            graduacao = "";
        }
        switch (graduacao){
            case "Nota A":
            case "Nota B":
                System.out.println("Aluno aprovado!");
                break;
            case "Nota C":
            case "Nota D":
                System.out.println("Aluno reprovado!");
                break;
            default:
                System.out.println("Nota inválida");
        }



    }
}