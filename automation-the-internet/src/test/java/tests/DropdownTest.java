package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

public class DropdownTest {

    @Test
    public void dropdownTest() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        DropdownPage dropdownPage = new DropdownPage(driver);

        dropdownPage.selectOption("Option 1");

        Assert.assertEquals(
                dropdownPage.getSelectedOption(),
                "Option 1"
        );

        dropdownPage.selectOption("Option 2");

        Assert.assertEquals(
                dropdownPage.getSelectedOption(),
                "Option 2"
        );

        driver.quit();
    }
}