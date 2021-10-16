public class Array_1 {

    //    Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.
//    make2([4, 5], [1, 2, 3]) → [4, 5]
//    make2([4], [1, 2, 3]) → [4, 1]
//    make2([], [1, 2]) → [1, 2]
    public int[] make2(int[] a, int[] b) {
        if (a.length == 0) {
            int[] c = {b[0], b[1]};
            return c;
        }
        if (a.length == 1) {
            int[] c = {a[0], b[0]};
            return c;
        } else {
            int[] c = {a[0], a[1]};
            return c;
        }


//    Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
//    rotateLeft3([1, 2, 3]) → [2, 3, 1]
//    rotateLeft3([5, 11, 9]) → [11, 9, 5]
//    rotateLeft3([7, 0, 0]) → [0, 0, 7]
        public int[] rotateLeft3 ( int[] nums){
            int[] a = {nums[1], nums[2], nums[0]};
            return a;
        }
        reverseArray из N чисел

    }
}