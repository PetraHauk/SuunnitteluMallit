package Visitor;

public class Main {

    public static void main(String[] args) {
        // Create files
        File file1 = new File("document.txt", 10);
        File file2 = new File("image.png", 15);
        File file3 = new File("video.mp4", 100);
        File file4 = new File("notes.docx", 5);

        Directory root = new Directory("root");
        Directory subDir1 = new Directory("subDir1");
        Directory subDir2 = new Directory("subDir2");

        root.addChild(file1);
        root.addChild(subDir1);
        subDir1.addChild(file2);
        subDir1.addChild(file3);
        root.addChild(subDir2);
        subDir2.addChild(file4);

        SizeCalculatorVisitor sizeCalculator = new SizeCalculatorVisitor();
        root.accept(sizeCalculator);
        System.out.println("Total size of all files: " + sizeCalculator.getTotalSize() + " MB");

        // Create SearchVisitor to find files with 'doc' in the name
        SearchVisitor searchVisitor = new SearchVisitor("doc");
        root.accept(searchVisitor);
        System.out.println("Files matching 'doc':");
        for (File file : searchVisitor.getFoundFiles()) {
            System.out.println("- " + file.getName());
        }
    }
}
