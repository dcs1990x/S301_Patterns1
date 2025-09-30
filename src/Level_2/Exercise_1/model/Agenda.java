package Level_2.Exercise_1.model;

import Level_2.Exercise_1.model.products.Address;
import Level_2.Exercise_1.model.products.PhoneNumber;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

   private List<Contact> contactsList = new ArrayList<>();

    public void addContact(Address address, PhoneNumber phoneNumber){
        Contact newContact = new Contact(address, phoneNumber);
        validateContact(newContact, contactsList);
        contactsList.add(newContact);
    }

    public void deleteContact(Contact newContact){
        if (!contactsList.contains(newContact)){
            throw new IllegalArgumentException("This contact does not exist");
        }
        contactsList.remove(newContact);
    }

    public void showAllContactsInfo(){
        for (Contact contactInAgenda : contactsList){
            System.out.println("Contact: ");
            System.out.println("Phone number = " + contactInAgenda.getPhoneNumber().getContactPhoneNumber());
            System.out.println("Address = " + contactInAgenda.getAddress().getContactAddress());
        }
    }

    public static void validateContact(Contact newContact, List<Contact> contacts) {
        if (contacts.contains(newContact)) {
            throw new IllegalArgumentException("This contact already exists. ");
        }
    }
}