class Test{

        public static boolean substringInString(String string, String subst) {
           //тут я должна исп условие со string и subst
                return true;
            else return false;
        }
    private char[] toCharArray() {
        return new char[0];
    }
    public static void main(String[] args) {
        substringInString("Hello", "lo");
        Test string=new Test();
        Test subst=new Test();
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
//            if (string.substringInString("Hello", "lo"));
//            System.out.println("the substring "+subst+" is contained in the string"+str);
//            if (string.substringInString("Hello", "www"));
//            System.out.println("the substring "+sub+" is not contained in the string"+str);;
        }
    }