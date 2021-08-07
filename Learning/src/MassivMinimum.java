public class MassivMinimum {
    public static void main(String[] args) {
        int[] massivMin = {6, 18, 3, 76, 2, 32, 14};
        for (int i = 0; i < massivMin.length; i++) {
            if (massivMin[i]<massivMin [i+1]) {
                i++;
            }
            else if (massivMin[i]>massivMin [i+1]){
                int massivMin [i+1] =massivMin[i];
            }
            System.out.println("Минимальное число массива - "+ massivMin [i] );
        }
    }
}
