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


}
