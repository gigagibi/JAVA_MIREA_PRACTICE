package PRAKTIKA2.praktika2zadanie4.src.com.company;
import java.util.ArrayList;
import java.util.Scanner;

class Dog
{
    Scanner sc = new Scanner(System.in);
    String name = "Bobik";
    int age = 3;

    @Override
    public String toString() {
        return
                name + " " + age;
    }

    void set(int Age, String Name)
    {
        this.age = Age;
        this.name = Name;
    }

    int getAge()
    {
        return this.age;
    }

    String getName()
    {
        return this.name;
    }

    int TurnAgeToHumans()
    {
        return this.age * 7;
    }
    public Dog(int Age, String Name)
    {
        this.age = Age;
        this.name = Name;
    }
}

class PitomnikSobak
{
    ArrayList dogs = new ArrayList();

    void addDog(int Age, String Name)
    {
        Dog dg = new Dog(Age, Name);
        dogs.add(dg);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog bobik = new Dog(4, "Bobik");
        System.out.println(bobik.toString());
        PitomnikSobak pitomnik = new PitomnikSobak();
        pitomnik.addDog(3, "Sharik");
    }
}
