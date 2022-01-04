package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    @Test
    void testCreateAdminUser () {
        AdminUser adminUser = new AdminUser("jdoe@gmail.com", "1234");
        assertEquals("jdoe@gmail.com", adminUser.getUserEmail());
        assertEquals("****", adminUser.getPassword());
    }

}