package onlineshop.waren;

public class Sachbuch extends Buch {
    private String thema;

    public Sachbuch(String titel, String autor, String thema) {
        super(titel, autor);
        this.thema = thema;
    }

    public String getThema() {
        return thema;
    }

    public void setThema(String thema) {
        this.thema = thema;
    }
}