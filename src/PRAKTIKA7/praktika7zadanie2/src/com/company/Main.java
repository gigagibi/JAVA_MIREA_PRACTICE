package PRAKTIKA7.praktika7zadanie2.src.com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shepherd bobik = new Shepherd("Бобик", "Овчарка", 5);
        ChiHuaHua krisa = new ChiHuaHua("Крыса", "ЧиХуаХуа", 1, "Коричневый");
        bobik.bark();
        krisa.bark();
        krisa.bite(bobik.getName());
        bobik.bite(krisa.getName());
    }
}
