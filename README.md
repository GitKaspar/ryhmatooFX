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

    public static HashMap<String, List<String>> loeFailist(String failinimi) throws FileNotFoundException {
        Scanner lugeja = new Scanner(new File(failinimi));
        HashMap<String, List<String>> failiSõnastik = new HashMap<>();
        while (lugeja.hasNextLine()){
            String rida = lugeja.nextLine();
            if (failiSõnastik.isEmpty()){
                failiSõnastik.put(failinimi.substring(failinimi.lastIndexOf('/') + 1), new ArrayList<String>());
            }
            else{
                if (rida.isEmpty()){
                    failiSõnastik.get(failinimi).add("...");}
                failiSõnastik.get(failinimi).add(rida);}
        }
        return failiSõnastik;
    }
}
```
