package com.example.aula;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.security.auth.callback.LanguageCallback;
import java.io.IOException;
import java.time.LocalDate;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

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
        // Olá, {nome}. Hoje é {dia}, BOM DIA.

        String nome = "Arthur";
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.length());

        String nomeOutro = "artHur";
        System.out.println(nome.equalsIgnoreCase(nomeOutro));

        //ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil ));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil );
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour()>= 0 && agora.getHour() < 12){
            saudacao = "Bom dia";
        } else if (agora.getHour()>= 12 && agora.getHour() < 18){
            saudacao = "Boa tarde";
        } else if (agora.getHour()>= 18 && agora.getHour() < 24) {
        saudacao = "Boa noite"  ;
        }
        else {
            saudacao = "Olá";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());

    }
}