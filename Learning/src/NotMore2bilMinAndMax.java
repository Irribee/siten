import java.util.Arrays;
import java.util.Scanner;
public class NotMore2bilMinAndMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of digits in the number (no more than 10)");
        int amount = scan.nextInt();
        int[] mas=new int[amount];
        System.out.println("Enter a number (no more than 2 billion)");
        int number = scan.nextInt();
        int i;
        for (i = 0; i <amount; i++) {
            mas[i] = number % 10;
            number = number / 10;
        }
        int p = 0;
        for (p = 0; p < mas.length; p++) {
            for (i = 0; i < mas.length; i++) {
                if (i + 1 == mas.length) {
                    break;}
                 else if (mas[i] < mas[i + 1]) {
                    int change = mas[i + 1];
                    mas[i + 1] = mas[i];
                    mas[i] = change;
                }
            }
        }
        int min=mas[mas.length-1];
        int max=mas[0];
        System.out.println("the maximum digit of your number " + max);
        System.out.println("the minimum digit of your number " + min);
    }
}

