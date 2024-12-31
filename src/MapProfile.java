import java.util.HashMap;
import java.util.Map;
/*2.Mappa per: Nome-Eta*/
public class MapProfile {
    public static void main(String[] args) {

        /*Crea una mappa con nomi e età*/
        HashMap<String, Integer> eta = new HashMap<>();
        eta.put("Anna",25);
        eta.put("Marco",30);
        eta.put("Luca",22);
        eta.put("Francesca",27);

        /*Troviamo la persona più giovane*/
        String piuGiovane = null;
        int etaMinima = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : eta.entrySet()) {
            if (entry.getValue()<etaMinima) {
                etaMinima = entry.getValue();
                piuGiovane = entry.getKey();
            }

        }
        System.out.println("La persona più giovane è: " + piuGiovane + "\n con anni: " + etaMinima);
    }
}
