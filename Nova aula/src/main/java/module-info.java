module com.aulanova.novas_aulas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.aulanova.novas_aulas to javafx.fxml;
    exports com.aulanova.novas_aulas;
}