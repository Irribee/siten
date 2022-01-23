public class Circle implements SquareAndPerimetr {
    int r = 19;
    double s;
    double p;

    public void Square() {
        s = (double) 3.14 * r * r;
        System.out.println("The square of the Circle= " + s);
    }

    public void Perimetr() {
        p = (double) 2 * 3.14 * r;
        System.out.println("The perimetr of the Circle= " + p);
    }
}
