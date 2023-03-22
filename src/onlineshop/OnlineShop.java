package onlineshop;

import org.apache.logging.log4j.Logger;

import onlineshop.waren.Buch;

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
	public static void main(String[] args){
		Buch buch = new Buch();
		buch.setAnzahlSeiten(42);
		buch.setAutor("meister");
		logger.info(buch);
	}
}
