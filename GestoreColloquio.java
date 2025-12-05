public class GestoreColloquio {
    private Colloquio[] colloqui;
    private int numeroColloqui;

    public GestoreColloquio() {
        int maxColloqui = 4;
        colloqui = new Colloquio[maxColloqui];
        numeroColloqui = 0;
    }

    public boolean aggiungiColloquio(Colloquio nuovoColloquio) {
        for (int i = 0; i < numeroColloqui; i++) {
            if (colloqui[i].equals(nuovoColloquio)) {
                return false;
            }
        }
        if (numeroColloqui < colloqui.length) {
            colloqui[numeroColloqui] = nuovoColloquio;
            numeroColloqui++;
            return true;
        }
        return false;
    }

    public boolean rimuoviColloquio(Colloquio daRimuovere) {
        for (int i = 0; i < numeroColloqui; i++) {
            if (colloqui[i].equals(daRimuovere)) {
                for (int j = i; j < numeroColloqui - 1; j++) {
                    colloqui[j] = colloqui[j + 1];
                }
                colloqui[numeroColloqui - 1] = null;
                numeroColloqui--;
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String s=null;
        for(int i=0; i<numeroColloqui;i++){
            s+=colloqui[i].toString()+"\n";
        }
        return s;
    }







}
