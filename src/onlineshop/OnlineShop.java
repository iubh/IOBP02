package onlineshop;

import org.apache.logging.log4j.Logger;

import onlineshop.waren.Buch;
import onlineshop.waren.Sachbuch;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Queue;

import java.util.concurrent.ConcurrentLinkedQueue;

// TODO: Auto-generated Javadoc
/**
 * The Class OnlineShop.
 */
public class OnlineShop {

	/** The logger. */
	private static Logger logger = LogManager.getRootLogger();

	private Queue<Bestellung> bestellungen = new ConcurrentLinkedQueue<Bestellung>();

	/** The historie. */
	private Historie historie = new Historie();

	public OnlineShop(Queue<Bestellung> bestellungen, Historie historie) {
		this.bestellungen = bestellungen;
		this.historie = historie;
	}

	public OnlineShop() {

	}

	/** The schritte. */
	private String[] schritte = new String[] { "Warenkorb anzeigen",
			"Zahlungsmethode wählen", "Zahlungsinformationen eingeben",
			"Versandart wählen", "Bestellübersicht anzeigen",
			"Bestellbestätigung anzeigen" };

	/**
	 * @return String
	 */
	// @Override
	public String toString() {
		return this.bestellungen.toString() + " " + this.historie.toString();
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println("Bitte eine Zahl auswählen (1,2,3,4 oder 5): ");
		Scanner s = new Scanner(System.in);
		int eingabe = s.nextInt();
		OnlineShop shop = new OnlineShop();
		Kunde besteller = new Kunde("Ralf", "Koschke");
		Warenkorb w1 = new Warenkorb();
		Buch buch = new Buch();
		Warenkorb w2 = new Warenkorb();
		Warenkorb w3 = new Warenkorb();
		switch (eingabe) {
			case 1:
				buch.setAnzahlSeiten(42);
				buch.setAutor("meister");
				logger.info(buch);
				logger.debug("1");
				s.close();
				break;
			case 2:
				buch.setAnzahlSeiten(24);
				buch.setAutor("gandalf");
				logger.info(buch);
				logger.debug("2");
				s.close();
				break;
			case 3:
				shop.bestellprozess();
				break;
			case 4:
				w1.artikelHinzufuegen(new Sachbuch("47-11", "dpunkt Verlag",
						"Requirements Engineering", 49.00, "Klaus Pohl", "SE"));
				w1.artikelHinzufuegen(1, new Sachbuch("47-12", "Spektrum",
						"UML Kompakt", 14.99F, "Helde Balzert", "SE"));
				Bestellung erste = new Bestellung("2013-08-13 15:33:56", besteller, w1);
				shop.bestellungen.offer(erste);
				// 2. Bestellung
				w2.artikelHinzufuegen(new Sachbuch("47-13", "Spektrum",
						"Software-Qualität", 34.99f, "Peter Liggesmeyer", "SE"));
				w2.artikelHinzufuegen(0, new Sachbuch("47-14", "Springer",
						"Faint Objects", 27.00f, "Brian Cudnik", "Astronomy"));
				Bestellung zweite = new Bestellung("2013-08-13 15:42:11", besteller, w2);
				shop.bestellungen.offer(zweite);
				w3.artikelHinzufuegen(new Sachbuch("47-15", "Pearson",
						"Software-Engineering", 59.95f, "Ian Summerville", "SE"));
				w3.artikelHinzufuegen(0, new Sachbuch("47-16", "Spektrum",
						"Softwaremanagement", 64.99f, "Helmut Balzert", "SE"));
				Bestellung dritte = new Bestellung("2013-08-13 15:45:23", besteller, w3);
				shop.bestellungen.offer(dritte);
				while (!shop.bestellungen.isEmpty()) {
					System.out.println(shop.bestellungen.poll());
				}
				break;
			case 5:
				shop.date();
				break;
		}
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
}
