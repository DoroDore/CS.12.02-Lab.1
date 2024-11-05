public class Phone extends ElectronicItem {
    private String networkType;
    private double screenSize;
    public Phone(String name, String location, String description, double price, int storageCapacity, String model, String maker, String operatingSystem, String networkType, double screenSize) {
        super(name, location, description, price, storageCapacity, model, maker, operatingSystem);
        this.networkType = networkType;
        this.screenSize = screenSize;
    }
    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }
    public String getNetworkType() {
        return networkType;
    }
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    public double getScreenSize() {
        return screenSize;
    }
    @Override
    public String toString() {
        return "Phone{" +
                "networkType='" + networkType + '\'' +
                ", screenSize=" + screenSize +
                ", storageCapacity=" + this.getStorageCapacity() +
                ", model='" + this.getModel() + '\'' +
                ", maker='" + this.getMaker() + '\'' +
                ", operatingSystem='" + this.getOperatingSystem() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", location='" + this.getLocation() + '\'' +
                ", description='" + this.getDescription() + '\'' +
                ", price=" + this.getPrice() +
                '}';
    }
}
