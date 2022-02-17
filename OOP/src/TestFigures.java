public class TestFigures {
    int sumSquare = 0;
    int sumPerimeter = 0;

//    public int sumFigures(SquareAndPerimeter figur) {
//
//        for (int i = 0; i < 4; i++) {
//            sumSquare += figur.square();
//            sumPerimeter += figur.perimeter();
//        }
//    }
        public static void main (String[]args){
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

//public class TestFigures {
//    public static void main(String[] args) {
//        Triangle triangle1 = new Triangle(4, 10, 7, 15);
//        Circle circle1 = new Circle(19);
//        Foursquare foursquare1 = new Foursquare(47);
//        Trapezoid trapezoid1 = new Trapezoid(4, 6, 8, 23, 11);
//        public int[] figures= new int[]{triangle1, circle1, foursquare1, trapezoid1};
//        triangle1.perimeter();
//        triangle1.square();
//        circle1.perimeter();
//        circle1.square();
//        foursquare1.perimeter();
//        foursquare1.square();
//        trapezoid1.perimeter();
//        trapezoid1.square();
//    }
//}



