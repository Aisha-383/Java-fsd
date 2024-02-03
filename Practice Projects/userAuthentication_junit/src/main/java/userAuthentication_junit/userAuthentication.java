package userAuthentication_junit;

import java.util.HashMap;
import java.util.Map;

public class userAuthentication {
    private Map<String, String> userCredentials;

    public userAuthentication() {
        userCredentials = new HashMap<>();
        userCredentials.put("aisha", "123456");
    }

    public boolean login(String username, String password) {
        if (userCredentials.containsKey(username)) {
            return userCredentials.get(username).equals(password);
        }
        return false;
    }

    public void logout(String username) {
        System.out.println(username + " logged out successfully.");
    }

    public boolean authenticateUser(String username) {
        return userCredentials.containsKey(username);
    }
}
