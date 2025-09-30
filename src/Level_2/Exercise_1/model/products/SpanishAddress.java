package Level_2.Exercise_1.model.products;

public class SpanishAddress implements Address {

    private String street, zip_code, municipality, province, country;
    private int block, floor, door;

    public SpanishAddress(String street, int block, int floor, int door, String municipality, String zip_code, String province, String country){
        this.street = street;
        this.block = block;
        this.floor = floor;
        this.door = door;
        this.municipality = municipality;
        this.zip_code = zip_code;
        this.province = province;
        this.country = country;
    }

    @Override
    public String getContactAddress(){
        return this.street + " " + this.block + ", " + this.floor + "-" + this.door + ", " + this.municipality + ", " + this.zip_code + ", " +
                this.province + ", " + this.country + System.lineSeparator();
    }
}