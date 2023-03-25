package onlineshop;

import org.apache.logging.log4j.Logger;

import onlineshop.waren.Buch;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;

// TODO: Auto-generated Javadoc
/**
 * The Class OnlineShop.
 */
public class OnlineShop {

	/** The logger. */
	private static Logger logger = LogManager.getRootLogger();

	/** The historie. */
	private Historie historie = new Historie();
	
	/** The schritte. */
	private String[] schritte = new String[] { "Warenkorb anzeigen",
			"Zahlungsmethode wählen", "Zahlungsinformationen eingeben",
			"Versandart wählen", "Bestellübersicht anzeigen",
			"Bestellbestätigung anzeigen" };

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println("Bitte eine Zahl auswählen (1,2 oder 3): ");
		Scanner s = new Scanner(System.in);
		int eingabe = s.nextInt();
		switch (eingabe) {
			case 1:
				Buch buch = new Buch();
				buch.setAnzahlSeiten(42);
				buch.setAutor("meister");
				logger.info(buch);
				logger.debug("1");
				s.close();
				break;
			case 2:
				Buch buch2 = new Buch();
				buch2.setAnzahlSeiten(24);
				buch2.setAutor("gandalf");
				logger.info(buch2);
				logger.debug("2");
				s.close();
				break;
			case 3:
				OnlineShop shop = new OnlineShop();
				shop.bestellprozess();
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
}
