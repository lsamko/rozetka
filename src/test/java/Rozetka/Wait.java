package Rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Wait {
    private final WebDriver webDriver;
    private final int timeToWait = 10;
    private final WebDriverWait wait;


    public Wait (WebDriver webDriver){
        this.webDriver =  webDriver;
        wait= new WebDriverWait(this.webDriver,timeToWait);
    }

    public void waitForElementToBeClickable(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
