import java.util.Scanner;
public int[] make2(int[] arr1, int[] arr2, int len) {
        int[] arr3 = new int[len];
        int index = 0;
        for (int i = 0, i<arr1.length - 1;i++){
        if (i <= len) {
        arr3[index] = arr1[i];
        }
        index++;
        }
        for (int i = 0, i<arr2.length - 1;i++){
        if (i <= len) {
        arr3[index] = arr2[i];
        }
        index++;
        }
        return arr3;
        }
public class popitka3 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("введите первый массив");
        int arr3 = name.nextInt();
        int[] arr3 = new int[len];
        if (figura.equals("треугольник")) {
            System.out.println("введи основание треугольника и его высоту");
            int a = name.nextInt();
            int h = name.nextInt();
            int s = (a * h) / 2;
            System.out.println("площадь треугольника равна " + s);
        }
        else if(figura.equals("квадрат")) {
            System.out.println("сторона квадрата равна");
            int c = name.nextInt();
            int pl = c*c;
            System.out.println("площадь квадрата равна " + pl);
        }
        else if(figura.equals("прямоугольник")) {
            System.out.println("длина прямоугольника равна ");
            int n = name.nextInt();
            System.out.println("ширина прямоугольника равна ");
            int m = name.nextInt();
            int plos = n * m;
            System.out.println("площадь прямоугольника равен " + plos);
        }
        else if(figura.equals("круг")) {
            System.out.println("адиус круга равен");
            double r = name.nextInt();
            double plosh = 3.14 * r * r;
            System.out.println("площадь круга равна " + plosh);
        }
            else {
                System.out.println("мы не можем посчитать площадь этой фигуры");
            }
        }
    }


