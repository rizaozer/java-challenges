package com.codermoder;

public class Main {

    public static void main(String[] args) {
        System.out.println(isParselTongue("You ssseldom sssspeak sso boldly, ssso messmerizingly.")); // true
        System.out.println(isParselTongue("She ssselects to eat that apple. ")); // false
    }

    public static boolean isParselTongue(String text) {
        boolean flag = true;
        for (int i = 1; i < text.length() - 1; i++) {
            if(!(text.substring(i - 1, i).toLowerCase().equals("s")) &&
            (text.substring(i, i + 1).toLowerCase().equals("s")) &&
                    !(text.substring(i + 1, i + 2).toLowerCase().equals("s"))) {
                flag = false;
            }
        }
        return flag;
    }
}
