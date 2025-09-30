package Level_2.Exercise_1.model.products;

public class PortuguesePhoneNumber implements PhoneNumber {

    private String number;

    public PortuguesePhoneNumber(String number){
        if (number.length() != 9){
            throw new IllegalArgumentException("Phone number length should be of 9 digits. ");
        }
        this.number = number;
    }

    @Override
    public String getContactPhoneNumber(){
        return "+351" + " " + this.number;
    }
}