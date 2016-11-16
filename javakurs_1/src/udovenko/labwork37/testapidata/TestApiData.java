package udovenko.labwork37.testapidata;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Created by gladi on 16.11.2016.
 */
public class TestApiData {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate myBirthDay = LocalDate.parse("1976-08-14");
        int myAge = myBirthDay.until(today).getYears();
        LocalDate currentYearBD = myBirthDay.withYear(today.getYear());

        System.out.println("Today is: " + today);
        System.out.printf("I was born at: %s. It was at %s.\n", myBirthDay, myBirthDay.getDayOfWeek());
        System.out.printf("I am %d old now\n", myAge);
        System.out.printf("In current year I %s my birthday at %s\n",
                Period.between(today, currentYearBD).isNegative() ? "celebrated" : "will celebrate",
                currentYearBD.getDayOfWeek());
        System.out.println();

        //Define a new date and time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/y HH:mm:ss (VV)");

        //Determine the current date and time for the multiple time-zones and output them in a new format
        Instant instant = Instant.now();
        System.out.println(ZonedDateTime.ofInstant(instant, ZoneId.of("America/New_York")).format(formatter));
        System.out.println(ZonedDateTime.ofInstant(instant, ZoneId.of("Asia/Tokyo")).format(formatter));
        System.out.println(ZonedDateTime.ofInstant(instant, ZoneId.of("Europe/Kiev")).format(formatter));
    }
}
