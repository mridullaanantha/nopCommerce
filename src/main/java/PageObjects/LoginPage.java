package PageObjects;

import nopCommerce.utils.LoadProperties;
import nopCommerce.utils.utils;
import org.openqa.selenium.By;

/**
 * Created by Anantha on 02/06/2015.
 */
public class LoginPage extends BasePage {



    //List of locators in Login page
    By EmailTextField = By.id("Email");
    By PasswordTextField=By.id("Password");
    By loginButton=By.xpath("//input[@value='Log in']");


public void login(String Email, String Password){

    utils.enterText(EmailTextField, Email);
    utils.enterText(PasswordTextField,Password);
    utils.click(loginButton);
    }
}