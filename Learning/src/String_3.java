public class String_3 {


//    Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
//
//    countYZ("fez day") → 2
//    countYZ("day fez") → 2
//    countYZ("day fyyyz") → 2

    public int countYZ(String str) {
        int countYZ = 0;
        String string = str.toLowerCase();
        for (int i = 0; i < str.length() - 1; i++) {
            if (i < str.length() - 1 && (string.charAt(i) == 'z' || string.charAt(i) == 'y') && Character.isLetter(string.charAt(i + 1)) == false) {
                countYZ++;
            } else if (string.charAt(string.length() - 1) == 'z' || string.charAt(string.length() - 1) == 'y') {
                countYZ++;
            }
        }
        return countYZ;
    }


//    We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.
//
//    gHappy("xxggxx") → true
//    gHappy("xxgxx") → false
//    gHappy("xxggyygxx") → false

    public boolean gHappy(String str) {
        boolean answer = true;
        if (str.length() == 1 && str.charAt(0) == 'g') {
            answer = false;
        } else if (str.length() > 1 && str.charAt(str.length() - 1) == 'g' && str.charAt(str.length() - 2) != 'g') {
            answer = false;
        } else {
            answer = true;
        }
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'g' && str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g')
                return false;
        }
        return answer;
    }


//    Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".
//
//    sameEnds("abXYab") → "ab"
//    sameEnds("xx") → "x"
//    sameEnds("xxx") → "x"

    public String sameEnds(String string) {
        String longSub = "";
        String halfStr = string.substring(0, string.length() / 2);
        for (int i = 1; i < halfStr.length() + 1; i++) {
            for (int k = halfStr.length(); k < string.length(); k++) {
                if (string.substring(0, i).equals(string.substring(k, string.length()))) {
                    longSub = string.substring(0, i);
                }
            }
        }
        return longSub;
    }

//    Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
//
//    sumNumbers("abc123xyz") → 123
//    sumNumbers("aa11b33") → 44
//    sumNumbers("7 11") → 18

    public int sumNumbers(String str) {
        String sumCh = "";
        int sumNum = 0;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (i < str.length() - 1 && Character.isDigit(str.charAt(i + 1))) {
                    sumCh += str.charAt(i);
                } else {
                    sumCh += str.charAt(i);
                    sumNum += Integer.parseInt(sumCh);
                    sumCh = "";
                }
            }
        }
        return sumNum;
    }


//    Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
//
//    withoutString("Hello there", "llo") → "He there"
//    withoutString("Hello there", "e") → "Hllo thr"
//    withoutString("Hello there", "x") → "Hello there"

    public String withoutString(String base, String remove) {
        String str1 = "";
        String base2 = base.toLowerCase();
        String remove2 = remove.toLowerCase();
        for (int i = 0; i < base.length(); i++) {
            if (i <= base.length() - remove.length()) {

                if (!base2.substring(i, i + remove.length()).equals(remove2)) {
                    str1 += base.substring(i, i + 1);

                }
                if (base2.substring(i, i + remove.length()).equals(remove2)) {
                    i += remove.length() - 1;
                }
            } else {
                str1 += base.substring(i, i + 1);
            }
        }
        return str1;
    }


//    We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.
//
//    countTriple("abcXXXabc") → 1
//    countTriple("xxxabyyyycd") → 3
//    countTriple("a") → 0

    public int countTriple(String str) {
        int count3 = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                count3++;
            }
        }
        return count3;
    }


    //    Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
//
//    mirrorEnds("abXYZba") → "ab"
//    mirrorEnds("abca") → "a"
//    mirrorEnds("aba") → "aba"

    public String mirrorEnds(String string) {
        String mirr = "";
        String str1 = "";
        for (int i = 0; i < string.length() + 1; i++) {
            str1 = string.substring(0, i);
            String str2 = "";

            for (int j = string.length() - 1; j >= 0; j--) {
                str2 += string.substring(j, j + 1);
                if (str1.equals(str2)) {
                    mirr = string.substring(0, i);

                }
            }
        }
        return mirr;
    }


//
//    Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)
//
//    notReplace("is test") → "is not test"
//    notReplace("is-is") → "is not-is not"
//    notReplace("This is right") → "This is not right"


//    Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).
//
//    equalIsNot("This is not") → false
//    equalIsNot("This is notnot") → true
//    equalIsNot("noisxxnotyynotxisi") → true

    public boolean equalIsNot(String str) {
        int strIs = 0;
        int strNot = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (i < str.length() - 1 && str.substring(i, i + 2).equals("is")) {
                strIs++;
            }
            if (i < str.length() - 2 && str.substring(i, i + 3).equals("not")) {
                strNot++;
            }
        }
        if (strIs == strNot) {
            return true;
        } else {
            return false;
        }
    }


//    Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
//
//    sumDigits("aa1bc2d3") → 6
//    sumDigits("aa11b33") → 8
//    sumDigits("Chocolate") → 0

    public int sumDigits(String str) {
        String strSum = "";
        int sumDigits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == true) {
                strSum = str.substring(i, i + 1);
                sumDigits += Integer.parseInt(strSum);
            }
        }
        return sumDigits;
    }


//    Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
//
//    maxBlock("hoopla") → 2
//    maxBlock("abbCCCddBBBxx") → 3
//    maxBlock("") → 0

    public int maxBlock(String str) {
        int block = 1;
        int maxBlock = 1;
        if (str.length() == 0) {
            maxBlock = 0;
        }
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 1).equals(str.substring(i + 1, i + 2))) {
                block++;
                if (maxBlock < block) {
                    maxBlock = block;
                }
            } else {
                block = 1;
            }
        }
        return maxBlock;
    }


}
