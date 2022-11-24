import java.util.HashMap;

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

    @Override
    public String toString() {
        return " contactList = \n" + contactList;
    }
}
