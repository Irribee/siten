import java.util.Arrays;

public class MassivMinimum {
    public static void main(String[] args) {
        int[] massivMin = {6, 18, 3, 76, 2, 32, 14};
        int i=0;
        int p=massivMin.length-1;
        for (p=massivMin.length-1;p>i; p++) {
            for (i = 0; i < massivMin.length; i++) {
                if (i + 1 == massivMin.length) {
                    break;
                } else if (massivMin[i] < massivMin[i + 1]) {
                    int change = massivMin[i + 1];
                    massivMin[i + 1] = massivMin[i];
                    massivMin[i] = change;
                }
            }
        }
        System.out.println("Отсортированный массив - " + Arrays.toString(massivMin));
    }
}

