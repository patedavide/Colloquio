import java.util.Date;

public class Main {
    public static void main(String[] args) {

        GestoreColloquio gestore = new GestoreColloquio();

        Colloquio colloquio1 = new Colloquio(new Date(2024, 5, 20), "Ilario Suardi", "3A", "Pamela Conti");
        Colloquio colloquio2 = new Colloquio(new Date(2024, 5, 21), "Thiago Corona", "2B", "Fabrizio Corona ");

        gestore.aggiungiColloquio(colloquio1);
        gestore.aggiungiColloquio(colloquio2);

        System.out.println(gestore.toString());

        gestore.rimuoviColloquio(colloquio1);

        System.out.println(gestore.toString());
    }
}
