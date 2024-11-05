public class ElectronicItem extends CISItem{
    private int storageCapacity;
    private String model, maker, operatingSystem;
    public ElectronicItem (String name, String location, String description, double price, int storageCapacity, String model, String maker, String operatingSystem) {
        super(name, location, description, price);
        this.storageCapacity = storageCapacity;
        this.model = model;
        this.maker = maker;
        this.operatingSystem = operatingSystem;
    }
}
