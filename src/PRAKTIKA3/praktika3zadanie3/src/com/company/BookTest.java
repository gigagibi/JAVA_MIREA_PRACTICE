package PRAKTIKA3.praktika3zadanie3.src.com.company;

public class BookTest {

    public static void main(String[] args) {
	Book book = new Book();
	book.setAuthor("Arthur");
    book.setEdition_number(1);
	book.setName("About Something");
	book.setYear(2010);
	System.out.println(book.toString());
    }
}
