# IOBP02 Datenstrukturen und Java-Klassenbibliothek

## Einheit 2

Führen Sie folgende Schritte in Ihrem Java-Projekt durch:
1. Implementieren Sie die „toString()“-Methode in den Klassen Kunde, Artikel,
   Buch und Sachbuch. Vermeiden Sie Code-Doppelungen!  

2. Implementieren Sie die „equals()“-Methode in den oben genannten Klassen.
  
3. Implementieren Sie die „hashCode()“-Methode in den oben genannten
   Klassen.  
  
4. Implementieren Sie die „clone()“-Methode in der Klasse „Sachbuch“.

Sie können die Implementierung testen, indem Sie die Klasse [ShopTest](src/onlineshop/ShopTest.java) laufen lassen. Dafür müssen Sie den Command-Line-Parameter <code>-enableassertions</code> oder <code>-ea</code> beim Aufruf mitgeben.

In IntelliJ IDEA funktioniert das leider nicht immer. Eine Alternative besteht darin, die Test-Klasse im Terminal laufen zu lassen. Führen Sie dafür folgende Schritte durch:
1. Erzeugen Sie die Java Class-Files über "Build / Build Project".
2. Klicken Sie im Project Explorer auf das Zahnrad.
2. Aktivieren Sie "Tree Appearance / Show Excluded Files".
3. Navigieren Sie zum Java Output-Verzeichnis, z.B. "out/production/IOBP-02".
4. Klicken Sie mit der rechten Maustaste auf dieses Verzeichnis und wählen Sie "Open In / Terminal".
5. Starten Sie nun die Test-Klasse über den Terminal, indem Sie folgenden Befehl eingeben: <code>java -ea onlineshop.ShopTest</code>

Viel Erfolg!  
Ihr IU-Team
