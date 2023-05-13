package Peamenüü;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import java.io.IOException;

public class MänguStseen extends Scene {

    private static Button jätka;

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

        VBox pealeht = new VBox(uustekst);
        pealeht.setAlignment(Pos.TOP_CENTER);
        pealeht.setPadding(new Insets(150, 0, 0, 0));
        peapaan.getChildren().add(pealeht);

        sisendiKast.setAlignment(Pos.BOTTOM_CENTER);
        sisendiKast.setPadding(new Insets(0, 0, 0, 150));
        sisendiKast.setMaxWidth(800);
        peapaan.getChildren().add(sisendiKast);

        jätka = PeamenüüRakendus.meieNupp("EDASI_BUTTON.png", 60, 60);
        jätka.setVisible(false);
        jätka.setOnMouseClicked(event -> {
            pealeht.setVisible(false);
            uustekst.textProperty().set("");
        });

        sisendiKast.getChildren().add(jätka);


      //  uustekst.setViewOrder(0);

        Tekstid tekstikogu = new Tekstid();
        Tekstid.väljastaTekst(tekstikogu.getAlgus(), uustekst, jätka);

        // Tekstikast saab  väärtuse, aga akent ei värskendata.
        // Lugemismeetod jätab ikka esimese rea vahele.

        /**
         * Probleem?
         */

        // peapaan.getChildren().get(0).setVisible(false);




    }


}