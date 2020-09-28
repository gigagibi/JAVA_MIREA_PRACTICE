package PRAKTIKA7;

public class TopManager implements EmployeePosition{
    private Company company;

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }

    @Override
    public String getJobTitle() {
        return "TopManager";
    }
}
