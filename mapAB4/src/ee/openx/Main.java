package ee.openx;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("a", "aaa");
        myMap.put("b", "bbb");
        myMap.put("c", "cake");
        System.out.println(mapAB(myMap));
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
            if (map.containsKey("a") && map.containsKey("b") && map.get("a").length() != map.get("b").length()) {
                if(map.get("a").length() > map.get("b").length()) {
                    map.put("c", map.get("a"));
                } else if(map.get("a").length() < map.get("b").length()) {
                    map.put("c", map.get("b"));
                }
            }
            if(map.containsKey("a") && map.containsKey("b") && map.get("a").length() == map.get("b").length()) {
            map.replace("a", "");
            map.replace("b", "");
            }
        return map;
    }
}
