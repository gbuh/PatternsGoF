package creational.Singleton.singleton;

public class SingleClassic {
    private static SingleClassic insrance;

    private SingleClassic() {}
//    --synchronized version--
//    public static synchronized SingleClassic getInstance() { ...
    public static SingleClassic getInstance() {
        if (insrance == null) {
            insrance = new SingleClassic();
        }
        return insrance;
    }
}
