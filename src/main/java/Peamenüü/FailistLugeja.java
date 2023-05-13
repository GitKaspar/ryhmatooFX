package Peamenüü;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class FailistLugeja {

    public FailistLugeja()   {
    }

    public static LinkedHashMap<String, List<String>> loeFailist(String failinimi)  {
        LinkedHashMap<String, List<String>> failiSõnastik = new LinkedHashMap<>();
        try (BufferedReader puhverlugeja = new BufferedReader(new InputStreamReader(new FileInputStream(failinimi), StandardCharsets.UTF_8))) {
            String fail = failinimi.substring(failinimi.lastIndexOf('/') + 1, failinimi.lastIndexOf('.'));
            String rida = puhverlugeja.readLine();
            while (rida != null) {
                if (!failiSõnastik.containsKey(fail)) {
                    failiSõnastik.put(fail, new ArrayList<String>());
                } else {
                    failiSõnastik.get(fail).add(rida);
                }
                rida = puhverlugeja.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Programm ei leidnud soovitud faili. Sõnum: " + e.getMessage());
        }
        return failiSõnastik;
    }

    /*
    public static void main(String[] args) throws FileNotFoundException {

        HashMap<String, List<String>> algus = loeFailist("src/main/resources/algus/algus.txt");
        HashMap<String, List<String>> kohad = loeFailist("src/main/resources/algus/kohad.txt");
        HashMap<String, List<String>> samaaniTutvustus = loeFailist("src/main/resources/algus/samaaniTutvustus.txt");

        HashMap<String, List<String>> kukudLabi = loeFailist("src/main/resources/lopp/kukudLabi.txt");
        HashMap<String, List<String>> oledEdukas = loeFailist("src/main/resources/lopp/oledEdukas.txt");
        HashMap<String, List<String>> ootus = loeFailist("src/main/resources/lopp/ootus.txt");
        HashMap<String, List<String>> riitusSj = loeFailist("src/main/resources/lopp/riitusSj.txt");

        HashMap<String, List<String>> adlinTulemused = loeFailist("src/main/resources/tulemused/adlinTulemused.txt");
        HashMap<String, List<String>> altarTulemused = loeFailist("src/main/resources/tulemused/altarTulemused.txt");
        HashMap<String, List<String>> jurkaTulemused = loeFailist("src/main/resources/tulemused/jurkaTulemused.txt");
        HashMap<String, List<String>> koskTulemused = loeFailist("src/main/resources/tulemused/koskTulemused.txt");
        HashMap<String, List<String>> samaanTulemused = loeFailist("src/main/resources/tulemused/samaanTulemused.txt");

        HashMap<String, List<String>> koskEba6nn = loeFailist("src/main/resources/ylesanne1/koskEba6nn.txt");
        HashMap<String, List<String>> koskEdu = loeFailist("src/main/resources/ylesanne1/koskEdu.txt");
        HashMap<String, List<String>> koskSj = loeFailist("src/main/resources/ylesanne1/koskSj.txt");

        HashMap<String, List<String>> altar = loeFailist("src/main/resources/ylesanne2/altar.txt");
        HashMap<String, List<String>> altar1 = loeFailist("src/main/resources/ylesanne2/altar1.txt");
        HashMap<String, List<String>> altar2 = loeFailist("src/main/resources/ylesanne2/altar2.txt");
        HashMap<String, List<String>> altarEiVea = loeFailist("src/main/resources/ylesanne2/altarEiVea.txt");
        HashMap<String, List<String>> altarSj = loeFailist("src/main/resources/ylesanne2/altarSj.txt");
        HashMap<String, List<String>> altarVeab = loeFailist("src/main/resources/ylesanne2/altarVeab.txt");

        HashMap<String, List<String>> jurka = loeFailist("src/main/resources/ylesanne3/jurka.txt");
        HashMap<String, List<String>> jurka1 = loeFailist("src/main/resources/ylesanne3/jurka1.txt");
        HashMap<String, List<String>> jurka2 = loeFailist("src/main/resources/ylesanne3/jurka2.txt");
        HashMap<String, List<String>> jurka3 = loeFailist("src/main/resources/ylesanne3/jurka3.txt");

        HashMap<String, List<String>> adlin = loeFailist("src/main/resources/ylesanne4/adlin.txt");
        HashMap<String, List<String>> adlin1 = loeFailist("src/main/resources/ylesanne4/adlin1.txt");
        HashMap<String, List<String>> adlin2 = loeFailist("src/main/resources/ylesanne4/adlin2.txt");
        HashMap<String, List<String>> moistatus1 = loeFailist("src/main/resources/ylesanne4/moistatus1.txt");
        HashMap<String, List<String>> moistatus2 = loeFailist("src/main/resources/ylesanne4/moistatus2.txt");
        HashMap<String, List<String>> moistatus3 = loeFailist("src/main/resources/ylesanne4/moistatus3.txt");

        HashMap<String, List<String>> aklupatiSamaan = loeFailist("src/main/resources/ylesanne5/aklupatiSamaan.txt");
        HashMap<String, List<String>> aklupatiSamaan1 = loeFailist("src/main/resources/ylesanne5/aklupatiSamaan1.txt");

    }*/
}