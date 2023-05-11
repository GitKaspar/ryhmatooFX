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
    
    ```
