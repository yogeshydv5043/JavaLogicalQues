package patterns.proxy;

public class RealInternet implements Internet {
    @Override
    public void connect(String site) {
        System.out.println("Connection successful in this site " + site);
    }
}
