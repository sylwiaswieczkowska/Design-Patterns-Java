package pl.sda.patterns.creational.singleton;


public class LazyInitializedSingleton {
    private static PropertyLoader instance;

    private LazyInitializedSingleton() {
    }

    public static PropertyLoader getInstance() {
        if (instance == null){
            instance = new PropertyLoader();
            instance.init();
        }
        return instance;
    }
}
