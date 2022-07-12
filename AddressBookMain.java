public class AddressBookMain {
    public static  void main(String[] args){
        System.out.println("Welcome to a address book program");
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.editContact();
    }
}
