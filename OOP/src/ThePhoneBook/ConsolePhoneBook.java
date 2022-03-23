package ThePhoneBook;

import java.util.Scanner;
import java.util.TreeMap;

public class ConsolePhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneDirectory = new PhoneBook();
        TreeMap<String, String> phoneBook = new TreeMap<>();
        addBasicContacts(phoneDirectory);
        for (; ; ) {
            System.out.println("Input the name: ");
            String name = scanner.nextLine();
            String number = "";
            if (phoneBook.containsKey(name)) {
                phoneDirectory.findNumberOfContact(name);
            } else if (name.equals("End")) {
                phoneDirectory.PrintAllNumbers();
                break;
            } else if (!phoneBook.containsKey(name)) {
                System.out.println("Input the number of phone: ");
                number = scanner.nextLine();
                phoneDirectory.addNumber(name, number);
            }
        }
    }

    public static void addBasicContacts(PhoneBook contact) {
        contact.addNumber("Rodion", "89536975212");
        contact.addNumber("Anton", "89680369941");
        contact.addNumber("Katya", "89543695665");
        contact.addNumber("Borya", "84563697741");
        contact.addNumber("Nina", "89776589631");
    }
}

