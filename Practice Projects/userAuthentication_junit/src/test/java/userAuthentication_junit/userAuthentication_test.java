package userAuthentication_junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class userAuthentication_test {
    private userAuthentication userAuth;

    @BeforeEach
    void setUp() {
        userAuth = new userAuthentication();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testLogin_Successful() {
        assertTrue(userAuth.login("aisha", "123456"), "Login should be successful");
    }

    @Test
    void testLogin_Unsuccessful() {
        assertFalse(userAuth.login("aisha", "wrongPassword"), "Login should fail with incorrect password");
    }

    @Test
    void testLogout() {
        assertDoesNotThrow(() -> userAuth.logout("aisha"), "Logout should not throw an exception");
    }

    @Test
    void testAuthenticateUser_ExistingUser() {
        assertTrue(userAuth.authenticateUser("aisha"), "User should be authenticated");
    }

    @Test
    void testAuthenticateUser_NonExistingUser() {
        assertFalse(userAuth.authenticateUser("non_existing_user"), "Non-existing user should not be authenticated");
    }
}

