# IOBP02
Datenstrukturen und Java-Klassenbibliothek

This is a sample project I created to experiment and learn, with the hope that it might be helpful to others. Although I acknowledge that my code style may not be optimal, I believe it is a good starting point for exploration and experimentation.

---

Herzlich willkommen zu den Aufgaben des Kurses "IOBP02 Datenstrukturen und Java-Klassenbibliothek" der International University. Hier werden im Laufe des Kurses die Aufgaben hochgeladen (master-Branch). Die Lösungen werden 2 Tage später im solution-Branch angezeigt. Die Aufgaben zu jeder Einheit stehen in "einheit1.md" bis "einheit6.md".

[Einheit 1](einheit1.md)  
[Einheit 2](einheit2.md)  
[Einheit 3](einheit3.md)  
[Einheit 4](einheit4.md)

Viel Erfolg!
Ihr IU-Team

Q&A:

1.)

Erkläre an einem Code-Beispiel, was abstrakte Klassen in java sind und zeige warum diese benötigt werden

Hier ist ein Beispiel, das die Verwendung von abstrakten Klassen in Java zeigt:

```java
abstract class Shape {
   abstract void draw();
}

class Circle extends Shape {
   void draw() {
      System.out.println("Kreis wird gezeichnet");
   }
}

class Rectangle extends Shape {
   void draw() {
      System.out.println("Rechteck wird gezeichnet");
   }
}

public class Main {
   public static void main(String[] args) {
      Shape s = new Circle();
      s.draw();
   }
}
```

In diesem Beispiel ist Shape eine abstrakte Klasse, die eine abstrakte Methode draw() enthält, die von allen abgeleiteten Klassen implementiert werden muss. Circle und Rectangle sind konkrete Klassen, die Shape erweitern und die draw()-Methode implementieren, um jeweils einen Kreis oder ein Rechteck zu zeichnen. Im main-Methode wird eine Instanz von Circle erstellt und auf eine Shape-Referenz zugewiesen. Dadurch wird sichergestellt, dass der Aufruf der draw()-Methode auf der korrekten Klasse ausgeführt wird.

Abstrakte Klassen sind in diesem Beispiel nützlich, weil sie eine gemeinsame Schnittstelle für verschiedene Formen bereitstellen. Dadurch können andere Teile des Codes unabhängig von der konkreten Implementierung der Formen bleiben. Zum Beispiel könnte eine Funktion, die alle Formen in einem Array zeichnet, einfach eine Schleife durchlaufen und die draw()-Methode auf jeder Form aufrufen, ohne sich um die Details der einzelnen Formen kümmern zu müssen. Außerdem kann die Abstraktion dazu beitragen, Code-Duplizierung zu vermeiden, da der gemeinsame Code in der abstrakten Klasse definiert werden kann.

2.)

Muss eine normale methode in einer abstrakten klasse, von den subklassen implementiert werden?

Nein, normale Methoden in einer abstrakten Klasse müssen nicht von den Subklassen implementiert werden, da sie bereits eine Implementierung in der abstrakten Klasse haben.

Abstrakte Methoden hingegen müssen von jeder konkreten Klasse, die von der abstrakten Klasse erbt, implementiert werden. Abstrakte Methoden haben keine Implementierung in der abstrakten Klasse selbst und müssen daher in den konkreten Klassen implementiert werden, die die abstrakte Klasse erweitern.

Wenn eine Methode in der abstrakten Klasse eine normale Methode ist, die bereits eine Implementierung hat, können die konkreten Klassen diese Methode aufrufen und verwenden, ohne sie erneut zu implementieren. Wenn jedoch eine Methode in der abstrakten Klasse als abstrakt deklariert ist, müssen die konkreten Klassen sie implementieren, da sie keine Implementierung in der abstrakten Klasse hat und die konkreten Klassen selbst eine Implementierung bereitstellen müssen.

3.)

Erkläre den Unterschied zwischen implizierten und explizierten Aufrufen in Java. Gehe zudem auf die toString Methode ein.

In Java gibt es zwei Arten von Methodenaufrufen: implizite und explizite Aufrufe.

Implizite Aufrufe sind Methodenaufrufe, die automatisch von Java ausgeführt werden, ohne dass der Entwickler explizit eine Methode aufrufen muss. Ein Beispiel hierfür ist die toString()-Methode, die implizit aufgerufen wird, wenn ein Objekt als String dargestellt werden soll. Wenn ein Objekt beispielsweise an die System.out.println()-Methode übergeben wird, ruft Java implizit die toString()-Methode des Objekts auf, um es in einen String umzuwandeln und ihn auszugeben.

Explizite Aufrufe hingegen sind Methodenaufrufe, bei denen der Entwickler die Methode explizit aufruft, indem er den Methodennamen und gegebenenfalls Argumente angibt.

Die toString()-Methode ist eine Methode, die in der Object-Klasse definiert ist und von jeder Java-Klasse geerbt wird. Die toString()-Methode gibt eine String-Darstellung des Objekts zurück. Wenn die toString()-Methode nicht in der Klasse, die das Objekt erstellt hat, überschrieben wird, gibt sie die Standard-String-Darstellung des Objekts zurück, die den Klassennamen und eine hexadezimale Darstellung der Objektadresse enthält. Wenn die toString()-Methode jedoch in der Klasse überschrieben wird, kann der Entwickler eine benutzerdefinierte String-Darstellung des Objekts zurückgeben, die sinnvoller ist als die Standard-String-Darstellung.

