package ee.openx;

public class Main {

    public static void main(String[] args) {
	    textToNum("(325)444-TEST");
    }

    public static void textToNum(String phoneNumber) {
        String convertedString = "";
        for (int i = 0; i < phoneNumber.length(); i++) {
            if ((Character.isDigit(phoneNumber.charAt(i))) || (phoneNumber.charAt(i) == '-') ||
                    (phoneNumber.charAt(i) == '(') || (phoneNumber.charAt(i) == ')')) {
                convertedString = convertedString + phoneNumber.charAt(i);
            } else {
                switch (phoneNumber.charAt(i)) {
                    case 'A':
                    case 'B':
                    case 'C':
                        convertedString += 2;
                        break;
                    case 'D':
                    case 'E':
                    case 'F':
                        convertedString += 3;
                        break;
                    case 'G':
                    case 'H':
                    case 'I':
                        convertedString += 4;
                        break;
                    case 'J':
                    case 'K':
                    case 'L':
                        convertedString += 5;
                        break;
                    case 'M':
                    case 'N':
                    case 'O':
                        convertedString += 6;
                        break;
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                        convertedString += 7;
                        break;
                    case 'T':
                    case 'U':
                    case 'V':
                        convertedString += 8;
                        break;
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                        convertedString += 9;
                        break;
                }
            }
        }
        System.out.println(convertedString);
    }
}
