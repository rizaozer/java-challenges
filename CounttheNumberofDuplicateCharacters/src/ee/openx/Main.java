package ee.openx;

public class Main {

    public static void main(String[] args) {
//        System.out.println(duplicateCount("aabbcadea")); // -> 3
//        System.out.println(duplicateCount("aiiuaiddudrizz")); // -> 2
        System.out.println(duplicateCount("Indivisibilities")); // -> 0
    }

    public static int duplicateCount(String myText) {
        int count = 0;
        int tempCount = 1;
        for (int i = 0; i < myText.length(); i++) {
            i = 0;
            for (int j = i + 1; j < myText.length(); j++) {
                if (myText.charAt(i) == myText.charAt(j)) {
                    tempCount++;
                }
            }
            System.out.println(myText + " " + count);
            if(tempCount == 2) {
                count++;
            }
            myText = myText.replaceAll(myText.substring(i, i + 1), "");
            tempCount = 1;
        }
        return count;
    }
}
