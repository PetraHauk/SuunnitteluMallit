package Proxy;

import java.util.HashMap;
import java.util.HashSet;

public class Library {
    private HashMap<String, Document> documents;
    private AccessControlServise accessControlServise;

    public Library() {
        documents = new HashMap<>();
        accessControlServise = AccessControlServise.getInstance();
    }

    public void addDocument(Document document) {
        documents.put(document.getIdentifier(), document);
    }

    public Document getDocument(String identifier) {
        return documents.get(identifier);
    }

    public void createProtectedDocument(String identifier, String creationDate, String content, User user) {
        DocumentReal documentReal = new DocumentReal(identifier, creationDate, content);
        DocumentProxy documentProxy = new DocumentProxy(documentReal);
        accessControlServise.addPermission(identifier, user.getUsername());
        addDocument(documentProxy);
    }
}
