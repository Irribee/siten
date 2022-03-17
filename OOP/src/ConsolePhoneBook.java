import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class ConsolePhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook book = new PhoneBook();
        TreeMap<String, String> phoneBook = new TreeMap<>();
        void getBasicContacts () {//какой параметр здесь вставить?
            phoneBook.put("Rodion", "89536975212");
            phoneBook.put("Anton", "89680369941");
            phoneBook.put("Katya", "89543695665");
            phoneBook.put("Borya", "84563697741");
            phoneBook.put("Nina", "89776589631");
        }
        for (; ; ) {
            System.out.println("Input the name: ");
            String name = scanner.nextLine();
            String phoneNumber = "";
            if (phoneBook.containsKey(name)) {
                book.findNumberOfContact("Petr");
            } else if (name.equals("End")) {
                book.PrintAllNumbers();
            } else if (!phoneBook.containsKey(name)) {
                book.addNumber("Petr","8968225698");
            }
        }
    }
}
