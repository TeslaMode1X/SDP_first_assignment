package Visitor;

// the 'file'
public class TextFile implements File {
    private String name;
    private boolean isVirus;
    public TextFile(String name, boolean isVirus) {
        this.name = name;
        this.isVirus = isVirus;
    }
    public String getName() {
        return this.name;
    }
    public boolean isVirus() {
        return this.isVirus;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
