package PRAKTIKA7;

public class Operator implements EmployeePosition{
    private Company company;
    @Override
    public double calcSalary(double baseSalary) {
        if(company.getIncome() > 10000000)
            return 2.5*baseSalary;
        else
            return baseSalary;
    }

    @Override
    public String getJobTitle() {
        return "Operator";
    }
}
