module com.example.aula10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aula10 to javafx.fxml;
    exports com.example.aula10;
}