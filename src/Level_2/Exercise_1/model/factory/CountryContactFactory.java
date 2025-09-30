package Level_2.Exercise_1.model.factory;

import Level_2.Exercise_1.model.products.Address;
import Level_2.Exercise_1.model.products.PhoneNumber;

public interface CountryContactFactory {

    Address createAddress(String street, int block, int floor, int door, String municipality, String zip_code, String province, String country);
    PhoneNumber createPhoneNumber(String number);
}