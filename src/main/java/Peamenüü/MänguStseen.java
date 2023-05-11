package Peamenüü;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MänguStseen extends Scene {

    public MänguStseen(Parent juur, double width, double height) {
        super(juur, width, height);
    }

    public static MänguStseen väärtustaMänguStseen(StackPane juur) {

        // Kaart läheb kuhjapaani alla.
        Image kaart = new Image("MAP_värv.jpg");
        ImageView kaartView = new ImageView(kaart);
        juur.setBackground(new Background(new BackgroundImage(kaart,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true))));

        // Kaardi kohal asub kast, kus kuvatakse tekst (illustratiivne).
        Image tekstiväli = new Image("TEKSTIKAST.png");
        ImageView tekstiVaade = new ImageView(tekstiväli);
        tekstiVaade.setFitWidth(1024);
        tekstiVaade.setFitHeight(576);
        tekstiVaade.setStyle("-fx-background-color: transparent;");

        juur.getChildren().add(tekstiVaade);

        MänguStseen mängustseen = new MänguStseen(juur, 1280, 720);

        return mängustseen;
    }

    public static void mänguStseeniJuhtija(MänguStseen stseen) throws IOException {
        StackPane peapaan = (StackPane) stseen.getRoot();

        /**
         * Eksperimenteeris TextArea klassiga, aga ei saanud selle valget kasti läbipaistvaks.
         * Lõpuks võtsime lihtsa Text objekti ja andsime sellele kogu sisse loetud faili kuvamiseks.
         */

        Text uustekst = new Text();
        uustekst.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, 21));
        uustekst.setTextAlignment(TextAlignment.CENTER);
        uustekst.setFill(Color.BLACK);

        /**
         * Vbox kannab tekstiakent. Peaks ka sisaldama sisendiväljasid.
         */

        HBox sisendiKast = new HBox();

        VBox pealeht = new VBox(100, uustekst, sisendiKast);
        pealeht.setAlignment(Pos.TOP_CENTER);
        pealeht.setPadding(new Insets(150, 0, 0, 0));
        peapaan.getChildren().add(pealeht);

        Button jätka = PeamenüüRakendus.meieNupp("EDASI_BUTTON.png", 60, 60);
        jätka.setVisible(false);
        jätka.setOnMouseClicked(event -> {
            pealeht.setVisible(false);
            peapaan.getChildren().get(0).setVisible(false);
            jätka.setVisible(false);
        });

        sisendiKast.setMaxWidth(800);
        sisendiKast.setAlignment(Pos.CENTER_RIGHT);
        sisendiKast.getChildren().add(jätka);

        loeFailEtte("src/main/resources/algus/algus.txt", uustekst);

        jätka.setVisible(true);

    }
    public static void loeFailEtte(String failiNimi, Text tekstiväli) throws IOException {
        Scanner lugeja = new Scanner(new File(failiNimi), StandardCharsets.UTF_8);
        StringBuilder sõneKuvamiseks = new StringBuilder();
        while (lugeja.hasNextLine()) {
            String rida = lugeja.nextLine();
            sõneKuvamiseks.append(rida + "\n");
        }
        tekstiväli.setText(sõneKuvamiseks.toString());
    }}