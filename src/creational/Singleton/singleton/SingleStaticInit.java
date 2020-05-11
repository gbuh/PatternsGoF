package creational.Singleton.singleton;

public class SingleStaticInit {
    private static SingleStaticInit instance;

    static {
        instance = new SingleStaticInit();
    }

    private SingleStaticInit() {}

    public static SingleStaticInit getInstance() {
        return instance;
    }
}
