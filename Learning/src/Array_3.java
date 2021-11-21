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
        for (int i = 0; i < nums.length; i++) {
            sumLeft += nums[i];
            int sumRight = 0;
            for (int j = nums.length - 1; j > i; j--) {
                sumRight += nums[j];
            }
            if (sumLeft == sumRight) {
                answer = true;
            }
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


//    Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
//
//    fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
//    fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
//    fix34([3, 2, 2, 4]) → [3, 4, 2, 2]

    public int[] fix34(int[] nums) {
        int[] fix34 = new int[nums.length];
        int indexThree = 0;
        int indexFour = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                indexThree = i;
            }
            if (nums[i] == 4) {
                indexFour = i;
                int change = nums[i];
                nums[i] = nums[indexThree + 1];
                nums[indexThree + 1] = change;

            }
        }
        return nums;
    }
// не подходит для тех моментов, как, например 1, 3, 1, 4, 4, 3, 1 (сначала 3, 4 (ок), но потом идет сначала 4, а уже потом 3), пробовала решить эту проблему таким способом, но так тоже не получается:
//public int[] fix34(int[] nums) {
//    int[] fix34=new int[nums.length];
//    int indexThree=0;
//    int indexFour=0;
//    for (int i=0; i<nums.length;i++){
//        if (nums[i]==3 && indexFour==0 ){
//            indexThree=i;
//        }
//        if (nums[i]==3 && indexFour!=0 ){
//            indexThree=i;
//            int change2=nums[i+1];
//            nums[i+1]=nums[indexFour];
//            nums[indexFour]=change2;
//            indexThree=0;
//            indexFour=0;
//        }
//        if (nums[i]==4 && indexThree==0){
//            indexFour=i;
//        }
//        if (nums[i]==4 && indexThree!=0){
//            indexFour=i;
//            int change=nums[i];
//            nums[i]=nums[indexThree+1];
//            nums[indexThree+1]=change;
//            indexThree=0;
//            indexFour=0;
//        }
//    }
//    return nums;
//}


//    Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
//
//    linearIn([1, 2, 4, 6], [2, 4]) → true
//    linearIn([1, 2, 4, 6], [2, 3, 4]) → false
//    linearIn([1, 2, 4, 4, 6], [2, 4]) → true

    public boolean linearIn(int[] outer, int[] inner) {
        int countInner = 0;
        if (inner.length == 0) {
            return true;
        }
        for (int i = 0; i < outer.length; i++) {
            if (outer[i] == inner[countInner]) {
                if (countInner == inner.length - 1) {
                    countInner++;
                    break;
                } else {
                    countInner++;
                }
            }
        }
        if (countInner >= inner.length) {
            return true;
        } else {
            return false;
        }
    }


    //    We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.
//
//    maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
//    maxMirror([1, 2, 1, 4]) → 3
//    maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
    public int maxMirror(int[] nums) {
        int maxMir = 0;
        for (int i = 0; i < nums.length; i++) {
            maxMir = 0;
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i + maxMir] == nums[j]) {
                    maxMir++;
                }

            }
        }
        return maxMir;
    }
//не работает, из-за того, что возвращаем maxMir, но он же обновляется перед вложенным циклом, поэтому всегда будет 0, но и ьез обнуления этой переменной ничего не получится.
}

