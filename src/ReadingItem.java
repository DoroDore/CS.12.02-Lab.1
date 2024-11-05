public class ReadingItem extends CISItem{
    private int wordCount;
    private String datePublished, author;
    public ReadingItem(String name, String location, String description, double price, int wordCount, String datePublished, String author) {
        super(name, location, description, price);
        this.wordCount = wordCount;
        this.datePublished = datePublished;
        this.author = author;
    }
}
