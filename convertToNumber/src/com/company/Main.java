package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> items = new HashMap<>();
        items.put( "piano", "200");
        items.put( "tv", "300");
        items.put( "stereo", "400");

        System.out.println(convertToNumber(items));
    }

    public static HashMap convertToNumber(HashMap<String, String> items) {
        HashMap<String, Integer> convertedHashMap = new HashMap<>();

        for (Map.Entry values : convertedHashMap.entrySet()) {
            System.out.println(values.getKey() + "= " + values.getKey().getClass().getSimpleName());
            System.out.println(values.getValue() + "= " + values.getValue().getClass().getSimpleName());
            System.out.println();
        }


        for (Map.Entry value : items.entrySet()) {
            for (int i = 0; i < items.size(); i++) {
                int tempInt = Integer.parseInt((String) value.getValue());
                convertedHashMap.put((String) value.getKey(), tempInt);
            }
        }

        for (Map.Entry values : convertedHashMap.entrySet()) {
            System.out.println(values.getKey() + "= " + values.getKey().getClass().getSimpleName());
            System.out.println(values.getValue() + "= " + values.getValue().getClass().getSimpleName());
            System.out.println();
        }

        return items;
    }
}
