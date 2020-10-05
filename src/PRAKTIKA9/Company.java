package PRAKTIKA9;

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employeers = new ArrayList<Employee>();

    public void hire(Employee empl)
    {
        employeers.add(empl);
    }

    public void hireAll(ArrayList<Employee> empl)
    {
        for(int i = 0; i < empl.size(); i++)
        {
            hire(empl.get(i));
        }
    }

    public void fire(Employee empl)
    {
        employeers.remove(empl);
    }

    public void fireAll(ArrayList<Employee> empl)
    {
        for(int i = 0; i < empl.size(); i++)
        {
            fire(empl.get(i));
        }
    }

    public ArrayList<Employee> getEmployeers() {
        return employeers;
    }

    public void setEmployeers(ArrayList<Employee> employeers) {
        this.employeers = employeers;
    }

    public void HandlerEmployees(EmployeerHandler handler, EmployeeSelector selector)
    {
        for(int i = 0; i < employeers.size(); i++)
        {
            if(selector.isNeed(employeers.get(i)))
            {
                handler.doSome(employeers.get(i));
            }
        }

    }
}
