package tests;

// Import WebDriver interface
import org.openqa.selenium.WebDriver;

// Import ChromeDriver to launch Chrome browser
import org.openqa.selenium.chrome.ChromeDriver;

// Import TestNG assertion methods
import org.testng.Assert;

// Import TestNG @Test annotation
import org.testng.annotations.Test;

// Import the Page Object class
import pages.DynamicLoadingPage;

public class DynamicLoadingTest {

    // Mark this method as a TestNG test
    @Test
    public void dynamicLoadingTest() {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open Dynamic Loading Example 2 page
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        // Create DynamicLoadingPage object
        DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage(driver);

        // Click the Start button
        dynamicLoadingPage.clickStart();

        // Verify that "Hello World!" is displayed after loading
        Assert.assertEquals(
                dynamicLoadingPage.getHelloWorldText(),
                "Hello World!"
        );

        // Close the browser
        driver.quit();
    }
}