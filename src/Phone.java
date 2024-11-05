public class Phone extends ElectronicItem {
    private String networkType;
    private int screenSize;
    public Phone(String name, String location, String description, double price, int storageCapacity, String model, String maker, String operatingSystem, String networkType, int screenSize) {
        super(name, location, description, price, storageCapacity, model, maker, operatingSystem);
        this.networkType = networkType;
        this.screenSize = screenSize;
    }
}
