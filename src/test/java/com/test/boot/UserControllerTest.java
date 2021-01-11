package com.test.boot;

import com.test.boot.controllers.UserController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.util.AssertionErrors;

import java.util.Arrays;
import java.util.List;

public class UserControllerTest {


    private UserController controller = new UserController();
    @Test
    public void testUsers() {

        List<String> users = controller.getUsers();

        AssertionErrors.assertEquals("",users, Arrays.asList("Aqib","Ali", "Ahmad"));
    }
}
