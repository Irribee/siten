public class String_2 {

    //    Given a string, return a string where for every char in the original, there are two chars.
//    doubleChar("The") → "TThhee"
//    doubleChar("AAbb") → "AAAAbbbb"
//    doubleChar("Hi-There") → "HHii--TThheerree"
    public String doubleChar(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            String sub = str.substring(i, i + 1);
            s = s + sub + sub;
        }
        return s;
    }

    //    Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
//    sameStarChar("xy*yzz") → true
//    sameStarChar("xy*zzz") → false
//    sameStarChar("*xa*az") → true
    public boolean sameStarChar(String str) {
        boolean star = true;
        for (int i = 1; i < str.length() - 1; i++) {
            String sub = str.substring(i, i + 1);
            if (sub.equals("*")) {
                if (str.charAt(i - 1) == str.charAt(i + 1)) {
                    star = true;
                } else {
                    star = false;
                }
            }
        }
        return star;
    }

    //    Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
//    repeatFront("Chocolate", 4) → "ChocChoChC"
//    repeatFront("Chocolate", 3) → "ChoChC"
//    repeatFront("Ice Cream", 2) → "IcI"
    public String repeatFront(String str, int n) {
        String repeat = "";
        for (int i = n; i > 0; i--) {
            String sub = str.substring(0, i);
            repeat += sub;
        }
        return repeat;
    }

    //    Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
//    mixString("abc", "xyz") → "axbycz"
//    mixString("Hi", "There") → "HTihere"
//    mixString("xxxx", "There") → "xTxhxexre"
    public String mixString(String a, String b) {
        String ab = "";
        String AB = "";
        if (a.length() < b.length()) {
            for (int i = 0; i < a.length(); i++) {
                String subb = b.substring(i, i + 1);
                String suba = a.substring(i, i + 1);
                AB += suba + subb;
            }
            AB += b.substring(a.length(), b.length());
        } else {
            for (int i = 0; i < b.length(); i++) {
                String subb = b.substring(i, i + 1);
                String suba = a.substring(i, i + 1);
                AB += suba + subb;
            }
            AB += a.substring(b.length(), a.length());
        }
        return AB;
    }

    //    Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
//   wordEnds("abcXY123XYijk", "XY") → "c13i"
//    wordEnds("XY123XY", "XY") → "13"
//    wordEnds("XY1XY", "XY") → "11"
    public String wordEnds(String str, String word) {
        int k = word.length();
        String end = "";
        for (int i = 0; i < str.length() - k; i++) {
            if (i == 0 && str.substring(i, i + k).equals(word)) {
                end = str.substring(i + k, i + k + 1);
            }
            if (str.substring(i, i + k).equals(word)) {
                end += (str.substring(i - 1, i)) + (str.substring(i + k, i + k + 1));
            }
            if (str.substring(i, str.length() - k + 1).equals(word)) {
                end += (str.substring(i - 1, i));
            }
        }
        return end;
    }

    //    Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
//    plusOut("12xy34", "xy") → "++xy++"
//    plusOut("12xy34", "1") → "1+++++"
//    plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
    public String plusOut(String str, String word) {
        String sub="";
        for (int i=0;i<str.length()+1; i++){
            if(i<=str.length()-word.length() && str.substring(i,i+word.length()).equals(word)){
                sub+=word;
                i+=word.length();
            }
            else{
                sub+="+";
            }
        }
        return sub;
    }



}
