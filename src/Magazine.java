public class Magazine extends ReadingItem{
    private String coverStoryTitle, printDate;
    public Magazine (String name, String location, String description, double price, int wordCount, String datePublished, String author, String coverStoryTitle, String printDate) {
        super(name, location, description, price, wordCount, datePublished, author);
        this.coverStoryTitle = coverStoryTitle;
        this.printDate = printDate;
    }
}
