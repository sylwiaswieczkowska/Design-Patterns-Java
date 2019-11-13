package pl.sda.patterns.creational.builder;

import lombok.Builder;
import lombok.NonNull;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;

@Builder
public class LombokStudent {
    //Required Parameters
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String pesel;
    @NonNull
    private Year birthYear;

    //Optional Parameters
    @NonNull
    private Month birthMonth;
    @NonNull
    private DayOfWeek birthDayOfWeek;
    @NonNull
    private Boolean scholarship;
}
