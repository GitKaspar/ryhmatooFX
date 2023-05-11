# ryhmatooFX

## Klass Tekstid

``` 
// Lugemised siia.

// Kaspari lugemised.
1. algus,
2. 

// Liisa lugemised.


```

---

```
// Lugemismeetod
//"src/main/resources/algus/algus.txt" - failitee näide


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FailistLugeja {

    public FailistLugeja()   {
    }

    public static HashMap<String, List<String>> loeFailist(String failinimi) throws FileNotFoundException {
        Scanner lugeja = new Scanner(new File(failinimi));
        HashMap<String, List<String>> failiSõnastik = new HashMap<>();
        while (lugeja.hasNextLine()) {
            String fail = failinimi.substring(failinimi.lastIndexOf('/') + 1, failinimi.lastIndexOf('.'));
            String rida = lugeja.nextLine();
            if (failiSõnastik.isEmpty()) {
                failiSõnastik.put(fail, new ArrayList<String>());
            } else {
                if (rida.isEmpty()) {
                    failiSõnastik.get(fail).add("...");
                } else {
                    failiSõnastik.get(fail).add(rida);
                }
            }
        }
        return failiSõnastik;
    }

    public static void main(String[] args) throws FileNotFoundException {
    HashMap<String, List<String>> algus = loeFailist("algus/algus.txt");
    HashMap<String, List<String>> kohad = loeFailist("algus/kohad.txt");
    HashMap<String, List<String>> samaaniTutvustus = loeFailist("algus/samaaniTutvustus.txt");
    
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
    
    
    ```
