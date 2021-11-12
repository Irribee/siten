public class Array_3 {

    //    Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
//
//    maxSpan([1, 2, 1, 1, 3]) → 4
//    maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
//    maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
    public int maxSpan(int[] nums) {
        int span = 0;
        if (nums.length == 1) {
            span = 1;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] == nums[j] && span < j - i) {
                    span = j - i + 1;
                } else if (nums[i] == nums[j] && span > j - i) {
                    span = span;
                }
            }
        }
        if (span == 0 && nums.length != 0) { //спросить у Пашки
            return 1;
        }
        return span;
    }


//    Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
//
//    canBalance([1, 1, 1, 2, 1]) → true
//    canBalance([2, 1, 1, 2, 1]) → false
//    canBalance([10, 10]) → true

    public boolean canBalance(int[] nums) {
        boolean answer = false;
        int sumLeft = 0;
        int sumRight = 0;
        int i = 0;
        int j = nums.length - 1;
        for (i = 0; i < nums.length; i++) {
            if (i >= j) {
                break;
            }
            if (sumLeft < sumRight) {
                continue;
            } else {
                sumLeft += nums[i];
                for (j = nums.length - 1; j > i; j--) {
                    sumRight += nums[j];
                }
            }
        }
        if (sumLeft == sumRight) {
            answer = true;
        }
        return answer;
    }


//    Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
//
//    seriesUp(3) → [1, 1, 2, 1, 2, 3]
//    seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
//    seriesUp(2) → [1, 1, 2]

    public int[] seriesUp(int n) {
        int[] arr = new int[n * (n + 1) / 2];
        int index = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                arr[index] = j + 1;
                index++;
            }
        }
        return arr;
    }


}

