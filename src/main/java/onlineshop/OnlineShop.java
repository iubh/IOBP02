package onlineshop;

import onlineshop.waren.Artikel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

/**
 * Managed den OnlineShop.<br/>
 * Hier wird später die Spring Boot Applikation gestartet.
 */
public class OnlineShop {
    private final static Logger log = LogManager.getLogger(OnlineShop.class);
    private final static String RESOURCES = "src/main/resources/";
    private final static String SEPARATOR = ";";
    private final static String SORTIMENT_DATEI = "sortiment.csv";
    private static Sortiment sortiment;

    public static void main(String[] args) {
        // TODO: 1. Erstellen Sie eine CSV-Datei mit 10 Artikeln als Startsortiment für den Shop.
        // Lesen Sie diese Datei mittels „BufferedReader“ ein, um das Shop-Sortiment zu initialisieren.
        Set<Artikel> artikels = artikelEinlesen(SORTIMENT_DATEI);
        sortiment = new Sortiment(artikels);

        // TODO: 2. Legen Sie ein Verzeichnis „Bestellungen“ an.
        File bestellungsVerzeichnis = verzeichnisAnlegen("Bestellungen");

        // TODO: 3. generieren Sie per Java-Code eine Testbestellung und schreiben Sie die
        // Bestellbestätigung in eine Textdatei innerhalb des „Bestellungen“-Verzeichnisses.
        Kunde kunde = new Kunde("Alfred", "Walther", Kunde.MAENNLICH, "15.11.1970");
        Bestellung bestellung = bestellen(kunde);
        bestellungSpeichern(bestellung, bestellungsVerzeichnis);

        // TODO: fügen Sie dem Sortiment per Java weitere Artikel hinzu.
        artikelHinzufuegen(5);

        // Speichern sie das neue Sortiment als CSV-Datei.
        sortimentSpeichern();
    }

    /**
     * Liest die Sortiments-Artikel aus einer CSV-Datei ein
     *
     * @param dateiName {@link String} der Name der CSV-Datei
     * @return sortimensArtikel {@link Set<Artikel>} - die eingelesenen Artikel
     */
    private static Set<Artikel> artikelEinlesen(String dateiName) {
        Set<Artikel> artikelListe = new TreeSet<>();
        File csvDatei = new File(RESOURCES + dateiName);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(csvDatei));
            // 1. Zeile (Header) überspringen
            String zeile = reader.readLine();

            // zeilenweise einlesen
            while ((zeile = reader.readLine()) != null) {
                String[] spalten = zeile.split(SEPARATOR);
                //                         beschreibung  hersteller
                artikelListe.add(new Artikel(spalten[0], spalten[1]));
            }
            reader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        log.debug(artikelListe.size() + " Artikel eingelesen");
        return artikelListe;
    }

    /**
     * Legt ein neues Verzeichnis unterhalb von "resources" an
     *
     * @param verzeichnisName {@link String} der Name des neuen Verzeichnisses
     * @return neuesVerzeichnis {@link File} Referenz auf das neue Verzeichnis
     */
    private static File verzeichnisAnlegen(String verzeichnisName) {
        File verzeichnis = new File(RESOURCES + verzeichnisName);
        if (verzeichnis.exists()) {
            log.warn("Das Verzeichnis '" + verzeichnisName + "' existiert bereits!");
            return verzeichnis;
        }

        boolean erfolgreich = verzeichnis.mkdir();
        if (!erfolgreich)
            throw new RuntimeException("Konnte das Verzeichnis '" + verzeichnisName + "' nicht unterhalb von '" + RESOURCES + "' anlegen!");

        log.debug("Verzeichnis '" + verzeichnisName + "' wurde angelegt");
        return verzeichnis;
    }

    /**
     * Führt eine Bestellung für einen Kunden durch.
     * Durchläuft das Sortiment und fügt den Artikel mit 50% Wahrscheinlichkeit hinzu.
     *
     * @param kunde {@link Kunde} der Bestellungs-Kunde
     * @return {@link Bestellung} Referenz auf die neu erzeugte Bestellung
     */
    private static Bestellung bestellen(Kunde kunde) {
        // Sortiment durchlaufen
        for (Artikel artikel : sortiment.getArtikelListe()) {
            // mit 50% Chance zum Warenkorb hinzufügen
            if (Math.random() > 0.5)
                kunde.getWarenkorb().hinzufuegen(artikel);
        }
        Bestellung bestellung = kunde.bestellen();
        log.debug(kunde.getWarenkorb().getArtikelListe().size() + " Artikel für Kunde '" + kunde + "' bestellt.");
        return bestellung;
    }

    /**
     * Speichert eine Bestellung als Textdatei im übergebenen Verzeichnis-
     *
     * @param bestellung             {@link Bestellung} die zu speichernde Bestellung
     * @param bestellungsVerzeichnis {@File} Referenz auf die erzeugte Textdatei
     */
    private static void bestellungSpeichern(Bestellung bestellung, File bestellungsVerzeichnis) {
        String dateiName = "Bestellung-" + bestellung.getBestellNr() + ".txt";
        File datei = new File(bestellungsVerzeichnis, dateiName);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(datei));
            writer.write(bestellung.toString());
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        log.debug("Bestellung Nr. '" + bestellung.getBestellNr() + "' gespeichert in Datei '" + dateiName + "'");
    }

    /**
     * Fügt <anzahl> Artikel zum Sortiment hinzu.
     *
     * @param anzahl {@link Integer} Anzahl der Artikel, die hinzugefügt werden
     */
    private static void artikelHinzufuegen(int anzahl) {
        for (int i = 1; i <= anzahl; i++) {
            Artikel artikel = new Artikel("Artikel-" + i, "HerstellerXY");
            sortiment.getArtikelListe().add(artikel);
        }
        log.debug(anzahl + " Artikel hinzugefügt");
    }

    /**
     * Speichert das aktuelle Sortiment als CVS-Datei im Resource-Verzeichnis.
     */
    private static void sortimentSpeichern() {
        File datei = new File(RESOURCES, SORTIMENT_DATEI);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(datei));

            // Kopfzeile ausgeben
            writer.write("Beschreibung;Hersteller");

            for (Artikel artikel : sortiment.getArtikelListe()) {
                writer.newLine();
                writer.write(artikel.getBeschreibung());
                writer.write(SEPARATOR);
                writer.write(artikel.getHersteller());
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        log.debug("Sortiment-Datei aktualisert ");
    }
}
