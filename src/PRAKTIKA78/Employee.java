package PRAKTIKA78;

public class Employee {
    private String name;
    private String surname;
    private double baseSalary;
    private EmployeePosition position;
    private Company company;

    public Employee(String name, double salary, EmployeePosition position, Company company) {
        this.name = name;
        this.baseSalary = salary;
        this.position = position;
        this.company = company;
    }

    public Employee(String name, double salary, EmployeePosition position) {
        this.name = name;
        this.baseSalary = salary;
        this.position = position;
    }

    public Employee(EmployeePosition position) {
        this.position = position;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.baseSalary = salary;
    }

    public Employee(double salary, EmployeePosition position) {
        this.baseSalary = salary;
        this.position = position;
    }

    public Employee(double salary) {
        this.baseSalary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    
    public void setSurname() {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return baseSalary;
    }

    public void setSalary(double salary) {
        this.baseSalary = salary;
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
