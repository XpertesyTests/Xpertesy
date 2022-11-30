package Pages;


import Constants.Const;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LearnMorePage extends BasePage{

    public void navigateToLearnMorePage() {
        webDriver.get(Const.LEARN_MORE_PAGE_URL);
    }

    public boolean isLearnMoreHeaderVisible() {
        return elementExist(Const.LEARN_MORE_HEADER);
    }

    public void clickOnGetStartedButton() {
        clickElementByXpath(Const.GET_STARTED_BUTTON);
    }

    public boolean isYourEmailAddressWindowOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Const.YOUR_EMAIL_ADDRESS_WINDOW_TAB_CONTENT)));
        return elementExist(Const.YOUR_EMAIL_ADDRESS_HEADER);
    }

    public void clickOnPageUpButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Const.PAGE_UP_BUTTON)));
        clickElementByXpath(Const.PAGE_UP_BUTTON);
    }

    public void clickOnSignUpButton() {
        clickElementByXpath(Const.SIGN_UP_BUTTON);
    }

    public void clickOnLogINButton() {
        clickElementByXpath(Const.LOG_IN_BUTTON);
    }
}