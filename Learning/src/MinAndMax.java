import java.util.Arrays;
import java.util.Scanner;
        public class MinAndMax {
            public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a four-digit number");
                int n = s.nextInt();
                int a = n % 10;
                int a1 = n / 10;
                int b = a1 % 10;
                int b1 = n / 100;
                int c = b1 % 10;
                int c1 = n / 1000;
                int d = c1 % 10;
                int[] number = {a, b, c, d};
                int i = 0;
                int p = 0;
                for (p = 0; p < number.length; p++) {
                    for (i = 0; i < number.length; i++) {
                        if (i + 1 == number.length) {
                            break;
                        } else if (number[i] < number[i + 1]) {
                            int change = number[i + 1];
                            number[i + 1] = number[i];
                            number[i] = change;
                        }
                    }
                }
                int min=number[3];
                int max=number[0];
                System.out.println("the maximum digit of your number " + max);
                System.out.println("the minimum digit of your number " + min);
            }
        }




