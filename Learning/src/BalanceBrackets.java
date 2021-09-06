import java.util.Scanner;

public class BalanceBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter open and closed curly braces");
        String string = scan.nextLine();
        char[] brackets = string.toCharArray();
        int i;
        int k = 0;
        for (i = 0; i < brackets.length; i++) {
            switch (brackets[i]) {
                case '{':
                    k++;
                    break;
                case '}':
                    k--;
                    break;
            }
        }
        if (k == 0) {
            System.out.println("true");
        } else if (k != 0) {
            System.out.println("false");
        }
    }
}


