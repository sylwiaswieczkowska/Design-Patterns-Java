package pl.sda.patterns.structural.decorator.fastfood;

import lombok.NonNull;

import java.math.BigDecimal;

public class Cheeseburger extends Haumburger {

    public Cheeseburger(@NonNull String bread, @NonNull BigDecimal price) {
        super(bread, price);
    }
    public Cheeseburger(Haumburger haumburger, BigDecimal price){
        super(haumburger.getBread(), price);
    }

    public void addIngredient(){
        BigDecimal newPrice = this.getPrice().multiply(BigDecimal.valueOf(5));
        this.setPrice(newPrice);
    }
    //Decorate
    public  void extraCOMMUNICAT(){
        super.orderSummary();
        System.out.println(" Extra communicat");
    }

}
