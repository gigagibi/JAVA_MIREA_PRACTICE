package PRAKTIKA3.praktika3zadanie3.src.com.company;

public class Book {
    private String author, name;
    private int year, edition_number;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEdition_number() {
        return edition_number;
    }

    public void setEdition_number(int edition_number) {
        this.edition_number = edition_number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", edition_number=" + edition_number +
                '}';
    }
}
