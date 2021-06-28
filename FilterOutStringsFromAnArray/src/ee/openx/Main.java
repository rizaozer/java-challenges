package ee.openx;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Object> sections = new ArrayList <>();
        sections.add("21s0sd3");
        sections.add(2);
        sections.add("aasf");
        sections.add("1");
        sections.add("2");
        sections.add("123");
        sections.add(123);
        System.out.println(filterArray(sections));
    }

    public static List<Integer> filterArray(List<Object> sections) {
        List<Integer> numbers = new ArrayList <>();
        for (int i = 0; i < sections.size(); i++) {
            String myString = "";
            for (int j = 0; j < sections.get(i).toString().length(); j++) {
                if(Character.isDigit(sections.get(i).toString().charAt(j))) {
                    myString = myString + sections.get(i).toString().charAt(j);
                }
            }
            int myNumber = 0;
            boolean flag = false;
            for (int k = 0; k < myString.length(); k++) {
                if(Character.isDigit(myString.charAt(k))) {
                    flag = true;
                }
            }
            if(flag) {
                myNumber = Integer.parseInt(myString);
            }
            if(!numbers.contains(myNumber)) {
                numbers.add(myNumber);
            }
        }
        return numbers;
    }
}
