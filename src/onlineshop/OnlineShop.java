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

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		System.out.println("Bitte eine Zahl auswählen (1 oder2): ");
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
		}
	}
}
