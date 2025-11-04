package Level_2.Exercise_1.model.factory;

import Level_2.Exercise_1.model.products.Address;
import Level_2.Exercise_1.model.products.PhoneNumber;

public interface CountryContactFactory {

    Address createAddress(String... data);
    PhoneNumber createPhoneNumber(String number);
}