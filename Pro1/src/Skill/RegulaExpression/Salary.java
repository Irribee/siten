package Skill.RegulaExpression;
//написать код с использованием регулярных выражений, который будет извлекать заработки, рассчитать сумму зароботка.

public class Salary {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя-7563, а Маша-30000 рублей";
        String onlyNumbers = text.replaceAll("[^0-9]", " ");
        String numbersWithOneSpace = onlyNumbers.replaceAll("\\s+", " ");
        String allWage = numbersWithOneSpace.trim();
        String[] strWage = allWage.split(" ");
        int[] wage = new int[strWage.length];
        int sumSalary = 0;
        for (int i = 0; i < strWage.length; i++) {
            wage[i] = Integer.parseInt(strWage[i]);
            sumSalary += wage[i];
        }
        System.out.println(sumSalary);
    }
}
