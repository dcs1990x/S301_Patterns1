package Level_2.Exercise_1.model;

import Level_2.Exercise_1.model.products.Address;
import Level_2.Exercise_1.model.products.PhoneNumber;
import java.util.Objects;

public class Contact {

    private Address address;
    private PhoneNumber phoneNumber;

    public Contact(Address address, PhoneNumber phoneNumber){
        this.address = Objects.requireNonNull(address, "Address cannot be null. ");
        this.phoneNumber = Objects.requireNonNull(phoneNumber, "Phone number cannot be null. ");
    }

    public Address getAddress(){
        return this.address;
    }

    public PhoneNumber getPhoneNumber(){
        return this.phoneNumber;
    }

    public String toString(){
        return "Contact: " + System.lineSeparator() +
                "Phone Number = " + getPhoneNumber() + System.lineSeparator() +
                "Address = " + getAddress() + System.lineSeparator();
    }
}