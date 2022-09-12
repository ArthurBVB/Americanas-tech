module com.example.aula {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aula to javafx.fxml;
    exports com.example.aula;
}