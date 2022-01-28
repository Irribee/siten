public class Circle implements SquareAndPerimeter {
    int radius;
    double s;
    double p;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double square() {
        s = 3.14 * radius * radius;
        // System.out.println("The square of the Circle= " + s);
        return s;
    }

    public double perimeter() {
        p = 2 * 3.14 * radius;
        // System.out.println("The perimeter of the Circle= " + p);
        return p;
    }
}
