package pl.sda.patterns.behavioral.command;

//TODO refactor it using command pattern
public class SaySth {
    public String justSayIt(Object o) {
        if (o instanceof SayHi) {
            return ((SayHi) o).saySth(new SayHi().getHi());
        } else if (o instanceof SayNo) {
            return ((SayNo) o).saySth(new SayNo().getNo());
        } else if (o instanceof SayYes) {
            return ((SayYes) o).saySth(new SayYes().getYes());
        } else {
            throw new RuntimeException("Wrong object type");
        }
    }
   }
