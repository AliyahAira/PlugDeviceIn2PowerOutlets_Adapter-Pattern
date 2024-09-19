public class ApplianceApp {
    public static void main(String[] args) {
        // Create instances of the adaptee objects
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        // Create adapter objects
        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);

        // Plug devices into power outlets
        System.out.println(laptopAdapter.plugIn());
        System.out.println(refrigeratorAdapter.plugIn());
        System.out.println(smartphoneAdapter.plugIn());
    }
}