package Main;
//Erstelle eine abstrakte Klasse Shape mit den Eigenschaften color, isFilled
abstract class Shape {
    private String color;
    private boolean isFilled;

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract double getArea();//Methoden getArea() und getPerimeter().
    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }
}


