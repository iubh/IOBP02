package onlineshop.waren;

import java.util.Objects;

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

    @Override
    public String getBeschreibung() {
        return super.getBeschreibung();
    }

    @Deprecated
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Buch buch = (Buch) o;
        return Objects.equals(titel, buch.titel) && Objects.equals(autor, buch.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel, autor);
    }

    @Override
    public String toString() {
        return "Buch{" +
                "titel='" + titel + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
