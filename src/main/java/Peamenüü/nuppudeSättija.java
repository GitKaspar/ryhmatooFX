package Peamenüü;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class nuppudeSättija extends Application {
    @Override
    public void start(Stage lava) throws Exception {
        BorderPane kuhjaPaan = new BorderPane();
        Image kaart = new Image("MAP_värv.jpg");
        ImageView kaartView = new ImageView(kaart);

        kuhjaPaan.setBackground(new Background(new BackgroundImage(kaart,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true))));

        Button adllin = PeamenüüRakendus.meieNupp("ADLIN_BUTTON.png", 169, 169);
        Button altar = PeamenüüRakendus.meieNupp("ALTAR_BUTTON.png", 171, 256);
        Button jürka = PeamenüüRakendus.meieNupp("JURKA_BUTTON.png", 171, 171);
        Button samaan = PeamenüüRakendus.meieNupp("SAMAAN_BUTTON.png", 183, 183);
        Button tompsuu = PeamenüüRakendus.meieNupp("TOMPSUU_BUTTON.png", 171, 171);
        Button tuli = PeamenüüRakendus.meieNupp("TULI.png",285, 289);

        adllin.setLayoutY(385);
        adllin.setLayoutX(1160);

        altar.setLayoutY(600);
        altar.setLayoutX(1100);

        jürka.setLayoutY(591);
        jürka.setLayoutX(166);

        samaan.setLayoutY(145);
        samaan.setLayoutX(185);

        tompsuu.setLayoutY(149);
        tompsuu.setLayoutX(955);

        tuli.setLayoutY(318);
        tuli.setLayoutX(647);


        kuhjaPaan.getChildren().addAll(adllin, altar,jürka,samaan, tompsuu, tuli);


        Scene testStseen = new Scene(kuhjaPaan, 1280,720);
        lava.setScene(testStseen);
        lava.setResizable(false);
        lava.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
