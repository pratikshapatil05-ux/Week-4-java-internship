import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + " - " + phone;
    }
}

public class ContactManager {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        contacts.add(new Contact("Alice", "1234567890"));
        contacts.add(new Contact("Bob", "0987654321"));

        System.out.println("Contacts List:");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
