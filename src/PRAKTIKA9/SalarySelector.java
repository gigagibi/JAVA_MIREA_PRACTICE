package PRAKTIKA9;

public class SalarySelector implements EmployeeSelector{
    @Override
    public boolean isNeed(Employee empl) {
        return empl.getSalary() > 10000;
    }
}
