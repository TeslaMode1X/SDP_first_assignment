package Template;

public class Main {
    public static void main(String[] args) {
        QualityCheck food = new FoodQualityCheck(true, "Banana", false);
        QualityCheck device = new ElectronicsQualityCheck(false, "Iphone",true, true);

        food.finalReport();
        device.finalReport();
    }
}
