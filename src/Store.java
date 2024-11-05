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
