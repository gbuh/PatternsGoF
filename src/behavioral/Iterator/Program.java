package behavioral.Iterator;

public class Program {

    public static void main(String[] args) {
        String[] skills = {"Java", "C#", "MySQL"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Igor", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer" + javaDeveloper.getName());
        System.out.print("Skills: ");

        while(iterator.hasNext()) {
            System.out.print(iterator.next().toString() + ", ");
        }
    }
}