Zusammenfassend ist der Unterschied zwischen impliziten und expliziten Aufrufen, dass implizite Aufrufe automatisch von Java ausgeführt werden, während explizite Aufrufe explizit vom Entwickler ausgeführt werden müssen. Die toString()-Methode ist eine implizite Methode, die eine String-Darstellung des Objekts zurückgibt und automatisch von Java aufgerufen wird, wenn ein Objekt als String dargestellt werden soll.

4.)

Erkläre an einem geeigneten Code-Beispiel das super keyword in Java und zeige wann dies notwendig ist.

In Java ist das super-Schlüsselwort eine Referenz auf die unmittelbar übergeordnete Klasse einer abgeleiteten Klasse. Es wird verwendet, um auf die Methoden, Konstruktoren und Variablen der übergeordneten Klasse zuzugreifen.

Hier ist ein Beispiel, das das super-Schlüsselwort demonstriert:

```java
public class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

public class Car extends Vehicle {
    private String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public void honk() {
        super.honk();
        System.out.println("Beep, beep!");
    }

    public void display() {
        System.out.println("Brand: " + super.brand);
        System.out.println("Model: " + this.model);
    }
}
```

In diesem Beispiel erbt die Car-Klasse von der Vehicle-Klasse. Die Vehicle-Klasse hat eine geschützte Variable brand und eine Methode honk(), die einen Standard-Ausgabe-Aufruf enthält. Die Car-Klasse hat eine private Variable model und eine Methode display(), die die Marke und das Modell des Autos ausgibt.

Die Car-Klasse hat auch eine honk()-Methode, die die honk()-Methode der übergeordneten Vehicle-Klasse überschreibt und die super-Methode aufruft, um den Standard-Ausgabe-Aufruf der honk()-Methode der Vehicle-Klasse zuerst auszuführen, bevor sie ihren eigenen Ausgabe-Aufruf hinzufügt.

Das super-Schlüsselwort wird auch im Konstruktor der Car-Klasse verwendet, um auf den Konstruktor der übergeordneten Vehicle-Klasse zuzugreifen und die Marke des Autos zu setzen.

Das super-Schlüsselwort ist notwendig, um auf Methoden, Konstruktoren oder Variablen der übergeordneten Klasse zuzugreifen, wenn diese in der abgeleiteten Klasse überschrieben oder ausgeblendet wurden. In diesem Beispiel haben wir das super-Schlüsselwort verwendet, um auf die honk()-Methode der Vehicle-Klasse zuzugreifen und den Konstruktor der Vehicle-Klasse aufzurufen, um die brand-Variable zu setzen.

5.)

Gibt es importierbare pakete in java, die system heißen?

Ja, es gibt in Java importierbare Pakete mit dem Namen java.lang.System. Dieses Paket enthält Klassen und Methoden, die für den Zugriff auf das System und seine Eigenschaften nützlich sind. Einige der wichtigsten Klassen in diesem Paket sind:

System: eine Klasse, die statische Methoden und Variablen für den Zugriff auf das System bereitstellt, wie z.B. die Ausgabe von Meldungen auf der Konsole und die Beendigung von Programmen.
Runtime: eine Klasse, die den Ausführungszeit- und Speicherplatzstatus des Systems verwaltet.
Math: eine Klasse, die mathematische Funktionen wie Sinus, Kosinus und Quadratwurzeln bereitstellt.
Es ist wichtig zu beachten, dass das Paket java.lang automatisch in jedem Java-Programm importiert wird, so dass die Klassen in diesem Paket ohne explizite Importanweisung verwendet werden können.

6.)

Gibt es importierbare pakete in java, die system heißen und nicht in java.lang enthalten sind?

Nein, es gibt keine importierbaren Pakete in Java, die explizit den Namen system tragen und nicht in dem Paket java.lang enthalten sind. Der Name java.lang ist ein spezielles Paket in Java, das automatisch in jedem Java-Programm importiert wird, und enthält grundlegende Klassen und Schnittstellen, die für die Java-Laufzeitumgebung unverzichtbar sind.

Es gibt jedoch andere Pakete in Java, die Klassen und Methoden enthalten, die mit dem System interagieren, wie z.B. das Paket java.util.logging für die Protokollierung, das Paket java.io für die Ein- und Ausgabeoperationen oder das Paket java.net für die Netzwerkprogrammierung. Diese Pakete bieten verschiedene Klassen und Methoden, die für die Interaktion mit dem System oder mit anderen Systemen erforderlich sind.

7.)

Stelle in einem Code Beispiel das Datum über einen Konstruktor mit einer Zeitzone in Java zusammen.

Hier ist ein Beispiel, wie man ein Datum mit einer bestimmten Zeitzone in Java über den Konstruktor der Klasse java.time.LocalDateTime zusammenstellt:

