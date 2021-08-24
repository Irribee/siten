import java.util.Arrays;
import java.util.Scanner;

public class NotMore2bilMinAndMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of digits in the number (no more than 10)");
        int amount = scan.nextInt();
        int[] mas = new int[amount];
        ;
        System.out.println("Enter a number (no more than 2 billion)");
        int number = scan.nextInt();
        int i;
        for (i = 0; i < amount; i++) {
            mas[i] = number % 10;
            number = number / 10;
        }
        int min = mas[0];
        int max = mas[0];
        for (i = 0; i < mas.length; i++) {
            if (min > mas[i]) {
                min = mas[i];
            }
            if (max < mas[i]) {
                max = mas[i];
            }
        }

        System.out.println("the maximum digit of your number " + max);
        System.out.println("the minimum digit of your number " + min);
    }
}

