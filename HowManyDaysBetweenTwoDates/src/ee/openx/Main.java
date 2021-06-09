package ee.openx;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert first date format 'yyyy-mm-dd': ");
        String dateBeforeString = scanner.nextLine();
        System.out.println("Please insert second date format 'yyyy-mm-dd': ");
        String dateAfterString = scanner.nextLine();

        //Parsing the date
        LocalDate dateBefore = LocalDate.parse(dateBeforeString);
        LocalDate dateAfter = LocalDate.parse(dateAfterString);

        //calculating number of days in between
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);

        //displaying the number of days
        System.out.println("The days betweed two dates: " + noOfDaysBetween);
    }
}