```java
import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        // Erstelle eine neue Zeitzone
        ZoneId timezone = ZoneId.of("Europe/Berlin");

        // Erstelle ein Datum mit der aktuellen Systemzeit und der Zeitzone
        LocalDateTime datetime = LocalDateTime.now(timezone);
        System.out.println("Datum mit der Systemzeit und Zeitzone: " + datetime);
    }
}
```

In diesem Beispiel wird zunächst eine neue Zeitzone mit dem Namen "Europe/Berlin" erstellt. Dann wird ein neues Datum mit der aktuellen Systemzeit und der Zeitzone "Europe/Berlin" über den Konstruktor der Klasse LocalDateTime erstellt.

Wenn dieses Programm ausgeführt wird, wird es das Datum mit der Systemzeit und der Zeitzone "Europe/Berlin" auf der Konsole ausgeben.

8.)

Warum kann man equals in Java überschreiben?

In Java ist die equals()-Methode eine Methode der Klasse Object, die für die Überprüfung von Objektgleichheit verwendet wird. Die Standardimplementierung von equals() in der Klasse Object prüft, ob zwei Objekte dieselbe Referenz haben, also auf dasselbe Objekt zeigen. Das bedeutet, dass zwei verschiedene Objekte mit denselben Attributwerten nicht als gleich betrachtet werden.

In vielen Fällen ist es jedoch erforderlich, Objekte anhand ihrer Attribute zu vergleichen, um zu prüfen, ob sie semantisch gleich sind. Um dies zu ermöglichen, können Java-Klassen die equals()-Methode überschreiben und eine eigene Implementierung bereitstellen, die die Attributwerte der Objekte vergleicht.

Die Überschreibung von equals() ist sinnvoll, wenn ein Objektgleichheitstest durchgeführt werden soll, bei dem nur bestimmte Attribute der Objekte verglichen werden sollen. Zum Beispiel können zwei Person-Objekte gleich sein, wenn ihre Namen und Alter übereinstimmen, auch wenn sie unterschiedliche Adressen haben.

Insgesamt ermöglicht die Möglichkeit, die equals()-Methode in Java zu überschreiben, eine flexiblere und genauere Definition der Objektgleichheit, was in vielen Anwendungsfällen sehr nützlich sein kann.

9.)

Was sind statische methoden in java?

Statische Methoden in Java sind Methoden, die einer Klasse zugeordnet sind, nicht jedoch einem bestimmten Objekt dieser Klasse. Sie können aufgerufen werden, ohne dass eine Instanz der Klasse erstellt wird, und können somit unabhängig von den Eigenschaften der Instanz arbeiten.

Statische Methoden werden in Java mit dem Schlüsselwort static vor dem Methodennamen deklariert. Sie können auf Klassenebene aufgerufen werden, ohne dass eine Instanz der Klasse erstellt werden muss. Statische Methoden können auf Klassenvariablen und -methoden zugreifen, aber nicht auf Instanzvariablen und -methoden.

Ein typisches Beispiel für eine statische Methode in Java ist die Math-Klasse, die viele nützliche mathematische Funktionen wie z.B. abs(), sqrt() oder sin() bereitstellt. Die Methoden dieser Klasse können auf Klassenebene aufgerufen werden, ohne dass eine Instanz der Klasse erstellt werden muss.

Ein weiteres Beispiel ist die main()-Methode, die in der Regel als Einstiegspunkt für die Ausführung von Java-Programmen dient. Die main()-Methode muss statisch sein, damit sie auf Klassenebene aufgerufen werden kann, ohne dass eine Instanz der Klasse erstellt werden muss.

Statische Methoden werden oft eingesetzt, um nützliche Hilfsfunktionen bereitzustellen, die unabhängig von einer bestimmten Instanz der Klasse arbeiten. Da sie auf Klassenebene aufgerufen werden können, sind sie auch nützlich für die Organisation von Code in Bibliotheken und Frameworks.

10.)

Wann macht es Sinn in Java eine eigene Wrapper klasse zu verwenden? Erkläre an einem Code-Beispiel.

Es kann sinnvoll sein, eine eigene Wrapper-Klasse in Java zu erstellen, um bestimmte Funktionalitäten hinzuzufügen oder um den Umgang mit bestimmten Datentypen zu vereinfachen. Eine Wrapper-Klasse ist im Wesentlichen eine Klasse, die einen anderen Datentyp "umwickelt" (engl. "wraps"), um zusätzliche Funktionen bereitzustellen.

Ein Beispiel für die Verwendung einer eigenen Wrapper-Klasse wäre, wenn man eine Klasse benötigt, die ein Integer-Array enthält und zusätzliche Methoden bereitstellt, um z.B. den Durchschnitt oder die Summe der Werte im Array zu berechnen. Hier kann eine Wrapper-Klasse nützlich sein, um die Funktionalität zu erweitern und den Code lesbarer und modularer zu gestalten.

Hier ist ein Beispiel für eine solche Wrapper-Klasse:

```java
public class IntegerArray {
    private int[] array;

    public IntegerArray(int[] array) {
        this.array = array;
    }

    public int sum() {
        int result = 0;
        for (int i : array) {
            result += i;
        }
        return result;
    }

    public double average() {
        if (array.length == 0) {
            return 0.0;
        }
        return (double) sum() / array.length;
    }

    // Weitere Methoden können hier hinzugefügt werden, um die Funktionalität zu erweitern

    public int[] getArray() {
        return array;
    }
}
```

