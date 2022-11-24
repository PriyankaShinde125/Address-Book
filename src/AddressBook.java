import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    HashMap<String, Contact> contactList = new HashMap<>();

    public AddressBook() {
    }

    public AddressBook(HashMap<String, Contact> contactList) {
        this.contactList = contactList;
    }

    public HashMap<String, Contact> getContactList() {
        return contactList;
    }

    public void setContactList(HashMap<String, Contact> contactList) {
        this.contactList = contactList;
    }

    public void createNewContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your details to create contact : ");
        System.out.print(" First name = ");
        String firstName = sc.next();
        System.out.print("\n Last name = ");
        String lastName = sc.next();
        System.out.print("\n Phone no = ");
        String phoneNo = sc.next();
        System.out.print("\n Email Id = ");
        String emailId = sc.next();
        System.out.print("\n Area = ");
        String area = sc.next();
        System.out.print("\n City = ");
        String city = sc.next();
        System.out.print("\n State = ");
        String state = sc.next();
        System.out.print("\n Zip = ");
        int zip = sc.nextInt();
        Address address = new Address(area, city, state, zip);
        Contact contact = new Contact(firstName, lastName, Long.parseLong(phoneNo), emailId, address);
        contactList.put(contact.getFirstName() + contact.getLastName(), contact);
        System.out.println(contactList);
    }

    public void editContact(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new phone no = ");
        String phoneNo = sc.next();
        contactList.get(name).setPhoneNumber(Long.parseLong(phoneNo));
        System.out.println(contactList.get(name));
    }

    public void deleteContact(String name) {
        System.out.println("Deleted : " + contactList.remove(name));
    }

    @Override
    public String toString() {
        return " contactList = \n" + contactList;
    }

}
