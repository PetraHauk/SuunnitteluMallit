package Proxy;

import java.util.HashMap;
import java.util.Map;

public class AccessControlServise extends Exception {

    private static AccessControlServise instance;
    private Map<String, String> permissions;


    private AccessControlServise() {
        permissions = new HashMap<>();
    }

    public static AccessControlServise getInstance() {
        if (instance == null) {
            instance = new AccessControlServise();
        }
        return instance;
    }

    public void addPermission(String identifier, String user) {
        permissions.put(identifier, user);
    }

    public boolean isAllowed(String identifier, String username) {
        return username.equals(permissions.get(identifier));
    }
}
