package Level_2.Exercise_1.model.factory;

import Level_2.Exercise_1.model.products.*;

public class PortugueseContactFactory implements CountryContactFactory {

    @Override
    public Address createAddress(String... data) {
        return new PortugueseAddress(data);
    }

    @Override
    public PhoneNumber createPhoneNumber(String number) {
        return new PortuguesePhoneNumber(number);
    }
}