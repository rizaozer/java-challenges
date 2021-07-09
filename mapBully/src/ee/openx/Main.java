package ee.openx;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("a", "candy");
        myMap.put("b", "dirt");
        System.out.println(mapBully(myMap));
    }

    public static Map<String, String> mapBully(Map<String, String> map) {
        if(map.containsKey("a")) {
            map.replace("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}
