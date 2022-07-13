import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Contacts contacts;
    Scanner scanner = new Scanner(System.in);
    ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
    public void addContact(){
       // Scanner scanner = new Scanner(System.in);
        contacts = new Contacts();
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
        arrayList.add(contacts);
        //System.out.println(contacts);
    }
    public void displayContact()
    {
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i)+"");
        }
    }
    //editing contact based on person name
    public void editContact() {
        System.out.println("Enter the first name");
        String firstName = scanner.nextLine();
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
            System.out.println(contacts);
        } else {
            System.out.println("contact is not found");
        }
    }
        //Deleting the contact based on firstName
        public void deleteContact(){
            System.out.println("enter the first name");
            String firstName = scanner.nextLine();
            if(firstName.equalsIgnoreCase(contacts.getFirstName())){
                System.out.println("deleting the contact list as first name matched ");
                contacts = null;

            }
            else {
                System.out.println("contact not deleted as first name not matched ");
            }
        }
    }

