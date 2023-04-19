package ShapeTest;


import Main.Circle;
import Main.Rectangle;
import Main.Square;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;

public class ShapeTest {
        //CircleArea-Objekt mit einer roten Farbe, einem ausgefüllten Zustand von true und einem Radius von 5,0.
        // Dann wird die erwartete Fläche des Kreises berechnet, die ungefähr 78,53975 beträgt, indem die Formel für die Fläche eines Kreises verwendet wird.
        // Anschließend wird die getArea()-Methode des Circle-Objekts aufgerufen und das Ergebnis in der Variable actualArea gespeichert.
        // Schließlich wird die assertEquals()-Methode verwendet, um zu überprüfen, ob die actualArea der expectedArea mit einer maximalen Differenz von 0,001 entspricht.
        //Diese Testmethode überprüft, ob die getArea()-Methode des Circle-Objekts die erwartete Fläche korrekt berechnet.
        @Test
        public void testCircleArea() {
            Circle circle = new Circle("Red", true, 5.0);
            double expectedArea = 78.53975;
            double actualArea = circle.getArea();
            assertEquals(expectedArea, actualArea, 0.001);
        }
        //assertEquals vergleicht zwei double Werte expectedArea und actualArea, um zu überprüfen, ob sie fast gleich sind (d. h. innerhalb einer Toleranz von v).
        // Wenn der Unterschied zwischen den beiden Werten größer als v ist, schlägt der Test fehl.
        //Dies ist eine Hilfsmethode der JUnit-Testbibliothek, die in diesem Beispiel verwendet wird, um sicherzustellen, dass die berechnete Fläche des Kreises (actualArea) mit der erwarteten Fläche (expectedArea) fast übereinstimmt,
        // mit einer maximalen Abweichung von v. Wenn die Abweichung größer ist als v, schlägt der Test fehl.
        private void assertEquals(double expectedArea, double actualArea, double v) {

        }
        //CirclePerimeter-Objekt mit einer roten Farbe, einem ausgefüllten Zustand von true und einem Radius von 5.0. Dann wird der erwartete Umfang des Kreises berechnet, der ungefähr 31,42 beträgt, indem die Formel für den Umfang eines Kreises verwendet wird.
        // Die getPerimeter()-Methode des Circle-Objekts wird aufgerufen und das Ergebnis in der Variable actualPerimeter gespeichert.
        // Schließlich wird die assertEquals()-Methode verwendet, um zu überprüfen, ob der actualPerimeter dem expectedPerimeter mit einer maximalen Abweichung von 0.001 entspricht.
        //Diese Testmethode überprüft, ob die getPerimeter()-Methode des Circle-Objekts den erwarteten Umfang korrekt berechnet.
        @Test
        public void testCirclePerimeter() {
            Circle circle = new Circle("Red", true, 5.0);
            double expectedPerimeter = 31.42;
            double actualPerimeter = circle.getPerimeter();
            assertEquals(expectedPerimeter, actualPerimeter, 0.001);
        }
        //RectangleArea-Objekt mit einer roten Farbe, einem ausgefüllten Zustand von true und einer Länge von 4.0 und einer Breite von 4.5.
        // Dann wird die erwartete Fläche des Rechtecks berechnet, die 18.0 beträgt, indem die Formel für die Fläche eines Rechtecks verwendet wird.
        // Die getArea()-Methode des Rectangle-Objekts wird aufgerufen und das Ergebnis in der Variable actualArea gespeichert.
        // Schließlich wird die assertEquals()-Methode verwendet, um zu überprüfen, ob der actualArea dem expectedArea mit einer maximalen Abweichung von 0.001 entspricht.
        //Diese Testmethode überprüft, ob die getArea()-Methode des Rectangle-Objekts die erwartete Fläche korrekt berechnet.
        @Test
        public void testRectangleArea() {
            Rectangle rectangle = new Rectangle("Red", true, 4.0, 4.5);
            double expectedArea = 18.0;
            double actualArea = rectangle.getArea();
            assertEquals(expectedArea, actualArea, 0.001);
        }
        //RectanglePerimeter-Objekt mit einer roten Farbe, einem ausgefüllten Zustand von true, einer Länge von 4.0 und einer Breite von 4.5.
        // Dann wird der erwartete Umfang des Rechtecks berechnet, der 13.0 beträgt, indem die Formel für den Umfang eines Rechtecks verwendet wird.
        // Die getPerimeter()-Methode des Rectangle-Objekts wird aufgerufen und das Ergebnis in der Variable actualPerimeter gespeichert.
        // Schließlich wird die assertEquals()-Methode verwendet, um zu überprüfen, ob der actualPerimeter dem expectedPerimeter mit einer maximalen Abweichung von 0.001 entspricht.
        //Diese Testmethode überprüft, ob die getPerimeter()-Methode des Rectangle-Objekts den erwarteten Umfang korrekt berechnet.
        @Test
        public void testRectanglePerimeter() {
            Rectangle rectangle = new Rectangle("Red", true, 4.0, 4.5);
            double expectedPerimeter = 13.0;
            double actualPerimeter = rectangle.getPerimeter();
            assertEquals(expectedPerimeter, actualPerimeter, 0.001);
        }
         //SquareArea-Objekt mit einer roten Farbe, einem ausgefüllten Zustand von true und einer Seitenlänge von 4.0. Dann wird die erwartete Fläche des Quadrats berechnet, die 16.0 beträgt, indem die Formel für die Fläche eines Quadrats verwendet wird.
         // Die getArea()-Methode des Square-Objekts wird aufgerufen und das Ergebnis in der Variable actualArea gespeichert.
         // Schließlich wird die assertEquals()-Methode verwendet, um zu überprüfen, ob der actualArea dem expectedArea mit einer maximalen Abweichung von 0.001 entspricht.
         //Diese Testmethode überprüft, ob die getArea()-Methode des Square-Objekts die erwartete Fläche korrekt berechnet.
        @Test
        public void testSquareArea() {
            Square square = new Square("Red", true, 4.0);
            double expectedArea = 16.0;
            double actualArea = square.getArea();
            assertEquals(expectedArea, actualArea, 0.001);
        }
        //SquarePerimeter-Objekt mit einer roten Farbe, einem ausgefüllten Zustand von true und einer Seitenlänge von 4.0. Dann wird der erwartete Umfang des Quadrats berechnet, der 16.0 beträgt, indem die Formel für den Umfang eines Quadrats verwendet wird.
        // Die getPerimeter()-Methode des Square-Objekts wird aufgerufen und das Ergebnis in der Variable actualPerimeter gespeichert.
        // Schließlich wird die assertEquals()-Methode verwendet, um zu überprüfen, ob der actualPerimeter dem expectedPerimeter mit einer maximalen Abweichung von 0.001 entspricht.
        //Diese Testmethode überprüft, ob die getPerimeter()-Methode des Square-Objekts den erwarteten Umfang korrekt berechnet.
        @Test
        public void testSquarePerimeter() {
            Square square = new Square("Red", true, 4.0);
            double expectedPerimeter = 16.0;
            double actualPerimeter = square.getPerimeter();
            assertEquals(expectedPerimeter, actualPerimeter, 0.001);
        }
        //überprüft, ob die Erstellung eines Kreisobjekts mit einem ungültigen Radius von -5.0 eine IllegalArgumentException auslöst.
        //Die Testmethode verwendet die assertThrows()-Methode von JUnit, um sicherzustellen, dass das Erstellen eines Circle-Objekts mit einem negativen Radius eine IllegalArgumentException auslöst.
        // Dazu wird ein Lambda-Ausdruck verwendet, um den Code zu definieren, der die Circle-Instanz erstellt. Wenn die Circle-Instanz erfolgreich erstellt wird, schlägt der Test fehl. Andernfalls wird der Test bestanden.
        //Diese Testmethode stellt sicher, dass ein ungültiger Radius verhindert wird und eine Ausnahme ausgelöst wird, wenn jemand versucht, ein Circle-Objekt mit einem negativen Radius zu erstellen.
        @Test
        public void testInvalidRadius() {
            assertThrows(IllegalArgumentException.class, () -> new Circle("Red", true, -5.0));
        }
        //Die Testmethode verwendet die assertThrows()-Methode von JUnit, um sicherzustellen, dass das Erstellen eines Rectangle-Objekts mit einer negativen Breite eine IllegalArgumentException auslöst.
        // Dazu wird ein Lambda-Ausdruck verwendet, um den Code zu definieren, der die Rectangle-Instanz erstellt. Wenn die Rectangle-Instanz erfolgreich erstellt wird, schlägt der Test fehl. Andernfalls wird der Test bestanden.
        //Diese Testmethode stellt sicher, dass eine ungültige Breite verhindert wird und eine Ausnahme ausgelöst wird, wenn jemand versucht, ein Rectangle-Objekt mit einer negativen Breite zu erstellen.
        @Test
        public void testInvalidWidth() {
            assertThrows(IllegalArgumentException.class, () -> new Rectangle("Red", true, -4.0, 4.5));
        }
        // Die Testmethode verwendet die assertThrows()-Methode von JUnit, um sicherzustellen, dass das Erstellen eines Rectangle-Objekts mit einer negativen Länge eine IllegalArgumentException auslöst.
        // Dazu wird ein Lambda-Ausdruck verwendet, um den Code zu definieren, der die Rectangle-Instanz erstellt. Wenn die Rectangle-Instanz erfolgreich erstellt wird, schlägt der Test fehl. Andernfalls wird der Test bestanden.
        //Diese Testmethode stellt sicher, dass eine ungültige Länge verhindert wird und eine Ausnahme ausgelöst wird, wenn jemand versucht, ein Rectangle-Objekt mit einer negativen Länge zu erstellen.
        @Test
        public void testInvalidLength() {
            assertThrows(IllegalArgumentException.class, () -> new Rectangle("Red", true, 4.0, -4.5));
        }
        //Die Testmethode verwendet die assertThrows()-Methode von JUnit, um sicherzustellen, dass das Erstellen eines Square-Objekts mit einer negativen Seitenlänge eine IllegalArgumentException auslöst.
        // Dazu wird ein Lambda-Ausdruck verwendet, um den Code zu definieren, der die Square-Instanz erstellt. Wenn die Square-Instanz erfolgreich erstellt wird, schlägt der Test fehl. Andernfalls wird der Test bestanden.
        //Diese Testmethode stellt sicher, dass eine ungültige Seitenlänge verhindert wird und eine Ausnahme ausgelöst wird, wenn jemand versucht, ein Square-Objekt mit einer negativen Seitenlänge zu erstellen.
        @Test
        public void testInvalidSide() {
            assertThrows(IllegalArgumentException.class, () -> new Square("Red", true, -4.0));
        }
    }


