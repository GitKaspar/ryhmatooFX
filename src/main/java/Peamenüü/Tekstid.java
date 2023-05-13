package Peamenüü;

import javafx.scene.control.Button;
import javafx.scene.text.Text;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

public class Tekstid {
    private LinkedHashMap<String, List<String>> algus;
    private LinkedHashMap<String, List<String>> kohad;
    private LinkedHashMap<String, List<String>> samaaniTutvustus;

    private LinkedHashMap<String, List<String>> kukudLabi;
    private LinkedHashMap<String, List<String>> oledEdukas;
    private LinkedHashMap<String, List<String>> ootus;
    private LinkedHashMap<String, List<String>> riitusSj;

    private LinkedHashMap<String, List<String>> adlinTulemused;
    private LinkedHashMap<String, List<String>> altarTulemused;
    private LinkedHashMap<String, List<String>> jurkaTulemused;
    private LinkedHashMap<String, List<String>> koskTulemused;
    private LinkedHashMap<String, List<String>> samaanTulemused;

    private LinkedHashMap<String, List<String>> koskEba6nn;
    private LinkedHashMap<String, List<String>> koskEdu;
    private LinkedHashMap<String, List<String>> koskSj;

    private LinkedHashMap<String, List<String>> altar;
    private LinkedHashMap<String, List<String>> altar1;
    private LinkedHashMap<String, List<String>> altar2;
    private LinkedHashMap<String, List<String>> altarEiVea;
    private LinkedHashMap<String, List<String>> altarSj;
    private LinkedHashMap<String, List<String>> altarVeab;

    private LinkedHashMap<String, List<String>> jurka;
    private LinkedHashMap<String, List<String>> jurka1;
    private LinkedHashMap<String, List<String>> jurka2;
    private LinkedHashMap<String, List<String>> jurka3;

    private LinkedHashMap<String, List<String>> adlin;
    private LinkedHashMap<String, List<String>> adlin1;
    private LinkedHashMap<String, List<String>> adlin2;
    private LinkedHashMap<String, List<String>> moistatus1;
    private LinkedHashMap<String, List<String>> moistatus2;
    private LinkedHashMap<String, List<String>> moistatus3;

    private LinkedHashMap<String, List<String>> aklupatiSamaan;
    private LinkedHashMap<String, List<String>> aklupatiSamaan1;

    public Tekstid() throws IOException {
        this.algus = FailistLugeja.loeFailist("src/main/resources/algus/algus.txt");
        this.kohad = FailistLugeja.loeFailist("src/main/resources/algus/kohad.txt");
        this.samaaniTutvustus = FailistLugeja.loeFailist("src/main/resources/algus/samaaniTutvustus.txt");
        this.kukudLabi = FailistLugeja.loeFailist("src/main/resources/lopp/kukudLabi.txt");
        this.oledEdukas = FailistLugeja.loeFailist("src/main/resources/lopp/oledEdukas.txt");
        this.ootus = FailistLugeja.loeFailist("src/main/resources/lopp/ootus.txt");
        this.riitusSj = FailistLugeja.loeFailist("src/main/resources/lopp/riitusSj.txt");
        this.adlinTulemused = FailistLugeja.loeFailist("src/main/resources/tulemused/adlinTulemused.txt");
        this.altarTulemused = FailistLugeja.loeFailist("src/main/resources/tulemused/altarTulemused.txt");
        this.jurkaTulemused = FailistLugeja.loeFailist("src/main/resources/tulemused/jurkaTulemused.txt");
        this.koskTulemused = FailistLugeja.loeFailist("src/main/resources/tulemused/koskTulemused.txt");
        this.samaanTulemused = FailistLugeja.loeFailist("src/main/resources/tulemused/samaanTulemused.txt");
        this.koskEba6nn = FailistLugeja.loeFailist("src/main/resources/ylesanne1/koskEba6nn.txt");
        this.koskEdu = FailistLugeja.loeFailist("src/main/resources/ylesanne1/koskEdu.txt");
        this.koskSj = FailistLugeja.loeFailist("src/main/resources/ylesanne1/koskSj.txt");

        this.altar = FailistLugeja.loeFailist("src/main/resources/ylesanne2/altar.txt");
        this.altar1 = FailistLugeja.loeFailist("src/main/resources/ylesanne2/altar1.txt");
        this.altar2 = FailistLugeja.loeFailist("src/main/resources/ylesanne2/altar2.txt");
        this.altarEiVea = FailistLugeja.loeFailist("src/main/resources/ylesanne2/altarEiVea.txt");
        this.altarSj = FailistLugeja.loeFailist("src/main/resources/ylesanne2/altarSj.txt");
        this.altarVeab = FailistLugeja.loeFailist("src/main/resources/ylesanne2/altarVeab.txt");

        this.jurka = FailistLugeja.loeFailist("src/main/resources/ylesanne3/jurka.txt");
        this.jurka1 = FailistLugeja.loeFailist("src/main/resources/ylesanne3/jurka1.txt");
        this.jurka2 = FailistLugeja.loeFailist("src/main/resources/ylesanne3/jurka2.txt");
        this.jurka3 = FailistLugeja.loeFailist("src/main/resources/ylesanne3/jurka3.txt");

        this.adlin = FailistLugeja.loeFailist("src/main/resources/ylesanne4/adlin.txt");
        this.adlin1 = FailistLugeja.loeFailist("src/main/resources/ylesanne4/adlin1.txt");
        this.adlin2 = FailistLugeja.loeFailist("src/main/resources/ylesanne4/adlin2.txt");
        this.moistatus1 = FailistLugeja.loeFailist("src/main/resources/ylesanne4/moistatus1.txt");
        this.moistatus2 = FailistLugeja.loeFailist("src/main/resources/ylesanne4/moistatus2.txt");
        this.moistatus3 = FailistLugeja.loeFailist("src/main/resources/ylesanne4/moistatus3.txt");

        this.aklupatiSamaan = FailistLugeja.loeFailist("src/main/resources/ylesanne5/aklupatiSamaan.txt");
        this.aklupatiSamaan1 = FailistLugeja.loeFailist("src/main/resources/ylesanne5/aklupatiSamaan1.txt");
    }

