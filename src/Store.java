import java.util.ArrayList;

public class Store {
    private final ArrayList<CISItem> cisItems;
    public Store() {
        cisItems = new ArrayList<>();
    }
    public ArrayList<CISItem> getCisItems() {
        return cisItems;
    }
    public void addBook(Book book) {
        cisItems.add(book);
    }
    public void addPhone(Phone phone) {
        cisItems.add(phone);
    }
    public void addMagazine(Magazine magazine) {
        cisItems.add(magazine);
    }
    public void addArduino(Arduino arduino) {
        cisItems.add(arduino);
    }
    public void updatePhonesLocation(String location) {
        for (CISItem item : cisItems) {
            if (item instanceof Phone) {
                item.setLocation(location);
            }
        }
    }
    public ArrayList<Phone> getAllPhones() {
        ArrayList<Phone> phones = new ArrayList<>();
        for (CISItem item : cisItems) {
            if (item instanceof Phone) {
                phones.add((Phone) item);
            }
        }
        return phones;
    }
    public ArrayList<CISItem> getItems(String itemType) {
        ArrayList<CISItem> items = new ArrayList<>();
        for (CISItem item : cisItems) {
            if (item.getClass().getSimpleName().equals(itemType)) {
                items.add(item);
            }
        }
        return items;
    }
    public void updateItems(String itemType, String property, String value) {
        for (CISItem item : cisItems) {
            if (item.getClass().getSimpleName().equals(itemType)) {
                switch (property) {
                    case "location":
                        item.setLocation(value);
                        break;
                    case "description":
                        item.setDescription(value);
                        break;
                    case "price":
                        item.setPrice(Double.parseDouble(value));
                        break;
                    case "wordCount":
                        if (item instanceof ReadingItem) {
                            ((ReadingItem) item).setWordCount(Integer.parseInt(value));
                        }
                        break;
                    case "datePublished":
                        if (item instanceof ReadingItem) {
                            ((ReadingItem) item).setDatePublished(value);
                        }
                        break;
                    case "author":
                        if (item instanceof ReadingItem) {
                            ((ReadingItem) item).setAuthor(value);
                        }
                        break;
                    case "coverStoryTitle":
                        if (item instanceof Magazine) {
                            ((Magazine) item).setCoverStoryTitle(value);
                        }
                        break;
                    case "printDate": //This is more logic than actual stuff lol
                        if (item instanceof Magazine) {
                            throw new IllegalArgumentException("Cannot update print date");
                        }
                        break;
                    case "isbn":
                        if (item instanceof Book) {
                            ((Book) item).setIsbn(value);
                        }
                        break;
                    case "edition":
                        if (item instanceof Book) {
                            throw new IllegalArgumentException("Cannot update edition");
                        }
                        break;
                    case "title": //This is more logic than actual stuff lol
                        if (item instanceof Book) {
                            throw new IllegalArgumentException("Cannot update title");
                        }
                        break;
                    case "storageCapacity":
                        if (item instanceof ElectronicItem) {
                            ((ElectronicItem) item).setStorageCapacity(Integer.parseInt(value));
                        }
                        break;
                    case "model":
                        if (item instanceof ElectronicItem) {
                            ((ElectronicItem) item).setModel(value);
                        }
                        break;
                    case "maker":
                        if (item instanceof ElectronicItem) {
                            ((ElectronicItem) item).setMaker(value);
                        }
                        break;
                    case "operatingSystem":
                        if (item instanceof ElectronicItem) {
                            ((ElectronicItem) item).setOperatingSystem(value);
                        }
                        break;
                    case "networkType":
                        if (item instanceof Phone) {
                            ((Phone) item).setNetworkType(value);
                        }
                        break;
                    case "screenSize":
                        if (item instanceof Phone) {
                            ((Phone) item).setScreenSize(Double.parseDouble(value));
                        }
                        break;
                    case "version":
                        if (item instanceof Arduino) {
                            ((Arduino) item).setVersion(value);
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid property");
                }
            }
        }
    }
    public void showAllInfo() {
        for (CISItem item : cisItems) {
            System.out.println(item.toString());
            System.out.println("---------------------------------------");
        }
    }
}
