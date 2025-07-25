package patterns.factory;

public abstract class PizzaStore {
    
    // The Factory Method (to be implemented by subclasses)
    protected abstract Pizza createPizza(String type);
    
    // Template method that uses the factory method
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        
        System.out.println("\n--- Making a " + type + " pizza ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
}