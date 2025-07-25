package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {

    List<Observer> observers = new ArrayList<>();
    String news;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(news);
        }
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }
}
