package Level_2.Exercise_1.model.products;

import java.util.Arrays;
import java.util.List;

public class SpanishAddress implements Address {

    private List<String> data;

    public SpanishAddress(String... data){
        this.data = Arrays.asList(data);
    }

    @Override
    public String getContactAddress() {
        return String.join(", ", data);
    }
}