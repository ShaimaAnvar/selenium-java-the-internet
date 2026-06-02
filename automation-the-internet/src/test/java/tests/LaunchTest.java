package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class LaunchTest {
    @Test
    public void launchWebsite(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
