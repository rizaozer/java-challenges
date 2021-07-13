package ee.openx;

public class Main {

    public static void main(String[] args) {
        System.out.println(validate("451352"));
    }

    public static boolean validate(String pin) {
        boolean valid = true;
        for (int i = 0; i < pin.length(); i++) {
            if(!Character.isDigit(pin.charAt(i))) {
                valid = false;
            }
        }
        if(!(pin.length() == 4 || pin.length() == 6)) {
            valid = false;
        }
        return valid;
    }
}
