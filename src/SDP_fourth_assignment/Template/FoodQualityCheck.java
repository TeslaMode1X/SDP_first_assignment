package Template;

public class FoodQualityCheck extends QualityCheck {
    private String content;
    private boolean expired;

    public FoodQualityCheck(boolean isDamage, String content, boolean expired) {
        super(isDamage);
        this.content = content;
        this.expired = expired;
    }

    @Override
    public void checkCharacteristics() {
        if (expired) {
            rep.append("The product is expired!\n");
        } else {
            rep.append("The product is not expired.\n");
        }
    }

    @Override
    public void report() {
        System.out.println("Product: " + content + "\n" + rep.toString());
    }
}
