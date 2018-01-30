package creational.Prototype;

public class Program {

    public static void main(String[] args) {
        Project master = new Project(1, "Master Project", "SourceCode sourceCode = new SourceCode();");
        
        System.out.println(master);
        
        ProjectFactory factory = new ProjectFactory(master);
        Project masterCopy = factory.cloneProject();
        
        System.out.println("=======================================================");
        System.out.println(masterCopy);
    }
}
