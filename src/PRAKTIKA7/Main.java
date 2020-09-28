package PRAKTIKA7;

public class Main {
    public static void main(String[] args) {
        /*Company Euroset = new Company();
        for(int i = 0; i < 180; i++)
        {
            Euroset.hire(new Employee(Math.random()*((40000-20000) + 20000), new Operator()));
        }

        for(int i = 0; i < 80; i++)
        {
            Euroset.hire(new Employee(Math.random()*((100000-60000) + 60000), new Manager()));
        }

        for(int i = 0; i < 10; i++)
        {
            Euroset.hire(new Employee(Math.random()*((200000-120000) + 120000), new TopManager()));
        }

        System.out.println(Euroset.getTopSalaryStaff(15));
        System.out.println(Euroset.getLowestSalaryStaff(30));
        for(int i = 0; i < Euroset.getEmployeers().size()/2; i++)
        {
            Euroset.fire(Euroset.getEmployeers().get(i));
        }
        System.out.println(Euroset.getTopSalaryStaff(15));
        System.out.println(Euroset.getLowestSalaryStaff(30));*/
        Company company = new Company();
        Employee employeer1 = new Employee("Андрей", 50000, new Operator());
        company.hire(employeer1);
        Employee employeer2 = new Employee("Дима", 40000, new Operator());
        company.hire(employeer2);
        Employee employeer3 = new Employee("Чебуратор", 150000, new TopManager());
        company.hire(employeer3);
        System.out.println(company.getLowestSalaryStaff(3));
    }

}
