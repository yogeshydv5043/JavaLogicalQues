package patterns.builder;

public class Employee {

    private String name;

    private String department;

    private String profile;

    private double salary;

    private boolean isActive;


    private Employee(Builder builder) {
        this.name = builder.name;
        this.department = builder.department;
        this.profile = builder.profile;
        this.salary = builder.salary;
        this.isActive = builder.isActive;
    }

    public static class Builder {
        private String name;

        private String department;

        private String profile;

        private double salary = 0.0;

        private boolean isActive = false;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder profile(String profile) {
            this.profile = profile;
            return this;
        }

        public Builder salary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder isActive(boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", profile='" + profile + '\'' +
                ", salary=" + salary +
                ", isActive=" + isActive +
                '}';
    }
}
