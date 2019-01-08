package Rozetka;

import org.openqa.selenium.By;

public final class Locators {
    public static final By LOGIN_BUTTON = By.xpath("//span[@id='header_user_menu_parent']/a");
    public static final By LOGIN_LOCATOR = By.xpath("//input[@name='login']");
    public static final By PASSWORD_LOCATOR = By.xpath("//input[@name='password']");
    public static final By BUTTON_ENTER = By.xpath("//button[text() = 'Войти']");
    public static final By PROFILE_BUTTON = By.xpath("//a[@name='profile']");
    public static final By SPORT = By.xpath("//a[contains(text(),'Спорт и увлечения')]");
    public static final By BICYCLES = By.xpath("//a[contains(text(),'Велосипеды и аксессуары')]");
    public static final By ACCESSORIES = By.xpath("//p[@class = 'pab-h3']/a[contains(text(),'Велоаксессуары')]");
    public static final By NAVIGATE_TO_EL = By.xpath("//a[contains(text(), 'XLC LS-B01')]" +
            "/ancestor::div[@class='g-i-tile g-i-tile-catalog']");
    public static final By BUTTON_ADD_TO_CART = By.xpath("//input[contains(@name,'9181806')]/..//button");
    public static final By ELEM_IN_CART = By.xpath("//a[contains(text(), 'XLC LS-B01')]");
    public static final By CART = By.xpath("//div[@id='cart_block18416']/a");
    public static final By DELETE_ELEM_FROM_CART = By.xpath("//a[@name='before_delete']");
    public static final String ACTUAL_URL = "https://rozetka.com.ua/aksessuary-dlya-velosipedov/c269513/";}
