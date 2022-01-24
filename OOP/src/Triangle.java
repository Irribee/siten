public class Triangle implements SquareAndPerimetr {
    int a = 10;
    int b = 9;
    int c = 5;
    int h = 18;
    int p;
    double s;

    public void Square() {
        s = (a * h) / 2;
        System.out.println("The square of the triangle= " + s);
    }

    public void Perimetr() {
        p = a + b + c;
        System.out.println("The perimetr of the triangle= " + p);
    }
}
