//написать код, который будет генерировать блатные автомобильные номера (состоящие из одинаковых цифр), 12 букв(А, В, Е, К, М, Н, О, Р, С, Т, У и Х) и все регионы от 1 до 197.
//упаковать их в ArrayList и, получив из консоли какой-то номер, произвести поиск этого номера 4-мя способами:
//прямой перебор list.contains();
//бинарный поиск Collections.binarySearch();
//TreeSet();
//НashSet();
//И сравнить, какой поиск занял наименьшее количество времени. long start= System.currentTimeMillis();
//long duration=System.currentTimeMillis()-start


package Skill;

import java.util.*;

public class AutoNumber {
    ArrayList<String> autoNumber = new ArrayList<>();
    String number = "";

    public void madeBasic() {
        String[] figure = {"111", "222", "333", "444", "555", "666", "777", "888", "999"};
        String[] letter = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < figure.length; j++) {
                for (int k = 0; k < letter.length; k++) {
                    for (int n = 0; n < letter.length; n++) {
                        for (int m = 1; m < 198; m++) {
                            number = letter[i] + figure[j] + letter[k] + letter[n] + m;
                            autoNumber.add(number);
                        }
                    }
                }
            }
        }
    }

    public boolean enumeration(String eliteNumber) {
        long start = System.currentTimeMillis();
        autoNumber.contains(eliteNumber);
        long duration = System.currentTimeMillis() - start;
        System.out.println(duration);
        return true;
    }

    public boolean binarySearch(String eliteNumber) {
        Collections.sort(autoNumber);
        long start = System.currentTimeMillis();
        Collections.binarySearch(autoNumber, eliteNumber);
        long duration = System.currentTimeMillis() - start;
        System.out.println(duration);
        return true;
    }

    public boolean treeSearch(String eliteNumber) {
        TreeSet<String> trSet = new TreeSet<>();
        trSet.addAll(autoNumber);
        long start = System.currentTimeMillis();
        trSet.contains(eliteNumber);
        long duration = System.currentTimeMillis() - start;
        System.out.println(duration);
        return true;
    }

    public boolean hashSearch(String eliteNumber) {
        HashSet<String> hSet = new HashSet<>();
        hSet.addAll(autoNumber);
        long start = System.currentTimeMillis();
        hSet.contains(eliteNumber);
        long duration = System.currentTimeMillis() - start;
        System.out.println(duration);
        return true;
    }
}

//        for (int i = 0; i < 2_00; i++) {
//            String[] number = {"111", "222", "333", "444", "555", "666", "777", "888", "999"};
//            String[] letter = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
//            int region = (int) (Math.random() * 197);
//
//            int numberLength = number.length;
//            int letterLength = letter.length;
//
//            int randNumber = (int) (Math.random() * numberLength);
//            int randLetter = (int) (Math.random() * letterLength);
//            String randRegion = Integer.toString(region);
//
//            autoNumber.add(letter[randLetter]);
//            autoNumber.add(number[randNumber]);
//            autoNumber.add(letter[randLetter]);
//            autoNumber.add(letter[randLetter]);
//            autoNumber.add(randRegion);
//            System.out.println(autoNumber);
//        }