In diesem Beispiel umhüllt die IntegerArray-Klasse ein Integer-Array und bietet zusätzliche Methoden, um die Summe und den Durchschnitt der Werte im Array zu berechnen. Außerdem bietet sie eine getArray()-Methode, um auf das darunterliegende Array zuzugreifen.

Die Verwendung einer solchen Wrapper-Klasse kann dazu beitragen, den Code lesbarer und modularer zu gestalten, indem sie die Funktionalität erweitert und die Handhabung des Integer-Arrays vereinfacht.

11.)

Was sind Attribute in Java. Erkläre an einem Code-Beispiel.

In Java bezeichnet der Begriff "Attribute" die Eigenschaften einer Klasse, die deren Zustand definieren. Diese Attribute werden auch als Instanzvariablen bezeichnet, da sie für jede Instanz der Klasse individuell existieren.

Hier ist ein Beispiel für eine Klasse mit einigen Attributen:

```java
public class Person {
    private String name;
    private int age;
    private String address;
    private boolean isStudent;

    public Person(String name, int age, String address, boolean isStudent) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.isStudent = isStudent;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public boolean isStudent() {
        return isStudent;
    }
}
```

In diesem Beispiel sind name, age, address und isStudent Attribute der Person-Klasse. Diese Attribute definieren den Zustand einer Person-Instanz und können von außen über Getter-Methoden abgefragt werden.

Beispielsweise kann eine Person-Instanz wie folgt erstellt und abgefragt werden:

```java
Person person = new Person("Max Mustermann", 30, "Musterstraße 123", true);
System.out.println(person.getName()); // Output: Max Mustermann
System.out.println(person.getAge()); // Output: 30
System.out.println(person.getAddress()); // Output: Musterstraße 123
System.out.println(person.isStudent()); // Output: true
```

In diesem Beispiel werden die Attribute der Person-Instanz durch den Konstruktor gesetzt und können dann über die Getter-Methoden abgefragt werden.

12.)

Welche Methoden bietet die Klasse Object in Java an?

In Java ist die Klasse Object die Basisklasse aller Klassen und bietet einige allgemeine Methoden an, die von allen Objekten geerbt werden. Hier sind einige der wichtigsten Methoden:

toString(): Gibt eine Zeichenfolgendarstellung des Objekts zurück.

equals(Object obj): Überprüft, ob das aktuelle Objekt gleich dem angegebenen Objekt ist.

hashCode(): Gibt den Hash-Code des Objekts zurück.

getClass(): Gibt das Klassenobjekt zurück, das das Objekt repräsentiert.

wait(): Hält das aktuelle Thread-Objekt an, bis das Objekt, auf das gewartet wird, benachrichtigt wird.

notify(): Benachrichtigt einen Thread, der auf das Objekt wartet, auf das notify() aufgerufen wird.

notifyAll(): Benachrichtigt alle Threads, die auf das Objekt warten, auf das notifyAll() aufgerufen wird.

Diese Methoden können überschrieben werden, um das Verhalten von Objekten zu ändern. Zum Beispiel kann die toString()-Methode überschrieben werden, um eine benutzerdefinierte Zeichenfolgendarstellung des Objekts zurückzugeben.

Es ist auch wichtig zu beachten, dass die Methoden wait(), notify() und notifyAll() nur aufgerufen werden sollten, wenn das aktuelle Objekt ein Monitor ist, dh wenn es von Threads gemeinsam genutzt wird. Andernfalls wird eine IllegalMonitorStateException ausgelöst.

13.)

Was ist der Unterschied zwischen throw und throws in Java?

In Java gibt es einen Unterschied zwischen throw und throws.

Das Schlüsselwort throw wird verwendet, um eine Ausnahme manuell auszulösen. Wenn eine Ausnahmebedingung eintritt und ein entsprechendes Objekt erstellt wird, kann es mit dem throw-Schlüsselwort an die Aufrufermethode weitergegeben werden. Das bedeutet, dass der Code, der das Problem erkannt hat, die Verantwortung für die Behandlung der Ausnahme an die Methode abgibt, die den Aufruf durchgeführt hat.

Ein Beispiel:

```java
public void myMethod() {
  int a = 10;
  if (a > 5) {
    throw new IllegalArgumentException("a should be less than or equal to 5");
  }
}
```

Das Schlüsselwort throws wird in der Methodendeklaration verwendet, um anzuzeigen, dass eine Methode eine Ausnahme auslösen kann, die sie nicht behandeln wird. Dies bedeutet, dass der Aufrufer der Methode die Verantwortung dafür hat, die Ausnahme zu behandeln oder sie an den Aufrufer seiner eigenen Methode weiterzugeben.

Ein Beispiel:

```java
public void myMethod() throws IOException {
  // Method implementation
}
```

In diesem Beispiel gibt die Methode an, dass sie eine IOException auslösen kann, aber sie behandelt sie nicht. Der Aufrufer der Methode muss dann entweder die Ausnahme behandeln oder sie ebenfalls mit dem throws-Schlüsselwort kennzeichnen, um sie an seinen eigenen Aufrufer weiterzugeben.

