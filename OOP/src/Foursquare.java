public class Foursquare implements SquareAndPerimetr {
    int a = 7;
    int s;
    int p;

    public void Square() {
        s = a ^ 2;
        System.out.println("The square of the Foursquare= " + s);
    }

    public void Perimetr() {
        p = 4 * a;
        System.out.println("The perimetr of the Foursquare= " + p);
    }
}
