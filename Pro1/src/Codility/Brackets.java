package Codility;
//A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:
//
//        S is empty;
//        S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
//        S has the form "VW" where V and W are properly nested strings.
//        For example, the string "{[()()]}" is properly nested but "([)()]" is not.
//
//        Write a function:
//
//class Solution { public int solution(String S); }
//
//that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.
//
//        For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.
//
//        Write an efficient algorithm for the following assumptions:
//
//        N is an integer within the range [0..200,000];
//        string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".

import java.util.ArrayList;
import java.util.Stack;


public class Brackets {
    public int solution(String S) {
        ArrayList<Character> mirror = new ArrayList<>();
        int rightEx = 0;
        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            switch (s) {
                case ')':
                    if (mirror.isEmpty() || mirror.get(mirror.size() - 1) != '(') {
                        return 0;
                    } else {
                        mirror.remove(mirror.size() - 1);
                    }
                    break;
                case ']':
                    if (mirror.isEmpty() || mirror.get(mirror.size() - 1) != '[') {
                        return 0;
                    } else {
                        mirror.remove(mirror.size() - 1);
                    }
                    break;
                case '}':
                    if (mirror.isEmpty() || mirror.get(mirror.size() - 1) != '{') {
                        return 0;
                    } else {
                        mirror.remove(mirror.size() - 1);
                    }
                    break;
                default:
                    mirror.add(s);
            }
        }
        if (mirror.isEmpty()) {
            rightEx = 1;
        } else {
            rightEx = 0;
        }
        return rightEx;
    }
}


//public class Brackets {
//    public int solution(String S) {
//        Stack<Character> mirror = new Stack<>();
//        int rightEx = 0;
//        for (int i = 0; i < S.length(); i++) {
//            char s = S.charAt(i);
//            switch (s) {
//                case ')':
//                    if (mirror.isEmpty() || mirror.pop() != '(') {
//                        return 0;
//                    }
//                    break;
//                case ']':
//                    if (mirror.isEmpty() || mirror.pop() != '[') {
//                        return 0;
//                    }
//                    break;
//                case '}':
//                    if (mirror.isEmpty() || mirror.pop() != '{') {
//                        return 0;
//                    }
//                    break;
//                default:
//                    mirror.push(s);
//            }
//        }
//        if (mirror.isEmpty()) {
//            rightEx = 1;
//        } else {
//            rightEx = 0;
//        }
//        return rightEx;
//    }
//}
