package ee.openx;

public class Main {

    public static void main(String[] args) {
        String[] wordsArray1 = {"knighthood", "parental", "fridge", "clingfilm"}; // ➞ "parental"
        String[] wordsArray2 = {"coding", "crackers", "edabit", "celebration"}; // ➞ "celebration"
        String[] wordsArray3 = {"velocity", "mackerel", "woven", "kingsmen"}; //  ➞ ""
        System.out.println(longest7SegmentWord(wordsArray1));
        System.out.println(longest7SegmentWord(wordsArray2));
        System.out.println(longest7SegmentWord(wordsArray3));
    }

    public static String longest7SegmentWord(String[] wordsArray) {
        String longestWord = "";
        for (int i = 0; i < wordsArray.length; i++) {
            if(isContainForbiddenChar(wordsArray[i])) {
                if (countChars(wordsArray[i]) > longestWord.length()) {
                    longestWord = wordsArray[i];
                }
            }
        }
        return longestWord;
    }

    private static int countChars(String word) {
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            counter++;
        }
        return counter;
    }

    private static boolean isContainForbiddenChar(String word) {
        String [] forbiddenChars = {"k", "m", "v", "w", "x"};
        for (int i = 0; i < forbiddenChars.length; i++) {
            if(word.contains(forbiddenChars[i])) {
                return false;
            }
        }
        return true;
    }
}


