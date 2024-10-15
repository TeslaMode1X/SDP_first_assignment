package Visitor;

// checks if file or program has a virus
public class AntivirusVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        if (textFile.isVirus()) {
            System.out.println("Text file have some viruses");
        } else {
            System.out.println("Text file is ok");
        }
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        if (executableFile.isVirus()) {
            System.out.println("Executable file have some viruses");
        } else {
            System.out.println("Executable file is ok");
        }
    }
}
