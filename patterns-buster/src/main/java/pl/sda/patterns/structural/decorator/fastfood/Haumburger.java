package pl.sda.patterns.structural.decorator.fastfood;

import lombok.NonNull;

import java.math.BigDecimal;

public class Haumburger extends Burger {

    public Haumburger(@NonNull String bread, @NonNull BigDecimal price) {
        super(bread, price);
    }
}
