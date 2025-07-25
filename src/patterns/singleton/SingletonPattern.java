package patterns.singleton;

public class SingletonPattern {

    private static SingletonPattern instance; // Single instance

    private SingletonPattern() {
    } //private constructor

    public static SingletonPattern getInstance() {

        if (instance == null) {
            instance = new SingletonPattern(); // if call first than create a instance
        }
        return instance;

    }
}
