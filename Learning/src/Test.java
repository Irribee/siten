public class Test {
    public static void main(String[] args) {
        SubInStr element1 = new SubInStr();
        if (element1.substringInString("Hello", "lo"))
            System.out.println("true");
        SubInStr element2 = new SubInStr();
        if (element2.substringInString("Hello", "ww"))
            System.out.println("true");
        }
    }
        class SubInStr {
            int i = 0;
            int k;
            int t = 0;

            public boolean substringInString(String string, String subst) {//тут я должна использовать условие со string и subst
                char[] str = string.toCharArray();
                char[] sub = subst.toCharArray();
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
                                t = 0;
                                i = i - k;
                                break;
                            } else if (str[i] == sub[k]) {
                                t++;
                                i++;
                            }
                        }
                    }
                }
                boolean result = (t >= sub.length);
                if (result)
                    return true;
                else
                    return false;

            }
        }
