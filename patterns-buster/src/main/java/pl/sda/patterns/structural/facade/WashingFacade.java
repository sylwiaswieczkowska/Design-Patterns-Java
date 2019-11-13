package pl.sda.patterns.structural.facade;

//TODO implement all steps necessary to do the laundry
public class WashingFacade {

    private DryingRack dryingRack = new DryingRack();
    private LaundryBasket basket = new LaundryBasket();
    private WashingMachine machine = new WashingMachine();

    //TODO
    public void start() {
        basket.emptyOut();
        machine.loadLaundry();
        machine.setTemperature(40);
        machine.chooseProgram();
        machine.start();
    }

    //TODO
    public void stop() {
        machine.stop();
        machine.extractLaundry();
        dryingRack.removeOldLaundry();
        dryingRack.hangLaundry();
    }
}
