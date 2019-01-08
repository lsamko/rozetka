package Rozetka;

        import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }
    private final String LOGIN = "testQA@gmail.com";
    private final String PASSWORD = "55aqws";

    public HomePage login(){
        webDriver.findElement(Locators.LOGIN_BUTTON).click();
        webDriver.findElement(Locators.LOGIN_LOCATOR).sendKeys(LOGIN);
        webDriver.findElement(Locators.PASSWORD_LOCATOR).sendKeys(PASSWORD);
        webDriver.findElement(Locators.BUTTON_ENTER).click();

        return this;
    }

}
