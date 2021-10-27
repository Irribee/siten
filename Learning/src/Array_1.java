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
    }


    //arr1, arr2, length, где length(int len) не обязательно 2. Если length больше, чем размер первых 2 массивов, то в нем только эл-ты первого и второго.
    public int[] make2(int[] arr1, int[] arr2, int len) {
        int[] arr3 = new int[len];
        int index = 0;
        for (int i = 0, i<arr1.length;
        i++){
            if (index <= len && i <= len) {
                arr3[index] = arr1[i];
            }
            index++;
        }
        for (int i = 0, i<arr2.length;
        i++){
            if (index <= len && i <= len) {
                arr3[index] = arr2[i];
            }
            index++;
        }
        return arr3;
    }

    //    Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
//    rotateLeft3([1, 2, 3]) → [2, 3, 1]
//    rotateLeft3([5, 11, 9]) → [11, 9, 5]
//    rotateLeft3([7, 0, 0]) → [0, 0, 7]
    public int[] rotateLeft3(int[] nums) {
        int[] a = {nums[1], nums[2], nums[0]};
        return a;
    }

    //reverseArray из N чисел
    public int[] rotateLeft3(int[] nums) {
        int[] arr = new int[];
        int k = nums.length;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[k - 1];
            k--;
        }
    }

    



}
