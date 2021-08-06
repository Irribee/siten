import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String figura = new String ();
        do {
            System.out.println("Площадь какой фигуры вы хотите рассчитать");
          figura = name.nextLine();
            switch (figura) {
                case "треугольник":
                    System.out.println("основание треугольника равно");
                    int a = name.nextInt();
                    System.out.println("высота треугольника равна");
                    int h = name.nextInt();
                    int s = (a * h) / 2;
                    System.out.println("площадь треугольника равна " + s);
                    break;
                case "квадрат":
                    System.out.println("сторона квадрата равна");
                    int c = name.nextInt();
                    int pl = c ^ 2;
                    System.out.println("площадь квадрата равна " + pl);
                    break;
                case "прямоугольник":
                    System.out.println("длина прямоугольника равна");
                    int n = name.nextInt();
                    System.out.println("ширина прямоугольника равна");
                    int m = name.nextInt();
                    int plos = n * m;
                    System.out.println("площадь прямоугольника равен " + plos);
                    break;
                case "круг":
                    System.out.println("радиус круга равен");
                    double r = name.nextInt();
                    double plosh = 3.14 * r * r;
                    System.out.println("площадь круга равна " + plosh);
                    break;
            }
        }
        while (!figura.equals("стоп"));
        System.out.println("Всего доброго");
    }
}
