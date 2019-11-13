package pl.sda.patterns.behavioral.command;

public class SayNo implements SaySthMethod{

    private final String NO = "no!";

    public String getNo() {
        return NO;
    }

   /* public String no() {
        System.out.println("no!");
        return "no!";
    }*/
}
