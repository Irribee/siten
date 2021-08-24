import java.util.Scanner;

public class SubstrInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string 1");
        String string = scan.nextLine();
        System.out.println("Enter a substring 2");
        String subst = scan.nextLine();
        char[] str = string.toCharArray();
        char[] sub = subst.toCharArray();
        int i;
        int k;
        int t = 0;
        for (i = 0; i < str.length; i++) {
            if (str[i] != sub[0]) {
                continue;
            } else if (str[i] == sub[0]) {
                t = 1;
                i++;
                for (k = 1; k < sub.length; k++) {
                    if (str[i] != sub[k]) {
                        continue;
                    } else if (str[i] == sub[k]) {
                        t++;
                        i++;
                    }
                }
                if (t == sub.length) {
                    System.out.println("true");
                }
                if (t == 0) {
                    System.out.println("false");
                }

            }
        }
    }
}


