package PRAKTIKA7;

import java.nio.charset.Charset;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        for(int i = 0; i < 180; i++)
        {
            company.hire(new Employee(Math.random()*(60000-20000) + 20000, new Operator()));
        }

        for(int i = 0; i < 80; i++)
        {
            company.hire(new Employee(Math.random()*(120000-60000) + 60000, new Manager()));
        }

        for(int i =0; i < 10; i++)
        {
            company.hire(new Employee(Math.random()*(300000-100000) + 100000, new TopManager(company)));
        }

        System.out.println("10 самых высоких зарплат: ");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(company.getTopSalaryStaff(10).get(i).getPosition().calcSalary(company.getTopSalaryStaff(10).get(i).getSalary()));
        }
        System.out.println("30 самых низких зарплат: ");
        for(int i = 0; i < 30; i++)
        {
            System.out.println(company.getLowestSalaryStaff(30).get(i).getPosition().calcSalary(company.getLowestSalaryStaff(30).get(i).getSalary()));
        }

        for(int i = 0; i < company.getEmployeers().size()/2; i++)
        {
            company.fire(company.getEmployeers().get(i));
        }

        System.out.println("10 самых высоких зарплат (после увольнения): ");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(company.getTopSalaryStaff(10).get(i).getPosition().calcSalary(company.getTopSalaryStaff(10).get(i).getSalary()));
        }
        System.out.println("30 самых низких зарплат (после увольнения): ");
        for(int i = 0; i < 30; i++)
        {
            System.out.println(company.getLowestSalaryStaff(30).get(i).getPosition().calcSalary(company.getLowestSalaryStaff(30).get(i).getSalary()));
        }
    }

}
