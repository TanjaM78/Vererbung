package Main;

//Implementiere die Klasse Circle, welche die Shape-Klasse erweitert. Sie hat zusätzlich eine Eigenschaft radius. Überschreibe die Methoden getArea() und getPerimeter() um die Fläche und den Umfang eines Kreises zu berechnen.
// Prüfe in den Methoden, ob der Radius negativ oder Null ist und werfe eine IllegalArgumentException, wenn dies der Fall ist.
public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than 0");/// Prüfe in den Methoden, ob der Radius negativ oder Null ist und werfe eine IllegalArgumentException, wenn dies der Fall ist.
        }
        this.radius = radius;
    }
    // @Override zeigt an, dass die Methode getArea in der aktuellen Klasse eine überschriebene Methode aus der übergeordneten Klasse ist
    // Das bedeutet, dass die Methode mit dem gleichen Namen und den gleichen Parametern bereits in der übergeordneten Klasse definiert wurde und hier in der aktuellen Klasse überschrieben wird.
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