Zusammenfassend lässt sich sagen, dass throw verwendet wird, um eine Ausnahme manuell auszulösen, während throws in der Methodendeklaration verwendet wird, um anzuzeigen, dass eine Methode eine Ausnahme auslösen kann, die sie nicht behandelt.

14.)

Welche Funktion hat mkdirs() in Java?

Die Funktion mkdirs() in Java wird verwendet, um Verzeichnisse auf dem Dateisystem zu erstellen. Es ist eine Methode der Klasse File, die einen Verzeichnispfad als Argument annimmt und true zurückgibt, wenn das Verzeichnis erstellt wurde, oder false, wenn es nicht erstellt werden konnte.

Der Hauptunterschied zwischen mkdir() und mkdirs() besteht darin, dass mkdir() nur ein einzelnes Verzeichnis erstellen kann, während mkdirs() alle erforderlichen Verzeichnisse in einem Pfad erstellt.

Ein Beispiel:

```java
File file = new File("C:/myDirectory/mySubDirectory");
if(file.mkdirs()){
    System.out.println("Directory has been created successfully");
}
else{
    System.out.println("Failed to create directory");
}
```

In diesem Beispiel wird das Verzeichnis "mySubDirectory" im Verzeichnis "myDirectory" auf dem Laufwerk "C:" erstellt, falls es noch nicht existiert. Die mkdirs()-Methode erstellt alle Verzeichnisse, die im Pfad angegeben sind, wenn sie nicht vorhanden sind.

Diese Funktion ist besonders nützlich, wenn eine Anwendung mehrere Verzeichnisse erstellen muss und nicht sicher ist, ob diese bereits vorhanden sind oder nicht.

15.)

Sind im Standard Konstruktor, in Java Methoden-Aufrufe erlaubt?

Ja, im Standard-Konstruktor in Java sind Methoden-Aufrufe erlaubt. Der Standard-Konstruktor ist ein spezieller Konstruktor, der automatisch von Java erzeugt wird, wenn keine anderen Konstruktoren in einer Klasse definiert wurden.

Der Standard-Konstruktor hat keine Argumente und führt normalerweise keine spezifischen Aktionen aus. Er wird jedoch oft verwendet, um Standardwerte für Attribute der Klasse zu setzen oder um eine Verbindung zu einer Datenbank herzustellen.

In einem Standard-Konstruktor können Methoden-Aufrufe wie in jedem anderen Konstruktor verwendet werden. Ein Beispiel:

```java
public class MyClass {
   private int count;
   
   public MyClass() {
      this.count = 0;
      init();
   }

   private void init() {
      System.out.println("Initializing MyClass");
   }
}
```

In diesem Beispiel wird der Standard-Konstruktor von MyClass definiert, der die Anzahl auf Null setzt und die Methode init() aufruft, um die Initialisierung der Klasse abzuschließen.

16.)

Es soll festgestellt werden, ob ein Wort aus der Zeichenkette, in Java das erste Wort ist anhand der Methode lastIndexOf(). Ist dies möglich? Wenn ja implementieren, wenn nein begründen. 

Es ist grundsätzlich möglich, mit Hilfe der lastIndexOf()-Methode in Java zu bestimmen, ob das erste Wort einer Zeichenkette vorliegt. Dazu müsste man allerdings zunächst das letzte Leerzeichen in der Zeichenkette finden, um dann den Substring vom Anfang der Zeichenkette bis zum letzten Leerzeichen zu extrahieren und mit dem ersten Wort zu vergleichen.

Allerdings ist diese Methode nicht sehr effizient und auch anfällig für Fehler, da sie davon ausgeht, dass das erste Wort einer Zeichenkette immer direkt vor dem ersten Leerzeichen steht. Das ist jedoch nicht immer der Fall, da es beispielsweise auch Zeichenketten geben kann, die mit einem Leerzeichen beginnen.

Es gibt in Java einfachere und robustere Möglichkeiten, das erste Wort einer Zeichenkette zu extrahieren und zu vergleichen, zum Beispiel indem man die split()-Methode verwendet oder eine reguläre Ausdruck (Regex) benutzt.

Hier ist ein Beispiel, das zeigt, wie man das erste Wort einer Zeichenkette mit der split()-Methode ermitteln und vergleichen kann:

```java
String input = "Hello world, how are you?";
String[] words = input.split(" ");
if(words.length > 0 && words[0].equals("Hello")) {
    System.out.println("The first word is 'Hello'");
} else {
    System.out.println("The first word is not 'Hello'");
}
```

In diesem Beispiel wird die Zeichenkette "Hello world, how are you?" in ein Array von Wörtern aufgeteilt, indem die split()-Methode mit einem Leerzeichen als Trennzeichen verwendet wird. Anschließend wird überprüft, ob das erste Wort des Arrays gleich "Hello" ist.

17.)

Collections-Framework in Java. Warum können die Collections daraus den Iterator verwenden?

Das Collections-Framework in Java bietet eine Vielzahl von Datenstrukturen, die es ermöglichen, Gruppen von Objekten zu verwalten. Dazu gehören beispielsweise Listen, Sets, Maps und Queues. Eine gemeinsame Eigenschaft dieser Datenstrukturen ist, dass sie alle den Iterator verwenden können, um über die in ihnen enthaltenen Elemente zu iterieren.

