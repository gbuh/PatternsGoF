package structural.Proxy;

public class MyProject implements Project {
    private String url;

    public MyProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Project " + url + " loading...");
    }

    @Override
    public void run() {
        System.out.println("Project " + url + " running...");
    }
}
