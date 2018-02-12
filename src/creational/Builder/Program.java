package creational.Builder;

public class Program {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new EnterpriseWebsiteBuilder());

//        Website website = director.buildWebsite();
//        System.out.println(website);
        System.out.println(director.buildWebsite());
    }
}
