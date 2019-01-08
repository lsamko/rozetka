package Rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CategoryPage extends AbstractPage {
    protected CategoryPage(WebDriver webDriver) {
        super(webDriver);
    }
    List<By> listOfCategories = new ArrayList<>();

    public void changeCategories(){
        listOfCategories.add(Locators.SPORT);
        listOfCategories.add(Locators.BICYCLES);
        listOfCategories.add(Locators.ACCESSORIES);
        for (int i = 0; i <listOfCategories.size() ; i++) {
            try{
                webDriver.findElement(listOfCategories.get(i)).click();
            } catch (NoSuchElementException e){
                System.out.println("Category doesn't exist");
            }

        }
    }
}
