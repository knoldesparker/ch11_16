import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Marty","206-9024");
        stringMap.put("Hawking","123-1234");
        stringMap.put("Smith","949-0504");
        stringMap.put("Newton","123-1234");

        System.out.println(is1to1(stringMap));

    }
    public static boolean is1to1(Map<String,String> map){
        Map<String, String> temp = new HashMap<>();

        for (Map.Entry<String,String> s : map.entrySet()){
            if (temp.containsValue(s.getValue())){
                System.out.println("false");
                System.out.println(temp);
                return false;
            } else {
                temp.put(s.getKey(),s.getValue());
            }
        }
        System.out.println("true");
        System.out.println(temp);
        return true;
    }

}
