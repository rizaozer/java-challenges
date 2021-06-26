package ee.openx;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Object> sections = new ArrayList <>();
        sections.add(1);
        sections.add(2);
        sections.add("aasf");
        sections.add("1");
        sections.add("123");
        sections.add(123);
        System.out.println(Arrays.toString(filterArray(sections)));
    }

    public static int [] filterArray(List<Object> sections) {
        int [] numbersArray = new int[1];
        numbersArray[0] = (int) sections.get(0);
//        for (int i = 0; i < sections.size(); i++) {
//           sections.get(i);
//        }
        return numbersArray;
    }
}
