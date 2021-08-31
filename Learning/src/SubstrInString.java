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
            } else if (i + 1 == str.length) {
                break;
            } else if (str[i] == sub[0]) {
                t++;
                i++;
                for (k = 1; k < sub.length; k++) {
                    if (i == str.length) {
                        break;
                    } else if (str[i] != sub[k]) {
                        t=0;
                        i=i-k;
                        break;
                    } else if (str[i] == sub[k]) {
                        t++;
                        i++;
                    }
                }
            }
        }
        if (t >= sub.length) {
            System.out.println("true");
        }
        if (t < sub.length) {
            System.out.println("false");
        }
    }
}



