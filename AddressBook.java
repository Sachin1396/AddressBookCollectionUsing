import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    Contacts contacts;
    Scanner scanner = new Scanner(System.in);
    //AddressBook addressBook = new AddressBook();
   static HashMap<String,Contacts> addressBookMap = new HashMap<>();
    ArrayList<Contacts> list = new ArrayList<Contacts>();
    AddressBookMain addressBookMain = new AddressBookMain();

    public Contacts addContact() {

        // Scanner scanner = new Scanner(System.in);
        contacts = new Contacts();
        System.out.println("Enter the first name");
        contacts.setFirstName(scanner.next());
        System.out.println("enter the last name");
        contacts.setLastName(scanner.next());
        System.out.println("enter the city");
        contacts.setCity(scanner.next());
        System.out.println("enter the state");
        contacts.setState(scanner.next());
        System.out.println("enter the zipcode");
        contacts.setZipCode(scanner.next());
        System.out.println("eneter the email");
        contacts.setEmail(scanner.next());
        System.out.println("enter the phone number");
        contacts.setPhoneNumber(scanner.next());
        //System.out.println(contacts);
        //list.add(contacts);
        System.out.println("enter the address book name");
        String name = scanner.next();
       // if(addressBookMap.containsKey(name))
        addressBookMap.put(name,contacts);
        System.out.println(contacts);
        return contacts;
    }

    public void displayContact() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + "");
        }
        System.out.println(addressBookMap);



    }
    public void duplicateEntry(){
        boolean flag = false;
        Contacts personDetails = addContact();
        for (Contacts objPerson : list) {
            if (objPerson.getFirstName().equals(personDetails.getFirstName())) {
                flag = true;
            }
        }
        if (!flag) {
            list.add(personDetails);

        } else {
            System.out.println("First Name already exist..");
        }
    }


    //editing contact based on person name
    public void editContact() {
        System.out.println("Enter the first name");
        String firstName = scanner.nextLine();
        for (Contacts contacts : list) {
            if (firstName.equalsIgnoreCase(contacts.getFirstName())) {
                System.out.println("Enter the first name");
                contacts.setFirstName(scanner.nextLine());
                System.out.println("enter the last name");
                contacts.setLastName(scanner.nextLine());
                System.out.println("enter the city");
                contacts.setCity(scanner.nextLine());
                System.out.println("enter the state");
                contacts.setState(scanner.nextLine());
                System.out.println("enter the zipcode");
                contacts.setZipCode(scanner.nextLine());
                System.out.println("eneter the email");
                contacts.setEmail(scanner.nextLine());
                System.out.println("enter the phone number");
                contacts.setPhoneNumber(scanner.nextLine());
                //System.out.println(contacts);
            } else {
                System.out.println("contact is not found");
            }
        }
    }
        //Deleting the contact based on firstName
        public void deleteContact() {
            System.out.println("Enter the first name");
            String firstName = scanner.next();

            for (Contacts contacts : list) {
                if (firstName.equalsIgnoreCase(contacts.getFirstName())) {
                    System.out.println("Contact Deleted ");
                    contacts = null;
                } else {
                    System.out.println("contact not deleted as first name not matched ");
                }
            }
        }
    }


