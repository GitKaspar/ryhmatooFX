package Peamenüü;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class MeetoditeTestklass {

    public static LinkedHashMap<String, List<String>> loeFailist(String failinimi)  {
        LinkedHashMap<String, List<String>> failiSõnastik = new LinkedHashMap<>();
        try (BufferedReader puhverlugeja = new BufferedReader(new InputStreamReader(new FileInputStream(failinimi), StandardCharsets.UTF_8))) {
            String fail = failinimi.substring(failinimi.lastIndexOf('/') + 1, failinimi.lastIndexOf('.'));
            String rida = puhverlugeja.readLine();
            while (rida != null) {
                if (!failiSõnastik.containsKey(fail)) {
                    failiSõnastik.put(fail, new ArrayList<String>());
                } else {
//                    if (rida.isEmpty()) {
                    //                       failiSõnastik.get(fail).add("...");
                    //                 } else {
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

    public static void main(String[] args) throws IOException {
        LinkedHashMap<String, List<String>> test = loeFailist("src/main/resources/algus/algus.txt");
        List<String> failiRead = test.get("algus");
        for (String rida : failiRead) {
            System.out.println(rida);
        }
    }

}