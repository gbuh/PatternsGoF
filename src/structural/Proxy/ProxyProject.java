package structural.Proxy;

public class ProxyProject implements Project {
    private String url;
    private MyProject myProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (myProject == null) {
            myProject = new MyProject(url);
        }
        myProject.run();
    }
}
