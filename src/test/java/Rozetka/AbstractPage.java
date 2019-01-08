package Rozetka;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    public static final String PAGE_NAME = "https://rozetka.com.ua";

    protected final WebDriver webDriver;

    protected AbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
