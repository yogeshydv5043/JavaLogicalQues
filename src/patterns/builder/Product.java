package patterns.builder;

public class Product {
    private final String name;
    private final String model;
    private final Integer qty;
    private final double price;
    private final boolean isStock; // Optional (default: false)

    // PRIVATE constructor (only Builder can create)
    private Product(Builder builder) {
        this.name = builder.name;
        this.model = builder.model;
        this.qty = builder.qty;
        this.price = builder.price;
        this.isStock = builder.isStock;
    }

    // Builder class
    public static class Builder {
        private String name;
        private String model;
        private Integer qty = 0;
        private double price = 0.0;
        private boolean isStock = false;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }


        public Builder qty(Integer qty) {
            this.qty = qty;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder isStock(boolean isStock) {
            this.isStock = isStock;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "isStock=" + isStock +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
