package PopUpWindows;

import Constants.Const;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Constants.Const.GET_STARTED_BUTTON;

public class YourEmailAddressWindow extends BasePage {


    public boolean isYourEmailAddressWindowOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Const.YOUR_EMAIL_ADDRESS_WINDOW_TAB_CONTENT)));
        return elementExist(Const.YOUR_EMAIL_ADDRESS_HEADER);
    }

    public void loginEmailInput(String email) {
        sendTextToElementByXpath(Const.EMAIL_INPUT, email);
    }

    public void clickOnContinueButton() {
        clickElementByXpath(Const.CONTINUE_BUTTON);
    }

    public void closeYourEmailWindow() {
        clickElementByXpath(Const.CLOSE_BUTTON);
    }

    public boolean isYourEmailWindowClose() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(GET_STARTED_BUTTON)));
        return elementExist(GET_STARTED_BUTTON);
    }

    public void openGmailTab() throws InterruptedException {
        WebElement continueWithGoogleButton = webDriver.findElement(By.xpath(Const.CONTINUE_WITH_GOOGLE_BUTTON));
        Thread.sleep(7000);
        continueWithGoogleButton.click();
        for (String str : webDriver.getWindowHandles()) {
            webDriver.switchTo().window(str);
        }
        webDriver.getCurrentUrl();
    }

    public boolean isErrFillOutFieldVisible() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Const.ERROR_TEXT)));
        return elementExist(Const.ERROR_TEXT);
    }


}
