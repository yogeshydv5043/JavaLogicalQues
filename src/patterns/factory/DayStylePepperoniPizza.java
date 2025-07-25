package patterns.factory;

public class DayStylePepperoniPizza extends PepperoniPizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Day style pepperoni pizza: thin crust, extra cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting into square slices (Day Style)");
    }
}
