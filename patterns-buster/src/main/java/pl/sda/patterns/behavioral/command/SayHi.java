package pl.sda.patterns.behavioral.command;

public class SayHi implements SaySthMethod{

    private final String HI = "Hi!";

    public String getHi() {
        return HI;
    }
    /*public String hi() {
        System.out.println("hi!");
        return "hi!";
    }*/
}
