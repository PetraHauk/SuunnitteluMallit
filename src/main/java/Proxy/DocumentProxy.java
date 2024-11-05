package Proxy;

import java.nio.file.AccessDeniedException;

public class DocumentProxy implements Document {

    private DocumentReal documentReal;
    private AccessControlServise accessControlServise;

    public DocumentProxy(DocumentReal documentReal) {
        this.documentReal = documentReal;
        accessControlServise = AccessControlServise.getInstance();
    }

    @Override
    public String getIdentifier() {
        return documentReal.getIdentifier();
    }

    @Override
    public String getCreatonDate() {
        return documentReal.getCreatonDate();
    }

    @Override
    public String getContent(User user) throws AccessControlServise {
        if (accessControlServise.isAllowed(documentReal.getIdentifier(), user.getUsername())) {
            return documentReal.getContent(user);
        } else {
            return "Access denied";
        }
    }


}
