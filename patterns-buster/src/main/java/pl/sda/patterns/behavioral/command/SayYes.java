package pl.sda.patterns.behavioral.command;

public class SayYes implements SaySthMethod{

    private final String YES = "yes!";

    public String getYes() {
        return YES;
    }
    /*
    public String yes() {
        System.out.println("yes!");
        return "yes!";
    }*/
}
