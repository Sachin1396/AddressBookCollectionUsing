import java.util.Scanner;

public class AddressBook {
    Contacts contacts = new Contacts();
    public void addContact(){
        Scanner scanner = new Scanner(System.in);
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
        System.out.println(contacts);
    }
}
