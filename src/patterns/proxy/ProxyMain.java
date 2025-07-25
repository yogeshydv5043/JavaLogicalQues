package patterns.proxy;

public class ProxyMain {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connect("google.com");
            internet.connect("facebook.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
