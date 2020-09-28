package PRAKTIKA7;

public class Manager implements EmployeePosition{
    private Company company;
    private double count = Math.random() * ((140000-115000) + 115000);

    public double getCount()
    {
        return count;
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary + 0.05 * count;
    }

    @Override
    public String getJobTitle() {
        return "Manager";
    }


}
