package Codility;
/**
 * An array A consisting of N integers is given. The dominator of array A is the value that occurs in more than half of the elements of A.
 * <p>
 * For example, consider array A such that
 * <p>
 * A[0] = 3    A[1] = 4    A[2] =  3
 * A[3] = 2    A[4] = 3    A[5] = -1
 * A[6] = 3    A[7] = 3
 * The dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in those with indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.
 * <p>
 * Write a function
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A consisting of N integers, returns index of any element of array A in which the dominator of A occurs. The function should return −1 if array A does not have a dominator.
 * <p>
 * For example, given array A such that
 * <p>
 * A[0] = 3    A[1] = 4    A[2] =  3
 * A[3] = 2    A[4] = 3    A[5] = -1
 * A[6] = 3    A[7] = 3
 * the function may return 0, 2, 4, 6 or 7, as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Dominator {
    public int solution(int[] A) {
        int dominator = 0;
        int count = 1;
        ArrayList<Integer> sortAr = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            sortAr.add(A[i]);
        }
        Collections.sort(sortAr);
        for (int j = 0; j < sortAr.size() - 1; j++) {
            if (sortAr.get(j) == sortAr.get(j + 1)) {
                count++;
                if (count > A.length / 2) {
                    dominator = sortAr.get(j);
                    break;
                }
            } else {
                count = 1;
            }
        }
        if (dominator == 0) {
            return -1;
        }
        for (int j = 0; j < A.length; j++) {
            if (A[j] == dominator) {
                return j;
            }
        }
        return -1;
    }
}
//минус этого решения, что она непродуктивное и цифра ) может быть доминатором, но у меня тогда в данном случае будет возвращено -1
//в кодилите было написано вот это:
//The following issues have been detected: wrong answers.For example, for the input [2147483647] the solution returned a wrong answer (got -1, but dominator exists, for example on position 0).
//Как я поняла, должна возвращаться цифра, которая встречается в больше, чем половина длина массива количества раз, но тут 0 элемент же цифра 2, которая только 1 раз повторяется