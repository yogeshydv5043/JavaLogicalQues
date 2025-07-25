package patterns.factory;

public class DayPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        return switch (type.toLowerCase()) {
            case "cheese" -> new DayStyleCheesePizza();
            case "pepperoni" -> new DayStylePepperoniPizza();
            default -> throw new IllegalArgumentException("Unknown NY pizza type: " + type);
        };
    }
}



