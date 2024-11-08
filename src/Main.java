public class Main {
    public static Store storeLoaded;
    public static void main(String[] args) {
        setUp();
        storeLoaded.showAllInfo();
    }
    public static void setUp() {
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
}