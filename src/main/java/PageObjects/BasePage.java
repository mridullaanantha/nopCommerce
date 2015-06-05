package PageObjects;

import nopCommerce.utils.utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Anantha on 02/06/2015.
 */
public class BasePage {
    public static WebDriver driver;


    //List of Locators

    By logoutLink=By.xpath("//a[@class='ico-logout']");

    public void Logout()
    {
        utils.click(logoutLink);
    }

}