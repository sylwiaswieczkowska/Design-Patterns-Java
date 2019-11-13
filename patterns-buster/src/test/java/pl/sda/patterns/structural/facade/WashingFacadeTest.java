package pl.sda.patterns.structural.facade;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertThrows;
import static org.testng.Assert.fail;

class WashingFacadeTest {

    @Test
    void shouldStartTheLaundryIfAllConditionsAreOk() {

        //given
        WashingFacade sut = new WashingFacade();
        //when
        //assertThrows(RuntimeException.class, sut::start);
        //when
        try{
            sut.start();
            fail();
        }catch(RuntimeException e){
            e.printStackTrace();
        }

        //then
        //TODO

    }

    @Test
    void shouldThrowExceptionIfDryingRackIsFull() {
    }
}