public class Triangle implements SquareAndPerimetr {
    int a = 10;
    int b = 9;
    int c = 5;
    int h = 18;
    double p;
    double s;

    public void Square() {
        s = (double) (a * h) / 2;
        System.out.println("The square of the triangle= " + s);
    }

    public void Perimetr() {
        p = (double) a + b + c;
        System.out.println("The perimetr of the triangle= " + p);
    }
}
