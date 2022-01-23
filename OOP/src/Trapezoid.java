public class Trapezoid implements SquareAndPerimetr {
    int a = 7;
    int b = 19;
    int c = 6;
    int d = 3;
    int h = 5;
    int s;
    int p;

    public void Square() {
        s = (a + b) / 2 * h;
        System.out.println("The square of the Trapezoid= " + s);
    }

    public void Perimetr() {
        p = a + b + c + d;
        System.out.println("The perimetr of the Trapezoid= " + p);
    }
}
