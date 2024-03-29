package ThePhoneBook;

import java.util.Scanner;

public class ConsolePhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneDirectory = new PhoneBook();
        addBasicContacts(phoneDirectory);
        for (; ; ) {
            System.out.println("Input the name: ");
            String name = scanner.nextLine();
            String number = "";
            if (name.equals("End")) {
                phoneDirectory.PrintAllNumbers();
                break;
            } else if (phoneDirectory.findNumberOfContact(name) == null) {
                System.out.println("Input the number of phone: ");
                number = scanner.nextLine();
                phoneDirectory.addNumber(name, number);
            } else {
                number = phoneDirectory.findNumberOfContact(name);
                System.out.println(name + " : " + number);
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

