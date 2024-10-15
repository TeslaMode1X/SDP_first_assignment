package Template;

public abstract class QualityCheck {
    private boolean isDamaged;
    protected StringBuilder rep;

    public QualityCheck(boolean isDamaged) {
        this.isDamaged = isDamaged;
        rep = new StringBuilder();
    }

    public void checkAppearance() {
        if (!isDamaged) {
            rep.append("The product does not have any damage.\n");
        } else {
            rep.append("The product has some damage.\n");
        }
    }

    public abstract void checkCharacteristics();

    public abstract void report();

    public void finalReport() {
        checkAppearance();
        checkCharacteristics();
        report();
    }
}
