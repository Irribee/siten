public class MassivMinimum {
    public static void main(String[] args) {
        int[] massivMin = {6, 18, 3, 76, 2, 32, 14};
        int i;
        for (i = 0; i < massivMin.length; i++) {
            if (i + 1 == massivMin.length) {
                break;
            }
            else if (massivMin[i] < massivMin[i + 1]) {
                continue;
            } else if (massivMin[i] > massivMin[i + 1]) {
                massivMin[i + 1] = massivMin[i];
            }
        }
            System.out.println("Минимальное число массива - "+ massivMin[i]);
        }
    }
