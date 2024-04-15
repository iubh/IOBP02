package onlineshop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * Managed den OnlineShop.<br/>
 * Hier wird später die Spring Boot Applikation gestartet.
 */
public class OnlineShop {
    private static final Logger logger = LogManager.getLogger(OnlineShop.class);

    public static void main(String[] args) {
/*
        Kunde kunde = new Kunde( "Karl", "Rietmann", Kunde.MAENNLICH, "27.05.1986", new Warenkorb());
        logger.info(kunde);
*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Testfall-Nummer (1, 2 oder 3) ein: ");
        int testNr = scan.nextInt();

        Kunde testKunde = null;
        Warenkorb cart = new Warenkorb();

        switch (testNr) {
            case 1:
                testKunde = new Kunde("Alfred", "Walther", Kunde.MAENNLICH, "15.11.1970", cart);
                break;
            case 2:
                testKunde = new Kunde("Laura", "Walther", Kunde.WEIBLICH, "26.04.2003", cart);
                break;
            case 3:
                testKunde = new Kunde("Lukas", "Walther", Kunde.MAENNLICH, "24.01.2006", cart);
                break;
            default:
                throw new RuntimeException("Die Testfall-Nummer " + testNr + " existiert leider nicht!");
        }

        logger.debug("Testfall: " + testNr);
        logger.debug(testKunde);
    }
}
