public class Logic_2 {

    //    We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks
//    makeBricks(3, 1, 8) → true
//    makeBricks(3, 1, 9) → false
//    makeBricks(3, 2, 10) → true
    public boolean makeBricks(int small, int big, int goal) {
        int n = goal % 10;
        if (n > 5 && n - 5 > small || n < 5 && n > small) {
            return false;
        }
        if (1 * small + 5 * big >= goal) {
            return true;
        } else {
            return false;
        }
    }


    //    Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
//    blackjack(19, 21) → 21
//    blackjack(21, 19) → 21
//    blackjack(19, 22) → 19
    public int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        }
        if (a > 21) {
            return b;
        } else if (b > 21) {
            return a;
        } else if (21 - a > 21 - b) {
            return b;
        } else {
            return a;
        }
    }

    //    For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().
//    roundSum(16, 17, 18) → 60
//    roundSum(12, 13, 14) → 30
//    roundSum(6, 4, 4) → 10
    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        if (num % 10 >= 5) {
            return num - num % 10 + 10;
        } else {
            return num - num % 10;
        }
    }

    //    Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
//    luckySum(1, 2, 3) → 6
//    luckySum(1, 2, 13) → 3
//    luckySum(1, 13, 3) → 1
    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        } else {
            return a + b + c;
        }
    }


    //    Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.
//    closeFar(1, 2, 10) → true
//    closeFar(1, 2, 3) → false
//    closeFar(4, 1, 3) → true
    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(b - a) <= 1 && Math.abs(c - a) > 1 && Math.abs(c - b) > 1) {
            return true;
        } else if (Math.abs(c - a) <= 1 && Math.abs(b - a) > 1 && Math.abs(c - b) > 1) {
            return true;
        } else {
            return false;
        }
    }


    //    We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
//    makeChocolate(4, 1, 9) → 4
//    makeChocolate(4, 1, 10) → -1
//    makeChocolate(4, 1, 7) → 2
    public int makeChocolate(int small, int big, int goal) {
        int n = goal / 5;
        if (small > 5 && goal % 10 != 0 && goal - (5 * n) <= small && (n >= big || goal - 5 * big >= small)) {
            return goal - 5 * big;
        }
        if (small < 5 && goal % 10 != 0 && goal - (5 * n) <= small && (n >= big || goal - 5 * big >= small)) {
            return goal - 5 * n;
        }
        if (goal % 10 == 0 && small < 5 && goal - 5 * big - small <= 0 && (n <= big || goal - 5 * big == 0)) {
            return goal - 5 * n;
        }
        if (goal % 10 == 0 && small > 5 && goal - (5 * big) - small <= 0 && (n >= big || goal - 5 * big == 0)) {
            return goal - 5 * big;
        } else {
            return -1;
        }
    }


}
