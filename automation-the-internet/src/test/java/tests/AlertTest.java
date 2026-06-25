package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertPage;

public class AlertTest {

    @Test
    public void jsAlertTest() {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open JavaScript Alerts page
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Create AlertPage object
        AlertPage alertPage = new AlertPage(driver);

        // Click "Click for JS Alert" button
        alertPage.clickJsAlertButton();

        // Accept the alert (click OK)
        alertPage.acceptAlert();

        // Verify success message
        Assert.assertEquals(
                alertPage.getResultMessage(),
                "You successfully clicked an alert"
        );

        // Close browser
        driver.quit();
    }
}