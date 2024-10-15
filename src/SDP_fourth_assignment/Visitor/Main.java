package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating list of files
        List<File> files = new ArrayList<>();

        // Visitors
        Visitor antivirus = new AntivirusVisitor();
        Visitor report = new ReportVisitor();

        // Adding some files
        files.add(new TextFile("document.txt", true));
        files.add(new ExecutableFile("program.exe", false));

        // Looping through files and executing them via visitors
        for (File file : files) {
            file.accept(antivirus);
            file.accept(report);
            System.out.println();
        }
    }
}
