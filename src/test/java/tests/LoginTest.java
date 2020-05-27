package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends TestBase{

    @Test
    public void loginAsHelpdeskTest(){

        driver.findElement(By.className("input[type='text']")).sendKeys("helpdesk19@cybertekschool.com");

        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("UserUser");

        driver.findElement(By.cssSelector("input[type='submit']")).sendKeys(Keys.ENTER);

    }
}
