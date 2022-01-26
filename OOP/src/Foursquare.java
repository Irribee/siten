public class Foursquare implements SquareAndPerimeter {
    int side;
    double s;
    double p;

    public Foursquare(int side) {
        this.side = side;
    }

    public double square() {
        s = side ^ 2;
        System.out.println("The square of the Foursquare= " + s);
        return s;
    }

    public double perimeter() {
        p = 4 * side;
        System.out.println("The perimeter of the Foursquare= " + p);
        return p;
    }
}
