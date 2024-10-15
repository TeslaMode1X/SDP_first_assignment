package Visitor;

// visitor methods for both files
public interface Visitor {
    void visit(TextFile textFile);
    void visit(ExecutableFile executableFile);
}
