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
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
    public int getStorageCapacity() {
        return storageCapacity;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setMaker(String maker) {
        this.maker = maker;
    }
    public String getMaker() {
        return maker;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
}
