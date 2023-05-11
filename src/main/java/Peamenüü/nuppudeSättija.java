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
        StackPane kuhjaPaan = new StackPane();
        Image kaart = new Image("MAP_värv.jpg");
        ImageView kaartView = new ImageView(kaart);

        kuhjaPaan.setBackground(new Background(new BackgroundImage(kaart,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true))));

        Button adllin = PeamenüüRakendus.meieNupp("ADLIN_BUTTON.png", 80, 80);
        Button altar = PeamenüüRakendus.meieNupp("ALTAR_BUTTON.png", 80, 80);
        Button jürka = PeamenüüRakendus.meieNupp("JURKA_BUTTON.png", 70, 70);
        Button samaan = PeamenüüRakendus.meieNupp("SAMAAN_BUTTON.png", 120, 100);
        Button tompsuu = PeamenüüRakendus.meieNupp("TOMPSUU_BUTTON.png", 70, 70);

        adllin.setLayoutY(350);
        adllin.setLayoutX(1110);

        altar.setLayoutY(600);
        altar.setLayoutX(1100);

        jürka.setLayoutY(500);
        jürka.setLayoutX(100);

        samaan.setLayoutY(150);
        samaan.setLayoutX(200);

        tompsuu.setLayoutY(50);
        tompsuu.setLayoutX(1100);


        kuhjaPaan.getChildren().addAll(adllin, altar,jürka,samaan, tompsuu);



        Scene testStseen = new Scene(kuhjaPaan, 1280,720);
        lava.setScene(testStseen);
        lava.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
