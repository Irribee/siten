public class Warmup_2 {
    //    Given a string and a non-negative int n, return a larger string that is n copies of the original string.
//    stringTimes("Hi", 2) → "HiHi"
//    stringTimes("Hi", 3) → "HiHiHi"
//    stringTimes("Hi", 1) → "Hi"
    public String stringTimes(String str, int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s = str + s;
        }
        return s;
    }


    //    Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
//    noTriples([1, 1, 2, 2, 1]) → true
//    noTriples([1, 1, 2, 2, 2, 1]) → false
//    noTriples([1, 1, 1, 2, 2, 2, 1]) → false
    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }


    //    Given an array of ints, return the number of 9's in the array.
//
//
//    arrayCount9([1, 2, 9]) → 1
//    arrayCount9([1, 9, 9]) → 2
//    arrayCount9([1, 9, 9, 3, 9]) → 3
    public int arrayCount9(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                k++;
            }
        }
        return k;
    }


    //    Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
//
//
//    has271([1, 2, 7, 1]) → true
//    has271([1, 2, 8, 1]) → false
//    has271([2, 7, 1]) → true
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int n = nums[i];
            if (nums[i + 1] == n + 5 && (nums[i + 2] == n - 1 || nums[i + 2] == n - 3 || nums[i + 2] == n + 1 || nums[i + 2] == n - 2)) {
                return true;
            }
        }
        return false;
    }

    //    Given a non-empty string like "Code" return a string like "CCoCodCode".
//
//
//    stringSplosion("Code") → "CCoCodCode"
//    stringSplosion("abc") → "aababc"
//    stringSplosion("ab") → "aab"
    public String stringSplosion(String str) {
        String s = "";
        for (int i = 1; i < str.length() + 1; i++) {
            s += str.substring(0, i);
        }
        return s;
    }


    //    Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.
//
//
//    array667([6, 6, 2]) → 1
//    array667([6, 6, 2, 6]) → 1
//    array667([6, 7, 2, 6]) → 1
    public int array667(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && nums[i + 1] == 6) {
                n++;
            } else if (nums[i] == 6 && nums[i + 1] == 7) {
                n++;
            }
        }
        return n;
    }

}
