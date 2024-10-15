package Visitor;

// summing the full report
public class ReportVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("File name: " + textFile.getName());
        System.out.println("Viruses: " + textFile.isVirus());
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Program name: " + executableFile.getName());
        System.out.println("Viruses: " + executableFile.isVirus());
    }
}
