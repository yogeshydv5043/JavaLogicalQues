package patterns.factory;

public class PizzaShop {
    public static void main(String[] args) {
        PizzaStore dayStore = new DayPizzaStore();

        // Order Day style cheese pizza
        Pizza dayCheese = dayStore.orderPizza("cheese");
        
        // Order Day style pepperoni pizza
        Pizza dayPepperoni = dayStore.orderPizza("pepperoni");
    }
}