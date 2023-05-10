package Peamenüü;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PeamenüüController {
    @FXML
    private Label tervitusTekst;

    @FXML
    protected void tereNupuKlikk() {
        tervitusTekst.setText("Teretulemast JavaFX programmi!");
    }
}