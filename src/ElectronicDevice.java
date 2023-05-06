public class ElectronicDevice {
    protected String make;
    protected double price;
    private boolean status;

    public ElectronicDevice(String make, double price) {
        this.make = make;
        this.price = price;
        this.status = false;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOpen(boolean status) {
        this.status = status;
    }

    public void close() {
        if (this.status) {
            this.status = false;
            System.out.println(make + " device is turned off.");
        } else {
            throw new IllegalArgumentException(make + " device is already turned off.");
        }
    }

    public void open() {
        if (isOpen()) {
            throw new IllegalArgumentException(make + " device is already turned on.");
        } else {
            this.status = true;
            System.out.println(this.make + " device is turned on.");
        }
    }

    public boolean isOpen() {
        return this.status;
    }
}
