public class Colloquio {
    private Date giorno;
    private String alunno;
    private String genitore;
    public String classe;

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

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String toString() {
        return "[Nome genitore: " + genitore + "Nome alunno: " + alunno + "Classe: " + classe + "]";
    }
}
