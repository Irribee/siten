package ThePhoneBook;//Код телефонной книги. Если пользователь вводит имя абонента, и он найден, то выводит номер контакта.
//Если не найден, то просит ввести номер его телефона и запоминает в Map.
//И выводит полный список абонентов в алфавитном порядке

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook implements PhoneBookInterface {
    TreeMap<String, String> book = new TreeMap<>();

    public String findNumberOfContact(String name) {
        String phoneNumber = book.get(name);
        return phoneNumber;
    }

    public void PrintAllNumbers() {
        for (Map.Entry<String, String> k : book.entrySet()) {
            System.out.println("Контакты: " + k.getValue() + ": " + k.getKey());
        }
    }

    public void addNumber(String name, String number) {
        book.put(name, number);
    }
}


//import java.util.Map;
//import java.util.Scanner;
//import java.util.TreeMap;
//
//public class ThePhoneBook.PhoneBook {
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

