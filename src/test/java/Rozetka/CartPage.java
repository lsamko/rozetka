package Rozetka;

import Rozetka.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CartPage extends AbstractPage {
    protected CartPage(WebDriver webDriver) {
        super(webDriver);
    }
    public void chooseElement(){
        new Actions(webDriver).moveToElement(webDriver.findElement(Locators.NAVIGATE_TO_EL)).perform();
        webDriver.findElement(Locators.BUTTON_ADD_TO_CART).click();
    }

    public boolean existElement(By element){
        try {
            webDriver.findElement(element);
        }catch (NoSuchElementException e){
            return false;
        }
        return true;
    }

    public void removeElementsFromCart(){
       if( webDriver.findElement(Locators.DELETE_ELEM_FROM_CART).isDisplayed()) {
    webDriver.findElement(Locators.DELETE_ELEM_FROM_CART).click();
        }
    }
}
