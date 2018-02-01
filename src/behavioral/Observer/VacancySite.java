package behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class VacancySite implements Observable {
    List<String> vacansies = new ArrayList<>();

    List<Observer> subcribers = new ArrayList<>();

    public void addVacansy(String vacancy) {
        this.vacansies.add(vacancy);
        notifyObservers();
    }

    public void removeVacansy(String vacancy) {
        this.vacansies.remove(vacancy);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        this.subcribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subcribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : subcribers) {
            observer.handleEvent(this.vacansies);
        }

    }

}
