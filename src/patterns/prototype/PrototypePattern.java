package patterns.prototype;

public class PrototypePattern implements Cloneable {
    // implement Cloneable interface

    private String name;
    private String model;

    public PrototypePattern(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "PrototypePattern{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public PrototypePattern clone() {  //override the clone method
        try {
            return (PrototypePattern) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public static void main(String[] args) {
        PrototypePattern original = new PrototypePattern("BMW", "S7"); //Original
        PrototypePattern clone = original.clone(); // create clone using original instance
        System.out.println("Original :-> " + original);
        System.out.println("Clone :-> " + clone);
    }
}
