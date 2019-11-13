package pl.sda.patterns.structural.bridge;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import pl.sda.patterns.structural.bridge.color.BlueColor;
import pl.sda.patterns.structural.bridge.color.Color;
import pl.sda.patterns.structural.bridge.color.ColorType;

class ShapeTest {

    @Test
    void shouldCorrectlyFillTheColor() {

        //given
        Diamond diamond = new Diamond(new BlueColor());

        //when
        Color color = diamond.getColor();

        //then
        Assert.assertEquals(ColorType.BLUE,color.getMyColor());
    }
}