import java.util.Date;

public class Colloquio {
    private Date giorno;
    private String alunno;
    private String genitore;
    public  String classe;

    public  Colloquio() {
        giorno = null;
        alunno = null;
        classe = null;
        genitore = null;
    }

    public  Colloquio(Date giorno, String alunno, String classe, String genitore) {
        this.giorno = giorno;
        this.alunno = alunno;
        this.classe = classe;
        this.genitore = genitore;
    }

    public void setGiorno(Date giorno) {
        this.giorno = giorno;
    }

    public void setAlunno(String alunno) {
        this.alunno = alunno;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setGenitore(String genitore) {
        this.genitore = genitore;
    }

    public Date getGiorno() {
        return giorno;
    }

    public String getAlunno() {
        return alunno;
    }

    public String getClasse() {
        return classe;
    }

    public String getGenitore() {
        return genitore;
    }

    public boolean equals(Colloquio colloquioConfrontato) {
        return alunno == colloquioConfrontato.alunno  && classe == colloquioConfrontato.classe && genitore == colloquioConfrontato.genitore;
    }

    public String toString() {
        return "[Nome genitore: " + genitore + "Nome alunno: " + alunno + "Classe: " + classe + "]";
    }
}
