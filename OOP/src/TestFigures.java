public class TestFigures {

    public static void main(String[] args) {
        int sumSquare = 0;
        int sumPerimeter = 0;
        SquareAndPerimeter[] figures = new SquareAndPerimeter[4];
        figures[0] = new Triangle(4, 10, 7, 15);
        figures[1] = new Circle(19);
        figures[2] = new Foursquare(47);
        figures[3] = new Trapezoid(4, 6, 8, 23, 11);
        for (int i = 0; i < figures.length; i++) {
            sumSquare += figures[i].square();
            sumPerimeter += figures[i].perimeter();
        }
        System.out.println("the sum of the square of all figures = " + sumPerimeter);
        System.out.println("the sum of the perimeters of all figures = " + sumSquare);
    }
}


