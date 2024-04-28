package onlineshop;

import org.junit.jupiter.api.Test;

class KundeTest {
    // 1. Arrange
    final Kunde kunde = new Kunde("Freddie", "Walker", "m", "15.11.1970");

    @Test
    void testClone() {
        // 2. Act
        // Kunde geklonterKunde = kunde.clone();

        // 3. Assert
        // assertEquals(kunde, geklonterKunde);
    }

    @Test
    void testClone_correct_Class() {
        // 2. Act
        // Object geklonterKunde = kunde.clone();

        // 3. Assert
        // assertEquals(Kunde.class, geklonterKunde.getClass());
    }

    @Test
    void testClone_false_positive() {
        // 1. Arrange
        // Kunde kunde2 = new Kunde("Captain", "Morgan", "m", "11.11.2001", new Warenkorb());

        // 2. Act
        // Kunde geklonterKunde = kunde.clone();

        // 3. Assert
        // assertNotEquals(kunde2, geklonterKunde);
    }

    @Test
    void testCompareTo() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
    }
}