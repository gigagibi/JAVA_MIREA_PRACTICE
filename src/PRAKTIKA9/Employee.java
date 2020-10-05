package PRAKTIKA9;

import java.time.LocalDate;

public class Employee {
    private String name, surname;
    private LocalDate dateOfBirth;
    private String livePlace;
    private String phoneNumber;
    private int salary;

    public Employee()
    {

    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String surname, LocalDate dateOfBirth, String livePlace, String phoneNumber, int salary) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.livePlace = livePlace;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLivePlace() {
        return livePlace;
    }

    public void setLivePlace(String livePlace) {
        this.livePlace = livePlace;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
