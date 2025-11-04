package Level_2.Exercise_1;

import Level_2.Exercise_1.model.Agenda;
import Level_2.Exercise_1.model.factory.*;
import Level_2.Exercise_1.model.products.*;

public class RunMain {
    public static void run(){

        Agenda agenda = new Agenda();

        CountryContactFactory spanishContactFactory = new SpanishContactFactory();
        Address spanishAddress1 = spanishContactFactory.createAddress("Carrer de Mallorca", "401", "1", "2", "Barcelona", "08013", "Barcelona", "Spain");
        PhoneNumber spanishPhoneNumber1 = spanishContactFactory.createPhoneNumber("666856351");
        agenda.addContact(spanishAddress1, spanishPhoneNumber1);

        CountryContactFactory portugueseContactFactory = new PortugueseContactFactory();
        Address portugueseAddress1 = portugueseContactFactory.createAddress("Avenida dos Aliados", "123", "2", "2", "Oporto", "4049-001", "Oporto", "Portugal");
        PhoneNumber portuguesePhoneNumber1 = portugueseContactFactory.createPhoneNumber("355145236");
        agenda.addContact(portugueseAddress1, portuguesePhoneNumber1);

        agenda.showAllContactsInfo();
    }
}