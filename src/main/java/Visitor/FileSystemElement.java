package Visitor;

public interface FileSystemElement {
    public void accept(FileSystemVisitor visitor);
}
