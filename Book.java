// Book.java
import java.util.ArrayList;
class Book {
    private String title;
    private String author;
    private String isbn;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public String toString() {
        return title + " by " + author + ", ISBN: " + isbn;
    }
    public static void main(String[] args) {
        // Create a list to store books
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630"));
        books.add(new Book("An Introduction to Python", "Guido van Rossum", "9355423489"));
        System.out.println("List of books:");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("\nAfter removing The C Programming Language:");
        books.removeIf(book -> book.getTitle().equals("The C Programming Language"));
        System.out.println("List of books:");
        for (Book book : books) {
            System.out.println(book);}}}