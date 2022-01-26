
public class TestFigures {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(4, 10, 7, 15);
        Circle circle1 = new Circle(19);
        Foursquare foursquare1 = new Foursquare(47);
        Trapezoid trapezoid1 = new Trapezoid(4, 6, 8, 23, 11);
        triangle1.perimeter();
        triangle1.square();
        circle1.perimeter();
        circle1.square();
        foursquare1.perimeter();
        foursquare1.square();
        trapezoid1.perimeter();
        trapezoid1.square();
    }
}
