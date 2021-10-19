public class Array_2 {

    //    Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
//    countEvens([2, 1, 2, 3, 4]) → 3
//    countEvens([2, 2, 0]) → 3
//    countEvens([1, 3, 5]) → 0
    public int countEvens(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                n++;
            }
        }
        return n;
    }

    //    This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem for job interviews. (See also: FizzBuzz Code.) Consider the series of numbers beginning at start and running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of these numbers, except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx) will make the String form of an int or other type. This version is a little more complicated than the usual version since you have to allocate and index into an array instead of just printing, and we vary the start/end instead of just always doing 1..100.
//    fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
//    fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
//    fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
    public String[] fizzBuzz(int start, int end) {
        String[] mas = new String[end - start];
        for (int i = start; i < end; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                mas[i - start] = "FizzBuzz";
            } else if (i % 3 == 0) {
                mas[i - start] = "Fizz";
            } else if (i % 5 == 0) {
                mas[i - start] = "Buzz";
            } else {
                mas[i - start] = String.valueOf(i);
            }
        }
        return mas;
    }


    //    Given an array of ints, return true if every element is a 1 or a 4.
//    only14([1, 4, 1, 4]) → true
//    only14([1, 4, 2, 4]) → false
//    only14([1, 1]) → true
    public boolean only14(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 4) {
                k++;
            } else {
                k--;
            }
        }
        if (k == nums.length) {
            return true;
        } else {
            return false;
        }
    }

    //    We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it. Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.
//    notAlone([1, 2, 3], 2) → [1, 3, 3]
//    notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
//    notAlone([3, 4], 3) → [3, 4]
    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i - 1] < nums[i + 1] && nums[i - 1] != val && nums[i + 1] != val) {
                nums[i] = nums[i + 1];
            }
            if (nums[i] == val && nums[i - 1] > nums[i + 1] && nums[i - 1] != val && nums[i + 1] != val) {
                nums[i] = nums[i - 1];
            }
        }
        return nums;
    }

    //    Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.
//    evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
//    evenOdd([3, 3, 2]) → [2, 3, 3]
//    evenOdd([2, 2, 2]) → [2, 2, 2]
    public int[] evenOdd(int[] nums) {
        int n = 0;
        int k = nums.length - 1;
        int[] mas = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                mas[n] = nums[i];
                n++;
            } else {
                mas[k] = nums[i];
                k--;
            }
        }
        return mas;
    }

    //    Given an array of ints, return true if every 2 that appears in the array is next to another 2.
//    twoTwo([4, 2, 2, 3]) → true
//    twoTwo([2, 2, 4]) → true
//    twoTwo([2, 2, 4, 2]) → false
    public boolean twoTwo(int[] nums) {
        for (int i=1;i<nums.length-1;i++){
            if (nums[i]==2 && nums[i+1]!=2 && nums[i-1]!=2) {
                return false;
            }
        }
        if(nums.length==1 && nums[0]==2){
            return false;
        }
        else if (nums.length>1 && nums[nums.length-1]==2 && nums[nums.length-2]!=2) {
            return false;
        }
        else{
            return true;
        }
    }



}