    /**
     * Mida meetod teeb? Peab lisama sõnesid tekstiobjektile ja neid kuvama.
     * Kui ilmjub kolm punkti (failis tühi rida), peaks seisatama ja ootama
     * @param samm kujutis, mis kannab sammu nime võtmena ja sellesse kuuluvaid sõneväärtusi Listina
     * @param tekstiväli - muudetav tekstiväli JavaFX meetodis
     */

        public static void väljastaTekst(LinkedHashMap<String, List<String>> samm, Text tekstiväli, Button nupp){
        StringBuilder väljastatavSõne = new StringBuilder();

        for (List<String> value : samm.values()) {
            for (int i = 0; i < value.size(); i++) {
                väljastatavSõne.append(value.get(i) + "\n");
                }
            tekstiväli.setText(väljastatavSõne.toString());
            }
        }

    public LinkedHashMap<String, List<String>> getAlgus() {
        return algus;
    }

    public LinkedHashMap<String, List<String>> getKohad() {
        return kohad;
    }

    public LinkedHashMap<String, List<String>> getSamaaniTutvustus() {
        return samaaniTutvustus;
    }

    public LinkedHashMap<String, List<String>> getKukudLabi() {
        return kukudLabi;
    }

    public LinkedHashMap<String, List<String>> getOledEdukas() {
        return oledEdukas;
    }

    public LinkedHashMap<String, List<String>> getOotus() {
        return ootus;
    }

    public LinkedHashMap<String, List<String>> getRiitusSj() {
        return riitusSj;
    }

    public LinkedHashMap<String, List<String>> getAdlinTulemused() {
        return adlinTulemused;
    }

    public LinkedHashMap<String, List<String>> getAltarTulemused() {
        return altarTulemused;
    }

    public LinkedHashMap<String, List<String>> getJurkaTulemused() {
        return jurkaTulemused;
    }

    public LinkedHashMap<String, List<String>> getKoskTulemused() {
        return koskTulemused;
    }

    public LinkedHashMap<String, List<String>> getSamaanTulemused() {
        return samaanTulemused;
    }

    public LinkedHashMap<String, List<String>> getKoskEba6nn() {
        return koskEba6nn;
    }

    public LinkedHashMap<String, List<String>> getKoskEdu() {
        return koskEdu;
    }

    public LinkedHashMap<String, List<String>> getKoskSj() {
        return koskSj;
    }

    public LinkedHashMap<String, List<String>> getAltar() {
        return altar;
    }

    public LinkedHashMap<String, List<String>> getAltar1() {
        return altar1;
    }

    public LinkedHashMap<String, List<String>> getAltar2() {
        return altar2;
    }

    public LinkedHashMap<String, List<String>> getAltarEiVea() {
        return altarEiVea;
    }

    public LinkedHashMap<String, List<String>> getAltarSj() {
        return altarSj;
    }

    public LinkedHashMap<String, List<String>> getAltarVeab() {
        return altarVeab;
    }

    public LinkedHashMap<String, List<String>> getJurka() {
        return jurka;
    }

    public LinkedHashMap<String, List<String>> getJurka1() {
        return jurka1;
    }

    public LinkedHashMap<String, List<String>> getJurka2() {
        return jurka2;
    }

    public LinkedHashMap<String, List<String>> getJurka3() {
        return jurka3;
    }

    public LinkedHashMap<String, List<String>> getAdlin() {
        return adlin;
    }

    public LinkedHashMap<String, List<String>> getAdlin1() {
        return adlin1;
    }

    public LinkedHashMap<String, List<String>> getAdlin2() {
        return adlin2;
    }

    public LinkedHashMap<String, List<String>> getMoistatus1() {
        return moistatus1;
    }

    public LinkedHashMap<String, List<String>> getMoistatus2() {
        return moistatus2;
    }

    public LinkedHashMap<String, List<String>> getMoistatus3() {
        return moistatus3;
    }

    public LinkedHashMap<String, List<String>> getAklupatiSamaan() {
        return aklupatiSamaan;
    }

    public LinkedHashMap<String, List<String>> getAklupatiSamaan1() {
        return aklupatiSamaan1;
    }
}