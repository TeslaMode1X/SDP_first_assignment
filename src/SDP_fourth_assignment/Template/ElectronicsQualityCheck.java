package Template;

public class ElectronicsQualityCheck extends QualityCheck {
    private boolean warranty;
    private boolean isWorking;
    private String name;

    public ElectronicsQualityCheck(boolean isDamage, String name, boolean warranty, boolean isWorking) {
        super(isDamage);
        this.name = name;
        this.warranty = warranty;
        this.isWorking = isWorking;
    }

    @Override
    public void checkCharacteristics() {
        if (isWorking) {
            rep.append("The device is working\n");
        } else {
            rep.append("The device is not working\n");
        }
        if (warranty) {
            rep.append("The device is under warranty\n");
        } else {
            rep.append("The device's warranty is expired\n");
        }
    }

    @Override
    public void report() {
        System.out.println("Product: " + name + "\n" + rep);
    }
}
