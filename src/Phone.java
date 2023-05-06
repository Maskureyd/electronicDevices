public class Phone extends ElectronicDevice {
    private String phoneNumber;

    public Phone(String make, double price, String phoneNumber) {
        super(make, price);
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void call(String number) {
        if (isOpen()) {
            System.out.println(phoneNumber + " is calling " + number + "...");
        } else {
            throw new IllegalArgumentException("The phone must be turned on to make a call.");
        }
    }
}
