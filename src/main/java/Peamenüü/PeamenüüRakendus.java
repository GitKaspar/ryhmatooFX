package Peamenüü;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.io.IOException;

public class PeamenüüRakendus extends Application{
    private Stage lava;
    private Scene peamenüü;
    private Button algusNupp;
    private Button lõpuNupp;

    @Override
    public void start(Stage pealava) {
        lava = pealava;
        BorderPane piiripaan = new BorderPane();

        // Mäng algab, kui vajutatakse sellele nupule
        algusNupp = meieNupp("BUTTON_ALUSTA.png", 290, 60);
        algusNupp.setOnMouseClicked(event -> {
            MänguStseen mänguStseen = MänguStseen.väärtustaMänguStseen(new StackPane());
            lava.setScene(mänguStseen);
            try {
                MänguStseen.mänguStseeniJuhtija(mänguStseen);
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        });

        // See nupp sulgeb mängu.
        lõpuNupp = meieNupp("BUTTON_SULEMANG.png", 290, 60);
        lõpuNupp.setOnMouseClicked(event -> {
            System.exit(0);
        });

        /**
         * Ainus viis, kuidas peamenüü suurema pildiga ühilduma sai, oli VBoxile top Padding lisamine.
         * Proovisin seada nuppude kõrguse/suuruse sõltuvaks piiripaani kõrgusest (listener).
         * Proovisin ka lihtsalt piiripaani/VBox'i kõrgust konstandiga jagada - ei töötanud.
         * Oli rahul vaid siis, kui sai Padding fikseeritud Double väärtusega.
         * Nii aga nihkuvad nupud, kui akna suurus muutub.
         * VBox on konteiner peamenüü nuppudele.
         */

        VBox menüükast = new VBox(30, algusNupp, lõpuNupp);
        menüükast.setAlignment(Pos.CENTER);
        menüükast.setPadding(new Insets(300, 0, 0, 0));
        piiripaan.setCenter(menüükast);

        // Taustapilt peamenüüle.
        Image taustapilt = new Image("ALGUSEEKRAAN.png");
        ImageView taustaView = new ImageView(taustapilt);
        piiripaan.setBackground(new Background(new BackgroundImage(taustapilt,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true))));

        // Mänguaken on esialgu kahjuks optimiseeritud vaid selles suuruses.
        peamenüü = new Scene(piiripaan, 1280, 720);
        lava.setScene(peamenüü);
        lava.show();
    }

    /**
     * Eraldi nuppude klass
     * @param failinimi - pilt, mida nupu jaoks kasutame
     * @param x nupu laius
     * @param y nupu kõrgus
     * @return "custom" nupp efektidega
     * Proovisin siingi teha nupu suurust sõltuvaks akna suurusest - ei olnud edukas.
     * Vaid ImageView objektile fikseeritud suuruse andmine lõi väiksemad nupud.
     * Selleta nupud pildi algsuuruses - hiiglaslikud.
     */
        public static Button meieNupp(String failinimi, double x, double y){

        Image pilt = new Image(failinimi);
        ImageView vaade = new ImageView(pilt);
        vaade.setFitWidth(x);
        vaade.setFitHeight(y);
        Button nupp = new Button();
        nupp.setGraphic(vaade);
        nupp.setStyle("-fx-background-color: transparent;");

        // Efektid. Nupp helendab, kui hiir on selle kohal.
        // Kui nuppu vajutatakse, langeb sellele vari.

        Glow sära = new Glow();
        DropShadow klikiVari = new DropShadow();
        nupp.setOnMouseEntered(event -> nupp.setEffect(sära));
        nupp.setOnMouseExited(event -> nupp.setEffect(null));
        nupp.setOnMousePressed(event -> nupp.setEffect(klikiVari));

        return nupp;
    }

    public static void main(String[] args) {
        launch();
    }
}