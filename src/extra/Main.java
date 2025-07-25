package extra;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<String,String> getRecord(String record){
        Map<String ,String> values=new HashMap<>();

        for(ROLE str:ROLE.values()){
            if(str.name().equalsIgnoreCase(record)){
                values.put(record, record + "," + record);
                break;
            }
        }
        return values;
    }

    public static void main(String[] args) {

        String name="ADMIN";

        Map<String,String> values=getRecord(name);
        System.out.println("Values : "+values);

    }
}
