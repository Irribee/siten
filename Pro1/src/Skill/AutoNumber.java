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
    TreeSet<String> trSet = new TreeSet<>();
    HashSet<String> hSet = new HashSet<>();

    public void makeBasic() {
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
        trSet.addAll(autoNumber);
        hSet.addAll(autoNumber);
    }

    public boolean enumeration(String eliteNumber) {
        boolean answer;
        long duration = 0;
        long start = System.currentTimeMillis();
        if (autoNumber.contains(eliteNumber)) {
            duration = System.currentTimeMillis() - start;
            answer = true;
        } else {
            answer = false;
        }
        System.out.println(answer + " " + duration);
        return answer;
    }

    public void makeBinary() {
        Collections.sort(autoNumber);
    }

    public boolean binarySearch(String eliteNumber) {
        makeBinary();
        boolean answer;
        long duration = 0;
        long start = System.currentTimeMillis();
        int ind = Collections.binarySearch(autoNumber, eliteNumber);
        if (ind > 0) {
            duration = System.currentTimeMillis() - start;
            answer = true;
        } else {
            answer = false;
        }
        System.out.println(answer + " " + duration);
        return answer;
    }

    public boolean treeSearch(String eliteNumber) {
        boolean answer;
        long duration = 0;
        long start = System.currentTimeMillis();
        if (trSet.contains(eliteNumber)) {
            duration = System.currentTimeMillis() - start;
            answer = true;
        } else {
            answer = false;
        }
        System.out.println(answer + " " + duration);
        return answer;
    }


    public boolean hashSearch(String eliteNumber) {
        boolean answer;
        long duration = 0;
        long start = System.currentTimeMillis();
        if (hSet.contains(eliteNumber)) {
            duration = System.currentTimeMillis() - start;
            answer = true;
        } else {
            answer = false;
        }
        System.out.println(answer + " " + duration);
        return answer;
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


