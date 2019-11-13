package pl.sda.patterns.structural.decorator.fastfood;

import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;

@Data
public abstract class Burger {

    @NonNull
    private String bread;
    @NonNull
    private BigDecimal price;

    protected void orderSummary(){
        System.out.println("You ordered:"
        + this.getClass().getSimpleName()
        + " the summary: "
        +this.price); }
}
