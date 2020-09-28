package PRAKTIKA7;

public class Main {
    public static void main(String[] args) {
        Company Euroset = new Company();
        for(int i = 0; i < 180; i++)
        {
            Euroset.hire(new Employee(new Operator()));
        }

        for(int i = 0; i < 80; i++)
        {
            Euroset.hire(new Employee(new Manager()));
        }

        for(int i = 0; i < 10; i++)
        {
            Euroset.hire(new Employee(new TopManager()));
        }

        System.out.println(Euroset.getTopSalaryStaff(15));
        System.out.println(Euroset.getLowestSalaryStaff(30));
        for(int i = 0; i < Euroset.getEmployeers().size(); i++)
        {
            Euroset.fire(Euroset.getEmployeers().get(i));
        }

    }

}
