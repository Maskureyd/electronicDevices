public class Main {
    public static void main(String[] args) {
        Computer lenovo = new Computer("Lenovo", 15000.00, "Windows XP");
        Phone redmi = new Phone("Redmi", 30000.00, "535-4321");

        lenovo.open();
        redmi.open();

        System.out.println();
        System.out.println("Devices defined at the beginning are accessed through the defined objects :  ");
        System.out.printf(lenovo.getMake() + " brand,priced at " + lenovo.getPrice() + ",equipped  with " + lenovo.getOperatingSystem() + " operating system.%n");
        System.out.printf(redmi.getMake() + " brand,priced at " + redmi.getPrice() + ",with the phone number " + redmi.getPhoneNumber() + ". %n");

        System.out.println();
        lenovo.updateOperatingSystem("Windows Vista");
        redmi.call("535-9876");
        System.out.println();

        lenovo.close();
        redmi.close();

        
    }
}
