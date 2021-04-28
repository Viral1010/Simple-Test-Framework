package Test;

import Core.Browser;
import Core.Logger;
import PageObjects.SignUpPO;
import Utility.Commons;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignupTest extends Browser {

    //here We can read the data from the excel and pass it as well
    @DataProvider(name = "parent")
    public Object[][] dpMethod() {
        return new Object[][]{
                {"viral", "patel", "viral.patel@mailinator.com", "viral1010", "Testing@1010", "Testing@1010"},
                {"Mahesh", "Patel", "mahesh.patel@mailinator.com", "mahesh1010", "Testing@1010", "Testing@1010"}

        };
    }

    Logger logger = new Logger();

    @Test(dataProvider = "parent")
    public void signUpUser(String[] accountDetails) {

        SignUpPO signupPO = new SignUpPO(driver);

        logger.logTestTitle("Verify user is able to sign up successfully");

        Commons.pause(10);
        signupPO.clickOnLanguageDropDown();
        signupPO.validateLanguageDropdownOption();

        signupPO.clickOnHindiDropDownOption();
        signupPO.validateContinueButtonOnHindi();

        signupPO.clickOnLanguageDropDown();

        signupPO.clickOnEspanolDropDownOption();
        signupPO.validateContinueButtonOnEspanol();

        signupPO.clickOnLanguageDropDown();

        signupPO.clickOnEnglishDropDownOption();
        signupPO.validateContinueButtonOnEnglish();


        signupPO.clickOnSetUpParentSupport();

        signupPO.clickOnCreateNewAccount();

        signupPO.validateCreateAccountButtonIsDisable();
        signupPO.enterFirstName(accountDetails[0]);

        signupPO.enterLastName(accountDetails[1]);

        signupPO.enterEmail(accountDetails[2]);

        signupPO.enterParentUserID(accountDetails[3]);

        signupPO.enterPassword(accountDetails[4]);

        signupPO.enterConfirmPassword(accountDetails[5]);

        signupPO.enterCaptcha("a");

        signupPO.validateCreateAccountButtonIsEnable();

    }
}
