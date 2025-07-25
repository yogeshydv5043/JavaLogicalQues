package patterns.builder;

public class User {

    private String id;

    private String name;

    private String role;

    private boolean isActive;

    private double salary;


    private User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.role = builder.role;
        this.isActive = builder.isActive;
        this.salary = builder.salary;
    }


    public static class Builder {
        private String id;

        private String name;

        private String role;

        private boolean isActive = false;

        private double salary = 0.0;


        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public Builder isActive(boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public Builder salary(double salary) {
            this.salary = salary;
            return this;
        }

        public User build() {
            return new User(this);
        }


    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", isActive=" + isActive +
                ", salary=" + salary +
                '}';
    }
}
