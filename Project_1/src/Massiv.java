public class Massiv {
    public static void main(String[] args) {
        int[] masi = new int[5];
        for (int i = 0; i < masi.length; i++) {
            masi[i] = i * (i+1);
        }
        for (int i = 0; i < masi.length; i++) {
            System.out.println(masi[i]);
        }
    }
}
