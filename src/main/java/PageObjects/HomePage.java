package PageObjects;

import nopCommerce.utils.utils;
import org.openqa.selenium.By;

/**
 * Created by Anantha on 04/06/2015.
 */
public class HomePage
{
    By LogInLink=By.xpath("//a[contains(text(),'Log in')]");

    public void clickLogin(){

        utils.click(LogInLink);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