Der Iterator ist eine Schnittstelle in Java, die es ermöglicht, sequentiell durch die Elemente einer Collection zu laufen, ohne dabei das zugrunde liegende Objekt zu verändern. Er bietet eine sichere und effiziente Möglichkeit, auf die Elemente einer Collection zuzugreifen und sie zu durchlaufen.

Jede Collection in Java, die die Schnittstelle Iterable implementiert, kann einen Iterator erstellen, um durch ihre Elemente zu iterieren. Dies liegt daran, dass die Iterable-Schnittstelle die iterator()-Methode definiert, die eine Iterator-Instanz zurückgibt. Durch das Implementieren dieser Schnittstelle kann jede Collection-Implementierung eine einheitliche Methode zum Erstellen eines Iterators bereitstellen, unabhängig von der konkreten Art der Collection.

Dank der Verwendung von Iteratoren kann das Collections-Framework in Java auf eine einfache, effektive und standardisierte Weise die Elemente in den verschiedenen Datenstrukturen durchlaufen und darauf zugreifen.

18.)

Was ist der unterschied zwischen deque und queue in Java?

Deque und Queue sind beide Interfaces im Java Collections-Framework, die sich auf die Verwaltung von Elementen in einer Warteschlange beziehen. Sie haben jedoch einige Unterschiede.

Deque steht für "Double Ended Queue" und ermöglicht das Einfügen und Entfernen von Elementen von beiden Seiten der Warteschlange, d.h. am Anfang und am Ende. Es bietet Methoden wie addFirst(), addLast(), removeFirst(), removeLast() usw. Deque kann sowohl als LIFO- (Last In First Out) als auch als FIFO- (First In First Out) Warteschlange verwendet werden.

Queue ist dagegen eine Schnittstelle, die das FIFO-Verhalten unterstützt, d.h. das Element, das zuerst in die Warteschlange eingefügt wurde, wird als erstes wieder entfernt. Es bietet Methoden wie add(), offer(), remove(), poll() usw. Es gibt auch Implementierungen von Queue wie z.B. PriorityQueue, die die Elemente nach ihrer Priorität sortieren.

Zusammenfassend kann man sagen, dass Deque im Gegensatz zu Queue eine Warteschlange ist, die sowohl vom Anfang als auch vom Ende aus zugänglich ist und sowohl als LIFO- als auch als FIFO-Struktur verwendet werden kann, während Queue eine Warteschlange ist, bei der das älteste Element zuerst entfernt wird und die als FIFO-Struktur verwendet wird.

19.)

Um eine for-Schleife zur Iteration nutzen zu können, muss welche Voraussetzung, in Java erfüllt werden? Geben Sie ein Beispiel für eine Datenstruktur an und einen Schleifenkopf einer erweiterten for-Schleife.

Um eine for-Schleife zur Iteration nutzen zu können, muss das Iterable-Interface implementiert werden. Dieses Interface bietet die Methode iterator(), die ein Iterator-Objekt zurückgibt, das die Iteration über die Elemente der Datenstruktur ermöglicht.

Ein Beispiel für eine Datenstruktur, die das Iterable-Interface implementiert, ist ArrayList aus dem Java Collections-Framework. Hier ist ein Beispiel für eine erweiterte for-Schleife, die eine ArrayList durchläuft:

```java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> liste = new ArrayList<String>();
    liste.add("Hallo");
    liste.add("Welt");
    liste.add("!");

    for (String element : liste) {
      System.out.println(element);
    }
  }
}
```

In diesem Beispiel wird eine ArrayList mit drei Elementen erstellt und dann mit einer erweiterten for-Schleife durchlaufen. Der Schleifenkopf for (String element : liste) gibt an, dass die Schleife über jedes Element der ArrayList iterieren soll und jedes Element der Variable element zugewiesen wird.

20.)

Müssen Collections in Java zwingend Iterable überschreiben bzw. implementieren?

Ja, um eine Collection in Java verwenden zu können, muss sie das Iterable-Interface implementieren. Das Iterable-Interface definiert die Methode iterator(), die ein Iterator-Objekt zurückgibt, das die Iteration über die Elemente der Collection ermöglicht.

Das bedeutet, dass alle Standard-Implementierungen von Collection in Java, wie z.B. ArrayList, LinkedList, HashSet und TreeSet, das Iterable-Interface implementieren müssen. Wenn Sie Ihre eigene Collection-Klasse schreiben, müssen Sie das Iterable-Interface ebenfalls implementieren, um sie mit der erweiterten for-Schleife und anderen Iterations-Mechanismen in Java verwenden zu können.

21.)

Müssen Collections in Java zwingend Iterable überschreiben bzw. implementieren? Zeige dies an einem Code Beispiel

Ja, Collections in Java müssen das Iterable-Interface implementieren, um die Verwendung von Iteratoren und der erweiterten for-Schleife zu ermöglichen. Hier ist ein Beispiel:

