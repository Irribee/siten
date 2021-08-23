import java.util.Scanner;

public class SubstrInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string 1");
        String string = scan.nextLine();
        System.out.println("Enter a substring 2");
        String subst = scan.nextLine();
        int k = string.indexOf(subst);
        if (k > 0) {
            System.out.println("true");
        }
        if (k < 0) {
            System.out.println("false");
        }
    }
}
