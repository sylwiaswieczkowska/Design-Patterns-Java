package pl.sda.patterns.creational.singleton;


public class StaticBlockSingleton {

    private static PropertyLoader instance = new PropertyLoader();

    private StaticBlockSingleton() {
    }

    public static PropertyLoader getInstance() {
        instance.init();
        return instance;
    }
}
