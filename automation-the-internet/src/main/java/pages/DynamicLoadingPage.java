package pages;

// Import By class to locate web elements
import org.openqa.selenium.By;

// Import WebDriver to control the browser
import org.openqa.selenium.WebDriver;

// Import ExpectedConditions for explicit wait conditions
import org.openqa.selenium.support.ui.ExpectedConditions;

// Import WebDriverWait to wait for specific conditions
import org.openqa.selenium.support.ui.WebDriverWait;

// Import Duration to specify wait time
import java.time.Duration;

public class DynamicLoadingPage {

    // Store the browser instance
    WebDriver driver;

    // Locator for the Start button
    By startButton = By.xpath("//button[text()='Start']");

    // Locator for the "Hello World!" text
    By helloWorld = By.xpath("//h4[text()='Hello World!']");

    // Constructor to receive the WebDriver from the test class
    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    // Clicks the Start button
    public void clickStart() {
        driver.findElement(startButton).click();
    }

    // Waits until "Hello World!" becomes visible and returns its text
    public String getHelloWorldText() {

        // Create an explicit wait with a maximum timeout of 10 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until the Hello World element becomes visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(helloWorld));

        // Return the displayed text ("Hello World!")
        return driver.findElement(helloWorld).getText();
    }
}