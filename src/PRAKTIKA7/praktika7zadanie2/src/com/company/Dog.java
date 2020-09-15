package PRAKTIKA7.praktika7zadanie2.src.com.company;

public abstract class Dog {
    protected java.lang.String name, breed, color, size;
    protected int age;

    void Dog(java.lang.String Name, java.lang.String Breed, int Age)
    {
        name = Name;
        breed = Breed;
        age = Age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void bark()
    {
        System.out.println(name + " залаяла");

    }

    public void eat()
    {
        System.out.println(name + " покушала");
    }

    public void bite(String b)
    {
        System.out.println(name + " укусила " + b);
    }
}
