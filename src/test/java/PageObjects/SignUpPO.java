package PageObjects;

import Core.Logger;
import Core.UserAction;
import Utility.Commons;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SignUpPO {

    public WebDriver driver;
    UserAction action = new UserAction();


    String select_language_dropdown = "//div[@class=\"accountDetailsLangDropDown\"]";

    String english_language_dropdown_option = "//span[@role=\"menuitem\"]//div[text()='English']";

    String hindi_language_dropdown_option = "//span[@role=\"menuitem\"]//div[text()='हिंदी']";

    String espanol_language_dropdown_option = "//span[@role=\"menuitem\"]//div[text()='Español']";

    String english_language_continue_button = "//button//div[text()='Continue']";

    String hindi_language_continue_button = "//button//div[text()='अग्रसर रहें']";

    String espanol_language_continue_button = "//button//div[text()='Continuar']";

    String set_up_parent_support_link = "//a[text()='Set up parent support']";

    String create_new_account_button_link = "//span[text()='CREATE A NEW ACCOUNT']";

    String first_name_text_field = "//label[text()='First name']/../input";

    String last_name_text_field = "//label[text()='Last name']/../input";

    String email_text_field = "//label[text()='Email address']/../input";

    String create_parent_username_text_field = "//label[text()='Create parent username']/../input";

    String create_parent_password_text_field = "//label[text()='Create parent password']/../input";

    String confirm_password_text_field = "//label[text()='Confirm password']/../input";

    String validate_captcha_text_field = "//label[text()='Validate Captcha']/../input";

    String create_account_button = "//span[text()='CREATE ACCOUNT']";


    public SignUpPO(WebDriver driver) {
        this.driver = driver;
    }


    Commons common = new Commons();
Logger logger = new Logger();

    public void clickOnLanguageDropDown() {
        Commons.pause(1);
        logger.logStepMessage("Click on Language Drop down");
        action.findElementByXpath(driver, select_language_dropdown).click();
    }

    public void validateLanguageDropdownOption()
    {
        logger.logStepMessage("Verify Language Dropdown With Option English, Hindi and Espanol is displayed");

        Assert.assertTrue(action.findElementByXpath(driver,english_language_dropdown_option).isDisplayed());
        Assert.assertTrue(action.findElementByXpath(driver,hindi_language_dropdown_option).isDisplayed());
        Assert.assertTrue(action.findElementByXpath(driver,espanol_language_dropdown_option).isDisplayed());
        logger.logStepResult("passed");


    }

    public void clickOnHindiDropDownOption() {
        logger.logStepMessage("Click on Hindi Option from language dropdown");
        Commons.pause(1);
        action.findElementByXpath(driver, hindi_language_dropdown_option).click();
    }

    public void validateContinueButtonOnHindi()
    {
        Assert.assertTrue(action.findElementByXpath(driver,hindi_language_continue_button).isDisplayed());
     }

    public void clickOnEspanolDropDownOption() {
        logger.logStepMessage("Click on Espanol Option from language dropdown");
        Commons.pause(1);
        action.findElementByXpath(driver, espanol_language_dropdown_option).click();
    }

    public void validateContinueButtonOnEspanol()
    {
        Assert.assertTrue(action.findElementByXpath(driver,espanol_language_continue_button).isDisplayed());
    }

    public void clickOnEnglishDropDownOption() {
        logger.logStepMessage("Click on English Option from language dropdown");
        Commons.pause(1);
        action.findElementByXpath(driver, english_language_dropdown_option).click();
    }

    public void validateContinueButtonOnEnglish()
    {Commons.pause(1);
        Assert.assertTrue(action.findElementByXpath(driver,english_language_continue_button).isDisplayed());
    }

    public void clickOnSetUpParentSupport() {
        logger.logStepMessage("Click on Set up parent Option Button");
        Commons.pause(1);
        action.findElementByXpath(driver, set_up_parent_support_link).click();
    }

    public void clickOnCreateNewAccount() {

        logger.logStepMessage("Click on create new account");
        Commons.pause(1);
        action.findElementByXpath(driver, create_new_account_button_link).click();
    }

    public void enterFirstName(String firstName)
    {
        logger.logStepMessage("Enter first Name " +firstName);
        Commons.pause(1);
        action.findElementByXpath(driver, first_name_text_field).sendKeys(firstName);
    }

    public void enterLastName(String lastName)
    {
        logger.logStepMessage("Enter last Name " +lastName);
        Commons.pause(1);
        action.findElementByXpath(driver, last_name_text_field).sendKeys(lastName);
    }
    public void enterEmail(String email)
    {
        logger.logStepMessage("Enter email " +email);
        Commons.pause(1);
        action.findElementByXpath(driver, email_text_field).sendKeys(email);
    }
    public void enterParentUserID(String parentUserID)
    {
        logger.logStepMessage("Enter parent user id " + parentUserID);
        Commons.pause(1);
        action.findElementByXpath(driver,create_parent_username_text_field ).sendKeys(parentUserID);
    }

    public void enterPassword(String password)
    {
        logger.logStepMessage("Enter password " +password);
        Commons.pause(1);
        action.findElementByXpath(driver,create_parent_password_text_field ).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword)
    {

        logger.logStepMessage("Enter confirm password " +confirmPassword);
        Commons.pause(1);
        action.findElementByXpath(driver,confirm_password_text_field ).sendKeys(confirmPassword);
    }

    public void enterCaptcha(String captcha)
    {
        logger.logStepMessage("Enter captch " +captcha);
        Commons.pause(1);
        action.findElementByXpath(driver,validate_captcha_text_field ).sendKeys(captcha);
    }

    public void validateCreateAccountButtonIsDisable()
    {
        logger.logStepMessage("Verify that create account button is disable");
        Commons.pause(1);
        Assert.assertTrue(action.findElementByXpath(driver,create_account_button).getAttribute("style").contains("opacity: 0.3"));
        logger.logStepResult("passed");

    }

    public void validateCreateAccountButtonIsEnable()

    {
        logger.logStepMessage("Verify that create account button is enable");
        Commons.pause(1);
        Assert.assertTrue(action.findElementByXpath(driver,create_account_button).getAttribute("style").contains("opacity: 1"));
        logger.logStepResult("passed");
    }





}
