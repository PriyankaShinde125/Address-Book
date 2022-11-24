import java.util.HashMap;
import java.util.Map;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to address book");
        HashMap<String, Contact> addressBook = new HashMap<>();
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
        addressBook.put(contact.getFirstName() + contact.getLastName(), contact);
        System.out.println(addressBook.get(contact.getFirstName() + contact.getLastName()));
    }
}
