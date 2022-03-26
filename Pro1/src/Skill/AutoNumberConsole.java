package Skill;

import java.util.Scanner;

public class AutoNumberConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AutoNumber auto = new AutoNumber();
    long start;
    //start = System.currentTimeMillis();
        //
        long duration;
        auto.madeBasic();
        for (; ; ) {
            System.out.println("Enter the elite number of the car");
            String eliteNumber = scanner.nextLine();
            start = System.currentTimeMillis();
            auto.enumeration(eliteNumber);
            if (true) {
                duration = System.currentTimeMillis() - start;
                System.out.println(duration);
            }
            start = System.currentTimeMillis();
            auto.binarySearch(eliteNumber);
            if (true) {
                duration = System.currentTimeMillis() - start;
                System.out.println(duration);
            }
            start = System.currentTimeMillis();
            auto.treeSearch(eliteNumber);
            if (true) {
                duration = System.currentTimeMillis() - start;
                System.out.println( duration);
            }
            start = System.currentTimeMillis();
            auto.hashSearch(eliteNumber);
            if (true) {
                duration = System.currentTimeMillis() - start;
                System.out.println (duration);
            }
        }
    }
}
