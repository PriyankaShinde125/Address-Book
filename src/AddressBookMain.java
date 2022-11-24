import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner sc;

    public static void main(String[] args) {
        System.out.println("Welcome to address book");
        sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        String firstName = "Priyanka";
        String lastName = "Shinde";
        String phoneNo = "9518905320";
        String emailId = "pshinde@gmail.com";
        String area = "Bhugaon";
        String city = "Pune";
        String state = "Maharashtra";
        int zip = 412115;

        Address address = new Address(area, city, state, zip);
        Contact contact = new Contact(firstName, lastName, Long.parseLong(phoneNo), emailId, address);
        addressBook.getContactList().put(contact.getFirstName() + contact.getLastName(), contact);

        System.out.println("Enter your details to create contact : ");
        System.out.print(" First name = ");
        firstName = sc.next();
        System.out.print("\n Last name = ");
        lastName = sc.next();
        System.out.print("\n Phone no = ");
        phoneNo = sc.next();
        System.out.print("\n Email Id = ");
        emailId = sc.next();
        System.out.print("\n Area = ");
        area = sc.next();
        System.out.print("\n City = ");
        city = sc.next();
        System.out.print("\n State = ");
        state = sc.next();
        System.out.print("\n Zip = ");
        zip = sc.nextInt();

        Address address1 = new Address(area, city, state, zip);
        Contact contact1 = new Contact(firstName, lastName, Long.parseLong(phoneNo), emailId, address1);
        addressBook.getContactList().put(contact1.getFirstName() + contact1.getLastName(), contact1);

        System.out.println(addressBook.getContactList().get(contact1.getFirstName() + contact1.getLastName()));
        System.out.println(addressBook);
    }
}
