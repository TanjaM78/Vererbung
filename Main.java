package Main;

public class Main {
        public static void main(String[] args) {

                Shape circle1 = new Circle("red", true, 5.0);
                System.out.println("Area of Circle1: " + circle1.getArea());
                System.out.println("Perimeter of Circle1: " + circle1.getPerimeter());

                Shape rectangle1 = new Rectangle("blue", false, 5.0, 4.0);
                System.out.println("Area of Rectangle1: " + rectangle1.getArea());
                System.out.println("Perimeter of Rectangle1: " + rectangle1.getPerimeter());

                Shape square1 = new Square("green", true, 3.0);
                System.out.println("Area of Square1: " + square1.getArea());
                System.out.println("Perimeter of Square1: " + square1.getPerimeter());

                // Test
                System.out.println("Testing Circle:");
                Circle c1 = new Circle("Red", true, 5);
                System.out.println("Circle 1 - Area: " + c1.getArea() + ", Perimeter: " + c1.getPerimeter());

                Circle c2 = new Circle("Green", false, 7);
                System.out.println("Circle 2 - Area: " + c2.getArea() + ", Perimeter: " + c2.getPerimeter());

                try {
                        Circle c3 = new Circle("Blue", true, -5);
                } catch (
                        IllegalArgumentException e) {
                        System.out.println("IllegalArgumentException thrown for Circle with negative radius");
                }

                try {
                        Circle c4 = new Circle("Yellow", false, 0);
                } catch (
                        IllegalArgumentException e) {
                        System.out.println("IllegalArgumentException thrown for Circle with radius 0");
                }

                System.out.println("\nTesting Rectangle:");
                Rectangle r1 = new Rectangle("Red", true, 4, 5);
                System.out.println("Rectangle 1 - Area: " + r1.getArea() + ", Perimeter: " + r1.getPerimeter());

                Rectangle r2 = new Rectangle("Green", false, 7, 8);
                System.out.println("Rectangle 2 - Area: " + r2.getArea() + ", Perimeter: " + r2.getPerimeter());

                try {
                        Rectangle r3 = new Rectangle("Blue", true, -4, 5);
                } catch (
                        IllegalArgumentException e) {
                        System.out.println("IllegalArgumentException thrown for Rectangle with negative width");
                }

                try {
                        Rectangle r4 = new Rectangle("Yellow", false, 4, -5);
                } catch (
                        IllegalArgumentException e) {
                        System.out.println("IllegalArgumentException thrown for Rectangle with negative height");
                }

                try {
                        Rectangle r5 = new Rectangle("Purple", true, 0, 5);
                } catch (
                        IllegalArgumentException e) {
                        System.out.println("IllegalArgumentException thrown for Rectangle with width 0");
                }

                try {
                        Rectangle r6 = new Rectangle("Orange", false, 4, 0);
                } catch (
                        IllegalArgumentException e) {
                        System.out.println("IllegalArgumentException thrown for Rectangle with height 0");
                }

                System.out.println("\nTesting Square:");
                Square s1 = new Square("Red", true, 4);
                System.out.println("Square 1 - Area: " + s1.getArea() + ", Perimeter: " + s1.getPerimeter());

                Square s2 = new Square("Green", false, 7);
                System.out.println("Square 2 - Area: " + s2.getArea() + ", Perimeter: " + s2.getPerimeter());

                try {
                        Square s3 = new Square("Blue", true, -4);
                } catch (IllegalArgumentException e) {
                        System.out.println("IllegalArgumentException thrown for Square with negative side length");
                }

                try {
                        Square s4 = new Square("Yellow", false, 0);
                } catch (IllegalArgumentException e) {
                        System.out.println("IllegalArgumentException thrown for Square with side length 0");
                }

        }
}









