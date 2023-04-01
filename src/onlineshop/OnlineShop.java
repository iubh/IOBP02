package onlineshop;

import org.apache.logging.log4j.Logger;

import onlineshop.waren.Buch;
import onlineshop.waren.Sachbuch;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Queue;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

// TODO: Auto-generated Javadoc
/**
 * The Class OnlineShop.
 */
public class OnlineShop {

	/** The logger. */
	private static Logger logger = LogManager.getRootLogger();

	/** The bestellungen. */
	private Queue<Bestellung> bestellungen = new ConcurrentLinkedQueue<Bestellung>();

	/** The historie. */
	private Historie historie = new Historie();

	/**
	 * Instantiates a new online shop.
	 *
	 * @param bestellungen the bestellungen
	 * @param historie     the historie
	 */
	public OnlineShop(Queue<Bestellung> bestellungen, Historie historie) {
		this.bestellungen = bestellungen;
		this.historie = historie;
	}

	/**
	 * Instantiates a new online shop.
	 */
	public OnlineShop() {
		System.out.println("Bitte eine Zahl auswählen (1,2,3,4,5,6,7,8 oder 9): ");
		Kunde besteller = new Kunde("Ralf", "Koschke");
		Warenkorb w1 = new Warenkorb();
		Buch buch = new Buch();
		Warenkorb w2 = new Warenkorb();
		Warenkorb w3 = new Warenkorb();
		Scanner s = new Scanner(System.in);
		int eingabe = s.nextInt();
		switch (eingabe) {
			case 1 -> {
				buch.setAnzahlSeiten(42);
				buch.setAutor("meister");
				logger.info(buch);
				logger.debug("1");
				s.close();
				break;
			}
			case 2 -> {
				buch.setAnzahlSeiten(24);
				buch.setAutor("gandalf");
				logger.info(buch);
				logger.debug("2");
				s.close();
				break;
			}
			case 3 -> {
				this.bestellprozess();
				break;
			}
			case 4 -> {
				w1.artikelHinzufuegen(new Sachbuch("47-11", "dpunkt Verlag",
						"Requirements Engineering", 49.00, "Klaus Pohl", "SE"));
				w1.artikelHinzufuegen(1, new Sachbuch("47-12", "Spektrum",
						"UML Kompakt", 14.99F, "Helde Balzert", "SE"));
				Bestellung erste = new Bestellung("2013-08-13 15:33:56", besteller, w1);
				this.bestellungen.offer(erste);
				// 2. Bestellung
				w2.artikelHinzufuegen(new Sachbuch("47-13", "Spektrum",
						"Software-Qualität", 34.99f, "Peter Liggesmeyer", "SE"));
				w2.artikelHinzufuegen(0, new Sachbuch("47-14", "Springer",
						"Faint Objects", 27.00f, "Brian Cudnik", "Astronomy"));
				Bestellung zweite = new Bestellung("2013-08-13 15:42:11", besteller, w2);
				this.bestellungen.offer(zweite);
				w3.artikelHinzufuegen(new Sachbuch("47-15", "Pearson",
						"Software-Engineering", 59.95f, "Ian Summerville", "SE"));
				w3.artikelHinzufuegen(0, new Sachbuch("47-16", "Spektrum",
						"Softwaremanagement", 64.99f, "Helmut Balzert", "SE"));
				Bestellung dritte = new Bestellung("2013-08-13 15:45:23", besteller, w3);
				this.bestellungen.offer(dritte);
				while (!this.bestellungen.isEmpty()) {
					System.out.println(this.bestellungen.poll());
				}
				break;
			}
			case 5 -> {
				this.date();
				break;
			}
			case 6 -> {
				this.file();
				break;
			}
			case 7 -> {
				this.compress();
				break;
			}
			case 8 -> {
				this.decompress();
				break;
			}
			case 9 -> {
				this.cMkdirs();
				break;
			}
		}
		s.close();
	}

	/** The schritte. */
	private String[] schritte = new String[] { "Warenkorb anzeigen",
			"Zahlungsmethode wählen", "Zahlungsinformationen eingeben",
			"Versandart wählen", "Bestellübersicht anzeigen",
			"Bestellbestätigung anzeigen" };

