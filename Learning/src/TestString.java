import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        String string = "Hello";
        String sub = "el";
        char[] str = string.toCharArray();
        char[] subst = sub.toCharArray();
        int i;
        int k;
        int t = 0;
        for (i = 0; i < str.length; i++) {
            for (k = 0; k < subst.length; k++) {
                if (str[i] != subst[k]) {
                    k++;
                } else if (str[i] == subst[k] && str[i] == subst[i + 1]) {
                    t = 1;
                    t++;
                }
            }
        }
        if (t >= 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
