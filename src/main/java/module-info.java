module com.example.ryhmatoofx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.almasb.fxgl.all;

    opens com.example.ryhmatoofx to javafx.fxml;
    exports com.example.ryhmatoofx;
}