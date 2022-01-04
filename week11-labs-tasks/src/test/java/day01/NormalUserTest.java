package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalUserTest {

    @Test

    void testCreateNormalUser() {
        NormalUser normalUser = new NormalUser("jdoe@gmail.com", "1234");
        assertEquals("jdoe@gmail.com", normalUser.getUserEmail());
        assertEquals("1234", normalUser.getPassword());
    }

}