module Peamenüü {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.almasb.fxgl.all;

    opens Peamenüü to javafx.fxml;
    exports Peamenüü;
}