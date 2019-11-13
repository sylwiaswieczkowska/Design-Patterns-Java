package pl.sda.patterns.structural.decorator.fastfood;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class CheeseburgerTest {

    @Test
    void creatCheeseburgerWithBread() {

        //given
        Cheeseburger cheeseburger = new Cheeseburger("bread", BigDecimal.valueOf(9));
        Cheeseburger cheeseburger1 = new Cheeseburger(new Haumburger("bread",BigDecimal.valueOf(4)),BigDecimal.valueOf(5));

        //wnhen

        //then
    }
}