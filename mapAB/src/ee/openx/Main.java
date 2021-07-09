package ee.openx;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("a", "Hi");
        myMap.put("b", "There");
        System.out.println(mapAB(myMap));
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
            if (map.containsKey("a") && map.containsKey("b")) {
                map.put("ab", map.get("a") + map.get("b"));
            }
        return map;
    }
}
