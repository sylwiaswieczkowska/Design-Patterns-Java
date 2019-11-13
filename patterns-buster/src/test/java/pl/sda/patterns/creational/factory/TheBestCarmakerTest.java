package pl.sda.patterns.creational.factory;


import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.sda.model.Calibra;
import pl.sda.model.Car;
import pl.sda.model.CarType;

import java.time.Year;

class TheBestCarmakerTest {
    @Test
    @DisplayName("Should return correct car based on given car type")
    void shouldReturnCorrectCarBasedOnGivenCarType() {
        //given
        TheBestCarmaker carmaker = new TheBestCarmaker();
        //when
        Car calibra = carmaker.makeCar4(CarType.CALIBRA, 5, "green", Year.of(2018));
        //then
        Assert.assertThat(calibra,
                CoreMatchers.is(new Calibra(5, "green", Year.of(2018))));
    }
}