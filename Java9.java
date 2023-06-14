abstract class Shape {
    int x, y;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    final void display() {
        System.out.println("Shape is displayed");
    }

    abstract void draw();
}

class Circle extends Shape {
    int radius;

    Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    void draw() {
        System.out.println("Circle is drawn at (" + x + ", " + y + ") with radius " + radius);
    }
}

public class Java9 {
    public static void main(String[] args) {
        Circle c = new Circle(10, 20, 5);
        c.draw();
        c.display();
        System.out.println("Aayush Bhattacharjee | 00190302021");
    }
}
