import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    public static final int FIRST_NAME = 1;
    public static final int LAST_NAME = 2;
    public static final int PHONE_NUMBER = 3;
    public static final int EMAIL_ID = 4;
    public static final int AREA = 5;
    public static final int CITY = 7;
    public static final int STATE = 8;
    public static final int ZIP = 9;
    String addressBookName;
    HashMap<String, Contact> contactMap;

    public AddressBook() {
        contactMap = new HashMap<>();
    }

    public AddressBook(String addressBookName) {
        this.addressBookName = addressBookName;
        contactMap = new HashMap<>();
    }

    public AddressBook(HashMap<String, Contact> contactMap) {
        this.contactMap = new HashMap<>();
        this.contactMap = contactMap;
    }

    public HashMap<String, Contact> getContactMap() {
        return contactMap;
    }

    public void setContactMap(HashMap<String, Contact> contactMap) {
        this.contactMap = contactMap;
    }

    public String getAddressBookName() {
        return addressBookName;
    }

    public void setAddressBookName(String addressBookName) {
        this.addressBookName = addressBookName;
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
        contactMap.put(contact.getEmailId(), contact);
        System.out.println(contactMap.get(contact.getEmailId()));
    }

    public void editContact(String emailId) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which field do you want to edit : ");
        System.out.println("1 : First name \n2 : Last name \n3 : Phone no \n4 : Email Id \n5 : Area \n6 : City \n7 : State \n8 : Zip");
        int choice = sc.nextInt();
        switch (choice) {
            case FIRST_NAME:
                System.out.println("Enter new first name ");
                String firstName = sc.next();
                contactMap.get(emailId).setFirstName(firstName);
                break;
            case LAST_NAME:
                System.out.println("Enter Last name = ");
                String lastName = sc.next();
                contactMap.get(emailId).setLastName(lastName);
                break;
            case PHONE_NUMBER:
                System.out.println("Enter Phone no = ");
                String phoneNo = sc.next();
                contactMap.get(emailId).setPhoneNumber(Long.parseLong(phoneNo));
                break;
            case EMAIL_ID:
                System.out.println("Enter Email Id = ");
                String newEmailId = sc.next();
                Contact c = contactMap.get(emailId);
                c.setEmailId(newEmailId);
                contactMap.remove(emailId);
                contactMap.put(newEmailId, c);
                break;
            case AREA:
                System.out.println("Enter Area = ");
                String area = sc.next();
                contactMap.get(emailId).getAddress().setArea(area);
                break;
            case CITY:
                System.out.println("Enter city = ");
                String city = sc.next();
                contactMap.get(emailId).getAddress().setCity(city);
                break;
            case STATE:
                System.out.println("Enter state = ");
                String state = sc.next();
                contactMap.get(emailId).getAddress().setState(state);
                break;
            case ZIP:
                System.out.println("Enter Zip = ");
                int zip = sc.nextInt();
                contactMap.get(emailId).getAddress().setZip(zip);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        System.out.println(contactMap.get(emailId));
    }

    public void deleteContact(String emailId) {
        System.out.println("Deleted : " + contactMap.remove(emailId));
    }

    @Override
    public String toString() {
        return " contactList = \n" + contactMap;
    }

}
