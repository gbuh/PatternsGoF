package behavioral.Observer;

import java.util.List;

public class Suscriber implements Observer {
    String name;
    
    public Suscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nwe have some changes in vacancies" + vacancies + 
                "\n=====================================================\n");
    }
}
