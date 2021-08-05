public class MassivMinimum {
        public static void main(String[] args) {
            int[] massivMin = {6, 18, 3, 76, 32, 14};
            for (int i=0; i<massivMin.length; i++) {
                int [] minimal= massivMin[0];
            if (minimal<i+1){
                i++;
            }
                        else if ( minimal>i+1){
                            minimal=i+1;
                }
                System.out.println( "Минимальное число массива "+ minimal);
            }
        }
    }

