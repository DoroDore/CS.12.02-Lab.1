import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    Store store, storeLoaded;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        store = new Store();
        storeLoaded = new Store();
        Phone phoneOne = new Phone(
                "iPhone 12",            // name
                "The Sun",              // location (you can specify the location if needed)
                "The latest iPhone model", // description
                799.99,                 // price
                256,                    // storage
                "iPhone 12",            // model
                "Apple",                // manufacturer
                "iOS",                  // operatingSystem
                "5G",                   // networkType
                6.1                     // screenSize
        );
        Phone phoneTwo = new Phone(
                "Galaxy S21",           // name
                "The Moon",              // location (you can specify the location if needed)
                "The latest Samsung Galaxy model", // description
                899.99,                 // price
                256,                    // storage
                "Galaxy S21",           // model
                "Samsung",              // manufacturer
                "Android",              // operatingSystem
                "5G",                   // networkType
                6.2                     // screenSize
        );
        Phone phoneThree = new Phone(
                "Pixel 5",              // name
                "The Stars",            // location (you can specify the location if needed)
                "The latest Google Pixel model", // description
                699.99,                 // price
                128,                    // storage
                "Pixel 5",              // model
                "Google",               // manufacturer
                "Android",              // operatingSystem
                "5G",                   // networkType
                6.0                     // screenSize
        );
        storeLoaded.addPhone(phoneOne);
        storeLoaded.addPhone(phoneTwo);
        storeLoaded.addPhone(phoneThree);
        Magazine magazineOne = new Magazine(
                "National Geographic",  // name
                "Unknown",              // location (you can specify the location if needed)
                "A monthly magazine exploring the wonders of the world", // description
                6.99,                   // price
                100,                    // wordCount
                "January 1888",         // datePublished
                "National Geographic",   // publisher
                "The Secret Life of Trees", // coverStoryTitle
                "January 2021"          // printDate
        );
        Magazine magazineTwo = new Magazine(
                "Time",                // name
                "Unknown",             // location (you can specify the location if needed)
                "A weekly magazine covering news and current events", // description
                5.99,                  // price
                80,                    // wordCount
                "March 3, 1923",       // datePublished
                "Time",                // publisher
                "The Great Reset",     // coverStoryTitle
                "March 15, 2021"       // printDate
        );
        Magazine magazineThree = new Magazine(
                "The New Yorker",       // name
                "Unknown",              // location (you can specify the location if needed)
                "A weekly magazine featuring journalism, commentary, and fiction", // description
                7.99,                  // price
                90,                    // wordCount
                "February 21, 1925",   // datePublished
                "Conde Nast",           // publisher
                "The Future of Work",   // coverStoryTitle
                "March 8, 2021"         // printDate
        );
        storeLoaded.addMagazine(magazineOne);
        storeLoaded.addMagazine(magazineTwo);
        storeLoaded.addMagazine(magazineThree);
    }
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        store = null;
    }
    @org.junit.jupiter.api.Test
    void addBookTest() {
        Book book = new Book(
                "The Great Gatsby",    // name
                "Unknown",             // location (you can specify the location if needed)
                "A classic novel depicting the Jazz Age in America", // description
                7.39,                  // price
                47000,                 // wordCount (an estimate)
                "April 10, 1925",      // datePublished
                "F. Scott Fitzgerald", // author
                "9780743273565",       // isbn
                "First Edition",       // edition
                "The Great Gatsby"     // title (assuming this is the title)
        );
        store.addBook(book);
        assertEquals(1, store.getItems("Book").size());
    }
    @org.junit.jupiter.api.Test
    void addBookAndPhoneTest() {
        Book book = new Book(
                "The Great Gatsby",    // name
                "Unknown",             // location (you can specify the location if needed)
                "A classic novel depicting the Jazz Age in America", // description
                7.39,                  // price
                47000,                 // wordCount (an estimate)
                "April 10, 1925",      // datePublished
                "F. Scott Fitzgerald", // author
                "9780743273565",       // isbn
                "First Edition",       // edition
                "The Great Gatsby"     // title (assuming this is the title)
        );
        Phone phone = new Phone(
                "iPhone 12",            // name
                "Unknown",              // location (you can specify the location if needed)
                "The latest iPhone model", // description
                799.99,                 // price
                256,                    // storage
                "iPhone 12",            // model
                "Apple",                // manufacturer
                "iOS",                  // operatingSystem
                "5G",                   // networkType
                6.1                     // screenSize
        );
        store.addBook(book);
        store.addPhone(phone);
        assertEquals(1, store.getItems("Book").size());
        assertEquals(1, store.getItems("Phone").size());
        assertEquals(2, store.getCisItems().size());
    }
    @org.junit.jupiter.api.Test
    void movePhonesTest() {
        storeLoaded.updatePhonesLocation("Room 512");
        storeLoaded.getAllPhones().forEach(phone -> assertEquals("Room 512", phone.getLocation()));
    }
    @org.junit.jupiter.api.Test
    void getItemsTest() {
        assertEquals(3, storeLoaded.getItems("Phone").size());
        assertEquals(3, storeLoaded.getItems("Magazine").size());
    }
    @org.junit.jupiter.api.Test
    void updateItemsTest() {
        storeLoaded.updateItems("Phone", "location", "Room 512");
        storeLoaded.getAllPhones().forEach(phone -> assertEquals("Room 512", phone.getLocation()));
        storeLoaded.updateItems("Magazine", "price", "10.99");
        storeLoaded.getItems("Magazine").forEach(magazine -> assertEquals(10.99, magazine.getPrice()));
    }
}