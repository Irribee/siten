public class String_1 {

    //Given a string, if the string begins with "red" or "blue"return that color string, otherwise return the empty string.
//seeColor("redxx") → "red"
//seeColor("xxred") → ""
//seeColor("blueTimes") → "blue"
    public String seeColor(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("red")) {
            return "red";
        } else if (str.length() >= 4 && str.substring(0, 4).equals("blue")) {
            return "blue";
        } else {
            return "";
        }
    }
}

    //    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
//        withoutX2("xHi") → "Hi"
//        withoutX2("Hxi") → "Hi"
//        withoutX2("Hi") → "Hi"
    public String withoutX2(String str) {
        if (str.length() > 1 && str.substring(0, 2).equals("xx")) {
            return str.substring(2, str.length());
        } else if (str.length() > 0 && str.substring(0, 1).equals("x")) {
            return str.substring(1, str.length());
        } else if (str.length() > 0 && str.substring(1, 2).equals("x")) {
            String left = str.substring(0, 1);
            String right = str.substring(2, str.length());
            return left + right;
        } else {
            return str;
        }
    }