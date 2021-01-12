import java.util.Scanner;

public class PloshCikl {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Площадь какой фигуры вы хотите рассчитать");
        String figura = name.nextLine();
        if (figura.equals("треугольник")) {
            System.out.println("основание треугольника равно");
            int a = name.nextInt();
            System.out.println("высота треугольника равна");
            int h = name.nextInt();
            int s = (a * h) / 2;
            System.out.println("площадь треугольника равна " + s);
        } else if (figura.equals("квадрат")) {
            System.out.println("сторона квадрата равна");
            int c = name.nextInt();
            int pl = c * c;
            System.out.println("площадь квадрата равна " + pl);
        } else if (figura.equals("прямоугольник")) {
            System.out.println("длина прямоугольника равна ");
            int n = name.nextInt();
            System.out.println("ширина прямоугольника равна ");
            int m = name.nextInt();
            int plos = n * m;
            System.out.println("площадь прямоугольника равен " + plos);
        } else if (figura.equals("круг")) {
            System.out.println("Радиус круга равен");
            double r = name.nextInt();
            double plosh = 3.14 * r * r;
            System.out.println("площадь круга равна " + plosh);
        } else {
            System.out.println("мы не можем посчитать площадь этой фигуры");
            do {
                System.out.println("Площадь какой фигуры вы хотите рассчитать");
            }
            while (figura.equals("нет"));
            System.out.println("до свидания");
        }

    }
}
{}

