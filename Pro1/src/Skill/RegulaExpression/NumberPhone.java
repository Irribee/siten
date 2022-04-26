package Skill.RegulaExpression;

import java.util.Scanner;

//реализовать очистку и преобразование к единому формату номера телефона, вводимого из консоли (например, +7 904v23-43-44, 8 (960) 9854547, 905 45632-11, привести к такому формату: +7 903 325-54-63
public class NumberPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number phone");
        String phoneNumber = scanner.nextLine();
        String onlyNumber = phoneNumber.replaceAll("[^0-9]", "");
        for (int i = 0; i < onlyNumber.length(); i++) {
            if (onlyNumber.charAt(i) == '9') {
                onlyNumber = "+7" + onlyNumber.substring(i, onlyNumber.length());
                break;
            }
        }
        String rightPhoneNumber = onlyNumber.substring(0, 2) + " " + onlyNumber.substring(2, 5) + " " + onlyNumber.substring(5, 8) + "-" + onlyNumber.substring(8, 10) + "-" + onlyNumber.substring(10, 12);
        System.out.println(rightPhoneNumber);
    }
}

//можно ли реализовать эту программу другим способом,  не применяя много раз substring при создании объекта rightPhoneNumber????