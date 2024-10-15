package Visitor;

// the 'program'
public class ExecutableFile implements File {
    private String name;
    private boolean isVirus;
    public ExecutableFile(String name, boolean isVirus) {
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
