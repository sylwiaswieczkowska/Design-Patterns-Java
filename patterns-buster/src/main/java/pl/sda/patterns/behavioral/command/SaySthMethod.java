package pl.sda.patterns.behavioral.command;

public interface SaySthMethod {
    default  String saySth(String word) {
        System.out.println(word);
        return word;
    }
}
