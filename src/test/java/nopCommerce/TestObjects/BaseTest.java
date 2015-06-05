package nopCommerce.TestObjects;

import PageObjects.BasePage;
import nopCommerce.utils.LoadProperties;
import nopCommerce.utils.utils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Anantha on 02/06/2015.
 */
public class BaseTest extends BasePage {
    @BeforeClass

    public static void setUp()
    {

        driver=new FirefoxDriver();
        driver.get(LoadProperties.getProperty("URL"));
        utils.waitForPageToLoad(20);
        utils.maximize();
    }
    @AfterClass

    public static void tearDown(){
        driver.quit();
            }
}
