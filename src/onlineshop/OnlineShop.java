package onlineshop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Managed den OnlineShop.<br/>
 * Hier wird später die Spring Boot Applikation gestartet.
 */
public class OnlineShop {
    private static Logger logger = LogManager.getLogger(OnlineShop.class);

    public static void main(String[] args) {
        Kunde kunde = new Kunde( "Karl", "Rietmann", Kunde.MAENNLICH, "27.05.1986", new Warenkorb());
        logger.info(kunde);
    }
}
