package Skill;

import java.util.Scanner;
import java.util.TreeSet;

public class AutoNumberConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AutoNumber auto = new AutoNumber();
        auto.madeBasic();
        for (; ; ) {
            System.out.println("Enter the elite number of the car");
            String eliteNumber = scanner.nextLine();
            auto.enumeration(eliteNumber);
            auto.binarySearch(eliteNumber);
            auto.treeSearch(eliteNumber);
            auto.hashSearch(eliteNumber);
        }
    }
}

