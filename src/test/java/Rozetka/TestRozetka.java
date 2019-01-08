package Rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestRozetka {
    private static WebDriver webDriver;
    private static HomePage homePage;
    private static CartPage cartPage;
    private static CategoryPage categoryPage;
    private static Wait wait;

    public TestRozetka() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\maven\\chromedriver.exe");
    }

    @BeforeClass
    public static void setUp() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(AbstractPage.PAGE_NAME);
        homePage = new HomePage(webDriver);
        categoryPage = new CategoryPage(webDriver);
        cartPage = new CartPage(webDriver);
        wait = new Wait(webDriver);
        homePage.login();
        wait.waitForElementToBeClickable(Locators.PROFILE_BUTTON);
    }

    @Test
    public void verifyCategory() {
        categoryPage.changeCategories();
        Assert.assertEquals(webDriver.getCurrentUrl(), Locators.ACTUAL_URL);
    }

    @Test
    public void verifyElementInCard() {
        cartPage.chooseElement();
        Assert.assertTrue(cartPage.existElement(Locators.ELEM_IN_CART));
    }

    @AfterClass
    public static void close() {
        webDriver.quit();
    }
}
