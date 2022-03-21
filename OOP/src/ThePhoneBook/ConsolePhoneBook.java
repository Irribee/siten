package ThePhoneBook;

import java.util.Scanner;
import java.util.TreeMap;

public class ConsolePhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook book = new PhoneBook();
        TreeMap<String, String> phoneBook = new TreeMap<>();
        addBasicContacts(book);
        for (; ; ) {
            System.out.println("Input the name: ");
            String name = scanner.nextLine();
            String number = "";
            if (phoneBook.containsKey(name)) {
                book.findNumberOfContact(name);
            } else if (name.equals("End")) {
                book.PrintAllNumbers();
            } else if (!phoneBook.containsKey(name)) {
                System.out.println("Input the number of phone: ");
                number = scanner.nextLine();
                book.addNumber(name, number);
            }
        }
    }

    public static void addBasicContacts(PhoneBook book) {
        book.addNumber("Rodion", "89536975212");
        book.addNumber("Anton", "89680369941");
        book.addNumber("Katya", "89543695665");
        book.addNumber("Borya", "84563697741");
        book.addNumber("Nina", "89776589631");
    }
}

