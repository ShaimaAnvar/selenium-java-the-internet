package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    WebDriver driver;
    By jsAltertButton = By.xpath("//button[text()='Click for JS Alert']");
    By resultMessage = By.id("result");
    public AlertPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickJsAlertButton(){
        driver.findElement(jsAltertButton).click();
    }
    public void acceptAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public String getResultMessage(){
       return driver.findElement(resultMessage).getText();
    }
}