```java
import java.util.*;

public class MyCollection<T> implements Iterable<T> {
    private List<T> items = new ArrayList<T>();

    public void add(T item) {
        items.add(item);
    }

    public Iterator<T> iterator() {
        return items.iterator();
    }

    public static void main(String[] args) {
        MyCollection<String> myCollection = new MyCollection<String>();
        myCollection.add("foo");
        myCollection.add("bar");
        myCollection.add("baz");

        for (String item : myCollection) {
            System.out.println(item);
        }
    }
}
```

In diesem Beispiel implementiert die Klasse MyCollection das Iterable-Interface und definiert eine Methode iterator(), die einen Iterator über die in der Collection gespeicherten Elemente zurückgibt. Die main()-Methode zeigt, wie die erweiterte for-Schleife verwendet werden kann, um die Elemente der Collection zu durchlaufen. Ohne die Implementierung des Iterable-Interfaces wäre dies nicht möglich.

22.)

Anforderungen für die eigene equals() - Implementierung

Wenn Sie in Java eine eigene equals()-Methode implementieren, müssen Sie sicherstellen, dass sie die folgenden Anforderungen erfüllt:

Reflexivität: Eine Objektreferenz x muss gleich der Objektreferenz x sein. Das bedeutet, x.equals(x) muss immer true zurückgeben.

Symmetrie: Wenn eine Objektreferenz x gleich einer Objektreferenz y ist, dann muss auch die Objektreferenz y gleich der Objektreferenz x sein. Das bedeutet, wenn x.equals(y) true zurückgibt, muss auch y.equals(x) true zurückgeben.

Transitivität: Wenn eine Objektreferenz x gleich einer Objektreferenz y ist und y gleich einer Objektreferenz z ist, dann muss auch x gleich z sein. Das bedeutet, wenn x.equals(y) und y.equals(z) true zurückgeben, muss auch x.equals(z) true zurückgeben.

Konsistenz: Eine Objektreferenz x muss während ihres gesamten Lebenszyklus immer den gleichen Wert zurückgeben, wenn sie mit equals() verglichen wird. Das bedeutet, dass wiederholte Aufrufe von x.equals(y) immer das gleiche Ergebnis liefern sollten, solange sich x oder y nicht ändern.

Nicht-Null: Eine Objektreferenz darf niemals gleich null sein. Das bedeutet, dass der Aufruf x.equals(null) immer false zurückgeben muss.

Hier ist ein Beispiel für eine Implementierung von equals(), die diese Anforderungen erfüllt:

```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person other = (Person) obj;

        return this.name.equals(other.name) && this.age == other.age;
    }
}
```

In diesem Beispiel wird equals() überschrieben, um zwei Person-Objekte anhand ihrer Namen und ihres Alters zu vergleichen. Es wird überprüft, ob die Objektreferenz gleich this ist, und falls ja, wird true zurückgegeben. Dann wird überprüft, ob das übergebene Objekt eine Instanz von Person ist, und falls nein, wird false zurückgegeben. Schließlich werden die Namen und Alter der beiden Person-Objekte verglichen, um zu entscheiden, ob sie gleich sind.

23.)

Was passiert wenn ein Int und ein String mit dem == Operator, in Java verglichen werden?

Wenn ein int und ein String mit dem == Operator in Java verglichen werden, wird die Referenzgleichheit überprüft, nicht der Wertgleichheit.

Für primitive Datentypen wie int vergleicht der == Operator die Werte direkt. Wenn die Werte gleich sind, wird true zurückgegeben, ansonsten false.

Für Objekte, wie z.B. String, vergleicht der == Operator die Speicheradressen der Objekte. Wenn beide Variablen auf dasselbe Objekt verweisen, wird true zurückgegeben, ansonsten false.

Hier ist ein Beispiel:

```java
int num = 10;
String str = "10";
if (num == str) {
    System.out.println("Equal");
} else {
    System.out.println("Not equal");
}
```

Dies würde "Not equal" ausgeben, da num und str unterschiedliche Typen haben und der == Operator die Referenzgleichheit vergleicht, nicht den Wert. Um den Wert zu vergleichen, muss die equals() Methode verwendet werden, wie folgt:

```java
int num = 10;
String str = "10";
if (Integer.toString(num).equals(str)) {
    System.out.println("Equal");
} else {
    System.out.println("Not equal");
}
```
Dies würde "Equal" ausgeben, da die equals() Methode den Wert der Objekte vergleicht, nicht die Speicheradressen.

24.)

Welches Schlüsselwort existiert in Javadoc nicht?

In Javadoc existiert das Schlüsselwort "inheritdoc" nicht. Es handelt sich hierbei um ein Schlüsselwort in der Dokumentation von C#. In Javadoc kann das Schlüsselwort "@inheritDoc" verwendet werden, um die Dokumentation der überschriebenen Methode zu erben.

25.)

Was gibt es nicht, in Java?

@catch

@throw

@exception

@param

Das Javadoc-Schlüsselwort "@catch" gibt es nicht in Java. Stattdessen wird das Schlüsselwort "@throws" verwendet, um anzuzeigen, dass eine Methode eine Ausnahme auslösen kann und welche Ausnahme das ist. "@param" wird verwendet, um die Parameter einer Methode zu dokumentieren und "@exception" wird verwendet, um Ausnahmen zu dokumentieren, die von einer Methode ausgelöst werden können.

