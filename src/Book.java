import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int releaseYear;
    private int numberPages;
    private String isbn;
    private String genre;
    private String synopsis;
    private String language;
    private static List<Book> books = new ArrayList<>();

    public Book(String title, String author, String publisher, int releaseYear, int numberPages, String isbn,
                String genre, String synopsis, String language) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.releaseYear = releaseYear;
        this.numberPages = numberPages;
        this.isbn = isbn;
        this.genre = genre;
        this.synopsis = synopsis;
        this.language = language;
    }

    public String getTitle() {return title;}

    public static void registerBook(String title, String author, String publisher, int releaseYear, int numberPages,
                                    String isbn, String genre, String synopsis, String language) {
        Book book = new Book(title, author, publisher, releaseYear, numberPages, isbn, genre, synopsis, language);
        books.add(book);
        System.out.println(book.getTitle() + " has been registered.");
    }

    public static void listBooks() {
        if (books.isEmpty()) {
            System.out.println("There are no books registered in the system.");
        }
        else {
            for (Book book : books) {
                System.out.println(book.getTitle() + "\n");
            }
        }
    }
}
