public class Trapezoid implements SquareAndPerimeter {
    int base1;
    int base2;
    int side1;
    int side2;
    int height;
    double p;
    double s;

    public Trapezoid(int base1, int base2, int side1, int side2, int height) {
        this.base1 = base1;
        this.base2 = base2;
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    public double square() {
        s = (base1 + base2) / 2 * height;
        System.out.println("The square of the Trapezoid= " + s);
        return s;
    }

    public double perimeter() {
        p = base1 + base2 + side1 + side2;
        System.out.println("The perimeter of the Trapezoid= " + p);
        return p;
    }
}
