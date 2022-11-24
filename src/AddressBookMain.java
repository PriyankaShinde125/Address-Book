import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to address book");
        AddressBook addressBook = new AddressBook();
        addressBook.createNewContact();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstname and last name to edit contact : ");
        String firstName = sc.next();
        String lastName = sc.next();
        addressBook.editContact(firstName + lastName);
    }
}
