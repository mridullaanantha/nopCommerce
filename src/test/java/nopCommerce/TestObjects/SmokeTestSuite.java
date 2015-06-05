package nopCommerce.TestObjects;

import PageObjects.BasePage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import nopCommerce.utils.LoadProperties;
import nopCommerce.utils.utils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Anantha on 02/06/2015.
 */



public class SmokeTestSuite extends BaseTest{

    //verifyLogin-Test data

    String Email= LoadProperties.getProperty("Email");
    String Password=LoadProperties.getProperty("Password");

   //Page Object
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
BasePage basePage = new BasePage();

    @Test
    public void verifyLogin()
    {
      homePage.clickLogin();
        loginPage.login(Email, Password);
         basePage.Logout();  }

    @Test

    public void VerifyNewCustomerRegistration()
    {

    }


}
