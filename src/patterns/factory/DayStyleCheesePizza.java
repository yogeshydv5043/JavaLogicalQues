package patterns.factory;

public class DayStyleCheesePizza extends CheesePizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Day style cheese pizza: thin crust, extra cheese");
    }
}
