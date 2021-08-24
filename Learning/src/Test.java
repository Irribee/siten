public class Test {
    public static void main(String[] args) {
        String str = "abcdefg";
        String substr = "cde";
        char[] striin = str.toCharArray();
        char[] subst = substr.toCharArray();
        {
            boolean match;

            for (int i = 0; i < striin.length; ++i) {
                match = true;
                for (int j = 0; j < subst.length; ++j) {
                    if (striin[i + j] != subst[j]) {
                        match = false;
                        break;
                    }
                }
            }
        }
    }
}
