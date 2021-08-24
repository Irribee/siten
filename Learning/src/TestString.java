import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class TestString {
    public static void main(String args[]) {
        String string = "Hello";
        String sub = "elo";
        char[] str = string.toCharArray();
        char[] subst = sub.toCharArray();
        int i;
        int k;
        int t;
        for (i = 0; i < str.length; i++) {
            if (str[i] == subst[0]) {
                t = 1;
                i++;
                for (k = 1; k < subst.length; k++) {
                    if (str[i] != subst[k]) {
                        continue;
                    } else if (str[i] == subst[k]) {//нужносделать так, чтобы не только K++ был, но и i++
                        t++;
                        i++;//?
                    }
                }
                    if (t == subst.length) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                }
            }
        }
    }
