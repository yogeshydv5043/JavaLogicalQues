package patterns.observer;

public class AajTakNews implements Observer{
    @Override
    public void update(String news) {
        System.out.println("AajTak received:-> "+news);
    }
}
