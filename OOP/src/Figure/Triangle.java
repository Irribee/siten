package Figure;

public class Triangle implements SquareAndPerimeter {
    int side1;
    int side2;
    int base;
    int height;
    double p;
    double s;

    public Triangle(int side1, int side2, int base, int height) {
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
        this.height = height;
    }

    public double square() {
        s = (base * height) / 2;
        // System.out.println("The square of the triangle= " + s); спросить у Пашки, почему удаляем
        return s;
    }

    public double perimeter() {
        p = side1 + side2 + base;
        // System.out.println("The perimeter of the triangle= " + p);
        return p;
    }
}
