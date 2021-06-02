package ee.openx;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<Integer> ints = new ArrayList<>();
	    ints.add(1);
	    ints.add(2);
	    ints.add(3);
	    ints.add(4);
	    ints.add(5);
	    ints.add(6);
	    ints.add(7);
        System.out.println(countEvens(ints));
    }

    public static int countEvens(List<Integer> integerList) {
        int counter = 0;
        for (int i = 0; i < integerList.size(); i++) {
            if(integerList.get(i) % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }
}
