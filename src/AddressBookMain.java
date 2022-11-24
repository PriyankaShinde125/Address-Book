import java.util.Scanner;

public class AddressBookMain {
    public static final int CREATE_CONTACT = 1;
    public static final int EDIT_CONTACT = 2;
    public static final int DELETE_CONTACT = 3;
    public static final int ZERO = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName;
        String lastName;
        AddressBook addressBook = new AddressBook();
        System.out.println("Welcome to address book");
        while (true) {
            System.out.println("Enter your choice : ");
            System.out.println("1 : Create new contact ");
            System.out.println("2 : Edit existing contact ");
            System.out.println("3 : Delete contact ");
            System.out.println("0 : Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case CREATE_CONTACT:
                    addressBook.createNewContact();
                    break;
                case EDIT_CONTACT:
                    System.out.println("Enter firstname and last name to edit contact : ");
                    firstName = sc.next();
                    lastName = sc.next();
                    addressBook.editContact(firstName + lastName);
                    break;
                case DELETE_CONTACT:
                    System.out.println("Enter firstname and last name to edit contact : ");
                    firstName = sc.next();
                    lastName = sc.next();
                    addressBook.deleteContact(firstName + lastName);
                    break;
                case ZERO:
                    return;
                default:
                    System.out.println("Invalid choice ");
                    break;
            }
        }
    }
}
