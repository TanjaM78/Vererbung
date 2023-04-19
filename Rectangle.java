package Main;
//Implementiere die Klasse Rectangle, welche ebenfalls die Shape-Klasse erweitert. Sie hat zusätzliche Eigenschaften width und height. Überschreibe die Methoden getArea() und getPerimeter() um die Fläche und den Umfang eines Rechtecks zu berechnen.
// Prüfe in den Methoden, ob Breite oder Länge negativ oder Null sind und werfe eine IllegalArgumentException, wenn dies der Fall ist.
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, boolean isFilled, double width, double height) {
        super(color, isFilled);
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be greater than 0");//// Prüfe in den Methoden, ob Breite oder Länge negativ oder Null sind und werfe eine IllegalArgumentException, wenn dies der Fall ist.
        }
        this.width = width;
        this.height = height;
    }
    // @Override zeigt an, dass die Methode getArea in der aktuellen Klasse eine überschriebene Methode aus der übergeordneten Klasse ist.
    // Das bedeutet, dass die Methode mit dem gleichen Namen und den gleichen Parametern bereits in der übergeordneten Klasse definiert wurde und hier in der aktuellen Klasse überschrieben wird.
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}


