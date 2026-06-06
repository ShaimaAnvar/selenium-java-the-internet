package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxPage;

public class CheckboxTest {

    @Test
    public void checkboxTest() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        CheckboxPage checkboxPage = new CheckboxPage(driver);

        Assert.assertFalse(checkboxPage.isCheckbox1Selected());

        checkboxPage.clickCheckbox1();

        Assert.assertTrue(checkboxPage.isCheckbox1Selected());

        Assert.assertTrue(checkboxPage.isCheckbox2Selected());

        driver.quit();
    }
}