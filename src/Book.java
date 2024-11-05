public class Book extends ReadingItem{
    String isbn, edition, title;
    public Book(String name, String location, String description, double price, int wordCount, String datePublished, String author, String isbn, String edition, String title) {
        super(name, location, description, price, wordCount, datePublished, author);
        this.isbn = isbn;
        this.edition = edition;
        this.title = title;
    }
}
