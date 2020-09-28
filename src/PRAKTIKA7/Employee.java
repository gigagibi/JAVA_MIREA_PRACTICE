package PRAKTIKA7;

public class Employee {
    private String name;
    private double salary;
    private EmployeePosition position;
    private Company company;

    public Employee(String name, double salary, EmployeePosition position, Company company) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.company = company;
    }

    public Employee(String name, double salary, EmployeePosition position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public Employee(EmployeePosition position) {
        this.position = position;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    public Employee(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
