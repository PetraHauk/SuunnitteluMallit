package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {
    private String name;
    private List<FileSystemElement> children;

    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addChild(FileSystemElement child) {
        children.add(child);
    }

    public List<FileSystemElement> getChildren() {
        return children;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
