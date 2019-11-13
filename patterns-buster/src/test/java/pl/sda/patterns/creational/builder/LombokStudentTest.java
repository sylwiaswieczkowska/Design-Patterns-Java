package pl.sda.patterns.creational.builder;

import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.junit.jupiter.api.Assertions.*;

class LombokStudentTest {

    @Test
    void builder() {
        LombokStudent lombokStudent = LombokStudent
                .builder()
                .firstName("")
                .lastName("")
                .pesel("")
                .birthYear(Year.now())
                .build();

        Student.Builder builder = new Student.Builder();
        Student buils1 = builder
                .withFirsName("name")
                .build();
    }
}