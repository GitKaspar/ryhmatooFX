package Peamenüü;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class PeamenüüRakendus extends Application {
    private Stage lava;
    private Scene stseen;
    private Button algusNupp;
    private Button lõpuNupp;

    @Override
    public void start(Stage pealava) {
        lava = pealava;
        BorderPane piiripaan = new BorderPane();

        Image algus = new Image("BUTTON_ALUSTA.png");
        ImageView algusView = new ImageView(algus);
        algusView.setFitWidth(290);
        algusNupp = new Button();
        algusNupp.setGraphic(algusView);
        algusNupp.setOnMouseClicked(event -> {
            Scene mänguStseen = createMänguStseen();
            lava.setScene(mänguStseen);
        });

        Image lõpp = new Image("BUTTON_SULEMANG.png");
        ImageView lõppView = new ImageView(lõpp);
        lõppView.setFitWidth(290);
        lõpuNupp = new Button();
        lõpuNupp.setGraphic(lõppView);
        lõpuNupp.setOnMouseClicked(event -> {
            System.exit(0);
        });

        VBox menüükast = new VBox(30, algusNupp, lõpuNupp);
        menüükast.setAlignment(Pos.CENTER);
        menüükast.setPrefHeight(500);
        menüükast.setPadding(new Insets(300, 0, 0, 0));
        piiripaan.setCenter(menüükast);

        Image taustapilt = new Image("ALGUSEEKRAAN.png");
        ImageView taustaView = new ImageView(taustapilt);
        piiripaan.setBackground(new Background(new BackgroundImage(taustapilt,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true))));


        stseen = new Scene(piiripaan, 1280, 720);

        lava.setScene(stseen);
        lava.show();
    }

    private Scene createMänguStseen() {
        BorderPane mängupaan = new BorderPane();
        Image kaart = new Image("MAP_värv.jpg");
        ImageView kaartView = new ImageView(kaart);
        mängupaan.setBackground(new Background(new BackgroundImage(kaart,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true))));

        Scene mängustseen = new Scene(mängupaan, 1280, 720);

        return mängustseen;
    }

    public static void main(String[] args) {
        launch();
    }
}