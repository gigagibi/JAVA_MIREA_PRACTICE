package PRAKTIKA9;

public class SalaryHandler implements EmployeerHandler{
    @Override
    public void doSome(Employee empl) {
        System.out.println(empl.getSalary());
    }
}
