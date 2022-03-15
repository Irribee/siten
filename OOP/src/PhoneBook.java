//Код телефонной книги. Если пользователь вводит имя абонента, и он найден, то выводит номер контакта.
//Если не найден, то просит ввести номер его телефона и запоминает в Map.
//И выводит полный список абонентов в алфавитном порядке

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {
   // Scanner scanner = new Scanner(System.in);
    public static HashMap<String, String> phoneBook = new HashMap<>();

    public static void getBasicContacts() {
        phoneBook.put("Rodion", "89536975212");
        phoneBook.put("Anton", "89680369941");
        phoneBook.put("Katya", "89543695665");
        phoneBook.put("Borya", "84563697741");
        phoneBook.put("Nina", "89776589631");
    }

    public static void findNumberOfContact(String name) {
        String phoneNumber = phoneBook.get(name);
        System.out.println(name + " : " + phoneNumber);
    }

    public static void PrintAllNumbers() {
        for (Map.Entry<String, String> k : phoneBook.entrySet()) {
            System.out.println("Контакты: " + k.getValue() + ": " + k.getKey());
        }
    }

    public static void addNumber(String name, String number) {
        phoneBook.put(name, number);
    }

    public static void main(String[] args) {
        getBasicContacts(); //получаем исх. список контактов
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Input the name: ");
            String name = scanner.nextLine();
            String phoneNumber = "";
            if (phoneBook.containsKey(name)) {
                findNumberOfContact("Nina");
            } else if (name.equals("End")) {
                PrintAllNumbers();
            } else if (!phoneBook.containsKey(name)) {
                addNumber("Mary", "889563649981");
            }
        }
    }
}


//import java.util.Map;
//import java.util.Scanner;
//import java.util.TreeMap;
//
//public class PhoneBook {
//    public static void main(String[] args) {
//        TreeMap<String, String> phoneBook = new TreeMap<>();
//        phoneBook.put("Rodion", "89536975212");
//        phoneBook.put("Anton", "89680369941");
//        phoneBook.put("Katya", "89543695665");
//        phoneBook.put("Borya", "84563697741");
//        phoneBook.put("Nina", "89776589631");
//
//        Scanner scanner = new Scanner(System.in);
//        for (; ; ) {
//            System.out.println("Input the name: ");
//            String name = scanner.nextLine();
//            String phoneNumber = "";
//            if (phoneBook.containsKey(name)) {
//                phoneNumber = phoneBook.get(name);
//                System.out.println(name + " : " + phoneNumber);
//            } else if (name.equals("End")) {
//                printMap(phoneBook);
//                continue;
//            } else if (!phoneBook.containsKey(name)) {//где то cэтим оператором ошибка
//                System.out.println("Input the phone number: ");
//                phoneNumber = scanner.nextLong();
//                System.out.println(name + " : " + phoneNumber);
//                phoneBook.put(name, phoneNumber);
//            }
//        }
//    }
//
//    public static void printMap(Map<String, Long> map) {
//        for (String key : map.keySet()) {
//            System.out.println(key + " - " + map.get(key));
//        }
//    }
//}

