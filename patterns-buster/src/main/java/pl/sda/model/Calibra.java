package pl.sda.model;

import org.checkerframework.checker.units.qual.C;

import java.time.Year;

public class Calibra extends Car {
    public Calibra(int door, String color, Year productionYear) {
        super(door, color, productionYear);
    }
    public Calibra(){
        super();
    }

}
