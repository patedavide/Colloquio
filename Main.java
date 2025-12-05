import java.util.Date;

public class Main {
    public static void main(String[] args) {

        GestoreColloquio gestore = new GestoreColloquio();

        Colloquio colloquio1 = new Colloquio(new Date(2024, 5, 20), "Mario Rossi", "3A", "Luigi Rossi");
        Colloquio colloquio2 = new Colloquio(new Date(2024, 5, 21), "Anna Bianchi", "2B", "Carla Bianchi");

        gestore.aggiungiColloquio(colloquio1);
        gestore.aggiungiColloquio(colloquio2);

        System.out.println(gestore.toString());

        gestore.rimuoviColloquio(colloquio1);

        System.out.println(gestore.toString());
    }
}
