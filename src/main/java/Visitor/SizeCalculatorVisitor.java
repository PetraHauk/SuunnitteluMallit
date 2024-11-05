package Visitor;

public class SizeCalculatorVisitor implements FileSystemVisitor {
    private int totalSize;

    public SizeCalculatorVisitor() {
        totalSize = 0;
    }

    public int getTotalSize() {
        return totalSize;
    }

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        for (FileSystemElement child : directory.getChildren()) {
            child.accept(this);
        }
    }
}