package Proxy;

public interface Document{
    String getIdentifier();
    String getCreatonDate();
    String getContent(User user) throws AccessControlServise;
}
