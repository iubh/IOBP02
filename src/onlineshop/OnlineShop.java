package onlineshop;

import org.apache.logging.log4j.Logger;

import onlineshop.waren.Buch;

import org.apache.logging.log4j.LogManager;

/**
 * The Class OnlineShop.
 */
public class OnlineShop {
	private static Logger logger = LogManager.getRootLogger();
	public static void main(String[] args){
		Buch buch = new Buch();
		buch.setAnzahlSeiten(42);
		buch.setAutor("meister");
		logger.info(buch);
	}
}
