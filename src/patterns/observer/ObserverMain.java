package patterns.observer;

public class ObserverMain {

    public static void main(String[] args) {

        System.out.println("--------------Observer----------------");
        NewsAgency newsAgency = new NewsAgency();
        Observer aajTak=new AajTakNews();
        Observer abpNews=new ABPNews();

        newsAgency.addObserver(aajTak);
        newsAgency.addObserver(abpNews);

        newsAgency.setNews("Breaking News : Observer Pattern is working properly ..");

    }
}
