package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        driver.get("https://example.com");

        LoginPage login = new LoginPage(driver);
        login.login("test", "password");

        Assert.assertTrue(driver.getTitle().contains("Dashboard"));
    }
}
