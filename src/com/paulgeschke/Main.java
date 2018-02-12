package com.paulgeschke;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        System.out.println("Today's Date: " + dtf.format(today));
        LocalDateTime fullMoon = LocalDateTime.of(2018, 3, 1, 17, 52, 10);
        double secondsPerCycle = ((29 * 24 * 60 *60)+(12 * 60 * 60)+(44*60));
        LocalDateTime nextFullMoon= fullMoon;
        while (nextFullMoon.isBefore(today)){
            nextFullMoon= nextFullMoon.plusSeconds((long)secondsPerCycle);
        }
        System.out.println("Next Full Moon Date: " + dtf.format(nextFullMoon));
    }
}
