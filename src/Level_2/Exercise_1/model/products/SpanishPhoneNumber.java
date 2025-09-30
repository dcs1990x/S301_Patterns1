package Level_2.Exercise_1.model.products;

public class SpanishPhoneNumber implements PhoneNumber {

    private String number;

    public SpanishPhoneNumber(String number){
        if (number.length() != 9){
            throw new IllegalArgumentException("Phone number length should be of 9 digits. ");
        }
        this.number = number;
    }

    @Override
    public String getContactPhoneNumber(){
        return "+34" + " " + this.number;
    }
}