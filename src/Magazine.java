public class Magazine extends ReadingItem{
    private final String coverStoryTitle, printDate;
    public Magazine (String name, String location, String description, double price, int wordCount, String datePublished, String author, String coverStoryTitle, String printDate) {
        super(name, location, description, price, wordCount, datePublished, author);
        this.coverStoryTitle = coverStoryTitle;
        this.printDate = printDate;
    }
    @Override
    public String toString() {
        return "Magazine: " + this.getName() + "\nLocation: " + this.getLocation() + "\nDescription: " +
                this.getDescription() + "\nPrice: " + this.getPrice() + "\nWord Count: " + this.getWordCount() +
                "\nDate Published: " + this.getDatePublished() + "\nAuthor: " + this.getAuthor() +
                "\nCover Story Title: " + this.coverStoryTitle + "\nPrint Date: " + this.printDate;
    }
}
