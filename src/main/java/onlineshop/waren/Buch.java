package onlineshop.waren;

public class Buch extends Artikel {
    protected int seiten;
    protected String titel;
    protected String autor;

    public Buch() {
        super();
    }

    public Buch(String titel, String autor) {
        super();
        this.titel = titel;
        this.autor = autor;
    }

    public String getBeschreibung() {
        return super.getBeschreibung();
    }

    public void setSeiten(int seiten) {
        this.seiten = seiten;
    }

    public void setAnzahlSeiten(int seiten) {
        this.seiten = seiten;
    }

    public void setAutor(final String autor) {
        this.autor = autor;
    }

    public void setTitel(final String titel) {
        this.titel = titel;
    }
}