	/**
	 * To string.
	 *
	 * @return String
	 */
	// @Override
	public String toString() {
		return this.bestellungen.toString() + " " + this.historie.toString();
	}

	/**
	 * Bestellprozess.
	 */
	private void bestellprozess() {
		Scanner s = new Scanner(System.in);
		int prozessPosition = 0;
		int eingabe = 1;

		while (eingabe != 0) {
			System.out.println("Aktueller Schritt: " + schritte[prozessPosition]);
			System.out.print("Bitte wählen Sie (1=weiter zu '" + schritte[prozessPosition + 1] + "', 2=zurück, 0=beenden): ");
			eingabe = s.nextInt();

			switch (eingabe) {
				case 0:
					System.out.println("Vielen Dank für Ihren Besuch!");
					break;
				case 1:
					prozessPosition++;
					historie.weiter(schritte[prozessPosition]);
					if (prozessPosition == schritte.length - 1) {
						System.out.println("Vielen Dank für Ihren Einkauf!");
						return;
					}
					break;
				case 2:
					if (historie.zurueck() != null)
						prozessPosition--;
					break;
			}
		}
		s.close();
	}

	/**
	 * Date.
	 */
	private void date() {
		Date datum = new Date();
		datum.setMonth(datum.getMonth() + 6);
		System.out.println(datum);
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("dd.MM.yyyy");
		String formatDate = sdf.format(datum);
		System.out.println(formatDate);
		System.out.println("GregorianCalendar:");
		GregorianCalendar calendar = new GregorianCalendar();
		sdf.setCalendar(calendar);
		formatDate = sdf.format(calendar.getTime());
		System.out.println(formatDate);
		System.out.println("GregorianCalendar Roll:");
		calendar.roll(Calendar.MONTH, 3);
		sdf.setCalendar(calendar);
		formatDate = sdf.format(calendar.getTime());
		System.out.println(formatDate);
	}

	/**
	 * File.
	 */
	private void file() {
		File[] roots = File.listRoots();
		for (File root : roots) {
			System.out.println(root);

			File[] files = root.listFiles();
			for (File file : files) {
				System.out.print(file.getAbsolutePath() + " ");
			}
			System.out.println();
		}

		File datei = new File("test");
		if (datei.exists()) {
			try {
				FileReader fileReader = new FileReader(datei);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				for (String zeile = bufferedReader.readLine(); zeile != null; zeile = bufferedReader.readLine()) {
					System.out.println(zeile);
				}
				bufferedReader.close();
				fileReader.close();
			} catch (FileNotFoundException ex) {
				ex.printStackTrace();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		try {
			FileWriter fileWriter = new FileWriter(datei);
			Date datum = new Date();
			SimpleDateFormat sdf;
			sdf = new SimpleDateFormat("dd.MM.yyyy");
			String formatDate = sdf.format(datum);
			fileWriter.write(formatDate);
			fileWriter.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Compress.
	 */
	private void compress() {
		try {
			BufferedWriter w = new BufferedWriter(
					new OutputStreamWriter(new DeflaterOutputStream(new FileOutputStream(new File("compress")))));
			GregorianCalendar calendar = new GregorianCalendar();
			SimpleDateFormat sdf;
			sdf = new SimpleDateFormat("kk.mm.ss.SSS");
			for (int i = 0; i < 100; ++i) {
				Date date = new Date();
				calendar.setTime(date);
				String formatDate = sdf.format(calendar.getTime());
				System.out.println(formatDate);
				w.write(formatDate + "\n");
			}
			w.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Decompress.
	 */
	private void decompress() {
		try {
			BufferedReader b = new BufferedReader(
					new InputStreamReader(new InflaterInputStream(new FileInputStream((new File("compress"))))));
			for (String s = b.readLine(); s != null; s = b.readLine()) {
				System.out.println(s);
			}
			b.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	
	/** 
	 * @return boolean
	 */
	public boolean cMkdirs () {
		String sep = File.separator;
		String pfad = "yoyoyo" + sep;
		File verzeichnis = new File(pfad);
		if(verzeichnis.exists() && verzeichnis.canWrite()) {
			return true;
			}
			else{
				return verzeichnis.mkdirs();
			}
		}
}