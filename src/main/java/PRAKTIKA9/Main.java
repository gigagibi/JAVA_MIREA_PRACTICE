package PRAKTIKA9;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            company.hire(new Employee(r.nextInt(100_000)));
        }
        company.HandlerEmployees(new SalaryHandler(), new SalarySelector());
        System.out.println("----------------------");
        company.HandlerEmployees(
                new EmployeerHandler() {
                    @Override
                    public void doSome(Employee empl) {
                        System.out.println(empl.getSalary());
                    }

                },
                new EmployeeSelector() {
                    @Override
                    public boolean isNeed(Employee empl) {
                        return empl.getSalary() > 10000;
                    }
                });
        System.out.println("----------------------");
        company.HandlerEmployees(empl -> System.out.println(empl.getSalary()), empl -> empl.getSalary() > 10000);
    }
}
