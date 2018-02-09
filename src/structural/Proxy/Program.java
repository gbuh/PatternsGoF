package structural.Proxy;

public class Program {

    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/gbuh/PatternsGoF");
        project.run();
    }
}
