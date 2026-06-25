package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertPage;

public class AlertTest {
    @Test
    public void jsAlertTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        AlertPage alertPage = new AlertPage(driver);
        alertPage.clickJsAlertButton();
        alertPage.acceptAlert();
        Assert.assertEquals(alertPage.getResultMessage(),"You successfully clicked an alert");
    }

}
