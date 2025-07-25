package patterns.observer;

public class ABPNews implements Observer{
    @Override
    public void update(String news) {
        System.out.println("ABPNews received:-> "+news);
    }
}
