package patterns.factory;

public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing pepperoni pizza: dough, tomato sauce, mozzarella, pepperoni");
    }

    @Override
    public void bake() {
        System.out.println("Baking at 190°C for 18 minutes");
    }

    @Override
    public void cut() {
        System.out.println("Cutting into 6 slices (pepperoni is heavier)");
    }

    @Override
    public void box() {
        System.out.println("Placing in special pepperoni-branded box");
    }
}
