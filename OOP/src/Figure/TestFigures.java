package Figure;

import Figure.Circle;
import Figure.Foursquare;
import Figure.Trapezoid;
import Figure.Triangle;

public class TestFigures {
    int sumSquare = 0;
    int sumPerimeter = 0;

//    public int sumFigures(Figure.SquareAndPerimeter figur) {
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

//public class Figure.TestFigures {
//    public static void main(String[] args) {
//        Figure.Triangle triangle1 = new Figure.Triangle(4, 10, 7, 15);
//        Figure.Circle circle1 = new Figure.Circle(19);
//        Figure.Foursquare foursquare1 = new Figure.Foursquare(47);
//        Figure.Trapezoid trapezoid1 = new Figure.Trapezoid(4, 6, 8, 23, 11);
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



