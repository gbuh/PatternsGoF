package behavioral.Observer;

public class Program {

    public static void main(String[] args) {
        VacancySite site = new VacancySite();

        site.addVacansy("1 vacancy");
        site.addVacansy("2 vacancy");
        
        Observer subsriber1 = new Suscriber("Igor");
        Observer subsriber2 = new Suscriber("Harry");
        
        site.addObserver(subsriber1);
        site.addObserver(subsriber2);
        
        site.addVacansy("New vacancy");
        site.removeVacansy("1 vacancy");
    }
}
