package Main;

//Implementiere die Klasse Square, welche die Rectangle-Klasse erweitert. Überschreibe die Konstruktor-Methode um nur noch eine Seitenlänge zu übergeben.
public class Square extends Rectangle {
    public Square(String color, boolean isFilled, double side) {
        super(color, isFilled, side, side);
    } // Die Seitenlängen des Rechtecks werden durch das Übergeben derselben Seitenlänge für beide Seiten ersetzt.
    // So wird ein Quadratobjekt erstellt, das alle Eigenschaften eines Rechtecks hat, aber ein Quadrat darstellt.
}


