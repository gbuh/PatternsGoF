package structural.Adapter;

public class Program {

    public static void main(String[] args) {
//        JavaApplication javaApplication = new JavaApplication();
//        Database adaptJavaApp = new AdapterOne(javaApplication);
        Database adaptJavaApp = new AdapterTwo();

        adaptJavaApp.insert();
        adaptJavaApp.select();
        adaptJavaApp.update();
        adaptJavaApp.delete();
    }
}
