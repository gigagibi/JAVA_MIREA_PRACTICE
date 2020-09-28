package PRAKTIKA7;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Random;

public class Company {
    private int bs;
    private ArrayList<Manager> managers = new ArrayList<Manager>();
    private ArrayList<TopManager> topManagers  = new ArrayList<TopManager>();
    private ArrayList<Operator> operators = new ArrayList<Operator>();
    private ArrayList<Employee> employeers = new ArrayList<Employee>();

    public int getBs() {
        return bs;
    }

    public ArrayList<Employee> getEmployeers() {
        return employeers;
    }

    public void setEmployeers(ArrayList<Employee> employeers) {
        this.employeers = employeers;
    }

    public void setBs(int bs) {
        this.bs = bs;
    }

    public void hire(Employee empl)
    {
        empl.setCompany(this);
        employeers.add(empl);
        if(empl.getPosition().getJobTitle() == "Manager")
        {
            managers.add((Manager)empl.getPosition());
        }

        else if(empl.getPosition().getJobTitle() == "TopManager")
        {
            topManagers.add((TopManager)empl.getPosition());
        }

        else if(empl.getPosition().getJobTitle() == "Operator")
        {
            operators.add((Operator)empl.getPosition());
        }
    }

    public void HireAll(List<Employee> empls)
    {
        for(int i = 0; i < empls.size(); i++)
        {
            hire(empls.get(i));
        }
    }

    public void fire(Employee empl)
    {
        empl.setCompany(null);
        employeers.remove(empl);
        if(empl.getPosition().getJobTitle() == "Manager")
        {
            for(int i = 0; i < managers.size(); i++)
            {
                if(managers.get(i) == empl.getPosition())
                    managers.remove(i);
            }
        }

        else if(empl.getPosition().getJobTitle() == "TopManager")
        {
            for(int i = 0; i < topManagers.size(); i++)
            {
                if(topManagers.get(i) == empl.getPosition())
                    topManagers.remove(i);
            }
        }

        else if(empl.getPosition().getJobTitle() == "Operator")
        {
            for(int i = 0; i < operators.size(); i++)
            {
                if(operators.get(i) == empl.getPosition())
                    operators.remove(i);
            }
        }
    }

    public double getIncome()
    {
        double income = 0;
        Random r = new Random();
        for(int i = 0; i < managers.size(); i++)
        {
            income += managers.get(i).getCount();
        }
        return income;
    }

    List<Employee> getTopSalaryStaff(int count)
    {
        if(count <= employeers.size() && count >= 0)
        {
            ArrayList<Employee> returnedEmpls= new ArrayList<Employee>();
            for(int i = this.employeers.size() - 1; i >= 0; i--)
            {
                for(int j = 0; j < i; j++)
                {
                    if(employeers.get(j).getSalary() < employeers.get(j+1).getSalary())
                    {
                        Employee tmpEmpl = new Employee(employeers.get(j).getName(), employeers.get(j).getSalary(), employeers.get(j).getPosition(), employeers.get(j).getCompany());
                        Employee nextEmpl = new Employee(employeers.get(j+1).getName(), employeers.get(j+1).getSalary(), employeers.get(j+1).getPosition(), employeers.get(j+1).getCompany());
                        nextEmpl = employeers.get(j);
                        tmpEmpl = employeers.get(j+1);
                    }
                }
            }

            for(int i = 0; i < count; i++)
            {
                returnedEmpls.add(employeers.get(i));
            }

            return returnedEmpls;
        }
        else
            return null;
    }

    List<Employee> getLowestSalaryStaff(int count)
    {
        if(count <= employeers.size() && count >= 0)
        {
            ArrayList<Employee> returnedEmpls= new ArrayList<Employee>();
            for(int i = this.employeers.size() - 1; i >= 0; i--)
            {
                for(int j = 0; j < i; j++)
                {
                    if(employeers.get(j).getSalary() > employeers.get(j+1).getSalary())
                    {
                        Employee tmpEmpl = new Employee(employeers.get(j).getName(), employeers.get(j).getSalary(), employeers.get(j).getPosition(), employeers.get(j).getCompany());
                        Employee nextEmpl = new Employee(employeers.get(j+1).getName(), employeers.get(j+1).getSalary(), employeers.get(j+1).getPosition(), employeers.get(j+1).getCompany());
                        nextEmpl = employeers.get(j);
                        tmpEmpl = employeers.get(j+1);
                    }
                }
            }

            for(int i = 0; i < count; i++)
            {
                returnedEmpls.add(employeers.get(i));
            }

            return returnedEmpls;
        }
        else
            return null;
    }

}
