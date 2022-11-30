package PopUpWindows;

import Constants.Const;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PasswordWindow extends BasePage {


    public boolean isPasswordWindowOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Const.LOG_IN_BUTTON)));
        return elementExist(Const.PASSWORD_HEADER);
    }

    public void loginPassInput(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Const.PASSWORD_HEADER)));
        sendTextToElementByXpath(Const.PASS_INPUT, password);
    }

    public void clickOnLogInButton() {
        clickElementByXpath(Const.LOG_IN_BUTTON);
    }

    public void clickOnForgotPassword() {
        clickElementByXpath(Const.FORGOT_PASSWORD_BUTTON);
    }

    public void enterPassword(String password) {
        sendTextToElementByXpath(Const.PASS_INPUT, password);
    }

    public boolean isIncorrectPasswordErrVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Const.INCORRECT_USERNAME_OR_PASSWORD_ERR_CLOSE_BUTTON)));
        return elementExist(Const.INCORRECT_USERNAME_OR_PASSWORD_ERR);

    }

    public void closeIncorrectPassErr() {
        clickElementByXpath(Const.INCORRECT_USERNAME_OR_PASSWORD_ERR_CLOSE_BUTTON);

    }

    public boolean isFillOutThisFieldErrVisible() {
        return elementExist(Const.FILL_OUT_THIS_FIELD_ERR);
    }

    public void clickOnRememberMeOption() {
        clickElementByXpath(Const.REMEMBER_ME_CHECK_BOX);
    }

    public boolean isRememberMeBoxChecked() {
        return checkedBox(Const.REMEMBER_ME_CHECK_BOX);
    }

    public void clickOnEyeIcon() {
        clickElementByXpath(Const.EYE_ICON);
    }

    public boolean isEnteredPassVisible(String password) {
        return sameValue(Const.PASS_INPUT, "Qwerty");

    }
}