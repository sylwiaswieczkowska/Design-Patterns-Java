package pl.sda.patterns.structural.adapter;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SocketClassAdapterImplTest {

    @Test
    void get120Volt() {

        //given
        SocketClassAdapterImpl sut = new SocketClassAdapterImpl();

        //when
        int volts = sut.get120Volt().getVolts();

        //then
        Assert.assertEquals(120, volts);

    }

    @Test
    void get12Volt() {

        //given
        SocketClassAdapterImpl sut = new SocketClassAdapterImpl();

        //when
        int volts = sut.get12Volt().getVolts();

        //then
        Assert.assertEquals(12, volts);
    }

    @Test
    void get3Volt() {

        //given
        SocketClassAdapterImpl sut = new SocketClassAdapterImpl();

        //when
        int volts = sut.get3Volt().getVolts();

        //then
        Assert.assertEquals(3, volts);
    }
}