package Level_2.Exercise_1.model.factory;

import Level_2.Exercise_1.model.products.Address;
import Level_2.Exercise_1.model.products.PhoneNumber;
import Level_2.Exercise_1.model.products.SpanishAddress;
import Level_2.Exercise_1.model.products.SpanishPhoneNumber;

public class SpanishContactFactory implements CountryContactFactory {

    @Override
    public Address createAddress(String street, int block, int floor, int door, String municipality, String zip_code, String province, String country) {
        return new SpanishAddress(street, block, floor, door, municipality, zip_code, province, country);
    }

    @Override
    public PhoneNumber createPhoneNumber(String number) {
        return new SpanishPhoneNumber(number);
    }
}