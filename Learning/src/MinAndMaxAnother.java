import java.util.Arrays;
import java.util.Scanner;
public class MinAndMaxAnother {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number (no more than 2 billion)");
        String number = s.nextLine();
        char[] mas = number.toCharArray();
        int min = mas[0];
        int max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (min > mas[i]) {
                min = mas[i];
            }
            if (max < mas[i]) {
                max = mas[i];
                //maxi = Integer.parseInt(String.valueOf(max));
            }
        }
        String myStr = Character.toString(max);;;
            int maxi = Integer.parseInt(String.valueOf(myStr));
        String myStr1 = Character.toString(min);;
        int mini = Integer.parseInt(String.valueOf(myStr1));
        System.out.println("the maximum digit of your number " + maxi);
        System.out.println("the minimum digit of your number " + mini);
    }
}
