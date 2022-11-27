public class AddressBookMain {
    public static void main(String[] args) {
        AddressBookOperations operateAddressBook = new AddressBookOperations();
        operateAddressBook.addAddressBooks();
        AddressBook addressBook = operateAddressBook.selectAddressBook();
        if (addressBook != null)
            operateAddressBook.generateMenuToOperateAddressBook(addressBook);
    }
}
