package onlineshop;

import onlineshop.waren.Artikel;
import onlineshop.waren.Buch;
import onlineshop.waren.Sachbuch;

public class ShopTest {

    public static void main(String[] args) {
        Kunde testKunde = new Kunde("Freddie", "Walker", Kunde.MAENNLICH, "15.11.1970", new Warenkorb());
        String stringKunde = testKunde.toString();
//        Kunde geclonterKunde = testKunde.clone();

        System.out.print("Teste Kunde ................... ");
        assert testKunde.toString().contains("@") == false : "Kunde.toString() nicht überschrieben!";
        assert stringKunde.equals("Kunden-Objekt enthält folgende Daten: \n" +
                "Vorname: Freddie\n" +
                "Nachname: Walker\n" +
                "Geschlecht: m\n" +
                "Geburtsdatum: 15.11.1970") : "Die Kundendaten weichen ab. \n" + stringKunde;

//        assert geclonterKunde.equals(testKunde) : "Die Kundennummern sind unterschiedlich";
//        assert geclonterKunde.hashCode() == testKunde.hashCode() : "Die HashCodes sind unterschiedlich";
        System.out.println("OK!");

        System.out.print("Teste Artikel ................. ");
        Artikel usbStick = new Artikel("256 GB", "Intenso");
        Artikel stick2 = new Artikel("256 GB", "Intenso");

        assert usbStick.toString().contains("@") == false : "Artikel.toString() nicht überschrieben!";
        assert usbStick.toString().equals("Artikel{beschreibung='256 GB', hersteller='Intenso'}") : "die Artikel müssen gleich sein";
        assert usbStick.equals(stick2) : "Die Artikel sind unterschiedlich";
        assert usbStick.hashCode() == stick2.hashCode() : "Die Artikel-HashCodes sind unterschiedlich";
        System.out.println("OK!");

        System.out.print("Teste Buch .................... ");
        Buch buch = new Buch("Das Lied von Eis und Feuer", "George R. R. Martin");
        Buch buch2 = new Buch("Das Lied von Eis und Feuer", "George R. R. Martin");

        assert buch.toString().contains("@") == false : "Buch.toString() nicht überschrieben!";
        assert buch.toString().equals("Buch{titel='Das Lied von Eis und Feuer', autor='George R. R. Martin'}") : "Die Buchdaten weichen ab.";
        assert buch.equals(buch2) : "Die Bücher sind unterschiedlich";
        assert buch.hashCode() == buch2.hashCode() : "Die Bücher-HashCodes sind unterschiedlich";
        System.out.println("OK!");

        System.out.print("Teste Sachbuch ................ ");
        Sachbuch sachbuch = new Sachbuch("Clean Code", "Robert C. Martin", "Programmierung");
        Sachbuch sachbuch2 = new Sachbuch("Clean Code", "Robert C. Martin", "Programmierung");

        assert buch.toString().contains("@") == false : "Sachbuch.toString() nicht überschrieben!";
        assert sachbuch.toString().equals("Sachbuch{titel='Clean Code', autor='Robert C. Martin', thema='Programmierung'}") : "Die Sachbuchdaten weichen ab.";
        assert sachbuch.equals(sachbuch2) : "Die Sachbücher sind unterschiedlich";
        assert sachbuch.hashCode() == sachbuch2.hashCode() : "Die Sachbuch-HashCodes sind unterschiedlich";
        System.out.println("OK!");
    }
}
