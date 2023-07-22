public class Computer extends ElectronicDevice {

    public Computer(String make, double price, String operatingSystem) {
        super(make, price);
        this.operatingSystem = operatingSystem;
    }

    private String operatingSystem;

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void updateOperatingSystem(String newSystem) {
        if (isOpen()) {
            this.operatingSystem = newSystem;
            System.out.println("Updating operating system..");
            System.out.println("Operating system updated: " + this.operatingSystem);
        } else {
            throw new IllegalArgumentException("The device must be turned on to update the operating system.");
        }
    }
}
