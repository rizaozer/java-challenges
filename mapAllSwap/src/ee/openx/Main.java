package ee.openx;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String [] myStringArray = {"ab", "ac"};
        System.out.println(Arrays.toString(allSwap(myStringArray)));
    }

    public static String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if(!map.containsKey(strings[i].substring(0, 1))) {
                map.put(strings[i].substring(0, 1), i);
            } else {
                String temp = strings[map.get(strings[i].substring(0, 1))];
                strings[map.get(strings[i].substring(0, 1))] = strings[i];
                strings[i] = temp;
                map.remove(strings[i].substring(0, 1));
            }
        }
        return strings;
    }
}








