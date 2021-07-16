package com.swnat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTests {
    @Test
    public void userHasRole() {
        User user = new User(UserRole.DESIGNER);
        Assert.assertEquals(user.getUserRole(), UserRole.DESIGNER);
    }
}


