package patterns.builder;

public class BuilderMain {

    public static void main(String[] args) {
        System.out.println("-----------------BUILDER PATTERN--------------------");
        Product product = new Product.Builder().name("Ear Buds").model("Z2 Wired").price(500.80).qty(30).isStock(true).build();
        System.out.println("PRODUCT DETAILS : " + product);
        User user = new User.Builder().id("USER_1001").name("Yogi").role("Java Developer").salary(50000).isActive(true).build();
        System.out.println("  ");
        System.out.println("USER DETAILS : " + user);
        Employee employee = new Employee.Builder().name("Yogesh").profile("Java Developer").department("Software Developer").salary(35000).isActive(true).build();
        System.out.println("  ");
        System.out.println("EMPLOYEE DETAILS : " + employee);

    }
}
