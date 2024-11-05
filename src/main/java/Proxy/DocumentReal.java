package Proxy;

public class DocumentReal implements Document{
    private String identifier;
    private String creationDate;
    private String content;

    public DocumentReal(String identifier, String creationDate, String content) {
        this.identifier = identifier;
        this.creationDate = creationDate;
        this.content = content;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String getCreatonDate() {
        return creationDate;
    }

    @Override
    public String getContent(User user) throws AccessControlServise {
        return content;
    }
}
