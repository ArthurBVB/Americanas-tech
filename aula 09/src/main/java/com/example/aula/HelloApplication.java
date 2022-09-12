package com.example.aula;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;

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
       int[] numeros = new int[5];
       numeros[0] = 1;
          numeros[1] = 2;
         numeros[2] = 3;
         numeros[3] = 4;
       numeros[4] = 5;
       for (int i=0; i< numeros.length; i++){
           System.out.println(numeros[i]);
        }
       String [] letras={"A", "B", "C", "D","E"};
      System.out.println(Arrays.toString(letras));

        int[] numeros1 = {5 ,2 ,54 , 100 ,9};
        int maior = numeros1[0];
        int menor = numeros1[0];
        int media = 0;

        for (int i=0; i < numeros1.length;i++) {
            if (numeros1[i] > maior) {
                maior = numeros1[i];
            }
            if (numeros1[i] < menor){
                menor = numeros1[i];
            }
            media += numeros1[i];
        }
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("Média: " + media/numeros1.length);

    }
}