26.)

Implementiere in der Klasse Tier das Interface Comparable, in Java und überprüfe die Objekte.

Gerne zeige ich ein Beispiel, wie das Interface Comparable in der Klasse Tier implementiert werden kann:

```java
public class Tier implements Comparable<Tier> {
    private String name;
    private int age;

    public Tier(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Tier o) {
        // Vergleiche die Tiere nach ihrem Alter
        return this.age - o.age;
    }
}
```

In diesem Beispiel implementiert die Klasse Tier das Interface Comparable und überschreibt die Methode compareTo(). Die Methode vergleicht die Tiere nach ihrem Alter. Wenn das aktuelle Tier älter ist als das übergebene Tier, gibt compareTo() eine positive Zahl zurück, wenn das übergebene Tier älter ist als das aktuelle Tier, gibt es eine negative Zahl zurück und wenn beide Tiere das gleiche Alter haben, gibt es 0 zurück.

Um die Objekte zu überprüfen, kann man beispielsweise ein Array von Tier-Objekten erzeugen und dieses mit Hilfe der Arrays.sort()-Methode sortieren:

```java
public class Test {
    public static void main(String[] args) {
        Tier[] tiere = new Tier[3];
        tiere[0] = new Tier("Hund", 5);
        tiere[1] = new Tier("Katze", 3);
        tiere[2] = new Tier("Pferd", 10);

        Arrays.sort(tiere);

        for (Tier t : tiere) {
            System.out.println(t.getName() + ": " + t.getAge() + " Jahre");
        }
    }
}
```

Das Ausführen dieses Codes würde folgende Ausgabe erzeugen:

```
Katze: 3 Jahre
Hund: 5 Jahre
Pferd: 10 Jahre
```

Da die Tiere nach ihrem Alter sortiert wurden, erscheint die Katze als erstes, gefolgt vom Hund und dann vom Pferd.

27.)

Welche Kontrollstrukturen gibt es in Java?

In Java gibt es verschiedene Arten von Kontrollstrukturen, die zur Steuerung des Programmablaufs genutzt werden können:

Bedingte Anweisungen (if-Anweisung, switch-Anweisung): Hierbei wird der Programmfluss abhängig von einer Bedingung gesteuert. Wenn die Bedingung erfüllt ist, wird eine bestimmte Anweisung ausgeführt.

Schleifen (for-Schleife, while-Schleife, do-while-Schleife): Schleifen werden verwendet, um Anweisungen wiederholt auszuführen, bis eine bestimmte Bedingung erfüllt ist.

Sprunganweisungen (break, continue): Mit Sprunganweisungen kann der Programmfluss an eine bestimmte Stelle im Code gesprungen werden.

Try-catch-Block: Der Try-catch-Block wird verwendet, um Ausnahmen zu behandeln, die während der Ausführung des Codes auftreten können.

Diese Kontrollstrukturen können je nach Anforderungen und Anwendungsfall miteinander kombiniert werden, um einen bestimmten Programmablauf zu realisieren.

28.)

Unterschiede und Gemeinsamkeiten zwischen primitiven Datentypen und Zeichenketten in Java

In Java gibt es acht primitiven Datentypen: boolean, byte, short, int, long, float, double und char. Zeichenketten werden in Java durch den Datentyp String dargestellt. Hier sind einige Unterschiede und Gemeinsamkeiten zwischen primitiven Datentypen und Zeichenketten in Java:

Datentypen: Primitiven Datentypen repräsentieren einfache Werte wie Zahlen, Wahrheitswerte oder Zeichen, während Zeichenketten komplexe Datenstrukturen sind, die aus einer Sequenz von Zeichen bestehen.

Initialisierung: Primitiven Datentypen können mit einem Standardwert initialisiert werden, während Zeichenketten in Java immer initialisiert werden müssen, bevor sie verwendet werden können.

Verarbeitung: Primitiven Datentypen werden häufig durch mathematische Operationen oder Vergleiche verarbeitet, während Zeichenketten häufig durch Textmanipulation verarbeitet werden, wie zum Beispiel das Verketten von Zeichenketten oder das Entfernen von Zeichen aus einer Zeichenkette.

Speicherplatzbedarf: Primitiven Datentypen benötigen in der Regel weniger Speicherplatz als Zeichenketten.

Vergleich: Primitiven Datentypen werden mit dem == Operator verglichen, während Zeichenketten mit der equals() Methode verglichen werden müssen.

Konvertierung: Primitiven Datentypen können durch das Casten in andere Datentypen konvertiert werden, während Zeichenketten durch die Verwendung von Methoden wie parseInt() oder valueOf() in andere Datentypen konvertiert werden können.

Manipulation: Primitiven Datentypen können nicht direkt manipuliert werden, während Zeichenketten durch Methoden wie replace() oder substring() manipuliert werden können.

Trotz dieser Unterschiede haben primitiven Datentypen und Zeichenketten in Java auch einige Gemeinsamkeiten. Beide können als Argumente an Methoden übergeben und als Rückgabewerte von Methoden verwendet werden. Darüber hinaus können beide auch in Arrays gespeichert werden.
