package patterns.factory;

public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing cheese pizza: dough, tomato sauce, mozzarella");
    }

    @Override
    public void bake() {
        System.out.println("Baking at 200°C for 15 minutes");
    }

    @Override
    public void cut() {
        System.out.println("Cutting into 8 slices");
    }

    @Override
    public void box() {
        System.out.println("Placing in official pizza box");
    }
}

