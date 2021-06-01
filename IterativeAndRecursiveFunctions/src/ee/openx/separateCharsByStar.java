package ee.openx;

public class separateCharsByStar {

    public static void main(String[] args) {

       // 2. Given a string, compute a new string where all the adjacent chars and not separated by a "*".
        System.out.println("Iterative function: ");
        printStringArray(separateChars_Iterate("RizaOzer", "*", 1));

        System.out.println();

        System.out.println("Recursion function: ");
        printStringArray(separateChars_Recursive("RizaOzer", "*", 0));
    }

    public static String[] separateChars_Iterate(String originalText, String stringToBeInserted, int index) {
        String[] text = new String[originalText.length()];
        for (int i = 0; i < originalText.length(); i++) {
            if (i < originalText.length() - 1) {
                text[i] = originalText.substring(i, index + i) + stringToBeInserted;
            } else {
                text[i] = originalText.substring(i, index + i);
            }
        }
        return text;
    }

    private static final String[] text = new String[8];
    public static String[] separateChars_Recursive(String originalText, String stringToBeInserted, int index) {
        if (index == originalText.length()) {
            return text;
        } else {
            if(index < originalText.length() - 1) {
                text[index] = originalText.substring(index, (index + 1)) + stringToBeInserted;
                separateChars_Recursive(originalText, "*", index + 1);
            } else {
                text[index] = originalText.substring(index, (index + 1));
                separateChars_Recursive(originalText, "*", index + 1);
            }
        }
        return text;
    }

        public static void printStringArray (String[]text){
            for (String s : text) {
                System.out.print(s);
            }
        }
    }
